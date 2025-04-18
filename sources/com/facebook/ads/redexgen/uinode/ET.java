package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class ET extends MV {
    public final /* synthetic */ C03545h A00;

    public ET(C03545h c03545h) {
        this.A00 = c03545h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MW mw) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onVolumeChanged();
    }
}
