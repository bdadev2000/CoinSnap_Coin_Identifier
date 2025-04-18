package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {

    /* renamed from: a, reason: collision with root package name */
    public final IntrinsicMeasurable f15725a;

    /* renamed from: b, reason: collision with root package name */
    public final IntrinsicMinMax f15726b;

    /* renamed from: c, reason: collision with root package name */
    public final IntrinsicWidthHeight f15727c;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.f15725a = intrinsicMeasurable;
        this.f15726b = intrinsicMinMax;
        this.f15727c = intrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int K(int i2) {
        return this.f15725a.K(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int R(int i2) {
        return this.f15725a.R(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int S(int i2) {
        return this.f15725a.S(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public final Placeable V(long j2) {
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f15732a;
        IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.f15730b;
        IntrinsicMinMax intrinsicMinMax2 = this.f15726b;
        IntrinsicMeasurable intrinsicMeasurable = this.f15725a;
        if (this.f15727c == intrinsicWidthHeight) {
            return new FixedSizeIntrinsicsPlaceable(intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.S(Constraints.h(j2)) : intrinsicMeasurable.R(Constraints.h(j2)), Constraints.d(j2) ? Constraints.h(j2) : 32767);
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.e(j2) ? Constraints.i(j2) : 32767, intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.s(Constraints.i(j2)) : intrinsicMeasurable.K(Constraints.i(j2)));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object m() {
        return this.f15725a.m();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int s(int i2) {
        return this.f15725a.s(i2);
    }
}
