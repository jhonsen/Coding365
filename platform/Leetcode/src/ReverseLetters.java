import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseLetters{

    public static void main(String[] args){
        System.out.println("Enter a string of ascii codes (e.g., letters, punctuations, etc.)");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String output = reverseLettersOnly(userInput);
        System.out.println("When ONLY the letters are reversed, you'll get: " + output);
            
    }
    public static String reverseLettersOnly(String word){
        char[] phrase = word.toCharArray();

        ArrayList<Integer> indices = new ArrayList<Integer>();
        ArrayList<Character> letters = new ArrayList<Character>();

        for (int i=0; i < phrase.length; i++) {
            if (Character.isLetter(phrase[i])) {
                indices.add(i);
                letters.add(phrase[i]);
            }
        }

        ArrayList<Integer> reversedIndices = new ArrayList<Integer>();
        for (int i=indices.size()-1; i>=0 ; i--) {
            reversedIndices.add(indices.get(i));
        }

        for (int index:reversedIndices) {
            phrase[index] = letters.remove(0);        
        }

        return String.join("",String.copyValueOf(phrase));
    }
}
