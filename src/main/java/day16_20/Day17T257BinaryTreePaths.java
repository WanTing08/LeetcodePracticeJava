package day16_20;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
    Given the root of a binary tree, return all root-to-leaf paths in any order.

    A leaf is a node with no children.

    Example:
    Input: root = [1,2,3,null,5]
    Output: ["1->2->5","1->3"]

 */
public class Day17T257BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root){
        List<String> result = new ArrayList<>();

        if(root == null) return result;

        dfs(root, "", result);
        return result;
    }

    private static void dfs(TreeNode node, String path, List<String> result){
        if(node.left == null || node.right == null){
            result.add(path + node.val);
            return;
        }
        if(node.left != null){
            dfs(node.left, path + node.val + "->", result);
        }
        if(node.right != null){
            dfs(node.right, path + node.val + "->", result);
        }
    }
}
