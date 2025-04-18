package com.instagram.common.viewpoint.core;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network.dex */
public class FY extends C1115b1 {
    @Override // com.instagram.common.viewpoint.core.C02523l
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.instagram.common.viewpoint.core.C02523l
    public final void A01(AccessibilityEvent accessibilityEvent, int i2) {
        accessibilityEvent.setContentChangeTypes(i2);
    }
}
