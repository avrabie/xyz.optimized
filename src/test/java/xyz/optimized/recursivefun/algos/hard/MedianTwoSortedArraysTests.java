package xyz.optimized.recursivefun.algos.hard;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MedianTwoSortedArraysTests {

    // we are testing the extractSecondHalfOfArray method inside MedianTwoSortedArrays Class
    // this method should return the second half of the array

    //testing on an array with even length
    @Test
    void testExtractSecondHalfOfArrayEvenLength() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {4, 5, 6};
        assertArrayEquals(expected, medianTwoSortedArrays.extractSecondHalfOfArray(input));
    }

    //testing on an array with odd length
    @Test
    void testExtractSecondHalfOfArrayOddLength() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5};
        assertArrayEquals(expected, medianTwoSortedArrays.extractSecondHalfOfArray(input));
    }

    //testing on an empty array
    @Test
    void testExtractSecondHalfOfArrayEmpty() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, medianTwoSortedArrays.extractSecondHalfOfArray(input));
    }

    //testing on an array with one element
    @Test
    void testExtractSecondHalfOfArraySingleElement() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals(expected, medianTwoSortedArrays.extractSecondHalfOfArray(input));
    }
}