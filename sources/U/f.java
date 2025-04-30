package U;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class f {
    public static h a(boolean z8, int i9, int i10, int i11, int i12, boolean z9, String str, String str2) {
        return new h(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z8).setColumnIndex(i9).setRowIndex(i10).setColumnSpan(i11).setRowSpan(i12).setSelected(z9).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static i b(AccessibilityNodeInfo accessibilityNodeInfo, int i9, int i10) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i9, i10);
        if (child != null) {
            return new i(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static i f(AccessibilityNodeInfo accessibilityNodeInfo, int i9) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i9);
        if (parent != null) {
            return new i(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
        accessibilityNodeInfo.setTextSelectable(z8);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
