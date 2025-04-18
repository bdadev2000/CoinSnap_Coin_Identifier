package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes4.dex */
public final class PointMode {

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2) {
        return i2 == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointMode)) {
            return false;
        }
        ((PointMode) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0) ? "Points" : a(1) ? "Lines" : a(2) ? "Polygon" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
