import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args){
        System.out.println("Enter a string of letters: ");
        Scanner input = new Scanner(System.in);
        String inputWords = input.nextLine();
        System.out.println("This is " + isPalindrome(inputWords) + "ly a palindrome.");
    
    }
    
    public static boolean isPalindrome(String sentence) {
        char[] characters = sentence.toCharArray();

        StringBuilder parsedString = new StringBuilder();

        for (char let:characters){
            char each = Character.toLowerCase(let);
            if(Character.isLetterOrDigit(each)) {
                parsedString.append(each);
            } else {
                continue;
            }
        }
        String output = new String(parsedString);
        var reversed = parsedString.reverse().toString();

        return output.equals(reversed);
    }

}