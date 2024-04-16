/**
 * This code is an implementation of Circular Doubly linked lists
 * @author Rhythm Babu Kafle
 * 1/1/2024
 */

package LinkedLists;

class Node {
    Integer data;
    Node prev, next;
    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}

class CircularDLinkedList {
    Node head, tail;
    boolean isEmpty () {
        return (head == null) && (tail == null);
    }

    public void insertAtHead (int el) {
        if(isEmpty()) {
            head = tail = new Node(null, el, null);
        } else {
            head = new Node(tail, el, head);
            head.next.prev = head;
            tail.next = head;
        }
    }

    public void insertAtTail ( int el ) {
        if(isEmpty()) {
            head = tail = new Node(null, el, null);
        } else { 
            tail = new Node(tail, el, head);
            tail.prev.next = tail;
            head.prev = tail;
        }
    }

    public void deleteAtHead() {
        if(isEmpty()) {
            return;
        } else if( head == tail ) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
            tail.next = head;
        }
    }

    public void deleteAtTail() {
        if(isEmpty()) {
            return;
        } else if( head == tail ) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            head.prev = tail;
        }
    }

    public void printForward () {
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp!=tail.next);
    }

    public void printBackward () {
        Node temp = tail;
        do {
            System.out.println(temp.data);
            temp = temp.prev;
        } while (temp!=head.prev);
    }
}

public class CircularDoublyDemo {
    public static void main(String[] args) {
        CircularDLinkedList cdl = new CircularDLinkedList();
        cdl.insertAtHead(5);
        cdl.insertAtHead(6);
        cdl.insertAtTail(1);
        cdl.insertAtTail(2);
        cdl.printForward();
        cdl.printBackward();
    }
}
