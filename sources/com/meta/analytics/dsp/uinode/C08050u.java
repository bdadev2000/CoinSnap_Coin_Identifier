package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08050u {
    public static InterfaceC08000p A00;

    public final InterfaceC08000p A00(C1636Yn c1636Yn, AdPlacementType adPlacementType) {
        InterfaceC08000p interfaceC08000p = A00;
        if (interfaceC08000p != null) {
            return interfaceC08000p;
        }
        switch (C08040t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1757bN();
            case 2:
                return new C1756bM();
            case 3:
                return new C1754bK(c1636Yn);
            case 4:
                return new C1145Fb(c1636Yn);
            case 5:
                return new FY();
            default:
                return null;
        }
    }
}
