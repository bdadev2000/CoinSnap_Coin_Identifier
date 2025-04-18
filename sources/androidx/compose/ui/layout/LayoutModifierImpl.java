package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import q0.q;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public q f15750o;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        return (MeasureResult) this.f15750o.invoke(measureScope, measurable, new Constraints(j2));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f15750o + ')';
    }
}
