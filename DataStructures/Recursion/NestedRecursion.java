/**
 * This code demonstrates a nested recursion
 * @author Rhythm Babu Kafle
 * 1/6/2024
 */

package Recursion;

public class NestedRecursion {
    public static int nestedRecursionDemo ( int n ) {
        if ( n== 0 )
            return 0;
        if ( n > 4 ) 
            return n;            
        return nestedRecursionDemo( 2 + nestedRecursionDemo( 2*n ));
    }
    public static void main(String[] args) {
        System.out.println(nestedRecursionDemo(3));
    }
}
