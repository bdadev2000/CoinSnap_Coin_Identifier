package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class LightingColorFilter extends ColorFilter {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        lightingColorFilter.getClass();
        if (!Color.c(0L, 0L)) {
            return false;
        }
        lightingColorFilter.getClass();
        return Color.c(0L, 0L);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        android.support.v4.media.d.z(0L, sb, ", add=");
        sb.append((Object) Color.i(0L));
        sb.append(')');
        return sb.toString();
    }
}
