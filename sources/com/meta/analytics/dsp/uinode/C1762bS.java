package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1762bS implements AnonymousClass61 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1757bN A01;
    public final /* synthetic */ C1757bN A02;
    public final /* synthetic */ C8T A03;

    public C1762bS(C1757bN c1757bN, int i9, C8T c8t, C1757bN c1757bN2) {
        this.A01 = c1757bN;
        this.A00 = i9;
        this.A03 = c8t;
        this.A02 = c1757bN2;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC08080x interfaceC08080x;
        interfaceC08080x = this.A01.A00;
        interfaceC08080x.ABw(this.A02, C1242Jb.A00(AdErrorType.NO_FILL));
    }
}
