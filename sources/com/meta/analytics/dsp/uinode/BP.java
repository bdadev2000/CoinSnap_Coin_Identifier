package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class BP extends MV {
    public final /* synthetic */ BK A00;

    public BP(BK bk) {
        this.A00 = bk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MW mw) {
        if (this.A00.getVideoView() != null) {
            this.A00.A07.A0P().setVolume(this.A00.getVideoView().getVolume());
        }
    }
}
