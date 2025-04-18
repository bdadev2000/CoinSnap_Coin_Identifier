package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final DurationBasedAnimationSpec f2095a;

    /* renamed from: b, reason: collision with root package name */
    public final RepeatMode f2096b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2097c;

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.f2095a = durationBasedAnimationSpec;
        this.f2096b = repeatMode;
        this.f2097c = j2;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.f2095a.a(twoWayConverter), this.f2096b, this.f2097c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        return p0.a.g(infiniteRepeatableSpec.f2095a, this.f2095a) && infiniteRepeatableSpec.f2096b == this.f2096b && infiniteRepeatableSpec.f2097c == this.f2097c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2097c) + ((this.f2096b.hashCode() + (this.f2095a.hashCode() * 31)) * 31);
    }
}
