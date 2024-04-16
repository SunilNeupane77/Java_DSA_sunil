/**
 * This code changes infix expressions to postfix expressions. It does not evaluate the expressions.
 * @author Rhythm Babu Kafle
 * 1/20/2024
 */

package Stack;

import java.util.Stack;

class ConversionLogic {
   
    public static Integer operatorPrecedence ( char ch ) {
        if ( ch == '+' || ch == '-')
            return 1;
        else if ( ch == '*' || ch == '/')
            return 2;
        else if ( ch == '^' )
            return 3;
        else 
            return -1;                    
    }


    public static Character operatorAssociativity ( char ch ) {
        if (ch == '^' )
            return 'R';
        return 'L';    
    }


    public static void infixToPostfix ( String exp ) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
       
        for (Character ch : exp.toCharArray()) {
            if ( !( ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '(' || ch == ')') )
                sb.append(ch);
            else if ( ch == '(' )
                st.push(ch);
            else if ( ch == ')' ) {
                while (!st.isEmpty() && st.peek()!='(') {
                    sb.append(st.pop());                          
                }
                st.pop();
            } else {

                while (!st.isEmpty() && (operatorPrecedence(ch) < operatorPrecedence(st.peek()) || operatorPrecedence(ch) == operatorPrecedence(st.peek()) && operatorAssociativity(ch) == 'L' )) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println("The postfix is: " +sb);
    }   
}


public class InfixToPostfix {
    public static void main(String[] args) {
        String s1 = "5+5-3*2";
        ConversionLogic.infixToPostfix(s1);
    }  
}