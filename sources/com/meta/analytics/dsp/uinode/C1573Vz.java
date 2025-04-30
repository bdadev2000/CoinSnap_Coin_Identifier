package com.meta.analytics.dsp.uinode;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1573Vz implements InterfaceC1186Gt {
    public final Context A00;
    public final InterfaceC1186Gt A01;
    public final HG<? super InterfaceC1187Gu> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1573Vz(Context context, HG<? super InterfaceC1187Gu> hg, InterfaceC1186Gt interfaceC1186Gt) {
        this.A00 = context.getApplicationContext();
        this.A02 = hg;
        this.A01 = interfaceC1186Gt;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1573Vz(Context context, String str, HG<? super InterfaceC1187Gu> hg) {
        this(context, hg, new AnonymousClass41(str, hg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1186Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final W0 A4X() {
        return new W0(this.A00, this.A02, this.A01.A4X());
    }
}
