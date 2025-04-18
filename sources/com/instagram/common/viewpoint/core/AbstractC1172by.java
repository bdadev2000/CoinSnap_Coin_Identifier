package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.by, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1172by implements C6X {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z2);

    public AbstractC1172by(boolean z2) {
        this.A00 = z2;
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABT() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABc() {
        A01(true);
    }
}
