/**
 * This program implements doubly linked list
 * 
 * @author Rhythm Babu Kafle
 * 12/25/2023
 */

package LinkedLists;

class Node {
    int data;
    Node prev, next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

class DLinkedList {
    Node head, tail;
    boolean isEmpty () {
        return (head == null) && (tail == null);
    }

    public void insertAtHead (int el) {
        if(isEmpty()) {
            head = tail = new Node(null, el, null);
        } else {
            head = new Node(null, el, head);
            head.next.prev = head;
        }
    }

    public void insertAtTail ( int el ) {
        if(isEmpty()) {
            head = tail = new Node(null, el, null);
        } else { 
            tail = new Node(tail, el, null);
            tail.prev.next = tail;
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
        }
    }

    public void printForward () {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printBackward () {
        Node temp = tail;
        while(temp!=null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DLinkedList dl = new DLinkedList();
        dl.insertAtHead(5);
        dl.insertAtHead(6);
        dl.insertAtHead(7);
        dl.insertAtTail(9);
        dl.deleteAtHead();
        dl.deleteAtTail();
        dl.printForward();
        System.out.println("--------------");
        dl.printBackward();
    }
}

