package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03203x {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3v] */
    public static C03183v A00(final InterfaceC03193w interfaceC03193w) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
                return (AccessibilityNodeInfo) InterfaceC03193w.this.A4W(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
                return InterfaceC03193w.this.A5h(str, i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i10, int i11, Bundle bundle) {
                return InterfaceC03193w.this.ADx(i10, i11, bundle);
            }
        };
    }
}
