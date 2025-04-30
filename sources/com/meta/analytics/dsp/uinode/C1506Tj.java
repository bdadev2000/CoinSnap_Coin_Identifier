package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1506Tj extends KT {
    public final /* synthetic */ AbstractC1362Nv A00;

    public C1506Tj(AbstractC1362Nv abstractC1362Nv) {
        this.A00 = abstractC1362Nv;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i9;
        this.A00.setPressed(false);
        AbstractC1362Nv abstractC1362Nv = this.A00;
        runnable = abstractC1362Nv.A08;
        i9 = this.A00.A07;
        abstractC1362Nv.postOnAnimationDelayed(runnable, i9);
    }
}
