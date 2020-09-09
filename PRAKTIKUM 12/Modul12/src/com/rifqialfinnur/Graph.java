package com.rifqialfinnur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    // buat objek Map
    private Map<Vertex, List<Vertex>> adjVertices;

    // constructor dari graph
    Graph(){
        this.adjVertices = new HashMap<Vertex, List<Vertex>>();
    }

    // menambahkan vertex
    void addVertex(String label){
        adjVertices.putIfAbsent(
                new Vertex(label), new ArrayList<>()
        );
    }

    // menghapus vertex
    void removeVertex(String label){
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    // menambahkan edge
    void addEdge(String label1, String label2){
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    // menghapus edge
    void removeEdge(String label1, String label2){
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if(eV1 != null){
            eV1.remove(v2);
        }
        if (eV2 != null)
            eV2.remove(v1);
    }

    // membuat method list
    List<Vertex> getAdjVertices(String label){
        return adjVertices.get(new Vertex(label));
    }

    // mencetak graph
    String printGraph(){
        StringBuffer sb = new StringBuffer();
        for (Vertex v: adjVertices.keySet()) {
            sb.append(v);
            sb.append(adjVertices.get(v)).append("\n");
        }
        return sb.toString();
    }

    // membuat class dari vertex
    class Vertex{
        String label;
        // constructor dari vertex
        Vertex(String label){
            this.label = label;
        }

        // menambahkan method hashCode
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((label==null)? 0 : label.hashCode());
            return result;
        }

        // menambahkan method equals terhadap objek
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Vertex other = (Vertex) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (label == null) {
                if (other.label != null)
                    return false;
            } else if (!label.equals(other.label))
                return false;
            return true;
        }

        // method to string
        @Override
        public String toString() {
            return label;
        }

        // mengambil type terluar dari graph
        private Graph getOuterType() {
            return Graph.this;
        }
    }
}
