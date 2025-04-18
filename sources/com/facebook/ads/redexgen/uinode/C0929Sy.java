package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0929Sy extends KT {
    public final /* synthetic */ C0928Sx A00;

    public C0929Sy(C0928Sx c0928Sx) {
        this.A00 = c0928Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C0815Oo c0815Oo;
        c0815Oo = this.A00.A0H;
        AbstractC0737Lo.A0F(1000, c0815Oo);
        this.A00.postDelayed(this, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
