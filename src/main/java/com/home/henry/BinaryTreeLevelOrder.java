package com.home.henry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int value;

    public TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

/**
 * BinaryTree Lever Order
 */
public class BinaryTreeLevelOrder {
    public List<List<Integer>> leverOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (null == root) {
            return results;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> current = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                current.add(head.value);
                if (null != head.left) {
                    queue.offer(head.left);
                }
                if (null != head.right) {
                    queue.offer(head.right);
                }
            }
            results.add(current);
        }
        return results;
    }
}
