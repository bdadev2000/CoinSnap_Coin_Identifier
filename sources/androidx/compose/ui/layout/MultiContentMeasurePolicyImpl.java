package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MultiContentMeasurePolicyImpl implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final MultiContentMeasurePolicy f15814a;

    public MultiContentMeasurePolicyImpl(MultiContentMeasurePolicy multiContentMeasurePolicy) {
        this.f15814a = multiContentMeasurePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiContentMeasurePolicyImpl) && a.g(this.f15814a, ((MultiContentMeasurePolicyImpl) obj).f15814a);
    }

    public final int hashCode() {
        return this.f15814a.hashCode();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f15814a.maxIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f15814a.maxIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        return this.f15814a.mo1measure3p2s80s(measureScope, MeasureScopeWithLayoutNodeKt.a(measureScope), j2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f15814a.minIntrinsicHeight(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return this.f15814a.minIntrinsicWidth(intrinsicMeasureScope, MeasureScopeWithLayoutNodeKt.a(intrinsicMeasureScope), i2);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f15814a + ')';
    }
}
