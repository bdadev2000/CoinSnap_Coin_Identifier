package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;

/* loaded from: classes4.dex */
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    public int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.K(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.R(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.S(i2);
    }

    public abstract long e2(Measurable measurable, long j2);

    public abstract boolean f2();

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        long e2 = e2(measurable, j2);
        if (f2()) {
            e2 = ConstraintsKt.f(j2, e2);
        }
        Placeable V = measurable.V(e2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new IntrinsicSizeModifier$measure$1(V));
    }

    public int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.s(i2);
    }
}
