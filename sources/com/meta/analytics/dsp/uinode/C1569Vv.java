package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1569Vv implements InterfaceC1186Gt {
    public final HG<? super C1570Vw> A00;

    public C1569Vv() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C1569Vv(HG<? super C1570Vw> hg) {
        this.A00 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1186Gt
    public final InterfaceC1187Gu A4X() {
        return new C1570Vw(this.A00);
    }
}
