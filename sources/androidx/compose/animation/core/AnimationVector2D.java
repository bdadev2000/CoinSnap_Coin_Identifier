package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AnimationVector2D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f2040a;

    /* renamed from: b, reason: collision with root package name */
    public float f2041b;

    public AnimationVector2D(float f2, float f3) {
        this.f2040a = f2;
        this.f2041b = f3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f2040a;
        }
        if (i2 != 1) {
            return 0.0f;
        }
        return this.f2041b;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector2D(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f2040a = 0.0f;
        this.f2041b = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f2, int i2) {
        if (i2 == 0) {
            this.f2040a = f2;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f2041b = f2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnimationVector2D) {
            AnimationVector2D animationVector2D = (AnimationVector2D) obj;
            if (animationVector2D.f2040a == this.f2040a && animationVector2D.f2041b == this.f2041b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2041b) + (Float.hashCode(this.f2040a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f2040a + ", v2 = " + this.f2041b;
    }
}
