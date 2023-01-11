package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    String id;
    private T data;
    private List<Edge<T>> edges = new ArrayList<>();
    private List<Vertex<T>> adjacentVertex = new ArrayList<>();

    Vertex(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setData(T data){
        this.data = data;
    }

    public void addAdjacentVertex(Edge<T> e, Vertex<T> v){
        edges.add(e);
        adjacentVertex.add(v);
    }

    public String toString(){
        return String.valueOf(id);
    }

    public List<Vertex<T>> getAdjacentVertexes(){
        return adjacentVertex;
    }

    public List<Edge<T>> getEdges(){
        return edges;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
