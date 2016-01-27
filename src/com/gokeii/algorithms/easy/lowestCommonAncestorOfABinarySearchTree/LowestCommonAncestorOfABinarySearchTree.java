/******************************************************************************
 * Recursive search with pruning.
 ******************************************************************************/

package com.gokeii.algorithms.easy.lowestCommonAncestorOfABinarySearchTree;

public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val >= p.val && root.val <= q.val) ||
                (root.val <= p.val && root.val >= q.val)) {
            return root;
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return null;
    }
}
