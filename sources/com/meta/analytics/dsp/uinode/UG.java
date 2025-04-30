package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UG implements MA {
    public final /* synthetic */ UD A00;

    public UG(UD ud) {
        this.A00 = ud;
    }

    @Override // com.meta.analytics.dsp.uinode.MA
    public final void AB6() {
        boolean A0W;
        boolean z8;
        JA ja;
        MC mc;
        InterfaceC1324Mj interfaceC1324Mj;
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
        z8 = this.A00.A0U;
        if (z8) {
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
        ja = this.A00.A0K;
        ja.A04(J9.A07, null);
        mc = this.A00.A0N;
        interfaceC1324Mj = this.A00.A0O;
        mc.A43(interfaceC1324Mj.A6u());
    }
}
