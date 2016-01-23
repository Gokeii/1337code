/******************************************************************************
 * Recursive traversal.
 ******************************************************************************/

package com.gokeii.algorithms.easy.maximumDepthOfBinaryTree;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
	    if (root == null) {
	        return 0;
	    }
	    
	    int leftDepth = maxDepth(root.left);
	    int rightDepth = maxDepth(root.right);
	    return leftDepth > rightDepth? leftDepth + 1 : rightDepth + 1;
    }
}
