package xyz.optimized.recursivefun.algos.easy;

import java.util.HashMap;
import java.util.Optional;

public class TwoSumOn {
    HashMap<Integer, Integer> kv = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (kv.putIfAbsent(nums[i], i) != null) {
                if (target == 2 * nums[i]) {
                    result[0] = kv.get(nums[i]);
                    result[1] = i;
                    return result;
                }
            }
            if (kv.get(target - nums[i]) != null && target != 2 * nums[i]) {
                result[0] = kv.get(target - nums[i]);
                result[1] = i;
                return result;
            }
        }

        return result;

    }
}
