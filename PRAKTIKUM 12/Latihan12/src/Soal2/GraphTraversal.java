package Soal2;

import java.util.*;

public class GraphTraversal {
    static Set<String> breadFirstTraversal(
            Graph graph, String root
    ){
        Set<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        while(!queue.isEmpty()){
            String vertex = queue.poll();
            for(Graph.Vertex v :
                    graph.getAdjVertices(vertex)
            ){ }
        }
        return visited;
    }
    static Set<String> depthFirstTraversal(
            Graph graph, String root
    ) {
        Set<String> visited = new LinkedHashSet<String >();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while(!stack.isEmpty()){
            String vertex = stack.pop();
            if(!visited.contains(vertex)){
                visited.add(vertex);
                for (Graph.Vertex v :
                        graph.getAdjVertices(vertex)
                ) {
                    //stack.push(v.label);
                }
            }
        }
        return visited;
    }
}
