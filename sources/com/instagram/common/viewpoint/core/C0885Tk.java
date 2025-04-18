package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0885Tk implements O7 {
    public final /* synthetic */ A4 A00;

    public C0885Tk(A4 a4) {
        this.A00 = a4;
    }

    @Override // com.instagram.common.viewpoint.core.O7
    public final void AC8(boolean z2) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z2);
        this.A00.A05();
    }
}
