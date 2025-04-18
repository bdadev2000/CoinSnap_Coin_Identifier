package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0907Ug extends KY {
    public final /* synthetic */ OL A00;

    public C0907Ug(OL ol) {
        this.A00 = ol;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        Runnable runnable;
        int i2;
        this.A00.setPressed(false);
        OL ol = this.A00;
        runnable = this.A00.A08;
        i2 = this.A00.A07;
        ol.postOnAnimationDelayed(runnable, i2);
    }
}
