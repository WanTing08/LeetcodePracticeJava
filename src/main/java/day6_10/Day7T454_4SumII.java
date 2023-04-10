package day6_10;

import java.util.HashMap;
import java.util.Map;

/*
    Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:

    0 <= i, j, k, l < n
    nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0

    Example 1:

    Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
    Output: 2
    Explanation:
    The two tuples are:
    1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
    2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0

 */
public class Day7T454_4SumII {
    public static int fourSum(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        Map<Integer, Integer> map = new HashMap<>(); //The keys of the map are sums of pairs and the values are the counts of those sums.
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum1 = nums1[i] + nums2[j];
                map.put(sum1, map.getOrDefault(sum1, 0) + 1);
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum2 = -(nums3[i] + nums4[j]);
                count += map.getOrDefault(sum2, 0);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        int count = fourSum(nums1, nums2, nums3, nums4);
        System.out.println(count);
    }
}
