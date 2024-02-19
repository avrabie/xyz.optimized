package xyz.optimized.recursivefun.algos.hard;

import java.util.Arrays;
import java.util.stream.Stream;

public class MedianTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,5};
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        int[] ints = medianTwoSortedArrays.extractFirstHalfOfArray(nums1);
        System.out.println(Arrays.toString(ints));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // arrange arrays with first median < second median
        if (nums1.length == 0) {
            return findMedian(nums2);
        }
        if (nums2.length==0) {
            return findMedian(nums1);
        }
        double median1 = findMedian(nums1);
        double median2 = findMedian(nums2);
        if (median1 > median2) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        } else if (median1==median2) {
            return median1;
        }

        int[] ints = mergeTwoSortedArrays(extractSecondHalfOfArray(nums1), extractFirstHalfOfArray(nums2));
        return findMedian(ints);

    }

    public int[] extractSecondHalfOfArray(int[] nums){
        if(nums.length<4) return nums;
        int n1 = nums.length%2==0? nums.length/2: nums.length/2+1;
        int[] num1 = Arrays.copyOfRange(nums, n1, nums.length);
        return num1;
    }

    public int[] extractFirstHalfOfArray(int[] nums) {
        if(nums.length<4) return nums;
        int n1 = nums.length%2==0 ? nums.length / 2 : nums.length/2+1;
        int[] num1 = Arrays.copyOfRange(nums, 0, n1);
        return num1;
    }

    public int[] mergeTwoSortedArrays(int[] num1, int[] num2) {
        int[] merged = new int[num1.length + num2.length];
        int i = 0, j = 0, k = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) merged[k++] = num1[i++];
            else merged[k++] = num2[j++];
        }
        if (i < num1.length) continueMerging(merged, k, num1, i);
        else continueMerging(merged, k, num2, j);

        return merged;
    }

    private void continueMerging(int[] merged, int k, int[] nums, int i) {
        while (i < nums.length) {
            merged[k++] = nums[i++];
        }
    }


    public double findMedian(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) {
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        } else {
            return nums[n / 2];
        }
    }
}
