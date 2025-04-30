package com.meta.analytics.dsp.uinode;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.En, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1131En extends C1670Zw {
    @Override // com.meta.analytics.dsp.uinode.C08743l
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.meta.analytics.dsp.uinode.C08743l
    public final void A01(AccessibilityEvent accessibilityEvent, int i9) {
        accessibilityEvent.setContentChangeTypes(i9);
    }
}
