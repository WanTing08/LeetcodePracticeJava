package day21_30;

import datastructure.TreeNode;

/*
    Given a root node reference of a BST and a key, delete the node with the given key in the BST.
    Return the root node reference (possibly updated) of the BST.

    Basically, the deletion can be divided into two stages:

    Search for a node to remove.
    If the node is found, delete the node.
 */
public class Day22T450DeleteNodeInABST {
    public static TreeNode deleteNode(TreeNode root, int key){
        if(root == null) return root;
        if(root.val == key){
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                TreeNode curr = root.right;
                while(curr.left != null){
                    curr = curr.left;
                }
                curr.left = root.left;
                root = root.left;
                return root;
            }
        }
        if(root.val > key) root.left = deleteNode(root.left, key);
        if(root.val < key) root.right = deleteNode(root.right, key);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        int key = 7;
        TreeNode res = deleteNode(root, key);
        printTree(res);
    }

    private static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
