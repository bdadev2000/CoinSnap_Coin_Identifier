package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AnimationVector3D extends AnimationVector {

    /* renamed from: a, reason: collision with root package name */
    public float f2042a;

    /* renamed from: b, reason: collision with root package name */
    public float f2043b;

    /* renamed from: c, reason: collision with root package name */
    public float f2044c;

    public AnimationVector3D(float f2, float f3, float f4) {
        this.f2042a = f2;
        this.f2043b = f3;
        this.f2044c = f4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f2042a;
        }
        if (i2 == 1) {
            return this.f2043b;
        }
        if (i2 != 2) {
            return 0.0f;
        }
        return this.f2044c;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.f2042a = 0.0f;
        this.f2043b = 0.0f;
        this.f2044c = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f2, int i2) {
        if (i2 == 0) {
            this.f2042a = f2;
        } else if (i2 == 1) {
            this.f2043b = f2;
        } else {
            if (i2 != 2) {
                return;
            }
            this.f2044c = f2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnimationVector3D) {
            AnimationVector3D animationVector3D = (AnimationVector3D) obj;
            if (animationVector3D.f2042a == this.f2042a && animationVector3D.f2043b == this.f2043b && animationVector3D.f2044c == this.f2044c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2044c) + d.b(this.f2043b, Float.hashCode(this.f2042a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f2042a + ", v2 = " + this.f2043b + ", v3 = " + this.f2044c;
    }
}
