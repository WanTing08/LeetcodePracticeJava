# [669. Trim a Binary Search Tree]()

## Solution
The method first checks if the root node is null. If it is, then it
returns null. 

If the value of the root node is less than **'low'**, then 
the method recursively trims the right subtree of the root node. 

If the value of the root node is greater than **'high'**, then the method 
recursively trims the left subtree of the root node. 

Finally, the method recursively trims the left and right subtrees of the root 
node and returns the root node of the new trimmed tree.

### [code](../../src/main/java/day21_30/Day23T669TrimABST.java)
```java
public TreeNode trimBST(TreeNode root, int low, int high){
    if(root == null) return null;
    if(root.val < low){
        return trimBST(root.right, low, high);
    }
    if(root.val > high){
        return trimBST(root.left, low, high);
    }
    root.left = trimBST(root.left, low, high);
    root.right = trimBST(root.right, low, high);
    return root;
}
```
# [108. Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
 
## Solution
