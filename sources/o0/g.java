package o0;

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
        long millis;
        millis = accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        return millis;
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j3) {
        Duration ofMillis;
        ofMillis = Duration.ofMillis(j3);
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(ofMillis);
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
    }
}
