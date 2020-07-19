import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class findCommonChars {
    public static void main(String[] args){
        System.out.println("Enter a list of words, separated by commas: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] words = userInput.split(",");
        ArrayList<String> output = findCommonChars(words);
        System.out.println("The common characters are: " + output);
    }
    public static ArrayList<String> findCommonChars(String[] words){
    
        ArrayList<String> charsToCarry = new ArrayList<String>();
        String[] firstWord = words[0].split("");
        for (String letter:firstWord) {
            charsToCarry.add(letter);
        }

        for (String word:words) {
            ArrayList<String> tempChars = new ArrayList<String>();

            for (String letter:word.split("")) {
                if (charsToCarry.contains(letter)) {
                    tempChars.add(letter);
                    charsToCarry.remove(letter);
                }
            }
            charsToCarry = tempChars;
        }

        return charsToCarry;
    }

}
