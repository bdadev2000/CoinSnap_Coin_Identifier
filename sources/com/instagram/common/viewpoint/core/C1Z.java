package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1Z implements Serializable {
    public static final long serialVersionUID = 351643298236575728L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C1Z(C1Y c1y) {
        String str;
        String str2;
        String str3;
        this.A02 = C1Y.A00(c1y);
        str = c1y.A01;
        this.A01 = str;
        str2 = c1y.A00;
        this.A00 = str2;
        str3 = c1y.A03;
        this.A03 = str3;
    }

    public final String A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }
}
