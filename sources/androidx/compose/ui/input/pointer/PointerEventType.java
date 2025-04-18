package androidx.compose.ui.input.pointer;

import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes3.dex */
public final class PointerEventType {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerEventType)) {
            return false;
        }
        ((PointerEventType) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0, 1) ? "Press" : a(0, 2) ? "Release" : a(0, 3) ? "Move" : a(0, 4) ? "Enter" : a(0, 5) ? "Exit" : a(0, 6) ? "Scroll" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
