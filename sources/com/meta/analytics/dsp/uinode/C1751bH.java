package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1751bH implements AnonymousClass61 {
    public final /* synthetic */ FY A00;
    public final /* synthetic */ boolean A01;

    public C1751bH(FY fy, boolean z8) {
        this.A00 = fy;
        this.A01 = z8;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        C1636Yn c1636Yn;
        AtomicBoolean atomicBoolean;
        AnonymousClass18 anonymousClass18;
        C1636Yn c1636Yn2;
        C1F c1f;
        c1636Yn = this.A00.A04;
        if (!C1225Ih.A1R(c1636Yn) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass18 = this.A00.A01;
            anonymousClass18.ACy(this.A00);
            return;
        }
        FY fy = this.A00;
        c1636Yn2 = fy.A04;
        c1f = this.A00.A03;
        fy.A06 = PC.A01(c1636Yn2, (FS) c1f, 0, new C1752bI(this));
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        AnonymousClass18 anonymousClass18;
        anonymousClass18 = this.A00.A01;
        anonymousClass18.AD1(this.A00, AdError.CACHE_ERROR);
    }
}
