import java.util.Scanner;

public class UglyNumber {
    public static void main (String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.valueOf(sc.nextLine());
        boolean result = isUgly(number);
        
        if (result) {
            System.out.println("The number is ugly");
        } else {
            System.out.println("The number is NOT ugly");
        }
        
    }
    
    public static boolean isUgly(int number){
        if (number <= 0) return false;
        if (number == 1) return true;    
        if (number % 2 ==0) return isUgly(number/2);
        if (number % 3 ==0) return isUgly(number/3);
        if (number % 5 ==0) return isUgly(number/5);
        return false;
    }
}