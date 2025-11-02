package org.example.io;
import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static class Edge {
        public final int to;
        public final int w;
        public Edge(int to, int w) { this.to = to; this.w = w; }
        @Override public String toString(){ return String.format("(%d,w=%d)", to, w); }
    }

    private final int n;
    private final List<List<Edge>> adj;

    public AdjacencyList(int n) {
        this.n = n;
        adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
    }

    public List<Edge> neighbors(int u) { return adj.get(u); }
    public int size() { return n; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i).append(": ").append(adj.get(i)).append("\n");
        }
        return sb.toString();
    }
}