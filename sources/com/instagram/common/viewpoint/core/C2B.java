package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.2B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2B {
    public static C2A A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static C2A A00(C1044Zr c1044Zr) {
        if (A00 == null) {
            A00 = new C2A(c1044Zr);
        }
        return A00;
    }

    public static void A01(C1044Zr c1044Zr) {
        if (AbstractC0610Ip.A0B(c1044Zr)) {
            A03(c1044Zr);
        }
    }

    public static void A02(C1044Zr c1044Zr) {
        if (AbstractC0610Ip.A0A(c1044Zr)) {
            A03(c1044Zr);
        }
    }

    public static void A03(C1044Zr c1044Zr) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC0690Lx.A01.execute(new C1138bQ(c1044Zr));
        }
    }
}
