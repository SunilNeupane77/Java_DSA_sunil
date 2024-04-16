/**
 * This code finds the GCD ( also known as HCF ) using recursion
 * @author Rhythm Babu Kafle
 * 1/6/2024
 */

package Recursion;

public class GCD {
    public static int gcdRecursive ( int a, int b ) {
        if ( a == 0) {
            return b;
        } else {
            return gcdRecursive(b%a, a);
        }
    }

    public static void main(String[] args) {
        System.out.println("GCD of 9 and 24 is : " + gcdRecursive(9, 24));
    }
}
