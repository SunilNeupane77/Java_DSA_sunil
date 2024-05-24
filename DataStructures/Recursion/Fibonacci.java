/**
 * Fibonacci number in recursion by sunil Neupane
 */

package Recursion;

public class Fibonacci {
    public static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int result = fibo(0);
        System.out.println(result);
    }
}
