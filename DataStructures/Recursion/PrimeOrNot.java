/**
 * This code checks whether a number is prime or real by recursion
 * I took help from geeksforgeeks to solve this problem, and want to clarify that this is the only code that I needed help to write 
 * The above sentence holds true for the date: 1/6/2024
 * @author Rhythm Babu Kafle
 * 1/6/2024
 */

package Recursion;

public class PrimeOrNot {
    public static boolean checkForPrime ( int n, int i ) {
        if ( n <= 2 ) 
            return (n == 2) ? true : false;
        if ( n%i == 0) 
            return false;
        if ( n < i*i ) 
            return true;
        
        return checkForPrime(n, i + 1);
      
    }
    public static void main(String[] args) {
        System.out.println(checkForPrime(7, 2));
    }
}
