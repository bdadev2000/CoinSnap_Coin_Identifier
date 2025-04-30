package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class XR implements CL {
    public final int A00;
    public final int A01;
    public final C1217Hz A02;

    public XR(XS xs) {
        C1217Hz c1217Hz = xs.A00;
        this.A02 = c1217Hz;
        c1217Hz.A0Y(12);
        this.A00 = c1217Hz.A0H();
        this.A01 = c1217Hz.A0H();
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final int A7o() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final boolean A93() {
        return this.A00 != 0;
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final int AEN() {
        int i9 = this.A00;
        return i9 == 0 ? this.A02.A0H() : i9;
    }
}
