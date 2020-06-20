import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Movezeroes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers including some zeroes, e.g., 0,1,3,0,12");
        String[] numbersString = input.nextLine().split(",");
               
        ArrayList<Integer> nums = new ArrayList<>();
        for (String num: numbersString) {
            nums.add(Integer.parseInt(num));
        }
        
        System.out.println("Your numbers intially were " + nums);
        moveZeroes(nums);
        System.out.println("With zeroes pushed back: " + nums);
    }
    
    public static void moveZeroes(ArrayList<Integer> numbers) {
        int counter = 0;
        ArrayList<Integer> zeroCollection = new ArrayList<Integer>();
        while (numbers.contains(0)) {
            numbers.remove(Integer.valueOf(0));
            counter++;
            zeroCollection.add(0);
        }
        numbers.addAll(zeroCollection);
    }
    
}

