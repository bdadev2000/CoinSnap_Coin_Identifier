package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.40, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass40 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3y] */
    public static C3y A00(final InterfaceC08873z interfaceC08873z) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3y
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
                return (AccessibilityNodeInfo) InterfaceC08873z.this.A4W(i9);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i9) {
                return InterfaceC08873z.this.A5h(str, i9);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i9) {
                return (AccessibilityNodeInfo) InterfaceC08873z.this.A5i(i9);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i9, int i10, Bundle bundle) {
                return InterfaceC08873z.this.ADx(i9, i10, bundle);
            }
        };
    }
}
