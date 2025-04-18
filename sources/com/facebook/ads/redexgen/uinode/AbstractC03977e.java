package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03977e {
    public static final AtomicReference<C1069Ym> A00 = new AtomicReference<>();

    public static C1069Ym A00() {
        return A00.get();
    }

    public static void A01(C1069Ym c1069Ym) {
        if (c1069Ym == null) {
            return;
        }
        AbstractC03967d.A00(A00, null, c1069Ym);
    }
}
