package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1203cT implements C6X {
    public final /* synthetic */ C0538Fq A00;

    public C1203cT(C0538Fq c0538Fq) {
        this.A00 = c0538Fq;
    }

    private void A00(boolean z2) {
        AnonymousClass17 anonymousClass17;
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass172;
        if (!z2) {
            anonymousClass17 = this.A00.A01;
            anonymousClass17.ADU(this.A00, AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass172 = this.A00.A01;
            anonymousClass172.ADR(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABT() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABc() {
        A00(true);
    }
}
