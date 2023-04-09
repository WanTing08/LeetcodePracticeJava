package day1_5;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * */
public class Day2T977 {
    public static int[] sortedSquares(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];

        while(right >= left){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[k--] = nums[left] * nums[left];
                left++;
            }else{
                result[k--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
