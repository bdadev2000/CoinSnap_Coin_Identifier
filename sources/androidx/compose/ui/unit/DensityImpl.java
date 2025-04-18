package androidx.compose.ui.unit;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
final class DensityImpl implements Density {

    /* renamed from: a, reason: collision with root package name */
    public final float f17481a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17482b;

    public DensityImpl(float f2, float f3) {
        this.f17481a = f2;
        this.f17482b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.f17481a, densityImpl.f17481a) == 0 && Float.compare(this.f17482b, densityImpl.f17482b) == 0;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f17481a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17482b) + (Float.hashCode(this.f17481a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f17481a);
        sb.append(", fontScale=");
        return d.n(sb, this.f17482b, ')');
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f17482b;
    }
}
