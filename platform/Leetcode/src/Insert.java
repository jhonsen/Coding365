// Solution in Java
import java.util.*;

public class Insert {

    public static void main (String[] args){
        System.out.println("Enter a list of integers separated by commas: ");
        Scanner input1 = new Scanner(System.in); 
        String numberList = input1.nextLine();
        
        System.out.println("Now enter a target number to be inserted: ");
        Scanner input2 = new Scanner(System.in); 
        String targetNumber = input2.nextLine();
        
        int targetIndex = searchInsert(numberList, targetNumber);
        String position = Integer.toString(targetIndex);
        System.out.println("The target number should go on index " + position + " of list above");
    }
    
    public static int searchInsert (String numbers, String target) {    
        String[] items = numbers.split(",");
        List<String> itemList = new ArrayList<String>(Arrays.asList(items));

        for (int i=0; i<itemList.size(); i++ ) {
            if (Integer.valueOf(target) == Integer.valueOf(itemList.get(i)) ) {
                return i;
            } else {
                if (Integer.valueOf(target) > Integer.valueOf(itemList.get(i))) {
                    continue;
                } else {
                    return i;
                }
            }
        }
        int output = itemList.size();
        return output;    
    }
}
