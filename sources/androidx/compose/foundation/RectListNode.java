package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f2847o = null;

    /* renamed from: p, reason: collision with root package name */
    public Rect f2848p;

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        Rect rect;
        l lVar = this.f2847o;
        if (lVar == null) {
            androidx.compose.ui.geometry.Rect Q = LayoutCoordinatesKt.c(nodeCoordinator).Q(nodeCoordinator, true);
            rect = new Rect(a.t0(Q.f14914a), a.t0(Q.f14915b), a.t0(Q.f14916c), a.t0(Q.d));
        } else {
            androidx.compose.ui.geometry.Rect rect2 = (androidx.compose.ui.geometry.Rect) lVar.invoke(nodeCoordinator);
            LayoutCoordinates c2 = LayoutCoordinatesKt.c(nodeCoordinator);
            long v2 = c2.v(nodeCoordinator, rect2.g());
            float f2 = rect2.f14915b;
            float f3 = rect2.f14916c;
            long v3 = c2.v(nodeCoordinator, OffsetKt.a(f3, f2));
            float f4 = rect2.f14914a;
            float f5 = rect2.d;
            long v4 = c2.v(nodeCoordinator, OffsetKt.a(f4, f5));
            long v5 = c2.v(nodeCoordinator, OffsetKt.a(f3, f5));
            float g2 = Offset.g(v2);
            float[] fArr = {Offset.g(v3), Offset.g(v4), Offset.g(v5)};
            for (int i2 = 0; i2 < 3; i2++) {
                g2 = Math.min(g2, fArr[i2]);
            }
            float h2 = Offset.h(v2);
            float[] fArr2 = {Offset.h(v3), Offset.h(v4), Offset.h(v5)};
            for (int i3 = 0; i3 < 3; i3++) {
                h2 = Math.min(h2, fArr2[i3]);
            }
            float g3 = Offset.g(v2);
            float[] fArr3 = {Offset.g(v3), Offset.g(v4), Offset.g(v5)};
            for (int i4 = 0; i4 < 3; i4++) {
                g3 = Math.max(g3, fArr3[i4]);
            }
            float h3 = Offset.h(v2);
            float[] fArr4 = {Offset.h(v3), Offset.h(v4), Offset.h(v5)};
            for (int i5 = 0; i5 < 3; i5++) {
                h3 = Math.max(h3, fArr4[i5]);
            }
            rect = new Rect(a.t0(g2), a.t0(h2), a.t0(g3), a.t0(h3));
        }
        MutableVector e2 = e2();
        Object obj = this.f2848p;
        if (obj != null) {
            e2.n(obj);
        }
        if (!rect.isEmpty()) {
            e2.b(rect);
        }
        f2(e2);
        this.f2848p = rect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        MutableVector e2 = e2();
        Rect rect = this.f2848p;
        if (rect != null) {
            e2.n(rect);
        }
        f2(e2);
        this.f2848p = null;
    }

    public abstract MutableVector e2();

    public abstract void f2(MutableVector mutableVector);
}
