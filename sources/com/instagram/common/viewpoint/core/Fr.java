package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class Fr extends AbstractC1172by {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0538Fq A01;
    public final /* synthetic */ C1185cB A02;
    public final /* synthetic */ C0533Fk A03;
    public final /* synthetic */ C1045Zs A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fr(C0538Fq c0538Fq, boolean z2, C1045Zs c1045Zs, C0533Fk c0533Fk, C1185cB c1185cB, int i2) {
        super(z2);
        this.A01 = c0538Fq;
        this.A04 = c1045Zs;
        this.A03 = c0533Fk;
        this.A02 = c1185cB;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1172by
    public final void A00() {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A01.A01;
        anonymousClass17.ADU(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1172by
    public final void A01(boolean z2) {
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        C0538Fq.A0D = null;
        if (z2) {
            this.A04.A00().AGG(this.A03.A1U(), this.A02.A1O());
        }
        if (this.A00 == 0) {
            atomicBoolean = this.A01.A0C;
            atomicBoolean.set(true);
            anonymousClass17 = this.A01.A01;
            anonymousClass17.ADR(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
