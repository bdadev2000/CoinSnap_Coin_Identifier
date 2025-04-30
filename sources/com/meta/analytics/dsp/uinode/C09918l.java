package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09918l {
    public static C09918l A00 = new C09918l();

    public static C09918l A00() {
        return A00;
    }

    public final YI A01(C09647f c09647f, boolean z8) {
        return new YI(c09647f, z8, new C6S());
    }

    public final Map<String, String> A02(C09647f c09647f) {
        try {
            return A01(c09647f, false).A05();
        } catch (Throwable th) {
            c09647f.A07().A3c(th);
            return C09838d.A01(c09647f);
        }
    }
}
