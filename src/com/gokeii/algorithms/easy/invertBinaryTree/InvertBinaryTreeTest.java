package com.gokeii.algorithms.easy.invertBinaryTree;

import org.junit.Assert;
import org.junit.Test;

public class InvertBinaryTreeTest {

    @Test
    public void test() {
        InvertBinaryTree solution = new InvertBinaryTree();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        solution.invertTree(root);
        Assert.assertEquals(7, root.left.val);
        Assert.assertEquals(2, root.right.val);
        Assert.assertEquals(9, root.left.left.val);
        Assert.assertEquals(6, root.left.right.val);
        Assert.assertEquals(3, root.right.left.val);
        Assert.assertEquals(1, root.right.right.val);
    }

}
