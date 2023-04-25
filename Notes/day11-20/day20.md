# [654. Maximum Binary Tree](https://leetcode.com/problems/maximum-binary-tree/)

## Solution
The **'constructTree'** method take an integer array **'nums'** as input and returns
the root of a maximum tree that can be constructed from the elements
of **'nums'**.

The solution uses a recursive helper method 'construct' to construct the binary tree.

The **'construct'** method takes the input array 'nums' and two indices
**'left'** and **'right'** that specify the range of the elements to consider.
It returns the root of a maximum binary tree that can be constructed from the elements in the specified range.

The **'construct'** method recursively constructs the left and right subtrees
of a new node with the maximum element in the specified range as its
value, using the same 'construct' method on the left and right subranges
of the maximum element.

### [code](../../src/main/java/day16_20/Day20T654MaximumBinaryTree.java)
```java
public static TreeNode constructTree(int[] nums){
    return construct(nums, 0 , nums.length);
}

private static TreeNode construct(int[] nums, int left, int right){
    if(right - left < 1) return null;
    if(right - left == 1) return new TreeNode(nums[left]);
    
    int maxValueIndex = left;
    int maxValue = nums[maxValueIndex];
    for (int i = left + 1; i < right; i++) {
        if(nums[i] > maxValue){
            maxValue = nums[i];
            maxValueIndex = i;
        }
    }
    TreeNode root = new TreeNode(maxValue);
    root.left = construct(nums, left, maxValueIndex);
    root.right = construct(nums, maxValueIndex + 1, right);
    return root;
}
```

# [617. Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/)

### [code](../../src/main/java/day16_20/Day20T617MergeTwoBinaryTrees.java)

```java
public static TreeNode mergeTree(TreeNode root1, TreeNode root2){
    if(root1 == null) return root2;
    if(root2 == null) return root1;
    root1.val += root2.val;
    root1.left = mergeTree(root1.left, root2.left);
    root2.right = mergeTree(root1.right, root2.right);
    return root1;
}
```

# [700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)

## Solution

The method checks if the root node is null or if the value of the root node is equal to the value being searched for. If either of these conditions are true, the root node is returned.

If the value being searched for is less than the value of the root node, then the method recursively calls itself with the left child of the root node as the new root. If the value being searched for is greater than the value of the root node, then the method recursively calls itself with the right child of the root node as the new root.

If the value being searched for is not found in the tree, then null is returned.
### [code](../../src/main/java/day16_20/Day20T700SearchInABinarySearchTree.java)
```java
public static TreeNode searchBT(TreeNode root, int val){
    
    if(root == null || root.val == val) return root;
    
    TreeNode result = new TreeNode();
    
    if(root.val > val) result = searchBT(root.left, val);
    if(root.val < val) result = searchBT(root.right, val);
    
    return result;
}
```

# [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)

## Solution
The method **'isValidBST(TreeNode root)'** is the main entry point of the 
recursive function. It calls the **'isValidBST(TreeNode root, 
long minVal, long maxVal)'** method and passes in the root node of the 
binary search tree, as well as the minimum and maximum values that 
a node in the tree can have.

The method **'isValidBST(TreeNode root, long minVal, long maxVal)'** is 
the recursive helper method that checks if the binary 
search tree rooted at the given root node is valid within the given 
range of **'minVal'** and **'maxVal'**.

The base case of the recursion is when the root node is null, which 
means that the tree is empty and therefore a valid binary search tree. 
If the root node's value is less than or equal to the **'minVal'** or greater 
than or equal to the **'maxVal'**, then the tree is not a valid binary 
search tree, so the method returns false.

Otherwise, the method recursively calls itself on the left and right 
child nodes of the root node, passing in the updated **'minVal'** and
**'maxVal'** values. The left child node's **'maxVal'** is updated to be 
**'root.val'** since any node in the left subtree must be less than 
the root node, and the right child node's **'minVal'** is updated to be 
**'root.val'** since any node in the right subtree must be greater than 
the root node.


### [code](../../src/main/java/day16_20/Day20T98ValidateBinarySearchTree.java)
```java
public static boolean isValidBST(TreeNode root){
    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

public static boolean isValidBST(TreeNode root, long minVal, long maxVal){
    if(root == null) return true;
    if(root.val <= minVal || root.val >= maxVal) return false;
    return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
}
```

### Attention
If a node in the valid binary search tree has the value of **_'Integer.MAX_VALUE'_** or 
_**'Integer.MIN_VALUE'**_, then the value of the parent node must be outside
of the range of the int data type, which causes an incorrect 
result if we compare with int values.

By using the long data type, we can expand the range of possible values that a node can have in the 
binary search tree, ensuring that the function can handle all 
possible cases of binary search trees, including cases where nodes 
have the values of _**'Integer.MAX_VALUE'**_ or _**'Integer.MIN_VALUE'**._