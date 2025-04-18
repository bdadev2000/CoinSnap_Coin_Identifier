package com.instagram.common.viewpoint.core;

import android.content.Context;

/* loaded from: assets/audience_network.dex */
public final class X4 implements InterfaceC0569Gy {
    public final Context A00;
    public final InterfaceC0569Gy A01;
    public final HL<? super InterfaceC0570Gz> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public X4(Context context, HL<? super InterfaceC0570Gz> hl, InterfaceC0569Gy interfaceC0569Gy) {
        this.A00 = context.getApplicationContext();
        this.A02 = hl;
        this.A01 = interfaceC0569Gy;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public X4(Context context, String str, HL<? super InterfaceC0570Gz> hl) {
        this(context, hl, new AnonymousClass41(str, hl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0569Gy
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final X5 A4t() {
        return new X5(this.A00, this.A02, this.A01.A4t());
    }
}
