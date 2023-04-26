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

### [code](../../src/main/java/day21_30/Day21T501FindModeInBinarySearchTree.java)
```java
public class Solution {
    private int preVal;
    private int count;
    private int maxCount;
    private List<Integer> modes;

    public int[] findMode(TreeNode root) {
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

    public void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        if (node.val == preVal) {
            count++;
        } else count = 1;

        if (count > maxCount) {
            maxCount = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == maxCount) {
            modes.add(node.val);
        }
        preVal = node.val;

        inorder(node.right);
    }
}
```

# [236. Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)

## Solution
The method starts by checking if the root is null or if either p or 
q is equal to the root. If any of these conditions is true, then the 
root is the LCA, and we return it.

Otherwise, we recursively search for the LCA in the left and right 
subtrees of the root. We call the method again with the left child
of the root and the nodes p and q. Similarly, we call the method with
the right child of the root and the nodes p and q.

Once we have LCA for the left and right subtrees,  we need to combine them to get the LCA for the entire tree.
There are four cases:
- If left and right LCA are null, then there is no common ancestor, return null
- If the left LCA is not null and the right LCA is null, then the left LCA is the LCA for entire tree, and return it
- If the right LCA is not null, and the left LCA is null, then the right LCA is the LCA for the entire tree, and return it.
- Otherwise, both left and right LCA are not null, and the root is the LCA for the entire tree, so we return it.

### [code](../../src/main/java/day21_30/Day21T236LowestCommonAncestorOfABinaryTree.java)

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

    if(root == p || root == q || root == null) return root; // recursive end condition

    // postorder traversal
    TreeNode left = lowestCommonAncestor(root.left, p ,q);
    TreeNode right = lowestCommonAncestor(root.right, p ,q);

    if(left == null && right == null) return null;       // if we didn't find the p and q
    else if(left != null && right == null) return left;  // if we only find one node
    else if(left == null && right != null) return right; // if we only find one node
    else return root;                                    // if we find both nodes
}
```


