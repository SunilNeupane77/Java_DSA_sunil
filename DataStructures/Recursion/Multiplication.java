/**
 * This is a recursive program to multipy two numbers
 * @author Rhythm Babu Kafle
 * 1/10/2024
 */

package Recursion;

public class Multiplication {
    static int multiply ( int n, int times ) {
        if ( n <= 1 )
            return times;
        else 
            return times + multiply( n - 1, times );    
    }
    public static void main(String[] args) {
        System.out.println(multiply(5, 6));
    }
}
