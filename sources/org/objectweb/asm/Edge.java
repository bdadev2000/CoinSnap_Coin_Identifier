package org.objectweb.asm;

/* loaded from: classes2.dex */
final class Edge {
    static final int EXCEPTION = Integer.MAX_VALUE;
    static final int JUMP = 0;
    final int info;
    Edge nextEdge;
    final Label successor;

    public Edge(int i2, Label label, Edge edge) {
        this.info = i2;
        this.successor = label;
        this.nextEdge = edge;
    }
}
