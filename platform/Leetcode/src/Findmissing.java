import java.util.Scanner;
import java.util.Arrays;
    
public class Findmissing{
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ordered integers (separated by commas), but leave one behind:");
        String text = input.nextLine();
        String[] numberString = text.split(",");
        
        int[] numbers = new int[numberString.length];
        for (int i=0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }
        System.out.println("The missing integer from the array above is: " + findMissing(numbers));
    }
    
    public static int findMissing(int[] numbers) {
        Arrays.sort(numbers);
        int output = 0;
        if (numbers[0] == 0 && numbers[numbers.length - 1] == numbers.length - 1) {
            output = numbers[numbers.length - 1] + 1;
        } else if (numbers[0] != 0) {
            output = 0;
        } else {
            for (int i=0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] != numbers[i] + 1) {
                    output = numbers[i] + 1;
                }
            }
        }   
        return output;
    }

}
