package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.PointerInputModifierNode;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class Node extends NodeParent {

    /* renamed from: b, reason: collision with root package name */
    public final Modifier.Node f15562b;

    /* renamed from: c, reason: collision with root package name */
    public final PointerIdArray f15563c;
    public final LongSparseArray d;
    public NodeCoordinator e;

    /* renamed from: f, reason: collision with root package name */
    public PointerEvent f15564f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15565g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15566h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15567i;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, androidx.compose.ui.input.pointer.util.PointerIdArray] */
    public Node(Modifier.Node node) {
        this.f15562b = node;
        ?? obj = new Object();
        obj.f15672b = new long[2];
        this.f15563c = obj;
        this.d = new LongSparseArray(2);
        this.f15566h = true;
        this.f15567i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final boolean a(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        LongSparseArray longSparseArray2;
        PointerIdArray pointerIdArray;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        PointerEvent pointerEvent;
        boolean z6;
        int i2;
        int i3;
        int i4;
        long j2;
        List list;
        Node node = this;
        LongSparseArray longSparseArray3 = longSparseArray;
        LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
        boolean a2 = super.a(longSparseArray, layoutCoordinates, internalPointerEvent, z2);
        DelegatingNode delegatingNode = node.f15562b;
        if (!delegatingNode.f14699n) {
            return true;
        }
        ?? r8 = 0;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                node.e = DelegatableNodeKt.d((PointerInputModifierNode) delegatingNode, 16);
            } else if ((delegatingNode.f14690c & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node node2 = delegatingNode.f15909p;
                int i5 = 0;
                delegatingNode = delegatingNode;
                r8 = r8;
                while (node2 != null) {
                    if ((node2.f14690c & 16) != 0) {
                        i5++;
                        r8 = r8;
                        if (i5 == 1) {
                            delegatingNode = node2;
                        } else {
                            if (r8 == 0) {
                                r8 = new MutableVector(new Modifier.Node[16]);
                            }
                            if (delegatingNode != 0) {
                                r8.b(delegatingNode);
                                delegatingNode = 0;
                            }
                            r8.b(node2);
                        }
                    }
                    node2 = node2.f14692g;
                    delegatingNode = delegatingNode;
                    r8 = r8;
                }
                if (i5 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.b(r8);
        }
        int j3 = longSparseArray.j();
        int i6 = 0;
        while (true) {
            longSparseArray2 = node.d;
            pointerIdArray = node.f15563c;
            if (i6 >= j3) {
                break;
            }
            long g2 = longSparseArray3.g(i6);
            PointerInputChange pointerInputChange = (PointerInputChange) longSparseArray3.k(i6);
            if (pointerIdArray.b(g2)) {
                long j4 = pointerInputChange.f15593g;
                if (Offset.i(j4)) {
                    long j5 = pointerInputChange.f15591c;
                    if (Offset.i(j5)) {
                        List list2 = pointerInputChange.f15597k;
                        w wVar = w.f30218a;
                        if (list2 == null) {
                            list2 = wVar;
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        List list3 = pointerInputChange.f15597k;
                        i2 = j3;
                        if (list3 == null) {
                            list3 = wVar;
                        }
                        int size = list3.size();
                        z6 = a2;
                        int i7 = 0;
                        while (i7 < size) {
                            int i8 = size;
                            HistoricalChange historicalChange = (HistoricalChange) list3.get(i7);
                            long j6 = g2;
                            long j7 = historicalChange.f15549b;
                            if (Offset.i(j7)) {
                                list = list3;
                                i4 = i6;
                                j2 = j5;
                                long j8 = historicalChange.f15548a;
                                NodeCoordinator nodeCoordinator = node.e;
                                a.p(nodeCoordinator);
                                arrayList.add(new HistoricalChange(j8, nodeCoordinator.U(layoutCoordinates2, j7), historicalChange.f15550c));
                            } else {
                                i4 = i6;
                                j2 = j5;
                                list = list3;
                            }
                            i7++;
                            list3 = list;
                            size = i8;
                            j5 = j2;
                            g2 = j6;
                            i6 = i4;
                        }
                        i3 = i6;
                        NodeCoordinator nodeCoordinator2 = node.e;
                        a.p(nodeCoordinator2);
                        long U = nodeCoordinator2.U(layoutCoordinates2, j4);
                        NodeCoordinator nodeCoordinator3 = node.e;
                        a.p(nodeCoordinator3);
                        PointerInputChange pointerInputChange2 = new PointerInputChange(pointerInputChange.f15589a, pointerInputChange.f15590b, nodeCoordinator3.U(layoutCoordinates2, j5), pointerInputChange.d, pointerInputChange.e, pointerInputChange.f15592f, U, pointerInputChange.f15594h, pointerInputChange.f15595i, arrayList, pointerInputChange.f15596j, pointerInputChange.f15598l);
                        pointerInputChange2.f15599m = pointerInputChange.f15599m;
                        longSparseArray2.h(g2, pointerInputChange2);
                        i6 = i3 + 1;
                        node = this;
                        longSparseArray3 = longSparseArray;
                        layoutCoordinates2 = layoutCoordinates;
                        j3 = i2;
                        a2 = z6;
                    }
                }
            }
            z6 = a2;
            i2 = j3;
            i3 = i6;
            i6 = i3 + 1;
            node = this;
            longSparseArray3 = longSparseArray;
            layoutCoordinates2 = layoutCoordinates;
            j3 = i2;
            a2 = z6;
        }
        boolean z7 = a2;
        if (longSparseArray2.j() == 0) {
            pointerIdArray.f15671a = 0;
            this.f15568a.g();
            return true;
        }
        for (int i9 = pointerIdArray.f15671a - 1; -1 < i9; i9--) {
            if (longSparseArray.f(pointerIdArray.f15672b[i9]) < 0) {
                pointerIdArray.c(i9);
            }
        }
        ArrayList arrayList2 = new ArrayList(longSparseArray2.j());
        int j9 = longSparseArray2.j();
        for (int i10 = 0; i10 < j9; i10++) {
            arrayList2.add(longSparseArray2.k(i10));
        }
        PointerEvent pointerEvent2 = new PointerEvent(arrayList2, internalPointerEvent);
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i11);
            if (internalPointerEvent.a(((PointerInputChange) obj).f15589a)) {
                break;
            }
            i11++;
        }
        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
        if (pointerInputChange3 != null) {
            boolean z8 = pointerInputChange3.d;
            if (z2) {
                z3 = false;
                if (!this.f15566h && (z8 || pointerInputChange3.f15594h)) {
                    NodeCoordinator nodeCoordinator4 = this.e;
                    a.p(nodeCoordinator4);
                    boolean d = PointerEventKt.d(pointerInputChange3, nodeCoordinator4.f15827c);
                    z4 = true;
                    this.f15566h = !d;
                    if (this.f15566h == this.f15565g && (PointerEventType.a(pointerEvent2.d, 3) || PointerEventType.a(pointerEvent2.d, 4) || PointerEventType.a(pointerEvent2.d, 5))) {
                        pointerEvent2.d = this.f15566h ? 4 : 5;
                    } else if (!PointerEventType.a(pointerEvent2.d, 4) && this.f15565g && !this.f15567i) {
                        pointerEvent2.d = 3;
                    } else if (PointerEventType.a(pointerEvent2.d, 5) && this.f15566h && z8) {
                        pointerEvent2.d = 3;
                    }
                }
            } else {
                z3 = false;
                this.f15566h = false;
            }
            z4 = true;
            if (this.f15566h == this.f15565g) {
            }
            if (!PointerEventType.a(pointerEvent2.d, 4)) {
            }
            if (PointerEventType.a(pointerEvent2.d, 5)) {
                pointerEvent2.d = 3;
            }
        } else {
            z3 = false;
            z4 = true;
        }
        if (!z7 && PointerEventType.a(pointerEvent2.d, 3) && (pointerEvent = this.f15564f) != null) {
            ?? r2 = pointerEvent.f15569a;
            int size3 = r2.size();
            ?? r5 = pointerEvent2.f15569a;
            if (size3 == r5.size()) {
                int size4 = r5.size();
                for (?? r7 = z3; r7 < size4; r7++) {
                    if (Offset.d(((PointerInputChange) r2.get(r7)).f15591c, ((PointerInputChange) r5.get(r7)).f15591c)) {
                    }
                }
                z5 = z3;
                this.f15564f = pointerEvent2;
                return z5;
            }
        }
        z5 = z4;
        this.f15564f = pointerEvent2;
        return z5;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public final void b(InternalPointerEvent internalPointerEvent) {
        super.b(internalPointerEvent);
        PointerEvent pointerEvent = this.f15564f;
        if (pointerEvent == null) {
            return;
        }
        this.f15565g = this.f15566h;
        List list = pointerEvent.f15569a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            boolean z2 = !pointerInputChange.d;
            long j2 = pointerInputChange.f15589a;
            boolean z3 = !internalPointerEvent.a(j2);
            boolean z4 = !this.f15566h;
            if ((z2 && z3) || (z2 && z4)) {
                PointerIdArray pointerIdArray = this.f15563c;
                int i3 = pointerIdArray.f15671a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    }
                    if (j2 == pointerIdArray.f15672b[i4]) {
                        pointerIdArray.c(i4);
                        break;
                    }
                    i4++;
                }
            }
        }
        this.f15566h = false;
        this.f15567i = PointerEventType.a(pointerEvent.d, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.MutableVector] */
    public final void d() {
        MutableVector mutableVector = this.f15568a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                ((Node) objArr[i3]).d();
                i3++;
            } while (i3 < i2);
        }
        DelegatingNode delegatingNode = this.f15562b;
        ?? r4 = 0;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode).m1();
            } else if ((delegatingNode.f14690c & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node node = delegatingNode.f15909p;
                int i4 = 0;
                delegatingNode = delegatingNode;
                r4 = r4;
                while (node != null) {
                    if ((node.f14690c & 16) != 0) {
                        i4++;
                        r4 = r4;
                        if (i4 == 1) {
                            delegatingNode = node;
                        } else {
                            if (r4 == 0) {
                                r4 = new MutableVector(new Modifier.Node[16]);
                            }
                            if (delegatingNode != 0) {
                                r4.b(delegatingNode);
                                delegatingNode = 0;
                            }
                            r4.b(node);
                        }
                    }
                    node = node.f14692g;
                    delegatingNode = delegatingNode;
                    r4 = r4;
                }
                if (i4 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.b(r4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean e(InternalPointerEvent internalPointerEvent) {
        MutableVector mutableVector;
        int i2;
        LongSparseArray longSparseArray = this.d;
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        if (!(longSparseArray.j() == 0)) {
            Modifier.Node node = this.f15562b;
            if (node.f14699n) {
                PointerEvent pointerEvent = this.f15564f;
                a.p(pointerEvent);
                NodeCoordinator nodeCoordinator = this.e;
                a.p(nodeCoordinator);
                long j2 = nodeCoordinator.f15827c;
                DelegatingNode delegatingNode = node;
                ?? r9 = 0;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof PointerInputModifierNode) {
                        ((PointerInputModifierNode) delegatingNode).e0(pointerEvent, PointerEventPass.f15574c, j2);
                    } else if ((delegatingNode.f14690c & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node node2 = delegatingNode.f15909p;
                        int i4 = 0;
                        delegatingNode = delegatingNode;
                        r9 = r9;
                        while (node2 != null) {
                            if ((node2.f14690c & 16) != 0) {
                                i4++;
                                r9 = r9;
                                if (i4 == 1) {
                                    delegatingNode = node2;
                                } else {
                                    if (r9 == 0) {
                                        r9 = new MutableVector(new Modifier.Node[16]);
                                    }
                                    if (delegatingNode != 0) {
                                        r9.b(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    r9.b(node2);
                                }
                            }
                            node2 = node2.f14692g;
                            delegatingNode = delegatingNode;
                            r9 = r9;
                        }
                        if (i4 == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.b(r9);
                }
                if (node.f14699n && (i2 = (mutableVector = this.f15568a).f14144c) > 0) {
                    Object[] objArr = mutableVector.f14142a;
                    do {
                        ((Node) objArr[i3]).e(internalPointerEvent);
                        i3++;
                    } while (i3 < i2);
                }
                z2 = true;
            }
        }
        b(internalPointerEvent);
        longSparseArray.a();
        this.e = null;
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean f(InternalPointerEvent internalPointerEvent, boolean z2) {
        MutableVector mutableVector;
        int i2;
        if (this.d.j() == 0) {
            return false;
        }
        DelegatingNode delegatingNode = this.f15562b;
        if (!delegatingNode.f14699n) {
            return false;
        }
        PointerEvent pointerEvent = this.f15564f;
        a.p(pointerEvent);
        NodeCoordinator nodeCoordinator = this.e;
        a.p(nodeCoordinator);
        long j2 = nodeCoordinator.f15827c;
        DelegatingNode delegatingNode2 = delegatingNode;
        ?? r8 = 0;
        while (delegatingNode2 != 0) {
            if (delegatingNode2 instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) delegatingNode2).e0(pointerEvent, PointerEventPass.f15572a, j2);
            } else if ((delegatingNode2.f14690c & 16) != 0 && (delegatingNode2 instanceof DelegatingNode)) {
                Modifier.Node node = delegatingNode2.f15909p;
                int i3 = 0;
                delegatingNode2 = delegatingNode2;
                r8 = r8;
                while (node != null) {
                    if ((node.f14690c & 16) != 0) {
                        i3++;
                        r8 = r8;
                        if (i3 == 1) {
                            delegatingNode2 = node;
                        } else {
                            if (r8 == 0) {
                                r8 = new MutableVector(new Modifier.Node[16]);
                            }
                            if (delegatingNode2 != 0) {
                                r8.b(delegatingNode2);
                                delegatingNode2 = 0;
                            }
                            r8.b(node);
                        }
                    }
                    node = node.f14692g;
                    delegatingNode2 = delegatingNode2;
                    r8 = r8;
                }
                if (i3 == 1) {
                }
            }
            delegatingNode2 = DelegatableNodeKt.b(r8);
        }
        if (delegatingNode.f14699n && (i2 = (mutableVector = this.f15568a).f14144c) > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i4 = 0;
            do {
                Node node2 = (Node) objArr[i4];
                a.p(this.e);
                node2.f(internalPointerEvent, z2);
                i4++;
            } while (i4 < i2);
        }
        if (delegatingNode.f14699n) {
            ?? r14 = 0;
            while (delegatingNode != 0) {
                if (delegatingNode instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) delegatingNode).e0(pointerEvent, PointerEventPass.f15573b, j2);
                } else if ((delegatingNode.f14690c & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                    Modifier.Node node3 = delegatingNode.f15909p;
                    int i5 = 0;
                    delegatingNode = delegatingNode;
                    r14 = r14;
                    while (node3 != null) {
                        if ((node3.f14690c & 16) != 0) {
                            i5++;
                            r14 = r14;
                            if (i5 == 1) {
                                delegatingNode = node3;
                            } else {
                                if (r14 == 0) {
                                    r14 = new MutableVector(new Modifier.Node[16]);
                                }
                                if (delegatingNode != 0) {
                                    r14.b(delegatingNode);
                                    delegatingNode = 0;
                                }
                                r14.b(node3);
                            }
                        }
                        node3 = node3.f14692g;
                        delegatingNode = delegatingNode;
                        r14 = r14;
                    }
                    if (i5 == 1) {
                    }
                }
                delegatingNode = DelegatableNodeKt.b(r14);
            }
        }
        return true;
    }

    public final void g(long j2, MutableObjectList mutableObjectList) {
        PointerIdArray pointerIdArray = this.f15563c;
        int i2 = 0;
        if (pointerIdArray.b(j2) && mutableObjectList.a(this) < 0) {
            int i3 = pointerIdArray.f15671a;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (j2 == pointerIdArray.f15672b[i4]) {
                    pointerIdArray.c(i4);
                    break;
                }
                i4++;
            }
            this.d.i(j2);
        }
        MutableVector mutableVector = this.f15568a;
        int i5 = mutableVector.f14144c;
        if (i5 > 0) {
            Object[] objArr = mutableVector.f14142a;
            do {
                ((Node) objArr[i2]).g(j2, mutableObjectList);
                i2++;
            } while (i2 < i5);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f15562b + ", children=" + this.f15568a + ", pointerIds=" + this.f15563c + ')';
    }
}
