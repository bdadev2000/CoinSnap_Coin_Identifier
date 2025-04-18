package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1201cR implements AnonymousClass64 {
    public final /* synthetic */ C0538Fq A00;
    public final /* synthetic */ boolean A01;

    public C1201cR(C0538Fq c0538Fq, boolean z2) {
        this.A00 = c0538Fq;
        this.A01 = z2;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass64
    public final void ABB() {
        C1045Zs c1045Zs;
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        C1045Zs c1045Zs2;
        C1E c1e;
        c1045Zs = this.A00.A04;
        if (!C0608Im.A1j(c1045Zs) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass17 = this.A00.A01;
            anonymousClass17.ADR(this.A00);
            return;
        }
        C0538Fq c0538Fq = this.A00;
        c1045Zs2 = this.A00.A04;
        c1e = this.A00.A03;
        c0538Fq.A06 = AbstractC0773Pc.A01(c1045Zs2, (C0533Fk) c1e, 0, new C1202cS(this));
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass64
    public final void ABC() {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADU(this.A00, AdError.CACHE_ERROR);
    }
}
