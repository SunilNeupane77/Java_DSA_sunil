/**
 * factorial of a number by nontail recursion by sunil Neupane
 */

package Recursion;

public class FactorialNonTail {
    public static int fact(int n) {
        if (n <= 1)
            return n;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int result = fact(4);
        System.out.println(result);
    }
}
