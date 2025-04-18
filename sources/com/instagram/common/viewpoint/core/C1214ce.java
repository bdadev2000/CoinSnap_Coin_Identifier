package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.ce, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1214ce implements AnonymousClass64 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GL A01;
    public final /* synthetic */ GL A02;
    public final /* synthetic */ C8X A03;

    public C1214ce(GL gl, int i2, C8X c8x, GL gl2) {
        this.A01 = gl;
        this.A00 = i2;
        this.A03 = c8x;
        this.A02 = gl2;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass64
    public final void ABB() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass64
    public final void ABC() {
        InterfaceC01860x interfaceC01860x;
        interfaceC01860x = this.A01.A00;
        interfaceC01860x.ACN(this.A02, C0625Jg.A00(AdErrorType.NO_FILL));
    }
}
