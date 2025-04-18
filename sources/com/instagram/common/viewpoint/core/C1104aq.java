package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1104aq extends C4Y {
    public C1104aq(AbstractC02804o abstractC02804o) {
        super(abstractC02804o, null);
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C02814p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0D(View view) {
        C02814p c02814p = (C02814p) view.getLayoutParams();
        return this.A02.A0l(view) + c02814p.topMargin + c02814p.bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0E(View view) {
        C02814p c02814p = (C02814p) view.getLayoutParams();
        return this.A02.A0m(view) + c02814p.leftMargin + c02814p.rightMargin;
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C02814p) view.getLayoutParams()).topMargin;
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.instagram.common.viewpoint.core.C4Y
    public final void A0J(int i2) {
        this.A02.A10(i2);
    }
}
