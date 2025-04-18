package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UG implements MA {
    public final /* synthetic */ UD A00;

    public UG(UD ud2) {
        this.A00 = ud2;
    }

    @Override // com.facebook.ads.redexgen.uinode.MA
    public final void AB6() {
        boolean A0W;
        boolean z10;
        JA ja2;
        MC mc2;
        InterfaceC0758Mj interfaceC0758Mj;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        O1 o12;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0S;
            if (!atomicBoolean2.get()) {
                o12 = this.A00.A0Q;
                o12.A07(this.A00);
                return;
            }
        }
        z10 = this.A00.A0U;
        if (z10) {
            atomicBoolean = this.A00.A0S;
            if (!atomicBoolean.get()) {
                A0V = this.A00.A0V();
                if (A0V) {
                    this.A00.A0W.setToolbarActionMode(0);
                    this.A00.A0L();
                    return;
                }
            }
        }
        ja2 = this.A00.A0K;
        ja2.A04(J9.A07, null);
        mc2 = this.A00.A0N;
        interfaceC0758Mj = this.A00.A0O;
        mc2.A43(interfaceC0758Mj.A6u());
    }
}
