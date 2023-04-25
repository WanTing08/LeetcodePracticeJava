# [530. Minimum Absolute Difference in BST](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)

## Solution
The problem is to find the minimum absolute difference between any two nodes in a binary search tree (BST).
To solve this problem, we perform an inorder traverse of the BST, keeping
tracking of the previous node we visited and updating the minimum difference
accordingly.

We start by checking if the root is null. If it is, return 0. Otherwise, 
we call a recursion helper method that performs an inorder traverse of
the BST. During the traversal, we compute the absolute difference between
the current node and its previous nods, and updating the minimum difference
accordingly. Once the traversal is complete, we return the minimum difference.

### [code](../../src/main/java/day21_30/Day21T530MinimumAbsoluteDifferenceInBST.java)

```java
class Solution {
    TreeNode prev;
    int minDiff = Integer.MAX_VALUE;
    
    public int minAbsDiff(TreeNode root){
        inorder(root);
        return minDiff;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);

        if(prev != null){
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }
}
```
