import java.util.*;

public class Replacealphabets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phrase to be encoded ('a':1,'b':2, etc.) below:");
        String inputText = scan.nextLine();
        
        String output = replaceAlphabets(inputText);
        System.out.println("The encoded string is: " + output);
    }

    public static String replaceAlphabets(String phrase) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArray = alphabets.split("");
        HashMap<String, String> diction = new HashMap<String, String>();
        for (int i=0; i<alphabetArray.length; i++) {
            diction.put(alphabetArray[i], Integer.toString(i+1));
        }
        String[] lettersInPhraseArray = phrase.split("");

        ArrayList<String> output = new ArrayList<String>();
        for (String alph:lettersInPhraseArray) {
            // Use Character.isLetter instead of Apache common's StringUtils
            if (Character.isLetter(alph.toLowerCase().charAt(0))) {
                output.add(diction.get(alph.toLowerCase()));
            } 
        }
        return  String.join(" ", output);
    }


}