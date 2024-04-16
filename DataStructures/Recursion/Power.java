/**
 * 
 */

package Recursion;

public class Power {
    static int power(int base, int power) {
        if (power == 0)
            return 1;
        else
            return base * power(base, power - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
