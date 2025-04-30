package com.meta.analytics.dsp.uinode;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class ET extends MV {
    public final /* synthetic */ C09205h A00;

    public ET(C09205h c09205h) {
        this.A00 = c09205h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MW mw) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onVolumeChanged();
    }
}
