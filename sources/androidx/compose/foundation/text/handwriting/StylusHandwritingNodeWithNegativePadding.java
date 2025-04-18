package androidx.compose.foundation.text.handwriting;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;

@StabilityInferred
/* loaded from: classes.dex */
public final class StylusHandwritingNodeWithNegativePadding extends StylusHandwritingNode implements LayoutModifierNode {
    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        int F0 = measureScope.F0(StylusHandwritingKt.f6275a);
        int F02 = measureScope.F0(StylusHandwritingKt.f6276b);
        int i2 = F02 * 2;
        int i3 = F0 * 2;
        Placeable V = measurable.V(ConstraintsKt.k(i2, i3, j2));
        int i4 = V.f15826b - i3;
        return measureScope.T(V.f15825a - i2, i4, x.f30219a, new StylusHandwritingNodeWithNegativePadding$measure$1(F02, F0, V));
    }
}
