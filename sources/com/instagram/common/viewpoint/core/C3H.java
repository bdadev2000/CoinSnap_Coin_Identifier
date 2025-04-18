package com.instagram.common.viewpoint.core;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3H extends C03296n {
    @Override // com.instagram.common.viewpoint.core.C02553o
    public Object A00(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2);
    }

    @Override // com.instagram.common.viewpoint.core.C02553o
    public Object A01(int i2, int i3, boolean z2, int i4) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2);
    }

    @Override // com.instagram.common.viewpoint.core.C02553o
    public final void A03(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.instagram.common.viewpoint.core.C02553o
    public final void A04(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}
