package com.gokeii.algorithms.easy.maximumDepthOfBinaryTree;

import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test() {
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.right = new TreeNode(0);

        Assert.assertEquals(4, solution.maxDepth(root));
        Assert.assertEquals(3, solution.maxDepth(root.left));
        Assert.assertEquals(2, solution.maxDepth(root.right));
    }

}
