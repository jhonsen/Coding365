import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class SplitBalancedString {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an interspersed string of L's and R's : ");
        String input = scan.nextLine();
        
        int output = splitBalancedString(input);
        System.out.println("The maximum number of LR-grouping is :" + output);
        
    }
    
    public static int splitBalancedString(String something) {
        ArrayList<String> letterArray = new ArrayList<String>(Arrays.asList(something.split("")));
        int total_counter = 0;
        int leader_counter = 0;


        String leader = String.valueOf(something.charAt(0));
        int ind = 0;
        while (ind < letterArray.size()) {

            String let = letterArray.get(ind);
            if (let.equals(leader)) {
                leader_counter +=1;  
            } else {
                leader_counter -= 1;
            }

            if (leader_counter == 0) {
                total_counter += 1;
                }
            ind++;

        }
        return total_counter;
    }
    
}