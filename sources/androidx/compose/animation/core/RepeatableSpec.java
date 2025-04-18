package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2160a;

    /* renamed from: b, reason: collision with root package name */
    public final DurationBasedAnimationSpec f2161b;

    /* renamed from: c, reason: collision with root package name */
    public final RepeatMode f2162c;
    public final long d;

    public RepeatableSpec(int i2, TweenSpec tweenSpec, RepeatMode repeatMode, long j2) {
        this.f2160a = i2;
        this.f2161b = tweenSpec;
        this.f2162c = repeatMode;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RepeatableSpec)) {
            return false;
        }
        RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
        return repeatableSpec.f2160a == this.f2160a && p0.a.g(repeatableSpec.f2161b, this.f2161b) && repeatableSpec.f2162c == this.f2162c && repeatableSpec.d == this.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.f2162c.hashCode() + ((this.f2161b.hashCode() + (this.f2160a * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedRepeatableSpec(this.f2160a, this.f2161b.a(twoWayConverter), this.f2162c, this.d);
    }
}
