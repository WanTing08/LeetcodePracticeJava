# [110. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)

## Solution
The _**'isBalanced'**_ function checks if a binary tree is balanced by 
recursively checking if the left and right subtrees are balanced 
and if the difference in their heights is no more than 1. 

The **_'getHeight'_** function computes the height of a binary tree recursively
by taking the maximum height of its left and right subtrees and adding 1.

### [code](../../src/main/java/day16_20/Day17T110BalancedBinaryTree.java)

```java
public static boolean isBalanced(TreeNode root){
    
    if(root == null) return true;
    
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    
    if(Math.abs(leftHeight - rightHeight) > 1) return false;
    
    return isBalanced(root.left) && isBalanced(root.right);
}
    
private static int getHeight(TreeNode node){
    
    if(node == null) return 0;
    
    int leftHeight = getHeight(node.left);
    int rightHeight = getHeight(node.right);
    
    return Math.max(leftHeight, rightHeight) + 1;
}
```

# [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

## Solution
