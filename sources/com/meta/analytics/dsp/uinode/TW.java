package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: assets/audience_network.dex */
public class TW extends KT {
    public final /* synthetic */ TT A00;

    public TW(TT tt) {
        this.A00 = tt;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        C1381Oo c1381Oo;
        z8 = this.A00.A0Z;
        if (!z8) {
            c1381Oo = this.A00.A0M;
            AbstractC1303Lo.A0F(1000, c1381Oo);
        }
        this.A00.postDelayed(this, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
