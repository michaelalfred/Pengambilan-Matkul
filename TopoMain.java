package ProjectTopo;

import java.util.List;

public class TopoMain {
    public static void main(String[] args){
        Graph graph = new Graph();

        graph.addVertex("Jaringan"); // 0
        graph.addVertex("Komunikasi Data"); // 1
        graph.addVertex("Sistem Digital"); // 2
        graph.addVertex("Matematika Diskrit"); // 3
        graph.addVertex("Matematika Dasar"); // 4
        graph.addVertex("Analisa Algoritma"); // 5
        graph.addVertex("Dasar Pemrograman"); // 6
        graph.addVertex("Struktur Data"); // 7
        graph.addVertex("Sistem Cerdas"); // 8
        
        graph.addDirectedEdge(0, 1);
        graph.addDirectedEdge(0, 5);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(1, 4);
        graph.addDirectedEdge(1, 3);
        graph.addDirectedEdge(5, 3);
        graph.addDirectedEdge(5, 7);
        graph.addDirectedEdge(7, 6);
        graph.addDirectedEdge(8, 5);

        List<String> path = graph.topologicalSort(7);

        System.out.println("Jalur dari tujuan " + graph.getVertexLabel(5) + " sampai ke awal graph:");
        for (String vertex : path) {
            System.out.print(vertex+", ");
        }
    }
}