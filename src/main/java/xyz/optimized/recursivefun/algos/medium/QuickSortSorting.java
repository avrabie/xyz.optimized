package xyz.optimized.recursivefun.algos.medium;


public class QuickSortSorting {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr);
        printArray(arr);
    }


    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int i1, int i2) {
        if (i1 >= i2) return;
        int pivot = arr[i2];
        int low = i1 - 1;
        int high = i1;
        while (high < i2) {
            if (arr[high] >= pivot) {
                high++;
            } else {
                swap(arr, ++low, high++);
            }
        }
        swap(arr, low + 1, i2);
        quickSort(arr, 0, low);
        quickSort(arr, low + 2, i2);
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }


    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
