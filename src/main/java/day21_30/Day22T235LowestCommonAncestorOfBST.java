package day21_30;

import datastructure.TreeNode;

/*
    Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q
    as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
public class Day22T235LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q){

        if(root.val > p.val && root.val > q.val){
            TreeNode left = lowestCommonAncestorBST(root.left, p ,q);
            if(left != null) return left;
        }

        if(root.val < p.val && root.val < q.val){
            TreeNode right = lowestCommonAncestorBST(root.right, p ,q);
            if(right != null) return right;
        }

        return root;
    }
}
