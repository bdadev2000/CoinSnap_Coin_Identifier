package com.meta.analytics.dsp.uinode;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1073Br extends AbstractC1613Xq implements InterfaceC1156Fo {
    public long A00;
    public InterfaceC1156Fo A01;

    public abstract void A08();

    @Override // com.meta.analytics.dsp.uinode.B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j7, InterfaceC1156Fo interfaceC1156Fo, long j9) {
        super.A01 = j7;
        this.A01 = interfaceC1156Fo;
        if (j9 == Long.MAX_VALUE) {
            j9 = super.A01;
        }
        this.A00 = j9;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final List<C1155Fn> A6Z(long j7) {
        return this.A01.A6Z(j7 - this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final long A70(int i9) {
        return this.A01.A70(i9) + this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A7T(long j7) {
        return this.A01.A7T(j7 - this.A00);
    }
}
