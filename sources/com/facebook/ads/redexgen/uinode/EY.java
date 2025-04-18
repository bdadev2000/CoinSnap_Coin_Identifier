package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class EY extends NX {
    public final /* synthetic */ C03545h A00;

    public EY(C03545h c03545h) {
        this.A00 = c03545h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0788Nn c0788Nn) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPrepared();
    }
}
