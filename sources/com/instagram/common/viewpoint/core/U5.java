package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class U5 implements O7 {
    public final /* synthetic */ B8 A00;

    public U5(B8 b8) {
        this.A00 = b8;
    }

    @Override // com.instagram.common.viewpoint.core.O7
    public final void AC8(boolean z2) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(z2);
        this.A00.A04();
    }
}
