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
The approach to solve this problem is to recursively divide the array in half to construct the left and right subtrees of the root node. The middle element of the array is chosen as the root of the subtree, and then we construct the left subtree using the left half of the array and the right subtree using the right half of the array.

### [code](../../src/main/java/day21_30/Day23T108ConvertSortedArrayToBST.java)
```java
public static TreeNode convertToBST(int[] nums){
    TreeNode root = traverse(nums, 0, nums.length - 1);
    return root;
}

public static TreeNode traverse(int[] nums, int left, int right){
    if(left > right) return null;
    int mid = left + ((right - left) >> 1);
    TreeNode root = new TreeNode(nums[mid]);
    root.left = traverse(nums, left, mid - 1);
    root.right = traverse(nums, mid + 1, right);
    return root;
}
```

# [538. Convert BST to Greater Tree](https://leetcode.com/problems/convert-bst-to-greater-tree/)

## Solution
The idea to solve this problem is to traverse the BST in reverse order,
i.e., right subtree, current node, and then left subtree. While traversing,
we maintain a running sum of all nodes visited so far, and update the 
current node's value to the new sum.

### [code](../../src/main/java/day21_30/Day23T538ConvertBSTtoGreaterTree.java)
```java
public class Solution {
    
    private int pre;

    public TreeNode greaterTree(TreeNode root) {
        pre = 0;
        traverse(root);
        return root;
    }

    private void traverse(TreeNode curr) {
        if (curr == null) return;
        traverse(curr.right);
        curr.val += pre;
        pre = curr.val;
        traverse(curr.left);
    }
}
```