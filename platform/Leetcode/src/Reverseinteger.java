import java.util.Scanner;

public class Reverseinteger {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Integer.valueOf(input.nextLine());
        System.out.print("The reversed integer is " + reverseInteger(number));
    }
    
    public static int reverseInteger(int number) {
        int output = 0;
        StringBuilder newNumber = new StringBuilder();

        if (number > 0) {        
            String num = String.valueOf(number);
            newNumber = newNumber.append(num).reverse();
            output = Integer.parseInt(newNumber.toString());
        } else {
            int positiveNumber = -1 * number;
            String num = String.valueOf(positiveNumber);
            newNumber = newNumber.append(num).reverse();
            output = -1 * Integer.parseInt(newNumber.toString());
        }

        return output;
    }
}
