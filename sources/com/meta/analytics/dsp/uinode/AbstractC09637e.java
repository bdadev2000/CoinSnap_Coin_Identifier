package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09637e {
    public static final AtomicReference<C1635Ym> A00 = new AtomicReference<>();

    public static C1635Ym A00() {
        return A00.get();
    }

    public static void A01(C1635Ym c1635Ym) {
        if (c1635Ym == null) {
            return;
        }
        AbstractC09627d.A00(A00, null, c1635Ym);
    }
}
