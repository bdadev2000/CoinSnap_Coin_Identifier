package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class StartDelayAnimationSpec<T> implements AnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationSpec f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2235b;

    public StartDelayAnimationSpec(FiniteAnimationSpec finiteAnimationSpec, long j2) {
        this.f2234a = finiteAnimationSpec;
        this.f2235b = j2;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new StartDelayVectorizedAnimationSpec(this.f2234a.a(twoWayConverter), this.f2235b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartDelayAnimationSpec)) {
            return false;
        }
        StartDelayAnimationSpec startDelayAnimationSpec = (StartDelayAnimationSpec) obj;
        return startDelayAnimationSpec.f2235b == this.f2235b && p0.a.g(startDelayAnimationSpec.f2234a, this.f2234a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2235b) + (this.f2234a.hashCode() * 31);
    }
}
