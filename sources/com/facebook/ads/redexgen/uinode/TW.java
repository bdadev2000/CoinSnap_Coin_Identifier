package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: assets/audience_network.dex */
public class TW extends KT {
    public final /* synthetic */ TT A00;

    public TW(TT tt) {
        this.A00 = tt;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        C0815Oo c0815Oo;
        z10 = this.A00.A0Z;
        if (!z10) {
            c0815Oo = this.A00.A0M;
            AbstractC0737Lo.A0F(1000, c0815Oo);
        }
        this.A00.postDelayed(this, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
