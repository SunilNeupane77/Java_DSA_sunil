/**
 * This program is a tailed recursion for finding factorial recursively
 * @author Rhythm Babu Kafle
 * 1/10/2024
 */

package Recursion;

import java.util.Scanner;

public class FactorialTail {
    public static int fact ( int n, int fact ) {
        if ( n <= 1 )
            return fact;
        else 
            return fact ( n - 1, n * fact);    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = fact(n, 1);
        System.out.println(result);
        sc.close();
    }
}
