package Soal2;

public class DemoGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();

        //Graph
        StringBuilder s= new StringBuilder();
        graph.addVertex("Dodo");
        graph.addVertex("Bejo");
        graph.addVertex("Maman");
        graph.addVertex("Jojo");
        graph.addVertex("Sukijah");

        graph.addEdge("Dodo", "Bejo");
        graph.addEdge("Dodo", "Jojo");
        graph.addEdge("Jojo","Maman");
        graph.addEdge("Jojo","Sukijah");
        graph.addEdge("Bejo","Maman");
        graph.addEdge("Bejo","Sukijah");

        //Graph Traversal
        System.out.println("DFS : "+ GraphTraversal.depthFirstTraversal(graph, "Dodo")
                +"->"+GraphTraversal.depthFirstTraversal(graph,"Bejo")
                +"->"+GraphTraversal.depthFirstTraversal(graph,"Maman")
                +"->"+GraphTraversal.depthFirstTraversal(graph,"Jojo")
                +"->"+GraphTraversal.depthFirstTraversal(graph,"Sukijah"));
        System.out.println("BFS : "
                +"\nPertama - tama si "+ GraphTraversal.breadFirstTraversal(graph, "Dodo")
                +" akan ke rumah "+GraphTraversal.breadFirstTraversal(graph,"Bejo")
                +" then, dia akan ke rumah  "+GraphTraversal.breadFirstTraversal(graph,"Jojo")
                +" \n,lalu ke rumah "+GraphTraversal.breadFirstTraversal(graph,"Maman")
                +" dan and the last destination ke rumah "+GraphTraversal.breadFirstTraversal(graph,"Sukijah"));
    }
}
