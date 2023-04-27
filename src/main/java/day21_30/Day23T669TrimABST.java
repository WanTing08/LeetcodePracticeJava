package day21_30;

import datastructure.TreeNode;

/*
    Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that
    all its elements lies in [low, high]. Trimming the tree should not change the relative structure of the elements
    that will remain in the tree (i.e., any node's descendant should remain a descendant).
    It can be proven that there is a unique answer.

    Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.

    Example:
    Input: root = [1,0,2], low = 1, high = 2
    Output: [1,null,2]
 */
public class Day23T669TrimABST {
    public static TreeNode trimBST(TreeNode root, int low, int high){
        if(root == null) return null;
        if(root.val < low){
            return trimBST(root.right, low, high);
        }
        if(root.val > high){
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        TreeNode res = trimBST(root, 1, 2);
        printTree(res);
    }

    private static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
