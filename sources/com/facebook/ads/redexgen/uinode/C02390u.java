package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02390u {
    public static InterfaceC02340p A00;

    public final InterfaceC02340p A00(C1070Yn c1070Yn, AdPlacementType adPlacementType) {
        InterfaceC02340p interfaceC02340p = A00;
        if (interfaceC02340p != null) {
            return interfaceC02340p;
        }
        switch (C02380t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1191bN();
            case 2:
                return new C1190bM();
            case 3:
                return new C1188bK(c1070Yn);
            case 4:
                return new C0579Fb(c1070Yn);
            case 5:
                return new FY();
            default:
                return null;
        }
    }
}
