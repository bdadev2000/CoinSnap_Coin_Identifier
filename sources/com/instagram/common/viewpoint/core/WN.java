package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* loaded from: assets/audience_network.dex */
public class WN implements JR {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ WJ A01;

    public WN(WJ wj, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = wj;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.instagram.common.viewpoint.core.JR
    public final void AGT() {
        this.A00.setVolume(0.0f);
    }

    @Override // com.instagram.common.viewpoint.core.JR
    public final void AGY(NativeAd nativeAd) {
        this.A01.A0I(W7.A0L(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.instagram.common.viewpoint.core.JR
    public final void AHF() {
        this.A01.A0D();
    }
}
