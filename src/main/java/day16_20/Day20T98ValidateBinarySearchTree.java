package day16_20;

import datastructure.TreeNode;

/*
    Given the root of a binary tree, determine if it is a valid binary search tree (BST).

    A valid BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.

    Example:
    Input: root = [2,1,3]
    Output: true
 */
public class Day20T98ValidateBinarySearchTree {
    public static boolean isValidBST(TreeNode root){
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, long minVal, long maxVal){
        if(root == null) return true;
        if(root.val <= minVal || root.val >= maxVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
