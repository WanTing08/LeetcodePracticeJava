/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 * Example 1:
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 *
 * */

public class Day2T209 {
    public int minSubArrayLen(int[] nums, int target){
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while(right < nums.length){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

        /*
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLen;
        }
         */
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        Day2T209 obj = new Day2T209();
        int minLen = obj.minSubArrayLen(nums, target);
        System.out.println(minLen);
    }
}
