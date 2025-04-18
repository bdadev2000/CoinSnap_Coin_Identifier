package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;

/* loaded from: classes4.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Direction f3888o;

    /* renamed from: p, reason: collision with root package name */
    public float f3889p;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        int k2;
        int i2;
        int h2;
        int i3;
        if (!Constraints.e(j2) || this.f3888o == Direction.f3879a) {
            k2 = Constraints.k(j2);
            i2 = Constraints.i(j2);
        } else {
            k2 = p0.a.A(Math.round(Constraints.i(j2) * this.f3889p), Constraints.k(j2), Constraints.i(j2));
            i2 = k2;
        }
        if (!Constraints.d(j2) || this.f3888o == Direction.f3880b) {
            int j3 = Constraints.j(j2);
            h2 = Constraints.h(j2);
            i3 = j3;
        } else {
            i3 = p0.a.A(Math.round(Constraints.h(j2) * this.f3889p), Constraints.j(j2), Constraints.h(j2));
            h2 = i3;
        }
        Placeable V = measurable.V(ConstraintsKt.a(k2, i2, i3, h2));
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new FillNode$measure$1(V));
    }
}
