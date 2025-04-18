package o0;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class f {
    public static i a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
        AccessibilityNodeInfo.CollectionItemInfo.Builder heading;
        AccessibilityNodeInfo.CollectionItemInfo.Builder columnIndex;
        AccessibilityNodeInfo.CollectionItemInfo.Builder rowIndex;
        AccessibilityNodeInfo.CollectionItemInfo.Builder columnSpan;
        AccessibilityNodeInfo.CollectionItemInfo.Builder rowSpan;
        AccessibilityNodeInfo.CollectionItemInfo.Builder selected;
        AccessibilityNodeInfo.CollectionItemInfo.Builder rowTitle;
        AccessibilityNodeInfo.CollectionItemInfo.Builder columnTitle;
        AccessibilityNodeInfo.CollectionItemInfo build;
        e.n();
        heading = e.d().setHeading(z10);
        columnIndex = heading.setColumnIndex(i10);
        rowIndex = columnIndex.setRowIndex(i11);
        columnSpan = rowIndex.setColumnSpan(i12);
        rowSpan = columnSpan.setRowSpan(i13);
        selected = rowSpan.setSelected(z11);
        rowTitle = selected.setRowTitle(str);
        columnTitle = rowTitle.setColumnTitle(str2);
        build = columnTitle.build();
        return new i(build);
    }

    public static j b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
        AccessibilityNodeInfo child;
        child = accessibilityNodeInfo.getChild(i10, i11);
        if (child != null) {
            return new j(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        String columnTitle;
        columnTitle = ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        return columnTitle;
    }

    public static String d(Object obj) {
        String rowTitle;
        rowTitle = ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        return rowTitle;
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo.ExtraRenderingInfo extraRenderingInfo;
        extraRenderingInfo = accessibilityNodeInfo.getExtraRenderingInfo();
        return extraRenderingInfo;
    }

    public static j f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        AccessibilityNodeInfo parent;
        parent = accessibilityNodeInfo.getParent(i10);
        if (parent != null) {
            return new j(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        String uniqueId;
        uniqueId = accessibilityNodeInfo.getUniqueId();
        return uniqueId;
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean isTextSelectable;
        isTextSelectable = accessibilityNodeInfo.isTextSelectable();
        return isTextSelectable;
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setTextSelectable(z10);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
