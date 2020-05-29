import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vowel {
    
    public static void main(String[] args) {
        System.out.println("Please enter a phrase/string:");
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        
        System.out.println("The string can be encoded as: " + encode(phrase));
        System.out.println("But can be decoded back into: " + decode(encode(phrase)));
            
    }
    
    public static String encode(String words) {
        Map<Character, Integer> vowels = new HashMap<>();
        vowels.put('a', 1);
        vowels.put('e', 2);
        vowels.put('i', 3);
        vowels.put('o', 4);
        vowels.put('u', 5);

        StringBuilder output = new StringBuilder();
        for (char letter: words.toCharArray()) {
            if (vowels.containsKey(letter)) {
                output.append(vowels.get(letter));
            } else {
                output.append(letter);
            }
        }
        return output.toString();
    }
    
    public static String decode(String words) {
        Map<Character, Character> vowels = new HashMap<>();
        vowels.put('1', 'a');
        vowels.put('2', 'e');
        vowels.put('3', 'i');
        vowels.put('4', 'o');
        vowels.put('5', 'u');

        StringBuilder output = new StringBuilder();
        for (char letter: words.toCharArray()) {
            if (vowels.containsKey(letter)) {
                output.append(vowels.get(letter));
            } else {
                output.append(letter);
            }
        }
        return output.toString();
    }
}