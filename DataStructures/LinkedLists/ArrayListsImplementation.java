package LinkedLists;

import java.util.ArrayList;

public class ArrayListsImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(1, 6);
        System.out.println(al.contains(2));
        al.remove(1);
        System.out.println(al);
    }
}
