package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04609w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AH A03;
    public final C0566Eo A04;
    public final TrackGroupArray A05;
    public final C0611Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C04609w(AH ah2, long j3, TrackGroupArray trackGroupArray, C0611Gk c0611Gk) {
        this(ah2, null, new C0566Eo(0), j3, C.TIME_UNSET, 1, false, trackGroupArray, c0611Gk);
    }

    public C04609w(AH ah2, Object obj, C0566Eo c0566Eo, long j3, long j10, int i10, boolean z10, TrackGroupArray trackGroupArray, C0611Gk c0611Gk) {
        this.A03 = ah2;
        this.A07 = obj;
        this.A04 = c0566Eo;
        this.A02 = j3;
        this.A01 = j10;
        this.A0A = j3;
        this.A09 = j3;
        this.A00 = i10;
        this.A08 = z10;
        this.A05 = trackGroupArray;
        this.A06 = c0611Gk;
    }

    public static void A00(C04609w c04609w, C04609w c04609w2) {
        c04609w2.A0A = c04609w.A0A;
        c04609w2.A09 = c04609w.A09;
    }

    public final C04609w A01(int i10) {
        C04609w c04609w = new C04609w(this.A03, this.A07, this.A04.A00(i10), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c04609w);
        return c04609w;
    }

    public final C04609w A02(int i10) {
        C04609w playbackInfo = new C04609w(this.A03, this.A07, this.A04, this.A02, this.A01, i10, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04609w A03(AH ah2, Object obj) {
        C04609w playbackInfo = new C04609w(ah2, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04609w A04(C0566Eo c0566Eo, long j3, long j10) {
        long j11 = j10;
        AH ah2 = this.A03;
        Object obj = this.A07;
        if (!c0566Eo.A01()) {
            j11 = C.TIME_UNSET;
        }
        return new C04609w(ah2, obj, c0566Eo, j3, j11, this.A00, this.A08, this.A05, this.A06);
    }

    public final C04609w A05(TrackGroupArray trackGroupArray, C0611Gk c0611Gk) {
        C04609w playbackInfo = new C04609w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0611Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C04609w A06(boolean z10) {
        C04609w playbackInfo = new C04609w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z10, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
