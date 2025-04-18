package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.6F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6F {
    public final long A00;
    public final C6E A01;
    public final String A02;
    public final boolean A03;

    public C6F(String str, boolean z2, C6E c6e) {
        this(str, z2, c6e, System.currentTimeMillis());
    }

    public C6F(String str, boolean z2, C6E c6e, long j2) {
        this.A02 = str;
        this.A03 = z2;
        this.A01 = c6e;
        this.A00 = j2;
    }

    public static C6F A00() {
        return new C6F("", true, C6E.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final C6E A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
