package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0940Tj extends KT {
    public final /* synthetic */ AbstractC0796Nv A00;

    public C0940Tj(AbstractC0796Nv abstractC0796Nv) {
        this.A00 = abstractC0796Nv;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i10;
        this.A00.setPressed(false);
        AbstractC0796Nv abstractC0796Nv = this.A00;
        runnable = abstractC0796Nv.A08;
        i10 = this.A00.A07;
        abstractC0796Nv.postOnAnimationDelayed(runnable, i10);
    }
}
