import java.util.Scanner;
import java.util.Arrays;


public class Plusone {
    
    public static void main (String[] args) {
        System.out.print("Enter a list of integers separated by commas: ");
        Scanner input = new Scanner(System.in);
        String numberString = input.nextLine();
        System.out.print("The new list is : " + plusOne(numberString));
    }
    
    public static String plusOne(String digits) {
        String[] numbers = digits.split(",");
        StringBuilder numberSb = new StringBuilder();
        for (int i=0; i< numbers.length;i++) {
            String ch = numbers[i];
            if (Character.isDigit(ch.charAt(0))) {
                numberSb.append(ch);
            }
        }
        int numberInt = Integer.parseInt(numberSb.toString());
        int numberIntAddedOne = numberInt + 1;

        String numAdded = String.valueOf(numberIntAddedOne);
        String[] output = numAdded.split("");
        String result =  Arrays.toString(output);
        return result;
    }
    
}
    
