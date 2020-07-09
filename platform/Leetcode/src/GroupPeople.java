import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class GroupPeople {
    
    public static void main(String[] args) {
        System.out.print("Imagine a list of intgers representing group sizes");
        System.out.print("Enter a list of integers, separated by commas ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] numbers = input.split(",");
        
        int[] numberInput = new int[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            numberInput[i] = Integer.parseInt(numbers[i]);
        }
        
        System.out.print("The indices of how people can be grouped are: " + findPeopleGroup(numberInput));
    }
    
    public static List<List<Integer>> findPeopleGroup(int[] sizeInput) { 
        HashMap<Integer,List<Integer>> groupsizeMap = new HashMap<Integer,List<Integer>>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i<sizeInput.length; i++) {
            if (!groupsizeMap.containsKey(sizeInput[i])) {
                groupsizeMap.put(sizeInput[i], new ArrayList<>());
            }
            groupsizeMap.get(sizeInput[i]).add(i);
            if  (groupsizeMap.get(sizeInput[i]).size() == sizeInput[i]) {
                result.add(groupsizeMap.get(sizeInput[i]));
                groupsizeMap.remove(sizeInput[i]);
            }
        }
        return result;        
    }
}
