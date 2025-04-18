package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1198cO implements InterfaceC02041p {
    public final /* synthetic */ C0538Fq A00;

    public C1198cO(C0538Fq c0538Fq) {
        this.A00 = c0538Fq;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02041p
    public final void AD2(AdError adError) {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADU(this.A00, adError);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02041p
    public final void AD3() {
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADR(this.A00);
    }
}
