package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1182bE implements InterfaceC02611q {
    public final /* synthetic */ FY A00;

    public C1182bE(FY fy) {
        this.A00 = fy;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02611q
    public final void ACZ(AdError adError) {
        AnonymousClass18 anonymousClass18;
        anonymousClass18 = this.A00.A01;
        anonymousClass18.AD1(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02611q
    public final void ACa() {
        AtomicBoolean atomicBoolean;
        AnonymousClass18 anonymousClass18;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass18 = this.A00.A01;
        anonymousClass18.ACy(this.A00);
    }
}
