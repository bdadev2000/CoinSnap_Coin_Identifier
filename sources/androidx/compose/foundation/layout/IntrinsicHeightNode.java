package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes3.dex */
final class IntrinsicHeightNode extends IntrinsicSizeModifier {

    /* renamed from: o, reason: collision with root package name */
    public IntrinsicSize f4027o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4028p;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f4027o == IntrinsicSize.f4029a ? intrinsicMeasurable.K(i2) : intrinsicMeasurable.s(i2);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long e2(Measurable measurable, long j2) {
        int K = this.f4027o == IntrinsicSize.f4029a ? measurable.K(Constraints.i(j2)) : measurable.s(Constraints.i(j2));
        if (K < 0) {
            K = 0;
        }
        return Constraints.Companion.d(K);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final boolean f2() {
        return this.f4028p;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f4027o == IntrinsicSize.f4029a ? intrinsicMeasurable.K(i2) : intrinsicMeasurable.s(i2);
    }
}
