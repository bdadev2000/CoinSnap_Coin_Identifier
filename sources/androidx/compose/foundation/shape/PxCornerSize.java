package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
final class PxCornerSize implements CornerSize, InspectableValue {
    @Override // androidx.compose.foundation.shape.CornerSize
    public final float a(long j2, Density density) {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PxCornerSize)) {
            return false;
        }
        ((PxCornerSize) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f);
    }

    public final String toString() {
        return "CornerSize(size = 0.0.px)";
    }
}
