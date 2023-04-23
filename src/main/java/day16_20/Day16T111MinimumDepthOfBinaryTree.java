package day16_20;

import datastructure.TreeNode;

/*
    Given a binary tree, find its minimum depth.

    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

    Note: A leaf is a node with no children.

 */
public class Day16T111MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(root.left == null){
            return rightDepth + 1;
        }
        if(root.right == null){
            return leftDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
