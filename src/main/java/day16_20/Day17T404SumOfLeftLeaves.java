package day16_20;

import datastructure.TreeNode;

/*
    Given the root of a binary tree, return the sum of all left leaves.

    A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.


 */
public class Day17T404SumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root){
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(sumOfLeftLeaves(root));
    }
}
