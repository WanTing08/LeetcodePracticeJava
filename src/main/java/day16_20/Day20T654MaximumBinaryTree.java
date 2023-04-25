package day16_20;

import datastructure.TreeNode;

/*
    You are given an integer array nums with no duplicates.
    A maximum binary tree can be built recursively from nums using the following algorithm:

    Create a root node whose value is the maximum value in nums.
    Recursively build the left subtree on the subarray prefix to the left of the maximum value.
    Recursively build the right subtree on the subarray suffix to the right of the maximum value.
    Return the maximum binary tree built from nums.

    Example:
    Input: nums = [3,2,1,6,0,5]
    Output: [6,3,5,null,2,0,null,null,1]
 */
public class Day20T654MaximumBinaryTree {
    public static TreeNode constructTree(int[] nums){
        return construct(nums, 0 , nums.length);
    }

    private static TreeNode construct(int[] nums, int left, int right){
        if(right - left < 1) return null;
        if(right - left == 1) return new TreeNode(nums[left]);

        int maxValueIndex = left;
        int maxValue = nums[maxValueIndex];
        for (int i = left + 1; i < right; i++) {
            if(nums[i] > maxValue){
                maxValue = nums[i];
                maxValueIndex = i;
            }
        }
        TreeNode root = new TreeNode(maxValue);
        root.left = construct(nums, left, maxValueIndex);
        root.right = construct(nums, maxValueIndex + 1, right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        TreeNode root = constructTree(nums);
        printTree(root);
    }


    private static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
