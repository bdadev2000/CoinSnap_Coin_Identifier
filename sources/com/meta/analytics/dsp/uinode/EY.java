package com.meta.analytics.dsp.uinode;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class EY extends NX {
    public final /* synthetic */ C09205h A00;

    public EY(C09205h c09205h) {
        this.A00 = c09205h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1354Nn c1354Nn) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPrepared();
    }
}
