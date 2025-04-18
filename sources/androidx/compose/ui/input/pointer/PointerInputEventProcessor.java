package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PointerInputEventProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f15615a;

    /* renamed from: b, reason: collision with root package name */
    public final HitPathTracker f15616b;

    /* renamed from: c, reason: collision with root package name */
    public final PointerInputChangeEventProducer f15617c = new PointerInputChangeEventProducer();
    public final HitTestResult d = new HitTestResult();
    public boolean e;

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.f15615a = layoutNode;
        this.f15616b = new HitPathTracker(layoutNode.B.f16089b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z2) {
        byte b2;
        HitPathTracker hitPathTracker;
        int i2;
        HitTestResult hitTestResult = this.d;
        if (this.e) {
            return 0;
        }
        try {
            this.e = true;
            InternalPointerEvent a2 = this.f15617c.a(pointerInputEvent, positionCalculator);
            LongSparseArray longSparseArray = a2.f15554a;
            int j2 = longSparseArray.j();
            for (int i3 = 0; i3 < j2; i3++) {
                PointerInputChange pointerInputChange = (PointerInputChange) longSparseArray.k(i3);
                if (!pointerInputChange.d && !pointerInputChange.f15594h) {
                }
                b2 = false;
                break;
            }
            b2 = true;
            int j3 = longSparseArray.j();
            int i4 = 0;
            while (true) {
                hitPathTracker = this.f15616b;
                if (i4 >= j3) {
                    break;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) longSparseArray.k(i4);
                if (b2 != false || PointerEventKt.a(pointerInputChange2)) {
                    this.f15615a.F(pointerInputChange2.f15591c, this.d, PointerType.a(pointerInputChange2.f15595i, 1), true);
                    if (!hitTestResult.isEmpty()) {
                        hitPathTracker.a(pointerInputChange2.f15589a, hitTestResult, PointerEventKt.a(pointerInputChange2));
                        hitTestResult.clear();
                    }
                }
                i4++;
            }
            hitPathTracker.f15552b.c();
            boolean b3 = hitPathTracker.b(a2, z2);
            if (!a2.f15556c) {
                int j4 = longSparseArray.j();
                for (int i5 = 0; i5 < j4; i5++) {
                    PointerInputChange pointerInputChange3 = (PointerInputChange) longSparseArray.k(i5);
                    if ((!Offset.d(PointerEventKt.f(pointerInputChange3, true), 0L)) && pointerInputChange3.b()) {
                        i2 = 2;
                        break;
                    }
                }
            }
            i2 = 0;
            int i6 = (b3 ? 1 : 0) | i2;
            this.e = false;
            return i6;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.f15617c.f15600a.a();
        HitPathTracker hitPathTracker = this.f15616b;
        MutableVector mutableVector = hitPathTracker.f15552b.f15568a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                ((Node) objArr[i3]).d();
                i3++;
            } while (i3 < i2);
        }
        hitPathTracker.f15552b.f15568a.g();
    }
}
