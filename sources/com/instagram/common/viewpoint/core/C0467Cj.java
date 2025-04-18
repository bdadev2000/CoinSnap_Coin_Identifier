package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0467Cj {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Format A07;
    public final long[] A08;
    public final long[] A09;
    public final C0468Ck[] A0A;

    public C0467Cj(int i2, int i3, long j2, long j3, long j4, Format format, int i4, C0468Ck[] c0468CkArr, int i5, long[] jArr, long[] jArr2) {
        this.A00 = i2;
        this.A03 = i3;
        this.A06 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = format;
        this.A02 = i4;
        this.A0A = c0468CkArr;
        this.A01 = i5;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C0468Ck A00(int i2) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i2];
    }
}
