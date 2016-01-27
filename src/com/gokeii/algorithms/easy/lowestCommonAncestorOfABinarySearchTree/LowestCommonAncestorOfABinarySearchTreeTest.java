package com.gokeii.algorithms.easy.lowestCommonAncestorOfABinarySearchTree;

import org.junit.Assert;
import org.junit.Test;

public class LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    public void test() {
        LowestCommonAncestorOfABinarySearchTree solution = new LowestCommonAncestorOfABinarySearchTree();
        
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        
        Assert.assertEquals(root, solution.lowestCommonAncestor(root, root.left, root.right));
        Assert.assertEquals(root.left, solution.lowestCommonAncestor(root.left, root.left, root.left.right));
    }

}
