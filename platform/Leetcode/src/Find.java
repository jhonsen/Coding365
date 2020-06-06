import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Find {
    
    public static void main (String[] args) {
        System.out.println("Give me a list of integers separated by commas: ");
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        int result = findSingle(numbers);
        System.out.println("The single integer in the list is: " + result);
    }
    
    public static int findSingle(String numbers) {
        String[] digits = numbers.split(",");
        List<String> list = new ArrayList<String>(Arrays.asList(digits));

        int output = 0; 
        int len = list.size();

        do {
            String toCheck = list.get(len-1);
            list.remove(toCheck);

            if (!list.contains(toCheck)) {
                output = Integer.valueOf(toCheck);
                break;
            } else {
                list.remove(toCheck);
            }
            len = list.size();
        } 
        while (len > 0);
        return output;
    }
}
