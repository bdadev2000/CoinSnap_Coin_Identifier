package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public final class AccessibilityEventCompat {

    @RequiresApi
    /* loaded from: classes4.dex */
    public static class Api34Impl {
        @DoNotInline
        public static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        @DoNotInline
        public static void b(AccessibilityEvent accessibilityEvent, boolean z2) {
            accessibilityEvent.setAccessibilityDataSensitive(z2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes4.dex */
    public @interface ContentChangeType {
    }
}
