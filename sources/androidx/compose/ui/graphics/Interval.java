package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes3.dex */
public class Interval<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float f14987a = Float.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public final float f14988b = Float.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14989c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.f14987a == interval.f14987a && this.f14988b == interval.f14988b && p0.a.g(this.f14989c, interval.f14989c);
        }
        return false;
    }

    public final int hashCode() {
        int b2 = android.support.v4.media.d.b(this.f14988b, Float.hashCode(this.f14987a) * 31, 31);
        Object obj = this.f14989c;
        return b2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "Interval(start=" + this.f14987a + ", end=" + this.f14988b + ", data=" + this.f14989c + ')';
    }
}
