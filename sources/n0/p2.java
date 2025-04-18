package n0;

import android.app.ApplicationExitInfo;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p2 {
    public static /* bridge */ /* synthetic */ int b(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason();
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo d(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.RangeInfo h(int i10, float f10, float f11, float f12) {
        return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
    }
}
