package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04258l {
    public static C04258l A00 = new C04258l();

    public static C04258l A00() {
        return A00;
    }

    public final YI A01(C03987f c03987f, boolean z10) {
        return new YI(c03987f, z10, new C6S());
    }

    public final Map<String, String> A02(C03987f c03987f) {
        try {
            return A01(c03987f, false).A05();
        } catch (Throwable th2) {
            c03987f.A07().A3c(th2);
            return C04178d.A01(c03987f);
        }
    }
}
