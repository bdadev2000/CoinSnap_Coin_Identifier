package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0544Fx extends AbstractC1172by {
    public final /* synthetic */ C0538Fq A00;
    public final /* synthetic */ AbstractC1191cH A01;
    public final /* synthetic */ C0533Fk A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544Fx(C0538Fq c0538Fq, boolean z2, boolean z3, C0533Fk c0533Fk, AbstractC1191cH abstractC1191cH) {
        super(z2);
        this.A00 = c0538Fq;
        this.A03 = z3;
        this.A02 = c0533Fk;
        this.A01 = abstractC1191cH;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1172by
    public final void A00() {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADU(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1172by
    public final void A01(boolean z2) {
        C1045Zs c1045Zs;
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        C1045Zs c1045Zs2;
        c1045Zs = this.A00.A04;
        if (!C0608Im.A1j(c1045Zs) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass17 = this.A00.A01;
            anonymousClass17.ADR(this.A01);
            return;
        }
        C0538Fq c0538Fq = this.A00;
        c1045Zs2 = this.A00.A04;
        c0538Fq.A06 = AbstractC0773Pc.A01(c1045Zs2, this.A02, 0, new C1200cQ(this));
    }
}
