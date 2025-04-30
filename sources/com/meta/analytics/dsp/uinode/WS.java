package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WS implements FB {
    public final int A00;
    public final /* synthetic */ CD A01;

    public WS(CD cd, int i9) {
        this.A01 = cd;
        this.A00 = i9;
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final boolean A9C() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final void AAM() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final int AEK(C10199p c10199p, C1614Xr c1614Xr, boolean z8) {
        return this.A01.A0P(this.A00, c10199p, c1614Xr, z8);
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final int AGO(long j7) {
        return this.A01.A0O(this.A00, j7);
    }
}
