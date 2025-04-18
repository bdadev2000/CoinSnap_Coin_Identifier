package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class WP implements InterfaceC0811Qo {
    public final /* synthetic */ WJ A00;

    public WP(WJ wj) {
        this.A00 = wj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0811Qo
    public final void AE2() {
        AtomicBoolean atomicBoolean;
        JP jp;
        JP jp2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        jp = this.A00.A02;
        if (jp != null) {
            jp2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            jp2.AD0(atomicBoolean2.get());
        }
    }
}
