package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1659Zl extends C4Y {
    public C1659Zl(AbstractC09024o abstractC09024o) {
        super(abstractC09024o, null);
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C09034p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0D(View view) {
        C09034p c09034p = (C09034p) view.getLayoutParams();
        return this.A02.A0l(view) + c09034p.topMargin + c09034p.bottomMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0E(View view) {
        C09034p c09034p = (C09034p) view.getLayoutParams();
        return this.A02.A0m(view) + c09034p.leftMargin + c09034p.rightMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C09034p) view.getLayoutParams()).topMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final void A0J(int i9) {
        this.A02.A10(i9);
    }
}
