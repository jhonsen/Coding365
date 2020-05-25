import java.util.Scanner;

public class Words { 
    
    public static void main(String[] args) {
        System.out.println("Input a string of text:");
        Scanner input = new Scanner(System.in);
        int length = countLength(input.next());
        System.out.println("The length of last word is " + Integer.toString(length));
    }
    
    public static int countLength (String phrase) {
        String trimmedPhrase = phrase.trim();
        String[] splitPhrase = trimmedPhrase.split("\\s+");
        String lastWord = splitPhrase[splitPhrase.length - 1];
        if (!lastWord.equals("")) {
            return lastWord.length();
        } else {
            return 0;
        }
    }
    
}