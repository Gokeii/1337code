/******************************************************************************
 * Another recursive traversal.
 ******************************************************************************/

package com.gokeii.algorithms.easy.invertBinaryTree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
