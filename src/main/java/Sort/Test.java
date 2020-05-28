package Sort;

import static Sort.Array.printArray;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, n - 1);
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length-1);

        System.out.println("\nMerge-sorted array: ");
        printArray(arr);
        System.out.println("\nQuickSorted array: ");
        printArray(arr);
    }
}