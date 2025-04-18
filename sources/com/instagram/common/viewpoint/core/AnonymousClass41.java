package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.41, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass41 extends AbstractC0460Cc {
    public final int A00;
    public final int A01;
    public final HL<? super InterfaceC0570Gz> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HL<? super InterfaceC0570Gz> hl) {
        this(str, hl, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HL<? super InterfaceC0570Gz> hl, int i2, int i3, boolean z2) {
        this.A03 = str;
        this.A02 = hl;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0460Cc
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0462Ce A01(HA ha) {
        return new C0462Ce(this.A03, null, this.A02, this.A00, this.A01, this.A04, ha);
    }
}
