package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08863x {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3v] */
    public static C08843v A00(final InterfaceC08853w interfaceC08853w) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
                return (AccessibilityNodeInfo) InterfaceC08853w.this.A4W(i9);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i9) {
                return InterfaceC08853w.this.A5h(str, i9);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i9, int i10, Bundle bundle) {
                return InterfaceC08853w.this.ADx(i9, i10, bundle);
            }
        };
    }
}
