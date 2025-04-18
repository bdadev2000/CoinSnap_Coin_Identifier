package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0982Va implements InterfaceC1256cd<C0664Io, C0669It> {
    public VX A00;

    public C0982Va(VX vx) {
        this.A00 = vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1256cd
    public final void A5c(C1253ca<C0664Io, C0669It> c1253ca, InterfaceC1243cP interfaceC1243cP) {
        switch (Im.A00[interfaceC1243cP.A8J(c1253ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1253ca, interfaceC1243cP);
                return;
            default:
                return;
        }
    }
}
