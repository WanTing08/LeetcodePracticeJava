# [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)

## Solution
The solution uses recursion to invert the left and right subtree of each
node in the binary tree. If the root node is null, it returns null. Otherwise,
it calls the 'invert' method recursively on the left and right subtree, 
and then swap the left and right subtrees of the current node before returning
the root node.

### [code](../../src/main/java/day11_15/Day15T226InvertBinaryTree.java)
```java
public TreeNode invert(TreeNode root){
    if(root == null) return null;
    TreeNode left = invert(root.left);
    TreeNode right = invert(root.right);
    root.left = right;
    root.right = left;
    return root;
}
```

# [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

## Solution
To solve this problem, we can use a recursive approach. We first check if the root node is null. If it is, then the tree is symmetric.
If not, we call a helper function that checks if the left and right subtrees
are mirror image of each other. To check if two trees are mirror images of each other, we compare their values and recursively compare the left subtree of one with the right subtree of the other, and vice versa. If all these comparisons return true, then we can say that the binary tree is symmetric.

### [code](../../src/main/java/day11_15/Day15T101SymmetricTree.java)
```java
public static boolean isSymmetric(TreeNode root){
    if(root == null) return true;
    return isMirror(root.left, root.right);
}

public static boolean isMirror(TreeNode left, TreeNode right){
    if(left == null && right == null) return true;
    if(left == null || right == null) return false;
    if(left.val != right.val) return false;
    return isMirror(left.left, right.right) && isMirror(left.right, right.left);
}
```

