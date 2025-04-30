package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10269w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AH A03;
    public final C1132Eo A04;
    public final TrackGroupArray A05;
    public final C1177Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C10269w(AH ah, long j7, TrackGroupArray trackGroupArray, C1177Gk c1177Gk) {
        this(ah, null, new C1132Eo(0), j7, C.TIME_UNSET, 1, false, trackGroupArray, c1177Gk);
    }

    public C10269w(AH ah, Object obj, C1132Eo c1132Eo, long j7, long j9, int i9, boolean z8, TrackGroupArray trackGroupArray, C1177Gk c1177Gk) {
        this.A03 = ah;
        this.A07 = obj;
        this.A04 = c1132Eo;
        this.A02 = j7;
        this.A01 = j9;
        this.A0A = j7;
        this.A09 = j7;
        this.A00 = i9;
        this.A08 = z8;
        this.A05 = trackGroupArray;
        this.A06 = c1177Gk;
    }

    public static void A00(C10269w c10269w, C10269w c10269w2) {
        c10269w2.A0A = c10269w.A0A;
        c10269w2.A09 = c10269w.A09;
    }

    public final C10269w A01(int i9) {
        C10269w c10269w = new C10269w(this.A03, this.A07, this.A04.A00(i9), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c10269w);
        return c10269w;
    }

    public final C10269w A02(int i9) {
        C10269w playbackInfo = new C10269w(this.A03, this.A07, this.A04, this.A02, this.A01, i9, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C10269w A03(AH ah, Object obj) {
        C10269w playbackInfo = new C10269w(ah, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C10269w A04(C1132Eo c1132Eo, long j7, long j9) {
        long j10 = j9;
        AH ah = this.A03;
        Object obj = this.A07;
        if (!c1132Eo.A01()) {
            j10 = C.TIME_UNSET;
        }
        return new C10269w(ah, obj, c1132Eo, j7, j10, this.A00, this.A08, this.A05, this.A06);
    }

    public final C10269w A05(TrackGroupArray trackGroupArray, C1177Gk c1177Gk) {
        C10269w playbackInfo = new C10269w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c1177Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C10269w A06(boolean z8) {
        C10269w playbackInfo = new C10269w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z8, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
