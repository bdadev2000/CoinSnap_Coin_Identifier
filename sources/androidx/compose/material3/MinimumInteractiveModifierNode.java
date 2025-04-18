package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import e0.x;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        float f2 = 0;
        float v2 = p0.a.v(((Dp) CompositionLocalConsumerModifierNodeKt.a(this, InteractiveComponentSizeKt.f9627a)).f17486a, f2);
        Placeable V = measurable.V(j2);
        boolean z2 = this.f14699n && (Float.isNaN(v2) ^ true) && Float.compare(v2, f2) > 0;
        int F0 = true ^ Float.isNaN(v2) ? measureScope.F0(v2) : 0;
        int max = z2 ? Math.max(V.f15825a, F0) : V.f15825a;
        int max2 = z2 ? Math.max(V.f15826b, F0) : V.f15826b;
        return measureScope.T(max, max2, x.f30219a, new MinimumInteractiveModifierNode$measure$1(max, max2, V));
    }
}
