package Sorting;

class Bshort {
    public void BubbleShort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/**
 * Bubblesort
 */
public class Bubblesort {
    public static void main(String[] args) {
        Bshort bb = new Bshort();
        int arr[] = { 23, 34, 56, 78, 90 };
        bb.BubbleShort(arr, 5);

    }

}