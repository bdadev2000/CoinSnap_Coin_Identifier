package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1003Vv implements InterfaceC0620Gt {
    public final HG<? super C1004Vw> A00;

    public C1003Vv() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C1003Vv(HG<? super C1004Vw> hg2) {
        this.A00 = hg2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0620Gt
    public final InterfaceC0621Gu A4X() {
        return new C1004Vw(this.A00);
    }
}
