package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.AbstractBaseGraph;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends IncidentEdgeSet<N> {
        public AnonymousClass2(AbstractBaseGraph abstractBaseGraph, BaseGraph baseGraph, Object obj) {
            super(baseGraph, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$0(Object obj) {
            return EndpointPair.ordered(obj, this.node);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$1(Object obj) {
            return EndpointPair.ordered(this.node, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$2(Object obj) {
            return EndpointPair.unordered(this.node, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            if (this.graph.isDirected()) {
                final int i2 = 0;
                final int i3 = 1;
                return Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.graph.predecessors((BaseGraph<N>) this.node).iterator(), new Function(this) { // from class: com.google.common.graph.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f28773b;

                    {
                        this.f28773b = this;
                    }

                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        EndpointPair lambda$iterator$0;
                        EndpointPair lambda$iterator$1;
                        EndpointPair lambda$iterator$2;
                        int i4 = i2;
                        AbstractBaseGraph.AnonymousClass2 anonymousClass2 = this.f28773b;
                        switch (i4) {
                            case 0:
                                lambda$iterator$0 = anonymousClass2.lambda$iterator$0(obj);
                                return lambda$iterator$0;
                            case 1:
                                lambda$iterator$1 = anonymousClass2.lambda$iterator$1(obj);
                                return lambda$iterator$1;
                            default:
                                lambda$iterator$2 = anonymousClass2.lambda$iterator$2(obj);
                                return lambda$iterator$2;
                        }
                    }
                }), Iterators.transform(Sets.difference(this.graph.successors((BaseGraph<N>) this.node), ImmutableSet.of(this.node)).iterator(), new Function(this) { // from class: com.google.common.graph.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f28773b;

                    {
                        this.f28773b = this;
                    }

                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        EndpointPair lambda$iterator$0;
                        EndpointPair lambda$iterator$1;
                        EndpointPair lambda$iterator$2;
                        int i4 = i3;
                        AbstractBaseGraph.AnonymousClass2 anonymousClass2 = this.f28773b;
                        switch (i4) {
                            case 0:
                                lambda$iterator$0 = anonymousClass2.lambda$iterator$0(obj);
                                return lambda$iterator$0;
                            case 1:
                                lambda$iterator$1 = anonymousClass2.lambda$iterator$1(obj);
                                return lambda$iterator$1;
                            default:
                                lambda$iterator$2 = anonymousClass2.lambda$iterator$2(obj);
                                return lambda$iterator$2;
                        }
                    }
                })));
            }
            final int i4 = 2;
            return Iterators.unmodifiableIterator(Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new Function(this) { // from class: com.google.common.graph.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f28773b;

                {
                    this.f28773b = this;
                }

                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    EndpointPair lambda$iterator$0;
                    EndpointPair lambda$iterator$1;
                    EndpointPair lambda$iterator$2;
                    int i42 = i4;
                    AbstractBaseGraph.AnonymousClass2 anonymousClass2 = this.f28773b;
                    switch (i42) {
                        case 0:
                            lambda$iterator$0 = anonymousClass2.lambda$iterator$0(obj);
                            return lambda$iterator$0;
                        case 1:
                            lambda$iterator$1 = anonymousClass2.lambda$iterator$1(obj);
                            return lambda$iterator$1;
                        default:
                            lambda$iterator$2 = anonymousClass2.lambda$iterator$2(obj);
                            return lambda$iterator$2;
                    }
                }
            }));
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n2) {
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((AbstractBaseGraph<N>) n2).size(), successors((AbstractBaseGraph<N>) n2).size());
        }
        Set<N> adjacentNodes = adjacentNodes(n2);
        return IntMath.saturatedAdd(adjacentNodes.size(), (allowsSelfLoops() && adjacentNodes.contains(n2)) ? 1 : 0);
    }

    public long edgeCount() {
        long j2 = 0;
        while (nodes().iterator().hasNext()) {
            j2 += degree(r0.next());
        }
        Preconditions.checkState((1 & j2) == 0);
        return j2 >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors((AbstractBaseGraph) endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.of(AbstractBaseGraph.this);
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n2, N n3) {
        Preconditions.checkNotNull(n2);
        Preconditions.checkNotNull(n3);
        return nodes().contains(n2) && successors((AbstractBaseGraph<N>) n2).contains(n3);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n2) {
        return isDirected() ? predecessors((AbstractBaseGraph<N>) n2).size() : degree(n2);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n2) {
        Preconditions.checkNotNull(n2);
        Preconditions.checkArgument(nodes().contains(n2), "Node %s is not an element of this graph.", n2);
        return new AnonymousClass2(this, this, n2);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() || !isDirected();
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n2) {
        return isDirected() ? successors((AbstractBaseGraph<N>) n2).size() : degree(n2);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (!isOrderingCompatible(endpointPair)) {
            return false;
        }
        N nodeU = endpointPair.nodeU();
        return nodes().contains(nodeU) && successors((AbstractBaseGraph<N>) nodeU).contains(endpointPair.nodeV());
    }
}
