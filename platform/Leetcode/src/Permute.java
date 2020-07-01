import java.util.ArrayList;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        System.out.print("Enter integers separated by commas (e.g., 1,2,3): ");
        Scanner sc = new Scanner(System.in);
        
        String[] nums = sc.nextLine().split(",");
        ArrayList<Integer> testCase = new ArrayList<Integer>();
        
        for (String num: nums) {
            testCase.add(Integer.parseInt(num));
        }
        
        System.out.println("The permutations are: " + permute(testCase));
    }
    
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> numbers) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

        if (numbers.size() == 1) {
            output.add(numbers);
        } else {
            for (int idx=0; idx < numbers.size(); idx++) {

                // make new ArrayList of numbers without a specific number
                ArrayList<Integer> tempNumbers = new ArrayList<Integer>();
                for (Integer num: numbers) {
                    if (num != numbers.get(idx)) {
                        tempNumbers.add(num);
                    }
                }

                // iterate over temp ArrayList
                for (ArrayList<Integer> each: permute(tempNumbers)) {
                    ArrayList<Integer> leftArray = new ArrayList<Integer>();            
                    leftArray.add(numbers.get(idx));
                    leftArray.addAll(each);

                    output.add(leftArray);
                }
             }
        }
        return output;
    
    }

}

