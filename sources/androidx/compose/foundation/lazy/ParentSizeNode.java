package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;

/* loaded from: classes3.dex */
final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f4439o;

    /* renamed from: p, reason: collision with root package name */
    public State f4440p;

    /* renamed from: q, reason: collision with root package name */
    public State f4441q;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        State state = this.f4440p;
        int round = (state == null || ((Number) state.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) state.getValue()).floatValue() * this.f4439o);
        State state2 = this.f4441q;
        int round2 = (state2 == null || ((Number) state2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) state2.getValue()).floatValue() * this.f4439o);
        int k2 = round != Integer.MAX_VALUE ? round : Constraints.k(j2);
        int j3 = round2 != Integer.MAX_VALUE ? round2 : Constraints.j(j2);
        if (round == Integer.MAX_VALUE) {
            round = Constraints.i(j2);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = Constraints.h(j2);
        }
        Placeable V = measurable.V(ConstraintsKt.a(k2, round, j3, round2));
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new ParentSizeNode$measure$1(V));
    }
}
