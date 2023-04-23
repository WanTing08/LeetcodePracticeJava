package day16_20;

import datastructure.TreeNode;

/*
    Given the root of a complete binary tree, return the number of the nodes in the tree.
    Input: root = [1,2,3,4,5,6]
    Output: 6
 */
public class Day16T222CountCompleteTreeNodes {
    public static int countNum(TreeNode root){
        if(root == null) return 0;
        return countNum(root.left) + countNum(root.right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(countNum(root));
    }
}
