package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1094Zm extends C4Y {
    public C1094Zm(AbstractC03364o abstractC03364o) {
        super(abstractC03364o, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C03374p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0D(View view) {
        C03374p c03374p = (C03374p) view.getLayoutParams();
        return this.A02.A0m(view) + c03374p.leftMargin + c03374p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0E(View view) {
        C03374p c03374p = (C03374p) view.getLayoutParams();
        return this.A02.A0l(view) + c03374p.topMargin + c03374p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C03374p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4Y
    public final void A0J(int i10) {
        this.A02.A0z(i10);
    }
}
