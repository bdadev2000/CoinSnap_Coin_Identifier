package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0957Wf implements InterfaceC1275dr<C0613It, C0618Iy> {
    public C0954Wc A00;

    public C0957Wf(C0954Wc c0954Wc) {
        this.A00 = c0954Wc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1275dr
    public final void A5y(Cdo<C0613It, C0618Iy> cdo, InterfaceC1263dd interfaceC1263dd) {
        switch (interfaceC1263dd.A8h(cdo)) {
            case A02:
            case A04:
                this.A00.A02(cdo, interfaceC1263dd);
                return;
            default:
                return;
        }
    }
}
