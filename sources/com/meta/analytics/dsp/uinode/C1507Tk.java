package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1507Tk extends KT {
    public final /* synthetic */ AbstractC1362Nv A00;

    public C1507Tk(AbstractC1362Nv abstractC1362Nv) {
        this.A00 = abstractC1362Nv;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i9;
        if (this.A00.isPressed()) {
            AbstractC1362Nv abstractC1362Nv = this.A00;
            i9 = abstractC1362Nv.A07;
            abstractC1362Nv.postDelayed(this, i9);
        } else {
            this.A00.setPressed(true);
            AbstractC1362Nv abstractC1362Nv2 = this.A00;
            runnable = abstractC1362Nv2.A09;
            abstractC1362Nv2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
