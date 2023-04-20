# [104. Maximum Depth of Binary Tree]()
## Solution
The solution is to use recursion to repeatedly compare the length of 
the left subtree and right subtree.

### [code](../src/main/java/day16_20/Day16T104MaximumDepthOfBinaryTree.java)
```java
public int maxDepth(TreeNode root){
    if(root == null) return 0;
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);
    return Math.max(leftDepth, rightDepth) + 1;
}
```

# []