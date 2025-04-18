package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Uh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0908Uh extends KY {
    public final /* synthetic */ OL A00;

    public C0908Uh(OL ol) {
        this.A00 = ol;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        Runnable runnable;
        int i2;
        if (this.A00.isPressed()) {
            OL ol = this.A00;
            i2 = this.A00.A07;
            ol.postDelayed(this, i2);
        } else {
            this.A00.setPressed(true);
            OL ol2 = this.A00;
            runnable = this.A00.A09;
            ol2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
