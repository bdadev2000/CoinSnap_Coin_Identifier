package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1748bE implements InterfaceC08271q {
    public final /* synthetic */ FY A00;

    public C1748bE(FY fy) {
        this.A00 = fy;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08271q
    public final void ACZ(AdError adError) {
        AnonymousClass18 anonymousClass18;
        anonymousClass18 = this.A00.A01;
        anonymousClass18.AD1(this.A00, adError);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08271q
    public final void ACa() {
        AtomicBoolean atomicBoolean;
        AnonymousClass18 anonymousClass18;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass18 = this.A00.A01;
        anonymousClass18.ACy(this.A00);
    }
}
