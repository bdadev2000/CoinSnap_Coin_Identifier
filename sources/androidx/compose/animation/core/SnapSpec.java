package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2225a;

    public SnapSpec(int i2) {
        this.f2225a = i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).f2225a == this.f2225a;
    }

    public final int hashCode() {
        return this.f2225a;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final /* bridge */ /* synthetic */ VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return a(VectorConvertersKt.f2340a);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedSnapSpec(this.f2225a);
    }
}
