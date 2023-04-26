package day21_30;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.

    If the tree has more than one mode, return them in any order.

    Assume a BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than or equal to the node's key.
    The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
    Both the left and right subtrees must also be binary search trees.

    Example：
    Input: root = [1,null,2,2]
    Output: [2]

    Input: root = [0]
    Output: [0]
 */
public class Day21T501FindModeInBinarySearchTree {
    private int preVal;
    private int count;
    private int maxCount;
    private List<Integer> modes;
    public int[] findMode(TreeNode root){
        preVal = 0;
        count = 0;
        maxCount = 0;
        modes = new ArrayList<>();

        inorder(root);

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    public void inorder(TreeNode node){
        if(node == null) return;

        inorder(node.left);

        if(node.val == preVal){
            count++;
        }else count = 1;

        if(count > maxCount){
            maxCount = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == maxCount) {
            modes.add(node.val);
        }
        preVal = node.val;

        inorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        Day21T501FindModeInBinarySearchTree solution = new Day21T501FindModeInBinarySearchTree();
        int[] res = solution.findMode(root);
        System.out.println(Arrays.toString(res));
    }

}
