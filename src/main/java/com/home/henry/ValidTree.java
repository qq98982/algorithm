package com.home.henry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Question:
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.
 * Notice:
 * You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 * Example:
 * Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true.
 * Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.
 * Tags:
 * Depth First Search Facebook Zenefits Union Find Breadth First Search Google Related Problems
 * Medium Find the Connected Component in the Undirected Graph
 */
public class ValidTree {

    public boolean ifVaildTree(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = initGraph(n, edges);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>(8);
        queue.offer(0);
        hashSet.add(0);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Integer neighbore : graph.get(node)) {
                if (hashSet.contains(neighbore)) {
                    continue;
                }
                hashSet.add(neighbore);
                queue.offer(neighbore);
            }
        }
        return hashSet.size() == n;
    }

    private Map<Integer, Set<Integer>> initGraph(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>(8);
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
}
