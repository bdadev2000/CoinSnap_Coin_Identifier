package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1093ae extends AbstractC02854t {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1092ad A01;

    public C1093ae(AbstractC1092ad abstractC1092ad) {
        this.A01 = abstractC1092ad;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02854t
    public final void A0L(FL fl, int i2) {
        super.A0L(fl, i2);
        if (i2 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02854t
    public final void A0M(FL fl, int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            this.A00 = true;
        }
    }
}
