package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WC implements InterfaceC0590Fo {
    public static final WC A01 = new WC();
    public final List<C0589Fn> A00;

    public WC() {
        this.A00 = Collections.emptyList();
    }

    public WC(C0589Fn c0589Fn) {
        this.A00 = Collections.singletonList(c0589Fn);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final List<C0589Fn> A6Z(long j3) {
        return j3 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final long A70(int i10) {
        AbstractC0626Ha.A03(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A71() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A7T(long j3) {
        return j3 < 0 ? 0 : -1;
    }
}
