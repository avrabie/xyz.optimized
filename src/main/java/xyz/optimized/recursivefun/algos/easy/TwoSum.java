package xyz.optimized.recursivefun.algos.easy;

public class TwoSum {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int pair = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    pair = j;
                    break;
                }
            }
            if (pair != 0) {
                result[0] = i;
                result[1] = pair;
                return result;
            }
        }
        return result;
    }


}
