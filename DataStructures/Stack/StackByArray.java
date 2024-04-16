/**
 * This is an implementation of Stack using Arrays
 * 
 * @authour Rhythm Babu Kafle
 * 1/1/2024
 */

package Stack;

class StackArrayDemo {
    Integer arr[] = new Integer[10];
    int tos = -1;

    public boolean isEmpty () {
        if ( tos == -1 ) {
            return true;
        }
        return false;
    }

    public void push ( int el ) {
        if(tos == arr.length - 1) {
            System.out.println("Stack OverFlow");
            return;
        }
        tos++;
        arr[tos] = el;
   }

    public void pop () {
        if(tos == -1) {
            System.out.println("Stack UnderFlow");
            return;
        } 
        tos--;
   }

    public void peek () {
        if(tos == -1) {
            System.out.println("No element to be shown");
            return;
        }
        System.out.println(arr[tos]);
    }
}

public class StackByArray {
    public static void main(String[] args) {
        StackArrayDemo sad = new StackArrayDemo();
        System.out.println(sad.isEmpty());
        sad.push(5);
        sad.push(5);
        sad.pop();
        sad.push(6);
        sad.peek();
        System.out.println(sad.isEmpty());
    }
}
