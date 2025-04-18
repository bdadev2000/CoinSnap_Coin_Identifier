package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0516Ek extends C1074aL {
    public InterfaceC0803Qg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(NativeAdLayout nativeAdLayout, C1045Zs c1045Zs, NativeAd nativeAd, JW jw) {
        OU ou = new OU(c1045Zs);
        MediaView mediaView = new MediaView(c1045Zs);
        AdOptionsView adOptionsView = new AdOptionsView(c1045Zs, nativeAd, nativeAdLayout);
        jw.A09(adOptionsView, 28);
        this.A00 = new TE(c1045Zs, nativeAd, jw, W7.A0L(nativeAd.getInternalNativeAd()).A17(), ou, mediaView, adOptionsView);
        M3.A0M(nativeAdLayout, jw.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, ou, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
