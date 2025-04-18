package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.graph.ElementOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private final Map<N, V> adjacentNodeValues;

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private UndirectedGraphConnections(Map<N, V> map) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(map);
    }

    public static <N, V> UndirectedGraphConnections<N, V> of(ElementOrder<N> elementOrder) {
        int i2 = AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type[elementOrder.type().ordinal()];
        if (i2 == 1) {
            return new UndirectedGraphConnections<>(new HashMap(2, 1.0f));
        }
        if (i2 == 2) {
            return new UndirectedGraphConnections<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(elementOrder.type());
    }

    public static <N, V> UndirectedGraphConnections<N, V> ofImmutable(Map<N, V> map) {
        return new UndirectedGraphConnections<>(ImmutableMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n2, V v2) {
        addSuccessor(n2, v2);
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n2, V v2) {
        return this.adjacentNodeValues.put(n2, v2);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(N n2) {
        return Iterators.transform(this.adjacentNodeValues.keySet().iterator(), new b(n2, 3));
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n2) {
        removeSuccessor(n2);
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(N n2) {
        return this.adjacentNodeValues.remove(n2);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N n2) {
        return this.adjacentNodeValues.get(n2);
    }
}
