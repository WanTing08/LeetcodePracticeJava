package day21_30;

import datastructure.TreeNode;

/*
    Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

    Example:
    Input: root = [4,2,6,1,3]
    Output: 1
 */
public class Day21T530MinimumAbsoluteDifferenceInBST {
    TreeNode prev;
    int minDiff = Integer.MAX_VALUE;
    public int minAbsDiff(TreeNode root){
        inorder(root);
        return minDiff;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);

        if(prev != null){
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }

}
