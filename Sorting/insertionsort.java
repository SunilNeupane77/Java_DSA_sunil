package Sorting;

public class insertionsort {
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11 };
        insertionSort(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
