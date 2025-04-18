package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import d0.k;
import e0.x;
import q0.p;

/* loaded from: classes3.dex */
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public AnchoredDraggableState f12967o;

    /* renamed from: p, reason: collision with root package name */
    public p f12968p;

    /* renamed from: q, reason: collision with root package name */
    public Orientation f12969q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12970r;

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        this.f12970r = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        if (!measureScope.t0() || !this.f12970r) {
            k kVar = (k) this.f12968p.invoke(new IntSize(IntSizeKt.a(V.f15825a, V.f15826b)), new Constraints(j2));
            this.f12967o.k((DraggableAnchors) kVar.f30134a, kVar.f30135b);
        }
        this.f12970r = measureScope.t0() || this.f12970r;
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new DraggableAnchorsNode$measure$1(measureScope, this, V));
    }
}
