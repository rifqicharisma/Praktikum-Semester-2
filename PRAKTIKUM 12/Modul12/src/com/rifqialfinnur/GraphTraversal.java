package com.rifqialfinnur;

import java.util.*;

public class GraphTraversal {
    // membuat Set dari string BFS
    static Set<String> breadthFirstTraversal(
            Graph graph, String root
    ){
        // mendeklarasikan objek Set
        Set<String> visited = new LinkedHashSet<String>();
        // mendeklarasikan queue
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        // perulangan untuk mencetak BFS
        while(!queue.isEmpty()){
            String vertex = queue.poll();
            for (Graph.Vertex v:
                 graph.getAdjVertices(vertex)) {
                if(!visited.contains(v.label)){
                    visited.add(v.label);
                    queue.add(v.label);
                }
            }
        }
        return visited;
    }

    // membuat method DFS
    static Set<String> depthFirstTraversal(
            Graph graph, String root
    ){
        // mendeklarasikan objek set
        Set<String> visited = new LinkedHashSet<String>();
        // mendeklarasikan objek Stack
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        // perulangan untuk mencetak DFS
        while(!stack.empty()){
            String vertex = stack.pop();
            if(!visited.contains(vertex)){
                visited.add(vertex);
                for (Graph.Vertex v:
                     graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }
}
