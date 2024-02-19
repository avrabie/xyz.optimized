package xyz.optimized.recursivefun.algos.hard;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MedianTwoSortedArrays1Test {

    private final MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();

    /**
     * Test case for the method extractFirstHalfOfArray when the array has odd number of elements
     */
    @Test
    public void testExtractFirstHalfOfArrayOdd() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3};
        int[] actual = medianTwoSortedArrays.extractFirstHalfOfArray(nums);
        assertArrayEquals(expected, actual, "The first half of the array should only contain the first two elements");
    }

    /**
     * Test case for the method extractFirstHalfOfArray when the array has even number of elements
     */
    @Test
    public void testExtractFirstHalfOfArrayEven() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 2};
        int[] actual = medianTwoSortedArrays.extractFirstHalfOfArray(nums);
        assertArrayEquals(expected, actual, "The first half of the array should only contain the first two elements");
    }

    /**
     * Test case for the method extractFirstHalfOfArray when the array contains a single element
     */
    @Test
    public void testExtractFirstHalfOfArraySingleElement() {
        int[] nums = {1};
        int[] expected = {1};
        int[] actual = medianTwoSortedArrays.extractFirstHalfOfArray(nums);
        assertArrayEquals(expected, actual, "The first half of the array should be empty as the array only contains one element");
    }

    /**
     * Test case for the method extractFirstHalfOfArray when the array is empty
     */
    @Test
    public void testExtractFirstHalfOfArrayEmpty() {
        int[] nums = {};
        int[] expected = {};
        int[] actual = medianTwoSortedArrays.extractFirstHalfOfArray(nums);
        assertArrayEquals(expected, actual, "The first half of the empty array should be an empty array");
    }
}