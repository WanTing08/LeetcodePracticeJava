package neetcode150.arraysAndHashing;

import java.util.Arrays;

public class T238_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);

        int pre = 1;
        for (int i = 0; i < n; i++) {
            res[i] *= pre;
            pre *= nums[i];
        }

        int post = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= post;
            post *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
