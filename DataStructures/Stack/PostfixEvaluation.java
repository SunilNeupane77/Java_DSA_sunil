/**
 * This code evaluates postfix expression and changes it to a numeric value.
 * 
 * NOTE: Please enter only one digit value before converting to postfix i.e. if exp is 3*72, 7 and 2 are counted as different numbers.
 *       Also, Enter the expression in postfix form. Use https://www.web4college.com/converters/infix-to-postfix-prefix.php to convert infix to postfix.
 * @author Rhythm Babu Kafle   
 * 1/20/2024
 */

package Stack;

import java.util.Stack;

public class PostfixEvaluation {
    public static double postfixEvaluation ( String s ) {
        Stack<Double> st = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if( ch >= '0' && ch <= '9'){ 
                st.push(Character.getNumericValue(ch) * 1.0);
            }
            else {
                double y = st.pop();
                double x = st.pop();
                double r = 0;
                switch (ch) {
                    case '+':
                        r = x + y;
                        break;
                    case '-':
                        r = x - y;
                        break;
                    case '*':
                        r = x * y;
                        break;
                    case '/':
                        r = x / y; 
                        break;
                    case '^':
                        r = Math.pow(x, y);
                        break;    
                    default:
                        break;
                }
                st.push(r);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String s1 = "55+32*-";
        System.out.println(postfixEvaluation(s1));;
    }
}
