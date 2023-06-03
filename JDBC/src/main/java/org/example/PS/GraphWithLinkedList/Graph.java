package org.example.PS.GraphWithLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    private int V; // number of verticies
    private LinkedList<Integer>[] adjList;

    public Graph(int v) {
        this.V = v;
        adjList = new LinkedList[V]; // new array of elements of type LinkedList
        for(int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    /**
     * Add an edge to the node
     * @param u the node that we want to add the edge to
     * @param v the node that will be connected
     */
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        DFSUtil(start, visited);
    }

    public void DFSWithStack(int start) {
        Stack<Integer> stack = new Stack<>();
        // initiate a visited array to avoid loop
        boolean[] visited = new boolean[V];
        visited[start] = true;
        stack.push(start);
        while (!stack.isEmpty()){
             start = stack.pop();
            System.out.println(start+ " ");
            Iterator<Integer> i = adjList[start].iterator();
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    stack.push(n);
                    // mark as visited since we are not running the function again
                    visited[n] = true;
                }
            }

        }
    }
    public void DFSUtil(int v, boolean[] visited){
            visited[v] = true;
//        System.out.println(v +" ");
        Iterator<Integer> it = adjList[v].iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n +" ");
            if(!visited[n]){
                DFSUtil(n,visited);
            }
        }

    }

}
