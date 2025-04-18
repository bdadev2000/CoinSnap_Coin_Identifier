package com.facebook.ads.redexgen.uinode;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0507Br extends AbstractC1047Xq implements InterfaceC0590Fo {
    public long A00;
    public InterfaceC0590Fo A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.uinode.B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j3, InterfaceC0590Fo interfaceC0590Fo, long j10) {
        super.A01 = j3;
        this.A01 = interfaceC0590Fo;
        if (j10 == Long.MAX_VALUE) {
            j10 = super.A01;
        }
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final List<C0589Fn> A6Z(long j3) {
        return this.A01.A6Z(j3 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final long A70(int i10) {
        return this.A01.A70(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A7T(long j3) {
        return this.A01.A7T(j3 - this.A00);
    }
}
