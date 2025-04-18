package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;

/* loaded from: classes4.dex */
final class PercentCornerSize implements CornerSize, InspectableValue {

    /* renamed from: a, reason: collision with root package name */
    public final float f5391a;

    public PercentCornerSize(float f2) {
        this.f5391a = f2;
        if (f2 < 0.0f || f2 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    public final float a(long j2, Density density) {
        return (this.f5391a / 100.0f) * Size.c(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.f5391a, ((PercentCornerSize) obj).f5391a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5391a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f5391a + "%)";
    }
}
