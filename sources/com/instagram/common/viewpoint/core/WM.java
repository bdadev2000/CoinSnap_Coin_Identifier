package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class WM implements O7 {
    public final /* synthetic */ WJ A00;

    public WM(WJ wj) {
        this.A00 = wj;
    }

    @Override // com.instagram.common.viewpoint.core.O7
    public final void AC8(boolean z2) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        JP jp;
        JP jp2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z2);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            jp = this.A00.A02;
            if (jp != null) {
                jp2 = this.A00.A02;
                jp2.AD0(z2);
            }
        }
    }
}
