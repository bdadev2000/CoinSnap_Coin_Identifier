package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: com.pgl.ssdk.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1274q {
    private static AccessibilityManager a;

    public static String a(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null) {
            return null;
        }
        if (a == null) {
            a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        AccessibilityManager accessibilityManager = a;
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < enabledAccessibilityServiceList.size(); i10++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i10);
            if (accessibilityServiceInfo != null) {
                sb2.append(String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name));
                if (i10 != enabledAccessibilityServiceList.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }
}
