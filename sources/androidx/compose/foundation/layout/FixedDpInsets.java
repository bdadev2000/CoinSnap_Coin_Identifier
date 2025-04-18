package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes3.dex */
final class FixedDpInsets implements WindowInsets {
    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return density.F0(0.0f);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return density.F0(0.0f);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return density.F0(0.0f);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return density.F0(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        fixedDpInsets.getClass();
        if (Dp.a(0.0f, 0.0f)) {
            fixedDpInsets.getClass();
            if (Dp.a(0.0f, 0.0f)) {
                fixedDpInsets.getClass();
                if (Dp.a(0.0f, 0.0f)) {
                    fixedDpInsets.getClass();
                    if (Dp.a(0.0f, 0.0f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + d.b(0.0f, d.b(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) Dp.b(0.0f)) + ", top=" + ((Object) Dp.b(0.0f)) + ", right=" + ((Object) Dp.b(0.0f)) + ", bottom=" + ((Object) Dp.b(0.0f)) + ')';
    }
}
