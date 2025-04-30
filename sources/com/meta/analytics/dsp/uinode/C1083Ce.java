package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ce, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1083Ce {
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
    public final C1084Cf[] A0A;

    public C1083Ce(int i9, int i10, long j7, long j9, long j10, Format format, int i11, C1084Cf[] c1084CfArr, int i12, long[] jArr, long[] jArr2) {
        this.A00 = i9;
        this.A03 = i10;
        this.A06 = j7;
        this.A05 = j9;
        this.A04 = j10;
        this.A07 = format;
        this.A02 = i11;
        this.A0A = c1084CfArr;
        this.A01 = i12;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C1084Cf A00(int i9) {
        C1084Cf[] c1084CfArr = this.A0A;
        if (c1084CfArr == null) {
            return null;
        }
        return c1084CfArr[i9];
    }
}
