package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class X0 implements InterfaceC0569Gy {
    public final HL<? super X1> A00;

    public X0() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public X0(HL<? super X1> hl) {
        this.A00 = hl;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0569Gy
    public final InterfaceC0570Gz A4t() {
        return new X1(this.A00);
    }
}
