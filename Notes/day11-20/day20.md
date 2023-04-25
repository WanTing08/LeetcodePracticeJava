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

# [700. Search in a Binary Search Tree]()