package androidx.compose.ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.InnerNodeCoordinator;
import e0.q;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class HitPathTracker {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutCoordinates f15551a;

    /* renamed from: b, reason: collision with root package name */
    public final NodeParent f15552b = new NodeParent();

    /* renamed from: c, reason: collision with root package name */
    public final MutableLongObjectMap f15553c = new MutableLongObjectMap(10);

    public HitPathTracker(InnerNodeCoordinator innerNodeCoordinator) {
        this.f15551a = innerNodeCoordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public final void a(long j2, HitTestResult hitTestResult, boolean z2) {
        long[] jArr;
        boolean z3;
        long[] jArr2;
        boolean z4;
        int i2;
        Node node;
        Node node2;
        NodeParent nodeParent = this.f15552b;
        MutableLongObjectMap mutableLongObjectMap = this.f15553c;
        mutableLongObjectMap.e = 0;
        long[] jArr3 = mutableLongObjectMap.f1458a;
        char c2 = 7;
        if (jArr3 != ScatterMapKt.f1590a) {
            q.Y(jArr3);
            long[] jArr4 = mutableLongObjectMap.f1458a;
            int i3 = mutableLongObjectMap.d;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr4[i4] = j3 | (jArr4[i4] & (~j3));
        }
        int i5 = 0;
        q.W(0, mutableLongObjectMap.d, mutableLongObjectMap.f1460c);
        mutableLongObjectMap.f1475f = ScatterMapKt.c(mutableLongObjectMap.d) - mutableLongObjectMap.e;
        int i6 = hitTestResult.d;
        boolean z5 = true;
        NodeParent nodeParent2 = nodeParent;
        boolean z6 = true;
        int i7 = 0;
        while (i7 < i6) {
            Modifier.Node node3 = (Modifier.Node) hitTestResult.get(i7);
            if (z6) {
                MutableVector mutableVector = nodeParent2.f15568a;
                int i8 = mutableVector.f14144c;
                if (i8 > 0) {
                    ?? r14 = mutableVector.f14142a;
                    int i9 = i5;
                    while (true) {
                        node2 = r14[i9];
                        if (a.g(((Node) node2).f15562b, node3)) {
                            break;
                        }
                        int i10 = i9 + 1;
                        if (i10 >= i8) {
                            break;
                        } else {
                            i9 = i10;
                        }
                    }
                }
                node2 = 0;
                node = node2;
                if (node != null) {
                    node.f15566h = true;
                    node.f15563c.a(j2);
                    Object c3 = mutableLongObjectMap.c(j2);
                    if (c3 == null) {
                        c3 = new MutableObjectList();
                        mutableLongObjectMap.g(j2, c3);
                    }
                    ((MutableObjectList) c3).b(node);
                    nodeParent2 = node;
                    i7++;
                    i5 = 0;
                } else {
                    z6 = false;
                }
            }
            node = new Node(node3);
            node.f15563c.a(j2);
            Object c4 = mutableLongObjectMap.c(j2);
            if (c4 == null) {
                c4 = new MutableObjectList();
                mutableLongObjectMap.g(j2, c4);
            }
            ((MutableObjectList) c4).b(node);
            nodeParent2.f15568a.b(node);
            nodeParent2 = node;
            i7++;
            i5 = 0;
        }
        if (!z2) {
            return;
        }
        long[] jArr5 = mutableLongObjectMap.f1459b;
        Object[] objArr = mutableLongObjectMap.f1460c;
        long[] jArr6 = mutableLongObjectMap.f1458a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j4 = jArr6[i11];
            if ((((~j4) << c2) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j4 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        long j5 = jArr5[i15];
                        MutableObjectList mutableObjectList = (MutableObjectList) objArr[i15];
                        MutableVector mutableVector2 = nodeParent.f15568a;
                        int i16 = mutableVector2.f14144c;
                        if (i16 > 0) {
                            Object[] objArr2 = mutableVector2.f14142a;
                            int i17 = 0;
                            while (true) {
                                ((Node) objArr2[i17]).g(j5, mutableObjectList);
                                jArr2 = jArr5;
                                z4 = true;
                                int i18 = i17 + 1;
                                if (i18 >= i16) {
                                    break;
                                }
                                i17 = i18;
                                jArr5 = jArr2;
                            }
                        } else {
                            jArr2 = jArr5;
                            z4 = true;
                        }
                        i2 = 8;
                    } else {
                        jArr2 = jArr5;
                        z4 = z5;
                        i2 = i12;
                    }
                    j4 >>= i2;
                    i14++;
                    z5 = z4;
                    i12 = i2;
                    jArr5 = jArr2;
                }
                jArr = jArr5;
                z3 = z5;
                if (i13 != i12) {
                    return;
                }
            } else {
                jArr = jArr5;
                z3 = z5;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            z5 = z3;
            jArr5 = jArr;
            c2 = 7;
        }
    }

    public final boolean b(InternalPointerEvent internalPointerEvent, boolean z2) {
        boolean z3;
        boolean z4;
        NodeParent nodeParent = this.f15552b;
        if (!nodeParent.a(internalPointerEvent.f15554a, this.f15551a, internalPointerEvent, z2)) {
            return false;
        }
        MutableVector mutableVector = nodeParent.f15568a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            z3 = false;
            do {
                z3 = ((Node) objArr[i3]).f(internalPointerEvent, z2) || z3;
                i3++;
            } while (i3 < i2);
        } else {
            z3 = false;
        }
        int i4 = mutableVector.f14144c;
        if (i4 > 0) {
            Object[] objArr2 = mutableVector.f14142a;
            int i5 = 0;
            z4 = false;
            do {
                z4 = ((Node) objArr2[i5]).e(internalPointerEvent) || z4;
                i5++;
            } while (i5 < i4);
        } else {
            z4 = false;
        }
        nodeParent.b(internalPointerEvent);
        return z4 || z3;
    }
}
