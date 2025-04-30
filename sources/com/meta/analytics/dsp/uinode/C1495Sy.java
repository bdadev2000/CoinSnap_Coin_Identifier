package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1495Sy extends KT {
    public final /* synthetic */ C1494Sx A00;

    public C1495Sy(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C1381Oo c1381Oo;
        c1381Oo = this.A00.A0H;
        AbstractC1303Lo.A0F(1000, c1381Oo);
        this.A00.postDelayed(this, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
