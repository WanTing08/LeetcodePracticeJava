package day21_30;

import datastructure.TreeNode;

/*
    Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST
    is changed to the original key plus the sum of all keys greater than the original key in BST.
 */
public class Day23T538ConvertBSTtoGreaterTree {
    private int pre;

    public TreeNode greaterTree(TreeNode root){
        pre = 0;
        traverse(root);
        return root;
    }

    private void traverse(TreeNode curr){
        if(curr == null) return;
        traverse(curr.right);
        curr.val += pre;
        pre = curr.val;
        traverse(curr.left);
    }

    public static void main(String[] args) {

    }
}
