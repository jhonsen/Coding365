import java.util.*;

public class Countprimes {
    public static void main(String[] args) {
        System.out.print("Enter an integer, and we'll give you the number of primes less than the number: ");
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("The total count of prime numbers below " + number + " is: " + countPrimes(number));
    }
    
    public static int countPrimes(int n) {
       boolean[] isPrime = new boolean[n];
       for (int i = 2; i < n; i++) {
          isPrime[i] = true;
       }
       /* Loop's ending condition is i * i < n instead of i < sqrt(n)
          to avoid repeatedly calling an expensive function sqrt().*/
       for (int i = 2; i * i < n; i++) {
          if (!isPrime[i]) continue;
          for (int j = i * i; j < n; j += i) {
             isPrime[j] = false;
          }
       }
       int count = 0;
       for (int i = 2; i < n; i++) {
          if (isPrime[i]) count++;
       }
       return count;
    }
}
