package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes.dex */
public final class RenderIntent {

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RenderIntent)) {
            return false;
        }
        ((RenderIntent) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0, 0) ? "Perceptual" : a(0, 1) ? "Relative" : a(0, 2) ? "Saturation" : a(0, 3) ? "Absolute" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
