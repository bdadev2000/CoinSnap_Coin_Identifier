package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
interface NetworkConnections<N, E> {
    void addInEdge(E e, N n2, boolean z2);

    void addOutEdge(E e, N n2);

    N adjacentNode(E e);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N n2);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CanIgnoreReturnValue
    N removeInEdge(E e, boolean z2);

    @CanIgnoreReturnValue
    N removeOutEdge(E e);

    Set<N> successors();
}
