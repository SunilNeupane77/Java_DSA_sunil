/**
 * 
 */

package Recursion;

public class PrimeOrNot {
    public static boolean checkForPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (n < i * i)
            return true;

        return checkForPrime(n, i + 1);

    }

    public static void main(String[] args) {
        System.out.println(checkForPrime(7, 2));
    }
}
