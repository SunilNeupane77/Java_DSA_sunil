package Queue;

class QueueLogic {
    int f = -1, r = -1, s, arr[];
    QueueLogic(int s) {
        this.s = s;
        arr = new int[s];
    }

    public void enqueue( int el ) {
        if ( f == (r+1)%s) {
            System.out.println("Queue full");
            return;
        } else if (f == -1 && r == -1) {
            f = (f+1)%s;
            r = (r+1)%s;
            arr[r] = el;   
        } else {
            r = (r+1)%s;
            arr[r] = el;
        }
    }

    public void dequeue () {
        if (f==-1 && r == -1) {
            System.out.println("Queue empty");
            return;
        }
        f = (f+1)%s;
    }

    public void printQueue ( ) {
        int temp = f;
        while ( f != r+1 ) {
            System.out.println(arr[f]);
            f++;
        }
        f = temp;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        QueueLogic ql = new QueueLogic(5);
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(5);
        ql.enqueue(5);
        ql.dequeue();        
        ql.printQueue();

    }
}
