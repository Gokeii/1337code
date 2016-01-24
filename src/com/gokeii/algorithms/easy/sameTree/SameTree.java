/******************************************************************************
 * Another recursive traversal.
 ******************************************************************************/

package com.gokeii.algorithms.easy.sameTree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) {
            return true;
        }

        if (null != p && null != q && p.val == q.val
                && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
            return true;
        } else {
            return false;
        }
    }
}
