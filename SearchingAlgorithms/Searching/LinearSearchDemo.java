package Searching;

// LinearSearch Class
class LinearSearch {
    public static boolean search(int arr[], int el) {

        // variable to determine if the element is found or not
        boolean found = false;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] == el) {
                found = true;
                break;
            }
        }
        return found;
    }
}

// class with main method
public class LinearSearchDemo {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        boolean found = LinearSearch.search(arr, 0);
        System.out.println(found);
    }
}
