package xyz.optimized.recursivefun.algos.medium;




public class QuickSortSorting {

    public static void main(String[] args) {
int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int i, int i1) {
        if (i >= i1) return;
        int pivot = arr[i1];
        int low = i - 1;
        int high = i;
        while (high < i1) {
            if (arr[high] >= pivot) {
                high++;
            } else {
                low++;
                swap(arr, low, high);
                high++;
            }
        }
        swap(arr, low + 1, i1);
        quickSort(arr, 0, low);
        quickSort(arr, low + 2, i1);
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
