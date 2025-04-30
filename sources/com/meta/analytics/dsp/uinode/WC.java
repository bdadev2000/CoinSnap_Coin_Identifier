package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WC implements InterfaceC1156Fo {
    public static final WC A01 = new WC();
    public final List<C1155Fn> A00;

    public WC() {
        this.A00 = Collections.emptyList();
    }

    public WC(C1155Fn c1155Fn) {
        this.A00 = Collections.singletonList(c1155Fn);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final List<C1155Fn> A6Z(long j7) {
        return j7 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final long A70(int i9) {
        AbstractC1192Ha.A03(i9 == 0);
        return 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A71() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A7T(long j7) {
        return j7 < 0 ? 0 : -1;
    }
}
