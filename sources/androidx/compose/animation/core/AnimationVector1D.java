package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AnimationVector1D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f2039a;

    public AnimationVector1D(float f2) {
        this.f2039a = f2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f2039a;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector1D(0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f2039a = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f2, int i2) {
        if (i2 == 0) {
            this.f2039a = f2;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).f2039a == this.f2039a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2039a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f2039a;
    }
}
