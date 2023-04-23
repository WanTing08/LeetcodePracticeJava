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
The solution uses depth-first search(DFS) to traverse the binary tree 
and find all the paths from the root node to left nodes. 

The **'binaryTreePaths'** method initializes the list of paths and check if
the root node is null. If the root is null, the method return the empty list
of paths. Otherwise, it calls the **'dfs'** method to traverse the binary tree.

The **'dfs'** method is a recursion way that takes the current node, 
the path from root node to the current node, and the list of paths as 
parameters. If current node is a leaf node, the method append the current
node value to the path and add it to the list of paths. 

If the current node has a left or right child, the method recursively calls itself with the child node, the updated path,
and the list of paths. The path is updated by appending the current node value and "->" to indicate the path to the child node.

Finally, the **'binaryTreePaths'** method returns the list of paths.

```java
public static List<String> binaryTreePaths(TreeNode root){
    List<String> result = new ArrayList<>();
    if(root == null) return result;
    dfs(root, "", result);
    return result;
    }
    
private static void dfs(TreeNode node, String path, List<String> result){
    if(node.left==null||node.right==null){
        result.add(path+node.val);
        return;
    }
    if(node.left!=null){
        dfs(node.left,path+node.val+"->",result);
    }
    if(node.right!=null){
        dfs(node.right,path+node.val+"->",result);
    }
}    
```

