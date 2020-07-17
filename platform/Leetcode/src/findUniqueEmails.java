import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class findUniqueEmails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email addresses, separated by commas: ");
        String userInput = sc.nextLine();
        String[] emails = userInput.split(",");
        int numberUnique = quantifyForwards(emails);
        System.out.println("The unique addresses are " + numberUnique);
    }

    public static int quantifyForwards(String[] emails) {
        HashSet<String> seen = new HashSet<String>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            // Note: one should escape the specific character '.',
            // since it is treated as a regex expression.
            local = local.replaceAll("\\.", "");
            seen.add(local + rest);
        }

        return seen.size();
    }

}