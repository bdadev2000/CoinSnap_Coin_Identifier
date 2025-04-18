package androidx.compose.ui.input.pointer;

import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes2.dex */
public final class PointerType {

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerType)) {
            return false;
        }
        ((PointerType) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return b(0);
    }
}
