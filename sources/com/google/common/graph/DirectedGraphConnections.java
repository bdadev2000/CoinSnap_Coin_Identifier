package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private static final Object PRED = new Object();
    private final Map<N, Object> adjacentNodeValues;
    private final List<NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    /* renamed from: com.google.common.graph.DirectedGraphConnections$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends AbstractSet<N> {

        /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1 */
        /* loaded from: classes2.dex */
        public class C01511 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;
            final /* synthetic */ Set val$seenNodes;

            public C01511(AnonymousClass1 anonymousClass1, Iterator it, Set set) {
                r2 = it;
                r3 = set;
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (r2.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) r2.next();
                    if (r3.add(nodeConnection.node)) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        public AnonymousClass1() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.adjacentNodeValues.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                final /* synthetic */ Iterator val$nodeConnections;
                final /* synthetic */ Set val$seenNodes;

                public C01511(AnonymousClass1 this, Iterator it, Set set) {
                    r2 = it;
                    r3 = set;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) r2.next();
                        if (r3.add(nodeConnection.node)) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends AbstractSet<N> {

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1 */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$entries;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Iterator it) {
                r2 = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (r2.hasNext()) {
                    Map.Entry entry = (Map.Entry) r2.next();
                    if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$2 */
        /* loaded from: classes2.dex */
        public class C01522 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;

            public C01522(AnonymousClass2 anonymousClass2, Iterator it) {
                r2 = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (r2.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) r2.next();
                    if (nodeConnection instanceof NodeConnection.Pred) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        public AnonymousClass2() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return DirectedGraphConnections.isPredecessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.predecessorCount;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                    final /* synthetic */ Iterator val$entries;

                    public AnonymousClass1(AnonymousClass2 this, Iterator it) {
                        r2 = it;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (r2.hasNext()) {
                            Map.Entry entry = (Map.Entry) r2.next();
                            if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                return (N) entry.getKey();
                            }
                        }
                        return endOfData();
                    }
                };
            }
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                final /* synthetic */ Iterator val$nodeConnections;

                public C01522(AnonymousClass2 this, Iterator it) {
                    r2 = it;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) r2.next();
                        if (nodeConnection instanceof NodeConnection.Pred) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends AbstractSet<N> {

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$1 */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$entries;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, Iterator it) {
                r2 = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (r2.hasNext()) {
                    Map.Entry entry = (Map.Entry) r2.next();
                    if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$2 */
        /* loaded from: classes2.dex */
        public class AnonymousClass2 extends AbstractIterator<N> {
            final /* synthetic */ Iterator val$nodeConnections;

            public AnonymousClass2(AnonymousClass3 anonymousClass3, Iterator it) {
                r2 = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (r2.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) r2.next();
                    if (nodeConnection instanceof NodeConnection.Succ) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        public AnonymousClass3() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return DirectedGraphConnections.isSuccessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.successorCount;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                    final /* synthetic */ Iterator val$entries;

                    public AnonymousClass1(AnonymousClass3 this, Iterator it) {
                        r2 = it;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (r2.hasNext()) {
                            Map.Entry entry = (Map.Entry) r2.next();
                            if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                return (N) entry.getKey();
                            }
                        }
                        return endOfData();
                    }
                };
            }
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                final /* synthetic */ Iterator val$nodeConnections;

                public AnonymousClass2(AnonymousClass3 this, Iterator it) {
                    r2 = it;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) r2.next();
                        if (nodeConnection instanceof NodeConnection.Succ) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$4 */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends AbstractIterator<EndpointPair<N>> {
        final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
        final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

        public AnonymousClass4(DirectedGraphConnections directedGraphConnections, Iterator it, AtomicBoolean atomicBoolean) {
            r2 = it;
            r3 = atomicBoolean;
        }

        @Override // com.google.common.collect.AbstractIterator
        public EndpointPair<N> computeNext() {
            while (r2.hasNext()) {
                EndpointPair<N> endpointPair = (EndpointPair) r2.next();
                if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !r3.getAndSet(true)) {
                    return endpointPair;
                }
            }
            return endOfData();
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass5 {
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

    /* loaded from: classes2.dex */
    public static abstract class NodeConnection<N> {
        final N node;

        /* loaded from: classes2.dex */
        public static final class Pred<N> extends NodeConnection<N> {
            public Pred(N n2) {
                super(n2);
            }

            public boolean equals(Object obj) {
                if (obj instanceof Pred) {
                    return this.node.equals(((Pred) obj).node);
                }
                return false;
            }

            public int hashCode() {
                return this.node.hashCode() + Pred.class.hashCode();
            }
        }

        /* loaded from: classes2.dex */
        public static final class Succ<N> extends NodeConnection<N> {
            public Succ(N n2) {
                super(n2);
            }

            public boolean equals(Object obj) {
                if (obj instanceof Succ) {
                    return this.node.equals(((Succ) obj).node);
                }
                return false;
            }

            public int hashCode() {
                return this.node.hashCode() + Succ.class.hashCode();
            }
        }

        public NodeConnection(N n2) {
            this.node = (N) Preconditions.checkNotNull(n2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PredAndSucc {
        private final Object successorValue;

        public PredAndSucc(Object obj) {
            this.successorValue = obj;
        }
    }

    private DirectedGraphConnections(Map<N, Object> map, List<NodeConnection<N>> list, int i2, int i3) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(map);
        this.orderedNodeConnections = list;
        this.predecessorCount = Graphs.checkNonNegative(i2);
        this.successorCount = Graphs.checkNonNegative(i3);
        Preconditions.checkState(i2 <= map.size() && i3 <= map.size());
    }

    public static boolean isPredecessor(Object obj) {
        return obj == PRED || (obj instanceof PredAndSucc);
    }

    public static boolean isSuccessor(Object obj) {
        return (obj == PRED || obj == null) ? false : true;
    }

    public static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$0(Object obj, Object obj2) {
        return EndpointPair.ordered(obj2, obj);
    }

    public static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$2(Object obj, NodeConnection nodeConnection) {
        return nodeConnection instanceof NodeConnection.Succ ? EndpointPair.ordered(obj, nodeConnection.node) : EndpointPair.ordered(nodeConnection.node, obj);
    }

    public static <N, V> DirectedGraphConnections<N, V> of(ElementOrder<N> elementOrder) {
        ArrayList arrayList;
        int i2 = AnonymousClass5.$SwitchMap$com$google$common$graph$ElementOrder$Type[elementOrder.type().ordinal()];
        if (i2 == 1) {
            arrayList = null;
        } else {
            if (i2 != 2) {
                throw new AssertionError(elementOrder.type());
            }
            arrayList = new ArrayList();
        }
        return new DirectedGraphConnections<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> DirectedGraphConnections<N, V> ofImmutable(N n2, Iterable<EndpointPair<N>> iterable, Function<N, V> function) {
        Preconditions.checkNotNull(n2);
        Preconditions.checkNotNull(function);
        HashMap hashMap = new HashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        int i2 = 0;
        int i3 = 0;
        for (EndpointPair<N> endpointPair : iterable) {
            if (endpointPair.nodeU().equals(n2) && endpointPair.nodeV().equals(n2)) {
                hashMap.put(n2, new PredAndSucc(function.apply(n2)));
                builder.add((ImmutableList.Builder) new NodeConnection.Pred(n2));
                builder.add((ImmutableList.Builder) new NodeConnection.Succ(n2));
                i2++;
            } else if (endpointPair.nodeV().equals(n2)) {
                N nodeU = endpointPair.nodeU();
                Object put = hashMap.put(nodeU, PRED);
                if (put != null) {
                    hashMap.put(nodeU, new PredAndSucc(put));
                }
                builder.add((ImmutableList.Builder) new NodeConnection.Pred(nodeU));
                i2++;
            } else {
                Preconditions.checkArgument(endpointPair.nodeU().equals(n2));
                N nodeV = endpointPair.nodeV();
                V apply = function.apply(nodeV);
                Object put2 = hashMap.put(nodeV, apply);
                if (put2 != null) {
                    Preconditions.checkArgument(put2 == PRED);
                    hashMap.put(nodeV, new PredAndSucc(apply));
                }
                builder.add((ImmutableList.Builder) new NodeConnection.Succ(nodeV));
            }
            i3++;
        }
        return new DirectedGraphConnections<>(hashMap, builder.build(), i2, i3);
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n2, V v2) {
        Map<N, Object> map = this.adjacentNodeValues;
        Object obj = PRED;
        Object put = map.put(n2, obj);
        if (put != null) {
            if (put instanceof PredAndSucc) {
                this.adjacentNodeValues.put(n2, put);
                return;
            } else if (put == obj) {
                return;
            } else {
                this.adjacentNodeValues.put(n2, new PredAndSucc(put));
            }
        }
        int i2 = this.predecessorCount + 1;
        this.predecessorCount = i2;
        Graphs.checkPositive(i2);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.add(new NodeConnection.Pred(n2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // com.google.common.graph.GraphConnections
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V addSuccessor(N r5, V r6) {
        /*
            r4 = this;
            java.util.Map<N, java.lang.Object> r0 = r4.adjacentNodeValues
            java.lang.Object r0 = r0.put(r5, r6)
            r1 = 0
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
            goto L2f
        Lb:
            boolean r2 = r0 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r2 == 0) goto L20
            java.util.Map<N, java.lang.Object> r2 = r4.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r3 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r3.<init>(r6)
            r2.put(r5, r3)
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r0 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r0
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$600(r0)
            goto L2f
        L20:
            java.lang.Object r2 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r0 != r2) goto L2f
            java.util.Map<N, java.lang.Object> r0 = r4.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r2 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r2.<init>(r6)
            r0.put(r5, r2)
            goto L9
        L2f:
            if (r0 != 0) goto L46
            int r6 = r4.successorCount
            int r6 = r6 + 1
            r4.successorCount = r6
            com.google.common.graph.Graphs.checkPositive(r6)
            java.util.List<com.google.common.graph.DirectedGraphConnections$NodeConnection<N>> r6 = r4.orderedNodeConnections
            if (r6 == 0) goto L46
            com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ r2 = new com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ
            r2.<init>(r5)
            r6.add(r2)
        L46:
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r1 = r0
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.DirectedGraphConnections.addSuccessor(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return this.orderedNodeConnections == null ? Collections.unmodifiableSet(this.adjacentNodeValues.keySet()) : new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1

            /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1 */
            /* loaded from: classes2.dex */
            public class C01511 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$nodeConnections;
                final /* synthetic */ Set val$seenNodes;

                public C01511(AnonymousClass1 this, Iterator it, Set set) {
                    r2 = it;
                    r3 = set;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) r2.next();
                        if (r3.add(nodeConnection.node)) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            public AnonymousClass1() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.adjacentNodeValues.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                    final /* synthetic */ Iterator val$nodeConnections;
                    final /* synthetic */ Set val$seenNodes;

                    public C01511(AnonymousClass1 this, Iterator it, Set set) {
                        r2 = it;
                        r3 = set;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (r2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) r2.next();
                            if (r3.add(nodeConnection.node)) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(N n2) {
        Preconditions.checkNotNull(n2);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        return new AbstractIterator<EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4
            final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
            final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

            public AnonymousClass4(DirectedGraphConnections this, Iterator it, AtomicBoolean atomicBoolean) {
                r2 = it;
                r3 = atomicBoolean;
            }

            @Override // com.google.common.collect.AbstractIterator
            public EndpointPair<N> computeNext() {
                while (r2.hasNext()) {
                    EndpointPair<N> endpointPair = (EndpointPair) r2.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !r3.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return endOfData();
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2

            /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1 */
            /* loaded from: classes2.dex */
            public class AnonymousClass1 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$entries;

                public AnonymousClass1(AnonymousClass2 this, Iterator it) {
                    r2 = it;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        Map.Entry entry = (Map.Entry) r2.next();
                        if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$2$2 */
            /* loaded from: classes2.dex */
            public class C01522 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$nodeConnections;

                public C01522(AnonymousClass2 this, Iterator it) {
                    r2 = it;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) r2.next();
                        if (nodeConnection instanceof NodeConnection.Pred) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            public AnonymousClass2() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return DirectedGraphConnections.isPredecessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.predecessorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                        final /* synthetic */ Iterator val$entries;

                        public AnonymousClass1(AnonymousClass2 this, Iterator it) {
                            r2 = it;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        public N computeNext() {
                            while (r2.hasNext()) {
                                Map.Entry entry = (Map.Entry) r2.next();
                                if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                    final /* synthetic */ Iterator val$nodeConnections;

                    public C01522(AnonymousClass2 this, Iterator it) {
                        r2 = it;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (r2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) r2.next();
                            if (nodeConnection instanceof NodeConnection.Pred) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n2) {
        Preconditions.checkNotNull(n2);
        Object obj = this.adjacentNodeValues.get(n2);
        if (obj == PRED) {
            this.adjacentNodeValues.remove(n2);
        } else if (!(obj instanceof PredAndSucc)) {
            return;
        } else {
            this.adjacentNodeValues.put(n2, ((PredAndSucc) obj).successorValue);
        }
        int i2 = this.predecessorCount - 1;
        this.predecessorCount = i2;
        Graphs.checkNonNegative(i2);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.remove(new NodeConnection.Pred(n2));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = this.adjacentNodeValues.get(obj);
        if (obj3 == null || obj3 == (obj2 = PRED)) {
            obj3 = null;
        } else if (obj3 instanceof PredAndSucc) {
            this.adjacentNodeValues.put(obj, obj2);
            obj3 = ((PredAndSucc) obj3).successorValue;
        } else {
            this.adjacentNodeValues.remove(obj);
        }
        if (obj3 != null) {
            int i2 = this.successorCount - 1;
            this.successorCount = i2;
            Graphs.checkNonNegative(i2);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new NodeConnection.Succ(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.3

            /* renamed from: com.google.common.graph.DirectedGraphConnections$3$1 */
            /* loaded from: classes2.dex */
            public class AnonymousClass1 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$entries;

                public AnonymousClass1(AnonymousClass3 this, Iterator it) {
                    r2 = it;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        Map.Entry entry = (Map.Entry) r2.next();
                        if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$3$2 */
            /* loaded from: classes2.dex */
            public class AnonymousClass2 extends AbstractIterator<N> {
                final /* synthetic */ Iterator val$nodeConnections;

                public AnonymousClass2(AnonymousClass3 this, Iterator it) {
                    r2 = it;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (r2.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) r2.next();
                        if (nodeConnection instanceof NodeConnection.Succ) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            public AnonymousClass3() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return DirectedGraphConnections.isSuccessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.successorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                        final /* synthetic */ Iterator val$entries;

                        public AnonymousClass1(AnonymousClass3 this, Iterator it) {
                            r2 = it;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        public N computeNext() {
                            while (r2.hasNext()) {
                                Map.Entry entry = (Map.Entry) r2.next();
                                if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                    final /* synthetic */ Iterator val$nodeConnections;

                    public AnonymousClass2(AnonymousClass3 this, Iterator it) {
                        r2 = it;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (r2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) r2.next();
                            if (nodeConnection instanceof NodeConnection.Succ) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    public V value(N n2) {
        Preconditions.checkNotNull(n2);
        V v2 = (V) this.adjacentNodeValues.get(n2);
        if (v2 == PRED) {
            return null;
        }
        return v2 instanceof PredAndSucc ? (V) ((PredAndSucc) v2).successorValue : v2;
    }
}
