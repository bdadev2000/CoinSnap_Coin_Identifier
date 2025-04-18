package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.api.Api;
import e0.x;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ScrollingLayoutNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public ScrollState f2879o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2880p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2881q;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f2881q ? intrinsicMeasurable.K(i2) : intrinsicMeasurable.K(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f2881q ? intrinsicMeasurable.R(Api.BaseClientBuilder.API_PRIORITY_OTHER) : intrinsicMeasurable.R(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f2881q ? intrinsicMeasurable.S(Api.BaseClientBuilder.API_PRIORITY_OTHER) : intrinsicMeasurable.S(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        CheckScrollableContainerConstraintsKt.a(j2, this.f2881q ? Orientation.f3394a : Orientation.f3395b);
        boolean z2 = this.f2881q;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int h2 = z2 ? Integer.MAX_VALUE : Constraints.h(j2);
        if (this.f2881q) {
            i2 = Constraints.i(j2);
        }
        Placeable V = measurable.V(Constraints.b(j2, 0, i2, 0, h2, 5));
        int i3 = V.f15825a;
        int i4 = Constraints.i(j2);
        if (i3 > i4) {
            i3 = i4;
        }
        int i5 = V.f15826b;
        int h3 = Constraints.h(j2);
        if (i5 > h3) {
            i5 = h3;
        }
        int i6 = V.f15826b - i5;
        int i7 = V.f15825a - i3;
        if (!this.f2881q) {
            i6 = i7;
        }
        this.f2879o.f(i6);
        this.f2879o.f2866b.b(this.f2881q ? i5 : i3);
        return measureScope.T(i3, i5, x.f30219a, new ScrollingLayoutNode$measure$1(this, i6, V));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.f2881q ? intrinsicMeasurable.s(i2) : intrinsicMeasurable.s(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }
}
