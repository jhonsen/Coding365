import java.util.Scanner;

public class Palindromenumber {
    public static void main(String[] args) {
        System.out.print("Enter a number and press return: ");
        Scanner input = new Scanner(System.in);
        int testCase = Integer.valueOf(input.nextLine());
        if (isPalindrome(testCase)) {
            System.out.println("The number above is a palindrome.");
        } else {
            System.out.println("The number above is NOT a palindrome.");
        }
        
    }
    
    public static boolean isPalindrome(int number) {
        String numberString = Integer.toString(number);
        char[] numberChars = numberString.toCharArray();

        char[] reversedChars = new char[numberChars.length];

        for (int i=0; i < numberChars.length; i++) {
            reversedChars[i] = numberChars[numberChars.length - 1 - i];
        }
        String reversedString = new String(reversedChars);
        return numberString.equals(reversedString);
    }

}
    
