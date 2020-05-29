import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("Input the first string:");
        Scanner input1 = new Scanner(System.in);
        String leftWord = input1.next();
        System.out.println("Input the second string:");
        Scanner input2 = new Scanner(System.in);

        String rightWord = input2.next();
        System.out.println("Are the two strings anagram? "+ isAnagram(leftWord,rightWord));
    }
    
    public static boolean isAnagram (String left, String right) {
        char[] leftArray = left.toCharArray();
        char[] rightArray = right.toCharArray();
        Arrays.sort(leftArray);
        Arrays.sort(rightArray);
        String newLeft = String.copyValueOf(leftArray);
        String newRight = String.copyValueOf(rightArray);
        return newLeft.equals(newRight);
    }
}