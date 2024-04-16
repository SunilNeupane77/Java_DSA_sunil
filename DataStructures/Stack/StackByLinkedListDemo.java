/**
 * This program implements stack with the help of LinkedList
 * 
 * @author Rhythm Babu Kafle
 * 12/25/2023
 */


package Stack;

import java.util.LinkedList;

class StackDemo<T> {
    LinkedList<T> stk = new LinkedList<>();

    public void push( T el ) {
        stk.addFirst(el);
    }

    public void pop() {
        if(stk.isEmpty()) {
            System.out.println("Stack UnderFlow");
        } else {
            stk.removeFirst();
        }
    }

    public T peek() {
        if(stk.isEmpty()) {
            return null;
        } 
        return stk.getFirst();        
    }
}

public class StackByLinkedListDemo {
    public static void main(String[] args) {
        StackDemo<Integer> stk = new StackDemo<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.pop();
        stk.pop();
        stk.pop();
        
        System.out.println(stk.peek());
    }
}
