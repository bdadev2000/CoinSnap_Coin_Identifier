package com.meta.analytics.dsp.uinode;

import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public class EU extends AbstractC1413Pu {
    public final /* synthetic */ C09205h A00;

    public EU(C09205h c09205h) {
        this.A00 = c09205h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewVideoRenderer mediaViewVideoRenderer2;
        MediaViewVideoRenderer mediaViewVideoRenderer3;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onCompleted();
        mediaViewVideoRenderer2 = this.A00.A00;
        if (C1225Ih.A1H(mediaViewVideoRenderer2.getContext())) {
            mediaViewVideoRenderer3 = this.A00.A00;
            mediaViewVideoRenderer3.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
