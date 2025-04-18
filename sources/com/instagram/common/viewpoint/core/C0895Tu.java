package com.instagram.common.viewpoint.core;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0895Tu extends AbstractC0832Rj {
    public final /* synthetic */ AbstractC0891Tq A00;

    public C0895Tu(AbstractC0891Tq abstractC0891Tq) {
        this.A00 = abstractC0891Tq;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A1U())) {
                this.A00.A04.AA6(this.A00.A01.A1U(), new O8().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0b()).A05());
                C0651Kh.A00(this.A00.A03).A0E(this.A00.A09.A83(), this.A00.A01.A1U());
                C1T.A07(this.A00.A01.A1Q(), this.A00.A03);
                this.A00.A03.A0E().A36();
                C2M.A02(this.A00.A01.A0a(), AbstractC0671Le.A00(this.A00.A01.A0c()));
                this.A00.A08.A4P(this.A00.A09.A7Z());
            }
        }
    }
}
