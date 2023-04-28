package day21_30;

import datastructure.TreeNode;

/*
    Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 */
public class Day23T108ConvertSortedArrayToBST {
    public static TreeNode convertToBST(int[] nums){
        TreeNode root = traverse(nums, 0, nums.length - 1);
        return root;
    }

    public static TreeNode traverse(int[] nums, int left, int right){
        if(left > right) return null;
        int mid = left + ((right - left) >> 1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traverse(nums, left, mid - 1);
        root.right = traverse(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = convertToBST(nums);
        printTree(root);
    }

    private static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
