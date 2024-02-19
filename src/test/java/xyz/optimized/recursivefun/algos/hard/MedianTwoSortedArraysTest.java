package xyz.optimized.recursivefun.algos.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedianTwoSortedArraysTest {

   /**
    * This class tests the mergeTwoSortedArrays method of the MedianTwoSortedArrays class.
    * The main aim here is to validate that the merging functionality is correct and combined array
    * is sorted. We're testing a couple of scenarios, both with same length arrays and arrays of different lengths.
    */
   
    @Test
    public void mergeTwoSortedArrays_sameArrayLengths_returnsMergedArray() {
        MedianTwoSortedArrays mtsa = new MedianTwoSortedArrays();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, mtsa.mergeTwoSortedArrays(nums1, nums2));
    }

    @Test
    public void mergeTwoSortedArrays_differentArrayLengths_returnsMergedArray() {
        MedianTwoSortedArrays mtsa = new MedianTwoSortedArrays();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, mtsa.mergeTwoSortedArrays(nums1, nums2));
    }
  
    @Test
    public void mergeTwoSortedArrays_oneEmptyArray_returnsMergedArray() {
        MedianTwoSortedArrays mtsa = new MedianTwoSortedArrays();
        int[] nums1 = {};
        int[] nums2 = {3, 4, 5, 6};
        int[] expected = {3, 4, 5, 6};
        assertArrayEquals(expected, mtsa.mergeTwoSortedArrays(nums1, nums2));
    }
}