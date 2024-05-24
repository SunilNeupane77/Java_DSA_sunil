/**
 * Nested Recursion Problem on java 
 -By Sunil Neupane
 */

package Recursion;

public class NestedRecursion {
    public static int nestedRecursionDemo(int n) {
        if (n == 0)
            return 0;
        if (n > 4)
            return n;
        return nestedRecursionDemo(2 + nestedRecursionDemo(2 * n));
    }

    public static void main(String[] args) {
        System.out.println(nestedRecursionDemo(3));
    }
}
