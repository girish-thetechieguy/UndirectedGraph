package com.assignment;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Graph<Integer> graph = new Graph<Integer>(false);
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("A", "H");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("C", "F");
        graph.addEdge("D", "E");
        graph.addEdge("E", "F");
        graph.addEdge("E", "H");
        graph.addEdge("F", "G");
        graph.addEdge("G", "H");
        String option = null;
        Scanner chooseOption = new Scanner(System.in);
        do {
            System.out.println("------------------------");
            System.out.println("Enter option to perform:");
            System.out.println("------------------------");
            System.out.println("A) Show all the possible paths");
            System.out.println("B) Show the least number of hops (shortest path)");
            System.out.println("C) Exit");
            option = chooseOption.next();
            Vertex<Integer> startVertex = graph.getVertex("A");
            Vertex<Integer> destVertex = graph.getVertex("H");
            GraphPathsHelper graphPathsDetector = new GraphPathsHelper();
            if(option.equals("A")){
                graphPathsDetector.printPaths(graph, startVertex, destVertex, 0);
            }
            if(option.equals("B")){
                int shortestNumberPath = 1;
                graphPathsDetector.printPaths(graph, startVertex, destVertex, shortestNumberPath);
            }
        }while(!option.equals("C"));
    }
}