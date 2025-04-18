package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes3.dex */
final class IntrinsicWidthNode extends IntrinsicSizeModifier {

    /* renamed from: o, reason: collision with root package name */
    public IntrinsicSize f4035o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4036p;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f4035o == IntrinsicSize.f4029a ? intrinsicMeasurable.R(i2) : intrinsicMeasurable.S(i2);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f4035o == IntrinsicSize.f4029a ? intrinsicMeasurable.R(i2) : intrinsicMeasurable.S(i2);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long e2(Measurable measurable, long j2) {
        int R = this.f4035o == IntrinsicSize.f4029a ? measurable.R(Constraints.h(j2)) : measurable.S(Constraints.h(j2));
        if (R < 0) {
            R = 0;
        }
        return Constraints.Companion.e(R);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final boolean f2() {
        return this.f4036p;
    }
}
