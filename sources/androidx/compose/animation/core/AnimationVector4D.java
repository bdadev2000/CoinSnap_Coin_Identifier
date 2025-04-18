package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AnimationVector4D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f2045a;

    /* renamed from: b, reason: collision with root package name */
    public float f2046b;

    /* renamed from: c, reason: collision with root package name */
    public float f2047c;
    public float d;

    public AnimationVector4D(float f2, float f3, float f4, float f5) {
        this.f2045a = f2;
        this.f2046b = f3;
        this.f2047c = f4;
        this.d = f5;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f2045a;
        }
        if (i2 == 1) {
            return this.f2046b;
        }
        if (i2 == 2) {
            return this.f2047c;
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f2045a = 0.0f;
        this.f2046b = 0.0f;
        this.f2047c = 0.0f;
        this.d = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f2, int i2) {
        if (i2 == 0) {
            this.f2045a = f2;
            return;
        }
        if (i2 == 1) {
            this.f2046b = f2;
        } else if (i2 == 2) {
            this.f2047c = f2;
        } else {
            if (i2 != 3) {
                return;
            }
            this.d = f2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            if (animationVector4D.f2045a == this.f2045a && animationVector4D.f2046b == this.f2046b && animationVector4D.f2047c == this.f2047c && animationVector4D.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + d.b(this.f2047c, d.b(this.f2046b, Float.hashCode(this.f2045a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f2045a + ", v2 = " + this.f2046b + ", v3 = " + this.f2047c + ", v4 = " + this.d;
    }
}
