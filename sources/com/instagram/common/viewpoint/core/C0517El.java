package com.instagram.common.viewpoint.core;

import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0517El extends AbstractC0856Sh {
    public final /* synthetic */ C02985h A00;

    public C0517El(C02985h c02985h) {
        this.A00 = c02985h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0857Si c0857Si) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            W7.A0L(this.A00.A08.getInternalNativeAd()).A1e(false, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onError();
    }
}
