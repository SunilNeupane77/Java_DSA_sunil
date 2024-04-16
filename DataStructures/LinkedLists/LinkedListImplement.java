package LinkedLists;

import java.util.LinkedList;

public class LinkedListImplement {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.isEmpty();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.push(6);
        ll.pop();
        ll.isEmpty();
        System.out.println(ll);
    }
}
