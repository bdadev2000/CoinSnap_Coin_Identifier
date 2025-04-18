package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class VF implements Q6 {
    public final /* synthetic */ VA A00;

    public VF(VA va) {
        this.A00 = va;
    }

    @Override // com.instagram.common.viewpoint.core.Q6
    public final void ACL() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A0W;
        atomicBoolean.set(true);
        this.A00.A0M();
    }
}
