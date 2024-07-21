package xyz.optimized.recursivefun.algos.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortSortingTest {

    @Test
    void quickSort() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        QuickSortSorting.quickSort(arr);
        assertArrayEquals(new int[]{1, 5, 7, 8, 9, 10}, arr);
    }

    // write a unit test for this method
    @Test
    void quickSort2() {
        int[] arr = {10, 7, 99, 87, 76, 8, 0, 0, 9, 1, 5, 6};
        int n = arr.length;
        QuickSortSorting.quickSort(arr);
        assertArrayEquals(new int[]{0, 0, 1, 5, 6, 7, 8, 9, 10, 76, 87, 99}, arr);

    }

}