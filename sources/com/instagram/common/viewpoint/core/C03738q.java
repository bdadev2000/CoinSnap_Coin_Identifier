package com.instagram.common.viewpoint.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03738q {
    public static C03738q A00 = new C03738q();

    public static C03738q A00() {
        return A00;
    }

    public final ZN A01(C7j c7j, boolean z2) {
        return new ZN(c7j, z2, new C6V());
    }

    public final Map<String, String> A02(C7j c7j) {
        try {
            return A01(c7j, false).A05();
        } catch (Throwable th) {
            c7j.A07().A3y(th);
            return C03658i.A01(c7j);
        }
    }
}
