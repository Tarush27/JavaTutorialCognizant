package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NewEdge {
    int s, d, w;

    //creating a constructor of the class Edge
    NewEdge(int src, int dest, int weight) {
        this.s = src;
        this.d = dest;
        this.w = weight;
    }
}

//a class to store adjacency list nodes
class Node {
    int value, weight;

    //creating a constructor of the class Vertex
    Node(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    //overrides the toString() method
    @Override
    public String toString() {
        return this.value + " (" + this.weight + ")";
    }
}

//a class to represent a graph object
class MyGraph {
    //note that we have created an adjacency list (i.e. List of List)      
    List<List<Node>> adjlist = new ArrayList<>();

    //creating a constructor of the class Graph that creates graph
    public MyGraph(List<NewEdge> edges) {
//find the maximum numbered vertex  
        int n = 0;
//iterates over the edges of the graph  
        for (NewEdge e : edges) {
//determines the maximum numbered vertex           
            n = Integer.max(n, Integer.max(e.s, e.d));
        }
//reserve the space for the adjacency list  
        for (int i = 0; i <= n; i++) {
            adjlist.add(i, new ArrayList<>());
        }
//adds the edges to the undirected graph  
        for (NewEdge e : edges) {
//creating a new node (from source to destination) in the adjacency list   
            adjlist.get(e.s).add(new Node(e.d, e.w));
//uncomment the following statement for undirected graph  
//adj.get(e.dest).add(new Node(e.src, e.weight));  
        }
    }

    //method that prints adjacency list of a graph
    public static void printGraph(MyGraph graph) {
        int src = 0;
        int n = graph.adjlist.size();
        System.out.printf("Adjacency List for the Graph is: ");
        while (src < n) {
//for-each loop prints the neighboring vertices with current vertex     
            for (Node edge : graph.adjlist.get(src)) {
                System.out.printf("%d -- > %s\t", src, edge);
            }
            System.out.println();
//increments the source by 1  
            src++;
        }
    }
}

public class WeightedGraph {
    public static void main(String[] args) {
        List<NewEdge> edges = Arrays.asList(new NewEdge(1, 4, 3), new NewEdge(4, 2, 5), new NewEdge(2, 5, 10), new NewEdge(5, 1, 6), new NewEdge(3, 2, 9), new NewEdge(1, 5, 1), new NewEdge(3, 5, 2));
//creates a graph with the edges declared above
        MyGraph graph = new MyGraph(edges);
//prints the corresponding adjacency list for the graph
        MyGraph.printGraph(graph);
    }
}
