package com.home.henry;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeLevelOrderTest {

    @Test
    void leverOrder() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(15);
        BinaryTreeLevelOrder binaryTreeLevelOrder = new BinaryTreeLevelOrder();
        List<List<Integer>> lists = binaryTreeLevelOrder.leverOrder(treeNode);
        Assertions.assertEquals(lists.size(), 3);
        Assertions.assertSame(3, lists.get(0).get(0));
        Assertions.assertSame(9, lists.get(1).get(0));
        Assertions.assertSame(20, lists.get(1).get(1));
        Assertions.assertSame(15, lists.get(2).get(0));
        Assertions.assertSame(7, lists.get(2).get(1));
        System.out.println(lists);

    }
}