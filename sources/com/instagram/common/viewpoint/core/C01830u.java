package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01830u {
    public static InterfaceC01780p A00;

    public final InterfaceC01780p A00(C1045Zs c1045Zs, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (C01820t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new GL();
            case 2:
                if (C0608Im.A1H(c1045Zs)) {
                    return new GK();
                }
                return new GL();
            case 3:
                return new C1209cZ();
            case 4:
                return new C1204cU(c1045Zs);
            case 5:
                return new GJ(c1045Zs);
            case 6:
                return new C0538Fq();
            default:
                return null;
        }
    }
}
