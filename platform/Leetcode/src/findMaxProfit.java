import java.util.Scanner;

public class findMaxProfit{
    public static void main(String[] args) {
        System.out.print("Enter a list of integers (prices), separated by commas: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] numbers = input.split(",");
        
        int[] numberInput = new int[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            numberInput[i] = Integer.parseInt(numbers[i]);
        }
          
        System.out.println("The best day to sell is : " + findMaxProfit(numberInput))  ;      
        
    }
    
    public static int findMaxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int basePrice = prices[0];

        for (int i=1; i<prices.length; i++) {
            int profit = 0;
            if ((prices[i] - basePrice) > 0) {
                profit = (prices[i] - basePrice);
            } else {
                profit = maxProfit;
            }

            if (prices[i] < basePrice) {
                basePrice = prices[i];
            }

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
