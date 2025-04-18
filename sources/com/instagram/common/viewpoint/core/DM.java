package com.instagram.common.viewpoint.core;

import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class DM extends AbstractC1022Yv implements InterfaceC0540Ft {
    public long A00;
    public InterfaceC0540Ft A01;

    public abstract void A08();

    @Override // com.instagram.common.viewpoint.core.BC
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j2, InterfaceC0540Ft interfaceC0540Ft, long j3) {
        super.A01 = j2;
        this.A01 = interfaceC0540Ft;
        if (j3 == Long.MAX_VALUE) {
            j3 = super.A01;
        }
        this.A00 = j3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final List<C0539Fs> A6x(long j2) {
        return this.A01.A6x(j2 - this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final long A7O(int i2) {
        return this.A01.A7O(i2) + this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final int A7P() {
        return this.A01.A7P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final int A7r(long j2) {
        return this.A01.A7r(j2 - this.A00);
    }
}
