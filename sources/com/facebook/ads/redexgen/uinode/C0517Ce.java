package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ce, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0517Ce {
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
    public final C0518Cf[] A0A;

    public C0517Ce(int i10, int i11, long j3, long j10, long j11, Format format, int i12, C0518Cf[] c0518CfArr, int i13, long[] jArr, long[] jArr2) {
        this.A00 = i10;
        this.A03 = i11;
        this.A06 = j3;
        this.A05 = j10;
        this.A04 = j11;
        this.A07 = format;
        this.A02 = i12;
        this.A0A = c0518CfArr;
        this.A01 = i13;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C0518Cf A00(int i10) {
        C0518Cf[] c0518CfArr = this.A0A;
        if (c0518CfArr == null) {
            return null;
        }
        return c0518CfArr[i10];
    }
}
