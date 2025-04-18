package com.facebook.ads.redexgen.uinode;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.En, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0565En extends C1104Zw {
    @Override // com.facebook.ads.redexgen.uinode.C03083l
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.facebook.ads.redexgen.uinode.C03083l
    public final void A01(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
