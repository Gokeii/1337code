package com.gokeii.algorithms.easy.sameTree;

import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

    @Test
    public void test() {
        SameTree solution = new SameTree();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.left.left = new TreeNode(3);
        tree1.left.right = new TreeNode(4);
        tree1.right = new TreeNode(5);
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.left.left = new TreeNode(3);
        tree2.left.right = new TreeNode(4);
        tree2.right = new TreeNode(5);
        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        tree3.left.left = new TreeNode(4);
        tree3.left.right = new TreeNode(4);
        tree3.right = new TreeNode(5);

        Assert.assertEquals(true, solution.isSameTree(tree1, tree2));
        Assert.assertEquals(false, solution.isSameTree(tree1, tree3));
    }

}
