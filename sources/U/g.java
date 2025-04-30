package U;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

/* loaded from: classes.dex */
public abstract class g {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z8);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j7) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j7));
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z8) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z8);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z8);
    }
}
