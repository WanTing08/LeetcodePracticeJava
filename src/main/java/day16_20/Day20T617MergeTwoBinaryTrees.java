package day16_20;

import datastructure.TreeNode;

/*
    You are given two binary trees root1 and root2.

    Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
    You need to merge the two trees into a new binary tree.
    The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
    Otherwise, the NOT null node will be used as the node of the new tree.

    Return the merged tree.

    Note: The merging process must start from the root nodes of both trees.

    Example:
    Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
    Output: [3,4,5,5,4,null,7]
 */
public class Day20T617MergeTwoBinaryTrees {
    public static TreeNode mergeTree(TreeNode root1, TreeNode root2){
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        root1.val += root2.val;
        root1.left = mergeTree(root1.left, root2.left);
        root2.right = mergeTree(root1.right, root2.right);
        return root1;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(2);
        root2.right = new TreeNode(3);

        TreeNode newTree = mergeTree(root1, root2);

        System.out.println(newTree.val);
        System.out.println(newTree.left.val);
        System.out.println(newTree.right.val);
    }
}
