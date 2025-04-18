package com.instagram.common.viewpoint.core;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class F3 extends R1 {
    public final /* synthetic */ C02985h A00;

    public F3(C02985h c02985h) {
        this.A00 = c02985h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(R6 r6) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onSeek();
    }
}
