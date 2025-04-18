package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.AdSettings;

/* renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1155bh implements InterfaceC03608d {
    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A6c() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A6q() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final C03567x A78(C7j c7j) {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A7o() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final String A8V() {
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            return AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final boolean A9Y() {
        return AdSettings.isMixedAudience();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final boolean A9d() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final Boolean A9i() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03608d
    public final boolean isTestMode(Context context) {
        return AdSettings.isTestMode(context);
    }
}
