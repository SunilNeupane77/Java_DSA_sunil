/**
 * 
 */

package Recursion;

public class Multiplication {
    static int multiply(int n, int times) {
        if (n <= 1)
            return times;
        else
            return times + multiply(n - 1, times);
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 6));
    }
}
