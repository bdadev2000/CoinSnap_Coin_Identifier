package androidx.compose.material3.carousel;

import android.support.v4.media.d;

/* loaded from: classes2.dex */
final class ShiftPointRange {

    /* renamed from: a, reason: collision with root package name */
    public final int f12741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12742b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12743c;

    public ShiftPointRange(int i2, int i3, float f2) {
        this.f12741a = i2;
        this.f12742b = i3;
        this.f12743c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftPointRange)) {
            return false;
        }
        ShiftPointRange shiftPointRange = (ShiftPointRange) obj;
        return this.f12741a == shiftPointRange.f12741a && this.f12742b == shiftPointRange.f12742b && Float.compare(this.f12743c, shiftPointRange.f12743c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12743c) + d.c(this.f12742b, Integer.hashCode(this.f12741a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShiftPointRange(fromStepIndex=");
        sb.append(this.f12741a);
        sb.append(", toStepIndex=");
        sb.append(this.f12742b);
        sb.append(", steppedInterpolation=");
        return d.n(sb, this.f12743c, ')');
    }
}
