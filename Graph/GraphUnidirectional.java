package Graph;

/* Unidirectional graph using Adjacency list in java */
import java.util.LinkedList;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer> adj[]; // Adjacency list

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list
        adj[w].add(v); // Add v to w's list
    }

    // A utility function to print the adjacency list representation of graph
    void printGraph() {
        for (int i = 0; i < V; ++i) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            for (Integer pCrawl : adj[i]) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }
}
