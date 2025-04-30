package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1548Va implements InterfaceC1822cd<C1230Io, C1235It> {
    public VX A00;

    public C1548Va(VX vx) {
        this.A00 = vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1822cd
    public final void A5c(C1819ca<C1230Io, C1235It> c1819ca, InterfaceC1809cP interfaceC1809cP) {
        switch (Im.A00[interfaceC1809cP.A8J(c1819ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1819ca, interfaceC1809cP);
                return;
            default:
                return;
        }
    }
}
