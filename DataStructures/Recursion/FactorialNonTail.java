/**
 * This program is a non-tailed recursion for finding factorial recursively
 * @author Rhythm Babu Kafle
 * 1/10/2024
 */

package Recursion;

public class FactorialNonTail {
    public static int fact ( int n ) {
        if ( n <= 1 )
            return n;
        else 
            return n * fact( n - 1 );              
    }

    public static void main(String[] args) {
        int result = fact ( 4 );
        System.out.println(result); 
    }
}
