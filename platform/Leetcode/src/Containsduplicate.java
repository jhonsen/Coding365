import java.util.HashMap;
import java.util.Scanner;

public class Containsduplicate {

    public static void main (String[] args) {
        System.out.println("Enter some integers separated by commas: ");
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        boolean output = containsDuplicate(numbers);
        System.out.println("Do these numbers have duplicates? " + output);
    }
        
    public static boolean containsDuplicate(String numbers) {
        String[] digits = numbers.split(",");
        HashMap<String, Integer> collection = new HashMap<String,Integer>();

        for (String num:digits) {
            if (!collection.containsKey(num)) {
                collection.put(num, 1);
            } else {
                int valuePlusOne = collection.get(num) + 1;
                collection.put(num, valuePlusOne);
            }
        }
        boolean output = false; 
        for (int i=0; i < digits.length; i++) {
            if (collection.get(digits[i]) > 1) {
                output = true;
                break;
            }
        }
        return output;
    }
}
