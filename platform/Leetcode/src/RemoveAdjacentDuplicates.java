import java.util.*;

public class RemoveAdjacentDuplicates{
    
    public static void main(String[] args){
        System.out.print("Enter a string of alphabets and I'll remove the adjacent duplicates: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = removeDuplicates(input);              
        System.out.println("The string without adjacent duplicates is: " + output); 
        
    }
    
    public static String removeDuplicates(String input){

        char[] charArray = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (char c :charArray) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char each: stack){
            sb.append(each);
        }

        return sb.toString();
    }
}
