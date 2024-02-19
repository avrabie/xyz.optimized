package xyz.optimized.recursivefun.algos.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianTwoSortedArraysUnitTest {

    /**
     * This class is the Unit Test for MedianTwoSortedArrays. It tests the method findMedianSortedArrays.
     * Each test is focus on a single use case to maintain clarity and readability, and initialize all necessary code within it.
     */
  
    @Test
    public void testFindMedianSortedArrays_SingleElementArrays() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        double result = medianTwoSortedArrays.findMedianSortedArrays(new int[]{5}, new int[]{6});
        Assertions.assertEquals(5.5, result);
    }

    @Test
    public void testFindMedianSortedArrays_SingleElementArrays2() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        double result = medianTwoSortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        Assertions.assertEquals(2.0, result);
    }

    @Test
    public void testFindMedianSortedArrays_EvenLengthArrays() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        double result = medianTwoSortedArrays.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
        Assertions.assertEquals(2.5, result);
    }

    @Test
    public void testFindMedianSortedArrays_OddLengthArrays() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        double result = medianTwoSortedArrays.findMedianSortedArrays(new int[]{1,2,3}, new int[]{4,5,6});
        Assertions.assertEquals(3.5, result);
    }

    @Test
    public void testFindMedianSortedArrays_DifferentLengthArrays() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        double result = medianTwoSortedArrays.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4,5});
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testFindMedianSortedArrays_Negative() {
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        double result = medianTwoSortedArrays.findMedianSortedArrays(new int[]{3}, new int[]{-2,-1});
        Assertions.assertEquals(-1, result);
    }

}