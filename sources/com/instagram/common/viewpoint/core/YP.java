package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class YP implements C6 {
    public final /* synthetic */ YO A00;

    public YP(YO yo) {
        this.A00 = yo;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        AbstractC0477Ct abstractC0477Ct;
        long j2;
        abstractC0477Ct = this.A00.A0B;
        j2 = this.A00.A07;
        return abstractC0477Ct.A03(j2);
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        AbstractC0477Ct abstractC0477Ct;
        long j3;
        long A00;
        long j4;
        if (j2 == 0) {
            j4 = this.A00.A09;
            return new C5(new C7(0L, j4));
        }
        abstractC0477Ct = this.A00.A0B;
        long A04 = abstractC0477Ct.A04(j2);
        YO yo = this.A00;
        j3 = this.A00.A09;
        A00 = yo.A00(j3, A04, 30000L);
        return new C5(new C7(j2, A00));
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return true;
    }
}
