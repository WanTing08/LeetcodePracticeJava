# [235. Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
## Solution
The function starts by comparing the values of **'root'**, **'p'**, and **'q'**. If both **'p'** and **'q'** are less than **'root'**, then the LCA must be in the left subtree of **'root'**. Therefore, the function makes a recursive call to lowestCommonAncestorBST with **'root.left'**, **'p'**, and **'q'**.

Similarly, if both **'p'** and **'q'** are greater than **'root'**, then the LCA must be in the right subtree of **'root'**. Therefore, the function makes a recursive call to lowestCommonAncestorBST with **'root.right'**, **'p'**, and **'q'**.

If neither of the above conditions is true, then **'root'** is the LCA of **'p'** and **'q'**. In this case, the function returns **'root'**.

## [code](../../src/main/java/day21_30/Day22T235LowestCommonAncestorOfBST.java)
```java
public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q){

    if(root.val > p.val && root.val > q.val){
        TreeNode left = lowestCommonAncestorBST(root.left, p ,q);
        if(left != null) return left;
    }

    if(root.val < p.val && root.val < q.val){
        TreeNode right = lowestCommonAncestorBST(root.right, p ,q);
        if(right != null) return right;
    }

    return root;
}
```

