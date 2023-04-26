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
# [501. Find Mode in Binary Search Tree](https://leetcode.com/problems/find-mode-in-binary-search-tree/)
## Solution

Perform an inorder traversal of the binary search tree, keeping track
of the previous node visited, the count of current value, the maximum 
count seen so far, and a list of node seen so far. 

At each node visited, update the count and compare it with the maximum count.
If the count is greater than the maximum count, update the modes list with the current value. If the count is equal to the maximum count, add the current value to the modes list. Finally, return the modes list as an array of integers.

