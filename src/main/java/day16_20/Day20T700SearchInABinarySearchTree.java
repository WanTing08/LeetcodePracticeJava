package day16_20;

import datastructure.TreeNode;

/*
    You are given the root of a binary search tree (BST) and an integer val.

    Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
    If such a node does not exist, return null.

    Example:
    Input: root = [4,2,7,1,3], val = 2
    Output: [2,1,3]
 */
public class Day20T700SearchInABinarySearchTree {
    public static TreeNode searchBT(TreeNode root, int val){
        if(root == null || root.val == val) return root;

        TreeNode result = new TreeNode();
        if(root.val > val) result = searchBT(root.left, val);
        if(root.val < val) result = searchBT(root.right, val);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;
        TreeNode result = searchBT(root, val);
        printTree(result);
    }

    private static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
