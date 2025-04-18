package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationVector f2377a;

    /* renamed from: b, reason: collision with root package name */
    public final Easing f2378b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2379c;

    public VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing, int i2) {
        this.f2377a = animationVector;
        this.f2378b = easing;
        this.f2379c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) obj;
        return p0.a.g(this.f2377a, vectorizedKeyframeSpecElementInfo.f2377a) && p0.a.g(this.f2378b, vectorizedKeyframeSpecElementInfo.f2378b) && this.f2379c == vectorizedKeyframeSpecElementInfo.f2379c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2379c) + ((this.f2378b.hashCode() + (this.f2377a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f2377a + ", easing=" + this.f2378b + ", arcMode=" + ((Object) ("ArcMode(value=" + this.f2379c + ')')) + ')';
    }
}
