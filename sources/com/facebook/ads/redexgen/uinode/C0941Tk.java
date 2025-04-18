package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0941Tk extends KT {
    public final /* synthetic */ AbstractC0796Nv A00;

    public C0941Tk(AbstractC0796Nv abstractC0796Nv) {
        this.A00 = abstractC0796Nv;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i10;
        if (this.A00.isPressed()) {
            AbstractC0796Nv abstractC0796Nv = this.A00;
            i10 = abstractC0796Nv.A07;
            abstractC0796Nv.postDelayed(this, i10);
        } else {
            this.A00.setPressed(true);
            AbstractC0796Nv abstractC0796Nv2 = this.A00;
            runnable = abstractC0796Nv2.A09;
            abstractC0796Nv2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
