package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1683aB implements InterfaceC08422f {
    public Drawable A00;
    public final /* synthetic */ AbstractC08412e A01;

    public C1683aB(AbstractC08412e abstractC08412e) {
        this.A01 = abstractC08412e;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08422f
    public final Drawable A6J() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08422f
    public final AbstractC08412e A6K() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08422f
    public final boolean A7l() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08422f
    public final boolean A8G() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08422f
    public final void AFu(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08422f
    public final void AG7(int i9, int i10) {
        if (i9 > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i9);
        }
        if (i10 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i10);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08422f
    public final void AGE(int i9, int i10, int i11, int i12) {
        this.A01.A05.set(i9, i10, i11, i12);
        AbstractC08412e abstractC08412e = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(abstractC08412e.A04.left + i9, this.A01.A04.top + i10, this.A01.A04.right + i11, this.A01.A04.bottom + i12);
    }
}
