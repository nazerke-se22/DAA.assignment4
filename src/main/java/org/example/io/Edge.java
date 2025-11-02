package org.example.io;
public class Edge {
    public final int from;
    public final int to;
    public final int w;

    public Edge(int from, int to, int w) {
        this.from = from;
        this.to = to;
        this.w = w;
    }

    @Override
    public String toString() {
        return String.format("(%d → %d, w=%d)", from, to, w);
    }
}
