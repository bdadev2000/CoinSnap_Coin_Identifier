package com.meta.analytics.dsp.uinode;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.2Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2Q implements Serializable {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public double A08;
    public double A09;
    public int A0A;

    public C2Q(double d2) {
        this.A04 = d2;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A03;
    }

    public final double A02() {
        return this.A05;
    }

    public final double A03() {
        return this.A06;
    }

    public final double A04() {
        return this.A07;
    }

    public final double A05() {
        if (this.A0A == 0) {
            return 0.0d;
        }
        return this.A08;
    }

    public final void A06() {
        this.A00 = 0.0d;
        this.A02 = 0.0d;
        this.A03 = 0.0d;
        this.A05 = 0.0d;
        this.A0A = 0;
        this.A07 = 0.0d;
        this.A08 = 1.0d;
        this.A09 = 0.0d;
    }

    public final void A07() {
        this.A01 = 0.0d;
    }

    public final void A08(double d2, double d9) {
        this.A0A++;
        double d10 = this.A07 + d2;
        this.A07 = d10;
        this.A02 = d9;
        double d11 = this.A09 + (d9 * d2);
        this.A09 = d11;
        this.A00 = d11 / d10;
        this.A08 = Math.min(this.A08, d9);
        this.A05 = Math.max(this.A05, d9);
        if (d9 >= this.A04) {
            this.A03 += d2;
            double d12 = this.A01 + d2;
            this.A01 = d12;
            this.A06 = Math.max(this.A06, d12);
            return;
        }
        this.A01 = 0.0d;
    }
}
