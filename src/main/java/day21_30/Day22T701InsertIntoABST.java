package day21_30;

import datastructure.TreeNode;

/*
    You are given the root node of a binary search tree (BST) and a value to insert into the tree.
    Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

    Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
    You can return any of them.
 */
public class Day22T701InsertIntoABST {
    public static TreeNode insertIntoBST(TreeNode root, int val){

        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }

        if(root.val > val) root.left = insertIntoBST(root.left, val);
        if(root.val < val) root.right = insertIntoBST(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 5;
        TreeNode result = insertIntoBST(root, val);
        printTree(result);
    }

    private static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
