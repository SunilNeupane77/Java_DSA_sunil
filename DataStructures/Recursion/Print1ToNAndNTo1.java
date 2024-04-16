/**
 * This program is a recursive program that prints 1 to n and n to 1
 * @author Rhythm Babu Kafle
 * 1/10/2024
 */

package Recursion;

public class Print1ToNAndNTo1 {
    static void oneToN ( int n ) {
        if ( n == 0)
            return;
        else 
            oneToN(n - 1);
            System.out.println(n);           
    }

    static void NToOne ( int n ) {
        if ( n==0 ) 
            return;
        else 
            System.out.println(n);
            NToOne(n - 1);            
    }

    public static void main(String[] args) {
        System.out.println("Printing from 1 to 5");
        oneToN(5);
        System.out.println("Printing from 5 to 1");
        NToOne(5);
    }
}
