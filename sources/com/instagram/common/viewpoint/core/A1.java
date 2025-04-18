package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* loaded from: assets/audience_network.dex */
public final class A1 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AM A03;
    public final Et A04;
    public final TrackGroupArray A05;
    public final C0560Gp A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public A1(AM am, long j2, TrackGroupArray trackGroupArray, C0560Gp c0560Gp) {
        this(am, null, new Et(0), j2, -9223372036854775807L, 1, false, trackGroupArray, c0560Gp);
    }

    public A1(AM am, Object obj, Et et, long j2, long j3, int i2, boolean z2, TrackGroupArray trackGroupArray, C0560Gp c0560Gp) {
        this.A03 = am;
        this.A07 = obj;
        this.A04 = et;
        this.A02 = j2;
        this.A01 = j3;
        this.A0A = j2;
        this.A09 = j2;
        this.A00 = i2;
        this.A08 = z2;
        this.A05 = trackGroupArray;
        this.A06 = c0560Gp;
    }

    public static void A00(A1 a12, A1 a13) {
        a13.A0A = a12.A0A;
        a13.A09 = a12.A09;
    }

    public final A1 A01(int i2) {
        A1 a12 = new A1(this.A03, this.A07, this.A04.A00(i2), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, a12);
        return a12;
    }

    public final A1 A02(int i2) {
        A1 playbackInfo = new A1(this.A03, this.A07, this.A04, this.A02, this.A01, i2, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final A1 A03(AM am, Object obj) {
        A1 playbackInfo = new A1(am, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final A1 A04(Et et, long j2, long j3) {
        long j4 = j3;
        AM am = this.A03;
        Object obj = this.A07;
        if (!et.A01()) {
            j4 = -9223372036854775807L;
        }
        return new A1(am, obj, et, j2, j4, this.A00, this.A08, this.A05, this.A06);
    }

    public final A1 A05(TrackGroupArray trackGroupArray, C0560Gp c0560Gp) {
        A1 playbackInfo = new A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0560Gp);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final A1 A06(boolean z2) {
        A1 playbackInfo = new A1(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z2, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
