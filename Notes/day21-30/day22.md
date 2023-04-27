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

# [701. Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/)
## Solution
If the **'root'** is null, then the method creates a new TreeNode with **'val'** and returns it.

If the **'root'** is not null, then the method checks whether **'val'** is less than or greater than the value of the **'root'** node. 

If **'val'** is less than the value of the **'root'** node, then the method recursively calls itself with **'root.left'** as 
the new **'root'** and **'val'** as the new value to insert. If **'val'** is greater than the value of the **'root'** node, 
then the method recursively calls itself with **'root.right'** as the new **'root'** and **'val'** as the new value to insert.

Once the correct position for the new node is found, the method returns the modified root node with the new node inserted.
### [code](../../src/main/java/day21_30/Day22T701InsertIntoABST.java)
```java
public static TreeNode insertIntoBST(TreeNode root, int val){

    if(root == null){
        TreeNode node = new TreeNode(val);
        return node;
    }

    if(root.val > val) root.left = insertIntoBST(root.left, val);
    if(root.val < val) root.right = insertIntoBST(root.right, val);
    return root;
}
```

# [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/)

## Solution
We use a recursive approach to traverse the tree and find the node with the given key. 

If the key is less than the current node's value, we traverse to the left subtree, else we traverse to the right subtree. 

If we find the node with the key, we check if it has one child or two children. If it has one child, we return the non-null child. If it has two children, we find the minimum node in the right subtree, replace the value of the current node with the minimum node's value, and then delete the minimum node from the right subtree recursively. 
Finally, we return the root node.

### [code]()
```java
public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) return root;
    if (root.val == key) {
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            TreeNode cur = root.right;
            while (cur.left != null) {
                cur = cur.left;
            }
            cur.left = root.left;
            root = root.right;
            return root;
        }
    }
    if (root.val > key) root.left = deleteNode(root.left, key);
    if (root.val < key) root.right = deleteNode(root.right, key);
    return root;
}
```
















