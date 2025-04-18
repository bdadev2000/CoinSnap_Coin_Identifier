package com.instagram.common.viewpoint.core;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
    public double A0A;
    public int A0B;

    public C2Q(double d) {
        this.A05 = d;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A03;
    }

    public final double A02() {
        return this.A04;
    }

    public final double A03() {
        return this.A06;
    }

    public final double A04() {
        return this.A07;
    }

    public final double A05() {
        return this.A08;
    }

    public final double A06() {
        if (this.A0B == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return this.A09;
    }

    public final void A07() {
        this.A00 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A02 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A04 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A03 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A06 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A0B = 0;
        this.A08 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A09 = 1.0d;
        this.A0A = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final void A08() {
        this.A01 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final void A09(double d, double d2) {
        this.A0B++;
        this.A08 += d;
        this.A02 = d2;
        this.A0A += d2 * d;
        this.A00 = this.A0A / this.A08;
        this.A09 = Math.min(this.A09, d2);
        this.A06 = Math.max(this.A06, d2);
        if (d2 >= this.A05) {
            this.A04 += d;
            this.A01 += d;
            this.A07 = Math.max(this.A07, this.A01);
        } else {
            this.A03 += d;
            this.A01 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }
}
