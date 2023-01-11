package com.assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class GraphPathsHelper {
    public void printPaths(Graph<Integer> graph,Vertex<Integer> start, Vertex<Integer> destination, int shortestNumberPath){
        Set<Vertex<Integer>> visited = new LinkedHashSet<Vertex<Integer>>();
        printPath(visited,destination,start, shortestNumberPath);
    }

    private void printPath(Set<Vertex<Integer>> visited,Vertex<Integer> destination,Vertex<Integer> current, int shortestNumberPath){
        int edgeCount1 = 0;
        if(visited.contains(current)){
            return;
        }
        if(destination.equals(current)){
            if(shortestNumberPath == 1){
                for(Vertex<Integer> v : visited){
                    edgeCount1++;
                }
                if(edgeCount1 == shortestNumberPath && destination.id == "H")
                    System.out.println(Arrays.stream(Arrays.stream
                            (visited.toArray()).toArray()).distinct().findFirst().get().toString() +"->"+destination.id);
            }else{
                for(Vertex<Integer> v : visited){
                    System.out.print(v.id + "->");
                }
                System.out.println(destination.id);
            }
            return;
        }

        visited.add(current);
        for(Vertex<Integer> child : current.getAdjacentVertexes()){
            printPath(visited,destination,child, shortestNumberPath);
        }
        visited.remove(current);
    }
}
