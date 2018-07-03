package com.home.henry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 给一个graph node, 每个node有list of neighbors. 复制整个graph, return new head node.
 * BFS solution
 * Use HashMap to mark cloned nodes.
 * 先能复制多少Node复制多少. 然后把neighbor 加上
 * Use `map<oldNode, newNode>` to mark visited
 */
class GraphNode {
    int value;
    List<GraphNode> neighbours;

    GraphNode(int value) {
        this.value = value;
        this.neighbours = new ArrayList<>();
    }
}

public class CloneGraph {
    public GraphNode cloneGraphNode(GraphNode node) {
        if (null == node) {
            return null;
        }
        Map<GraphNode, GraphNode> hm = new HashMap<>();
        hm.put(node, new GraphNode(node.value));
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();
            for (GraphNode neighbor : currentNode.neighbours) {
                // Copy neighbors
                if (!hm.containsKey(neighbor)) {
                    queue.add(neighbor);
                    hm.put(neighbor, new GraphNode(neighbor.value));
                }
                hm.get(currentNode).neighbours.add(hm.get(neighbor));
            }
        }
        return hm.get(node);
    }
}
