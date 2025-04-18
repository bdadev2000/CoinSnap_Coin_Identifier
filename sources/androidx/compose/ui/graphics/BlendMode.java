package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes2.dex */
public final class BlendMode {

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "Clear" : a(i2, 1) ? "Src" : a(i2, 2) ? "Dst" : a(i2, 3) ? "SrcOver" : a(i2, 4) ? "DstOver" : a(i2, 5) ? "SrcIn" : a(i2, 6) ? "DstIn" : a(i2, 7) ? "SrcOut" : a(i2, 8) ? "DstOut" : a(i2, 9) ? "SrcAtop" : a(i2, 10) ? "DstAtop" : a(i2, 11) ? "Xor" : a(i2, 12) ? "Plus" : a(i2, 13) ? "Modulate" : a(i2, 14) ? "Screen" : a(i2, 15) ? "Overlay" : a(i2, 16) ? "Darken" : a(i2, 17) ? "Lighten" : a(i2, 18) ? "ColorDodge" : a(i2, 19) ? "ColorBurn" : a(i2, 20) ? "HardLight" : a(i2, 21) ? "Softlight" : a(i2, 22) ? "Difference" : a(i2, 23) ? "Exclusion" : a(i2, 24) ? "Multiply" : a(i2, 25) ? "Hue" : a(i2, 26) ? "Saturation" : a(i2, 27) ? "Color" : a(i2, 28) ? "Luminosity" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BlendMode)) {
            return false;
        }
        ((BlendMode) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return b(0);
    }
}
