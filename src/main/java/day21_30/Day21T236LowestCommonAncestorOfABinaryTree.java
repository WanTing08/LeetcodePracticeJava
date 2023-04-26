package day21_30;

import datastructure.TreeNode;

/*
    Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as
    the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
public class Day21T236LowestCommonAncestorOfABinaryTree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

        if(root == p || root == q || root == null) return root; // recursive end condition

        // postorder traversal
        TreeNode left = lowestCommonAncestor(root.left, p ,q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);

        if(left == null && right == null) return null; // if we didn't find the p and q
        else if(left != null && right == null) return left; // if we only find one node
        else if(left == null && right != null) return right; // if we only find one node
        else return root; // if we find both nodes
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode lca = lowestCommonAncestor(root, p ,q);
        System.out.println(lca.val);
    }
}
