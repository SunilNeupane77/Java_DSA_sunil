/**
 * This program implements Singly Linked List
 * 
 * @author Rhythm Babu Kafle
 * Date: Before 12/25/2023
 */

package LinkedLists;

class Node {
    Integer data;
    Node next;
    
    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }
    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class SLinkedList {
     Node head, tail;
     public SLinkedList() {
        head = tail = null;
     }

     public boolean isEmpty() {
        return ( head == null ) && ( tail == null );
     }

     public void insertAtHead( int el ) {
        if(isEmpty()) {
            head = tail = new Node(el);
        } else {
            head = new Node(el, head);
        }
     }

     public void insertAtTail( int el ) {
        if(isEmpty()) {
            head = tail = new Node(el);
        } else {
            tail = tail.next = new Node(el);
        }
     }

     public void deleteAtTail() {
        if( isEmpty() ) {
            return;
        } else if( head == tail ){
            head = tail = null;
        } else {
            Node temp = head;
            while(temp.next != tail ) {
                temp = temp.next;
            } 
            temp.next = null;
            tail = temp;
        }
     }

     public void deleteAtHead () {
        if( isEmpty() ) {
            return;
        } else if ( head == tail ) {
            head = tail = null;
        } else {
            head = head.next;
        }
     }

     public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        } 
     }
}

public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SLinkedList sl1 = new SLinkedList();
        sl1.insertAtHead(4);
        sl1.insertAtTail(5);
        sl1.insertAtHead(1);
        sl1.insertAtTail(5);
        sl1.insertAtTail(7);
        sl1.deleteAtTail();
        sl1.deleteAtHead();
        sl1.printList();
    }
}
