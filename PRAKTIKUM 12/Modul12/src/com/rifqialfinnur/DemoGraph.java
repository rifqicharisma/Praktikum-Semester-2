package com.rifqialfinnur;

public class DemoGraph {
    public static void main(String[] args) {
        // deklarasikan objek
        Graph graph = new Graph();

        // menambahkan vertex
        graph.addVertex("Dodo");
        graph.addVertex("Bejo");
        graph.addVertex("Maman");
        graph.addVertex("Jojo");
        graph.addVertex("Sukijah");

        // menambahkan objek
        graph.addEdge("Dodo", "Bejo");
        graph.addEdge("Dodo", "Jojo");
        graph.addEdge("Jojo", "Maman");
        graph.addEdge("Jojo", "Sukijah");
        graph.addEdge("Bejo", "Maman");
        graph.addEdge("Bejo", "Sukijah");

        // mencetak graph
        System.out.println(graph.printGraph());

        // mencetak graph berdasarkan DFS dan BFS
        System.out.println("DFS : "+ GraphTraversal.depthFirstTraversal(graph,"Dodo"));
        System.out.println("BFS : "+ GraphTraversal.breadthFirstTraversal(graph,"Dodo"));
    }
}
