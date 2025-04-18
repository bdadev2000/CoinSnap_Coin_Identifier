package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1H */
/* loaded from: assets/audience_network.dex */
public class C1H implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C01901b A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final C1H A0C(int i2) {
        this.A02 = i2;
        return this;
    }

    public final C1H A0D(int i2) {
        this.A03 = i2;
        return this;
    }

    public final C1H A0E(int i2) {
        this.A04 = i2;
        return this;
    }

    public final C1H A0F(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C1H A0G(int i2) {
        this.A01 = i2;
        return this;
    }

    public final C1H A0H(long j2) {
        this.A05 = j2;
        return this;
    }

    public final C1H A0I(C01901b c01901b) {
        this.A06 = c01901b;
        return this;
    }

    public final C1H A0J(String str) {
        this.A08 = str;
        return this;
    }

    public final C1H A0K(String str) {
        this.A07 = str;
        return this;
    }

    public final C1H A0L(boolean z2) {
        this.A09 = z2;
        return this;
    }

    public final C1H A0M(boolean z2) {
        this.A0A = z2;
        return this;
    }

    public final C1H A0N(boolean z2) {
        this.A0B = z2;
        return this;
    }

    public final C1I A0O() {
        return new C1I(this);
    }
}
