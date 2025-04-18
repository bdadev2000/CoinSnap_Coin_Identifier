package androidx.compose.material.ripple;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class RippleAlpha {

    /* renamed from: a, reason: collision with root package name */
    public final float f7408a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7409b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7410c;
    public final float d;

    public RippleAlpha(float f2, float f3, float f4, float f5) {
        this.f7408a = f2;
        this.f7409b = f3;
        this.f7410c = f4;
        this.d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        return this.f7408a == rippleAlpha.f7408a && this.f7409b == rippleAlpha.f7409b && this.f7410c == rippleAlpha.f7410c && this.d == rippleAlpha.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + d.b(this.f7410c, d.b(this.f7409b, Float.hashCode(this.f7408a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f7408a);
        sb.append(", focusedAlpha=");
        sb.append(this.f7409b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f7410c);
        sb.append(", pressedAlpha=");
        return d.n(sb, this.d, ')');
    }
}
