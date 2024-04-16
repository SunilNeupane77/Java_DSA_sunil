/**
 * This program is for finding fibonacci recursively
 * @author Rhythm Babu Kafle
 * 1/10/2024
 */

package Recursion;

public class Fibonacci {
    public static int fibo ( int n ) {
        if ( n == 0 || n == 1) 
            return n;
        else 
            return fibo( n - 1 ) + fibo ( n - 2);            
    }

    public static void main(String[] args) {
        int result = fibo(0);
        System.out.println(result);
    }
}
