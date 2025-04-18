package androidx.compose.animation;

import android.support.v4.media.d;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;

@Immutable
/* loaded from: classes4.dex */
public final class Scale {

    /* renamed from: a, reason: collision with root package name */
    public final float f1897a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1898b;

    /* renamed from: c, reason: collision with root package name */
    public final FiniteAnimationSpec f1899c;

    public Scale(float f2, long j2, FiniteAnimationSpec finiteAnimationSpec) {
        this.f1897a = f2;
        this.f1898b = j2;
        this.f1899c = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.f1897a, scale.f1897a) == 0 && TransformOrigin.a(this.f1898b, scale.f1898b) && p0.a.g(this.f1899c, scale.f1899c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f1897a) * 31;
        int i2 = TransformOrigin.f15060c;
        return this.f1899c.hashCode() + d.d(this.f1898b, hashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f1897a + ", transformOrigin=" + ((Object) TransformOrigin.d(this.f1898b)) + ", animationSpec=" + this.f1899c + ')';
    }
}
