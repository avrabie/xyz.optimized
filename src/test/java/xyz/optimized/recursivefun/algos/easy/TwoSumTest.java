package xyz.optimized.recursivefun.algos.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TwoSumTest class contains tests for the twoSum method in the TwoSum class.
 */
public class TwoSumTest {

    @Test
    void twoSum_SumsMatchTarget_ReturnsIndices() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(nums, 9);

        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum_NoSumsMatchTarget_ReturnsZeroArray() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(nums, 10);

        Assertions.assertArrayEquals(new int[]{0, 0}, result);
    }
    
    @Test
    void twoSum_ContainsNegativeNumbers_ReturnsIndices() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {-3, 4, 3, 90};
        int[] result = twoSum.twoSum(nums, 0);

        Assertions.assertArrayEquals(new int[]{0, 2}, result);
    }
}