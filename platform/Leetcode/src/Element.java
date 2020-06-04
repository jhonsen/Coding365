import java.util.HashMap;
import java.util.Scanner;

public class Element {
    
    public static void main(String[] args) {
        System.out.print("Enter a list of integers separated by commas: ");
        Scanner input = new Scanner(System.in);
        String numberString = input.nextLine();
        System.out.println("The most common integer is: " + findMajority(numberString));
    }
    
    public static int findMajority(String numbers) {
        String[] numbersArray = numbers.split(",");
        int maxInt = 0;
        int maxVal = 0;

        HashMap<String, Integer> collection = new HashMap<String, Integer> ();

        for (String num:numbersArray){
            if(!collection.containsKey(num)) {
                collection.put(num, 1);

                if (collection.get(num)>maxVal) {
                    maxVal = collection.get(num);
                    maxInt = Integer.parseInt(num);
                }

            } else {
                int value = collection.get(num);
                collection.put(num, value + 1);
                if (collection.get(num) > maxVal) {
                    maxVal = collection.get(num);
                    maxInt = Integer.parseInt(num);
                }
            }
        }

        return maxInt;
    }    
}
