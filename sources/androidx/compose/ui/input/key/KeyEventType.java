package androidx.compose.ui.input.key;

import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes.dex */
public final class KeyEventType {

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KeyEventType)) {
            return false;
        }
        ((KeyEventType) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0, 1) ? "KeyUp" : a(0, 2) ? "KeyDown" : a(0, 0) ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Invalid";
    }
}
