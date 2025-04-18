package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import e0.x;

/* loaded from: classes2.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f4126o;

    /* renamed from: p, reason: collision with root package name */
    public float f4127p;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int K = intrinsicMeasurable.K(i2);
        int F0 = !Dp.a(this.f4127p, Float.NaN) ? intrinsicMeasureScope.F0(this.f4127p) : 0;
        return K < F0 ? F0 : K;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int R = intrinsicMeasurable.R(i2);
        int F0 = !Dp.a(this.f4126o, Float.NaN) ? intrinsicMeasureScope.F0(this.f4126o) : 0;
        return R < F0 ? F0 : R;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int S = intrinsicMeasurable.S(i2);
        int F0 = !Dp.a(this.f4126o, Float.NaN) ? intrinsicMeasureScope.F0(this.f4126o) : 0;
        return S < F0 ? F0 : S;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        int k2;
        int i2 = 0;
        if (Dp.a(this.f4126o, Float.NaN) || Constraints.k(j2) != 0) {
            k2 = Constraints.k(j2);
        } else {
            k2 = measureScope.F0(this.f4126o);
            int i3 = Constraints.i(j2);
            if (k2 > i3) {
                k2 = i3;
            }
            if (k2 < 0) {
                k2 = 0;
            }
        }
        int i4 = Constraints.i(j2);
        if (Dp.a(this.f4127p, Float.NaN) || Constraints.j(j2) != 0) {
            i2 = Constraints.j(j2);
        } else {
            int F0 = measureScope.F0(this.f4127p);
            int h2 = Constraints.h(j2);
            if (F0 > h2) {
                F0 = h2;
            }
            if (F0 >= 0) {
                i2 = F0;
            }
        }
        Placeable V = measurable.V(ConstraintsKt.a(k2, i4, i2, Constraints.h(j2)));
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new UnspecifiedConstraintsNode$measure$1(V));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int s2 = intrinsicMeasurable.s(i2);
        int F0 = !Dp.a(this.f4127p, Float.NaN) ? intrinsicMeasureScope.F0(this.f4127p) : 0;
        return s2 < F0 ? F0 : s2;
    }
}
