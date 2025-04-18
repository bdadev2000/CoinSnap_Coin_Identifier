package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.9y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04069y {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Et A04;
    public final boolean A05;
    public final boolean A06;

    public C04069y(Et et, long j2, long j3, long j4, long j5, boolean z2, boolean z3) {
        this.A04 = et;
        this.A03 = j2;
        this.A02 = j3;
        this.A00 = j4;
        this.A01 = j5;
        this.A06 = z2;
        this.A05 = z3;
    }

    public final C04069y A00(int i2) {
        return new C04069y(this.A04.A00(i2), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C04069y A01(long j2) {
        return new C04069y(this.A04, j2, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
