package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0834Rl {
    public float A00;
    public C0Q A01;
    public Map<String, String> A02;

    public C0834Rl(C0Q c0q) {
        this(c0q, 0.0f);
    }

    public C0834Rl(C0Q c0q, float f2) {
        this(c0q, f2, null);
    }

    public C0834Rl(C0Q c0q, float f2, Map<String, String> windowParams) {
        this.A01 = c0q;
        this.A00 = f2;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final C0Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0Q.A0I;
    }
}
