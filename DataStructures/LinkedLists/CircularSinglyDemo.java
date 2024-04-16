/**
 * This program implements circular singly linked list
 * 
 * @author Rhythm Babu Kafle
 * 1/1/2024
 */

package LinkedLists;

class Node {
    Integer data;
    Node next;

    Node ( Integer data, Node next ) {
        this.data = data;
        this.next = next;
    }
}

class CircularLinkedList {
    Node head, tail;
    public boolean isEmpty () {
        return (head == null) && (tail == null);
    }

    public void insertHead( int el ){
        if ( isEmpty() ) {
            head = tail = new Node(el, null);
        } else {
            head = new Node (el, head);
        }
    }

    public void deleteHead () {
        if(isEmpty()) {
            return;
        } else if ( head == tail ) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void insertTail ( int el ) {
        if( isEmpty() ) {
            head = tail = new Node( el, null );
        } else {
            tail = tail.next = new Node ( el, head );
        }
    }

    public void deleteTail ( ) {
        if( isEmpty() ) {
            return;
        } else if ( head == tail ){
            head = tail = null;
        } else {
            Node temp = head;
            while( temp.next!=tail ) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        } 
    }

    public boolean search(int el) {
        Node temp = head;
        do {
            temp = temp.next;
        } while ( temp.data!=el && temp!=tail.next);
        if(temp.data == el) {
            return true;
        }
        return false;
    }

    public void printList ( ) {
        Node temp = head; 
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp!=tail.next);
    }
    
}

public class CircularSinglyDemo {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertHead(5);
        cll.insertHead(6);
        cll.insertHead(3);
        cll.insertHead(67);
        cll.insertTail(69);
        cll.insertTail(3);
        cll.insertTail(1);
        
        cll.deleteHead();
        cll.deleteTail();
        cll.printList();
        boolean found = cll.search(37);
        System.out.println(found);
    }
}
