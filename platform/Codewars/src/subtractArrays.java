import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class subtractArrays{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String[] firstArray = sc.nextLine().split(",");
        System.out.println("Enter a list of integers to subtract: ");
        String[] secondArray = sc.nextLine().split(",");        
        
        int[] firstIntegers = new int[firstArray.length];
        for (int i=0; i<firstArray.length; i++) {
            firstIntegers[i] = Integer.parseInt(firstArray[i]);
        }
        
        int[] secondIntegers = new int[secondArray.length];
        for (int i=0; i<secondArray.length; i++) {
            secondIntegers[i] = Integer.parseInt(secondArray[i]);
        }
        
        ArrayList<Integer> output = subtractArrays(firstIntegers, secondIntegers);
        System.out.print("The remainders are " + output);
    }
    
    public static ArrayList<Integer> subtractArrays(int[] a, int[] b){
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int eachA:a) {
            if (!Arrays.stream(b).anyMatch(i -> i == eachA)) output.add(eachA);        
        }
        return output;
    }
    
}
