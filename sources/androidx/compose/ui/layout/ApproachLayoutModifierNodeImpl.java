package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public q f15706o;

    /* renamed from: p, reason: collision with root package name */
    public l f15707p;

    /* renamed from: q, reason: collision with root package name */
    public p f15708q;

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final MeasureResult L0(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        return (MeasureResult) this.f15706o.invoke(approachMeasureScope, measurable, new Constraints(j2));
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean Q0(long j2) {
        return ((Boolean) this.f15707p.invoke(new IntSize(j2))).booleanValue();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean V(Placeable.PlacementScope placementScope, LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        return ((Boolean) this.f15708q.invoke(placementScope, lookaheadLayoutCoordinates)).booleanValue();
    }
}
