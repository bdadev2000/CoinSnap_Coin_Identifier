package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class Fade {

    /* renamed from: a, reason: collision with root package name */
    public final float f1880a;

    /* renamed from: b, reason: collision with root package name */
    public final FiniteAnimationSpec f1881b;

    public Fade(float f2, FiniteAnimationSpec finiteAnimationSpec) {
        this.f1880a = f2;
        this.f1881b = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return Float.compare(this.f1880a, fade.f1880a) == 0 && p0.a.g(this.f1881b, fade.f1881b);
    }

    public final int hashCode() {
        return this.f1881b.hashCode() + (Float.hashCode(this.f1880a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f1880a + ", animationSpec=" + this.f1881b + ')';
    }
}
