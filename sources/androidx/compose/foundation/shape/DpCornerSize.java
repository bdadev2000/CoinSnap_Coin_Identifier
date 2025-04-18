package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes4.dex */
final class DpCornerSize implements CornerSize, InspectableValue {

    /* renamed from: a, reason: collision with root package name */
    public final float f5389a;

    public DpCornerSize(float f2) {
        this.f5389a = f2;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    public final float a(long j2, Density density) {
        return density.y1(this.f5389a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.a(this.f5389a, ((DpCornerSize) obj).f5389a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5389a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f5389a + ".dp)";
    }
}
