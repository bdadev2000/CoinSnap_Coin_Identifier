package com.meta.analytics.dsp.uinode;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3H extends C09486k {
    @Override // com.meta.analytics.dsp.uinode.C08773o
    public Object A00(int i9, int i10, int i11, int i12, boolean z8, boolean z9) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, i10, i11, i12, z8);
    }

    @Override // com.meta.analytics.dsp.uinode.C08773o
    public Object A01(int i9, int i10, boolean z8, int i11) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i9, i10, z8);
    }

    @Override // com.meta.analytics.dsp.uinode.C08773o
    public final void A03(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.meta.analytics.dsp.uinode.C08773o
    public final void A04(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}
