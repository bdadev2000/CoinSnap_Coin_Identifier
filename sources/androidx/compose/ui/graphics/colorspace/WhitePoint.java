package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public final class WhitePoint {

    /* renamed from: a, reason: collision with root package name */
    public final float f15123a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15124b;

    public WhitePoint(float f2, float f3) {
        this.f15123a = f2;
        this.f15124b = f3;
    }

    public final float[] a() {
        float f2 = this.f15123a;
        float f3 = this.f15124b;
        return new float[]{f2 / f3, 1.0f, ((1.0f - f2) - f3) / f3};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f15123a, whitePoint.f15123a) == 0 && Float.compare(this.f15124b, whitePoint.f15124b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15124b) + (Float.hashCode(this.f15123a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f15123a);
        sb.append(", y=");
        return d.n(sb, this.f15124b, ')');
    }
}
