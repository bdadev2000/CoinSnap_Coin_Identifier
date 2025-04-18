package com.instagram.common.viewpoint.core;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class FB extends AbstractC0836Rn {
    public final /* synthetic */ C02985h A00;

    public FB(C02985h c02985h) {
        this.A00 = c02985h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(SZ sz) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            W7.A0L(this.A00.A08.getInternalNativeAd()).A1e(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
