import java.util.Scanner;
import java.util.Arrays;

public class Twosum {

    public static void main(String[] args) {
        
        System.out.println("Enter a string of numbers, separated by commas (e.g., 1,2,5,7) and press return.");
        Scanner input = new Scanner(System.in);
        int[] numbers = convertToIntArrays(input.nextLine());        
        
        System.out.print("Now, enter a target value: ");
        int target = Integer.valueOf(input.nextLine());
        
        String result = Arrays.toString(twoSum(numbers, target));
        System.out.println("The indices of numbers having the sum equal to " + target + " are: " + result);
    }
    
    public static int[] convertToIntArrays (String array) {
        String[] stringArray = array.split(",");
        int[] collection = new int[stringArray.length];
        for (int i=0; i <stringArray.length ; i++) {
            collection[i] = Integer.parseInt(stringArray[i]);
        }
        return collection;
    }
    
    public static int[] twoSum(int[] numbers, int target) {   

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] + numbers[i] == target ) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
}
