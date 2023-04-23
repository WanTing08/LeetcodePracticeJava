# [104. Maximum Depth of Binary Tree]()
## Solution
The solution is to use recursion to repeatedly compare the length of 
the left subtree and right subtree.

### [code](../../src/main/java/day16_20/Day16T104MaximumDepthOfBinaryTree.java)
```java
public int maxDepth(TreeNode root){
    if(root == null) return 0;
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);
    return Math.max(leftDepth, rightDepth) + 1;
}
```

# [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

## Solution
The solution uses recursive way. The base case is when 'root' is 'null',
in which case the depth is 0. The next base case is when 'root' has no
children, in which case the depth is 1.

If **'root'** has children, we recursively compute the minimum depth of the
left and right subtrees. If **'root'** has a left child, we call **'minDepth'** on
it; otherwise, we set **'leftDepth'** to **'Integer.MAX_VALUE'** to ensure that it
is not chosen as the minimum. Similarly, if **'root'** has a right child, 
we call **'minDepth'** on it; otherwise, we set **'rightDepth'** to 
**'Integer.MAX_VALUE'**. The minimum depth of the tree rooted at **'root'** is 
then 1 plus the minimum of **'leftDepth'** and **'rightDepth'**.

### [code](../../src/main/java/day16_20/Day16T111MinimumDepthOfBinaryTree.java)
```java
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
```

# [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/description/)

## Solution

This solution is based on the observation that the total number of nodes in a binary tree is equal to the number of nodes in its left subtree plus the number of nodes in its right subtree plus one (for the root node). We recursively count the nodes in the left and right subtrees, and add them together along with one to get the total number of nodes in the tree.

This solution doesn't take advantage of the fact that the tree is a complete binary tree, so it may be slower for large trees.

### [code](../../src/main/java/day16_20/Day16T222CountCompleteTreeNodes.java)

```java
public static int countNum(TreeNode root){
    if(root == null) return 0;
    return countNum(root.left) + countNum(root.right) + 1;
}
```
