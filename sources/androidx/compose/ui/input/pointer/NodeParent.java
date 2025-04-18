package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;

@StabilityInferred
/* loaded from: classes2.dex */
public class NodeParent {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f15568a = new MutableVector(new Node[16]);

    public boolean a(LongSparseArray longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        MutableVector mutableVector = this.f15568a;
        int i2 = mutableVector.f14144c;
        if (i2 <= 0) {
            return false;
        }
        Object[] objArr = mutableVector.f14142a;
        int i3 = 0;
        boolean z3 = false;
        do {
            z3 = ((Node) objArr[i3]).a(longSparseArray, layoutCoordinates, internalPointerEvent, z2) || z3;
            i3++;
        } while (i3 < i2);
        return z3;
    }

    public void b(InternalPointerEvent internalPointerEvent) {
        MutableVector mutableVector = this.f15568a;
        int i2 = mutableVector.f14144c;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            }
            if (((Node) mutableVector.f14142a[i2]).f15563c.f15671a == 0) {
                mutableVector.o(i2);
            }
        }
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            MutableVector mutableVector = this.f15568a;
            if (i2 >= mutableVector.f14144c) {
                return;
            }
            Node node = (Node) mutableVector.f14142a[i2];
            if (node.f15562b.f14699n) {
                i2++;
                node.c();
            } else {
                node.d();
                mutableVector.o(i2);
            }
        }
    }
}
