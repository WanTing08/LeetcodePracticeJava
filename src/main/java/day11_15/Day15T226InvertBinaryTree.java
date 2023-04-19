package day11_15;

import datastructure.TreeNode;

/*
    Given the root of a binary tree, invert the tree, and return its root.

    Input: root = [4,2,7,1,3,6,9]
    Output: [4,7,2,9,6,3,1]
 */
public class Day15T226InvertBinaryTree {
    public static TreeNode invert(TreeNode root){
        if(root == null) return null;
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode inverted = invert(root);
        printTree(inverted);
    }

    public static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
