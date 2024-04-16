package Searching;

// This search method only works in an already sorted array

class SearchBinary {
    public static boolean search( int arr[], int key ) {
        int low = 0, high = arr.length - 1, mid;    //  Initializing required variables
        boolean found = false;  //  Indicates when the key is found, used to end the process
        while ( low <= high ) {
            mid = ( low + high ) / 2;
            if ( key < arr[mid] ) 
                high = mid - 1;     // further dividing the search space
            else if ( arr[mid] < key ) 
                low = mid + 1;      // further dividing the search space
            else {
                found = true;
                return found;    
            }
        } 
        return found;
    }
}

public class BinarySearchDemo {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6 };
        boolean res = SearchBinary.search(arr, 5);
        System.out.println(res);
    }
}
