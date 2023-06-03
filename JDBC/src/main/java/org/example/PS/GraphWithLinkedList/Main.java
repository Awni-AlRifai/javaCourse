package org.example.PS.GraphWithLinkedList;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        // adjList
        // [{},{},{},{},{}]
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,4);
        // [{1->2},{3},{3},{4},{}]
        g.DFS(0);

    }
}
