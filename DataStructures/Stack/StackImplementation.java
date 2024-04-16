package Stack;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        st.push('a');
        st.push('b');
        System.out.println(st.capacity());
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
