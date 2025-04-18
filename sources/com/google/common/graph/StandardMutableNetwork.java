package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    public StandardMutableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    @CanIgnoreReturnValue
    private NetworkConnections<N, E> addNodeInternal(N n2) {
        NetworkConnections<N, E> newConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n2, newConnections) == null);
        return newConnections;
    }

    private NetworkConnections<N, E> newConnections() {
        return isDirected() ? allowsParallelEdges() ? DirectedMultiNetworkConnections.of() : DirectedNetworkConnections.of() : allowsParallelEdges() ? UndirectedMultiNetworkConnections.of() : UndirectedNetworkConnections.of();
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N n2, N n3, E e) {
        Preconditions.checkNotNull(n2, "nodeU");
        Preconditions.checkNotNull(n3, "nodeV");
        Preconditions.checkNotNull(e, "edge");
        if (containsEdge(e)) {
            EndpointPair<N> incidentNodes = incidentNodes(e);
            EndpointPair of = EndpointPair.of(this, n2, n3);
            Preconditions.checkArgument(incidentNodes.equals(of), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e, incidentNodes, of);
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n2);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnections == null || !networkConnections.successors().contains(n3), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n2, n3);
        }
        boolean equals = n2.equals(n3);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!equals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n2);
        }
        if (networkConnections == null) {
            networkConnections = addNodeInternal(n2);
        }
        networkConnections.addOutEdge(e, n3);
        NetworkConnections<N, E> networkConnections2 = this.nodeConnections.get(n3);
        if (networkConnections2 == null) {
            networkConnections2 = addNodeInternal(n3);
        }
        networkConnections2.addInEdge(e, n2, equals);
        this.edgeToReferenceNode.put(e, n2);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N n2) {
        Preconditions.checkNotNull(n2, "node");
        if (containsNode(n2)) {
            return false;
        }
        addNodeInternal(n2);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E e) {
        Preconditions.checkNotNull(e, "edge");
        N n2 = this.edgeToReferenceNode.get(e);
        boolean z2 = false;
        if (n2 == null) {
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n2);
        Objects.requireNonNull(networkConnections);
        NetworkConnections<N, E> networkConnections2 = networkConnections;
        N adjacentNode = networkConnections2.adjacentNode(e);
        NetworkConnections<N, E> networkConnections3 = this.nodeConnections.get(adjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections<N, E> networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(e);
        if (allowsSelfLoops() && n2.equals(adjacentNode)) {
            z2 = true;
        }
        networkConnections4.removeInEdge(e, z2);
        this.edgeToReferenceNode.remove(e);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N n2) {
        Preconditions.checkNotNull(n2, "node");
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n2);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(n2);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(EndpointPair<N> endpointPair, E e) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e);
    }
}
