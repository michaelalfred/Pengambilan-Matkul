package ProjectTopo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Graph{
    private int[][] adjacencyMatrix;
    private int nVerts;
    private String[] vertexList;

    public Graph() {
        adjacencyMatrix = new int[999][999];
        vertexList = new String[999];
        nVerts = 0;
    }

    public void addVertex(String label) {
        vertexList[nVerts++] = label;
    }

    public String getVertexLabel(int vertex) {
        return vertexList[vertex];
    }

    public void addDirectedEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
    }

    public List<String> topologicalSort(int goal) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[nVerts];

        // Memanggil metode rekursif untuk melakukan topological sort
        topologicalSortUtil(goal, visited, stack);

        // Mengubah tumpukan menjadi jalur dalam bentuk daftar string
        List<String> path = new ArrayList<>();
        while (!stack.isEmpty()) {
            path.add(vertexList[stack.pop()]);
        }
        Collections.reverse(path);

        return path;
    }

    private void topologicalSortUtil(int vertex, boolean[] visited, Stack<Integer> stack) {
        visited[vertex] = true;

        for (int i = 0; i < nVerts; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        stack.push(vertex);
    }

    public int findVertex(String label) {
    for (int i = 0; i < nVerts; i++) {
        if (vertexList[i].equals(label)) {
            return i;
        }
    }
    return -1; // Jika label tidak ditemukan
}
    
    public int getnVerts() {
        return nVerts;
    }

    public void setnVerts(int nVerts) {
        this.nVerts = nVerts;
    }

    public String getVertexList(int i) {
        return vertexList[i];
    }

    public void setVertexList(String[] vertexList) {
        this.vertexList = vertexList;
    }
    
    
    // public String displayVertex(int v) {
    //     return vertexList[v];
    // }

    // public void tampilMatrix() {
    //     System.out.print(" ");
    //     for (int i = 0; i < getnVerts(); i++) {
    //         System.out.print("  "+displayVertex(i));
    //     }
    //     System.out.println();
    //     for (int i = 0; i < nVerts; i++) {
    //         System.out.print(displayVertex(i)+ "  ");
    //         for (int j = 0; j < nVerts; j++) {
    //             System.out.print(adjacencyMatrix[i][j] + "  ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public int getnVerts() {
    //     return nVerts;
    // }

    
}