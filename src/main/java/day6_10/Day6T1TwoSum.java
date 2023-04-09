package day6_10;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * */
public class Day6T1TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        if(nums == null || nums.length == 0) return res;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
