package Queue;

class LQueueLogic {
    int f = -1, r = -1, s, arr[];
    public LQueueLogic( int s ) {
        this.s = s;
        arr = new int[s];
    }

    public void enqueue ( int el ) {
        if(f==-1 && r==-1) {
            f++;
            r++;
            arr[r] = el;
        } else if (r == arr.length-1) {
            System.out.println("Queue full");
        } else {
            r++;
            arr[r] = el;
        }
    }

    public void dequeue () {
        if ( (f==-1 && r==-1) || f == r+1) {
            System.out.println("Queue Empty");
            return;
        }
        f++;
    }

    public void printQueue () {
        int temp = f;
        while ( f!=r+1) {
            System.out.println(arr[f]);
            f++;
        }
        f = temp;
    }
}

public class LinearQueue {
    public static void main(String[] args) {
        LQueueLogic lq = new LQueueLogic(3);
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        
        lq.dequeue();
        lq.printQueue();
        lq.dequeue();
        lq.dequeue();
       
    }
}
