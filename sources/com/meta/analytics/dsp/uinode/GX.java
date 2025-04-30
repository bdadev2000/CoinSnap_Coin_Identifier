package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;

/* loaded from: assets/audience_network.dex */
public final class GX implements Comparable<GX> {
    public static String[] A07 = {"eb8CGYK3prt3t", "dQfQVH0VaiNJA", "r8fXA", "r3rHNRtipUDB7ufPa7P3AvdqyjlNLgla", "2m", "YPC8s", "obzEXxZAmH6P4FrObF", "ImIsZWaiqjX9J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public GX(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i9) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = C1070Bo.A0H(i9, false) ? 1 : 0;
        this.A03 = C1070Bo.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GX gx) {
        int resultSign;
        int resultSign2;
        int A01;
        int A012;
        int A013;
        int A014;
        int A015;
        int i9 = this.A05;
        int i10 = gx.A05;
        if (i9 != i10) {
            A015 = C1070Bo.A01(i9, i10);
            return A015;
        }
        int i11 = this.A03;
        int i12 = gx.A03;
        if (i11 != i12) {
            A014 = C1070Bo.A01(i11, i12);
            return A014;
        }
        int i13 = this.A02;
        int i14 = gx.A02;
        if (i13 != i14) {
            A013 = C1070Bo.A01(i13, i14);
            return A013;
        }
        if (this.A06.A0D) {
            A012 = C1070Bo.A01(gx.A00, this.A00);
            return A012;
        }
        int i15 = this.A05 != 1 ? -1 : 1;
        int i16 = this.A01;
        int resultSign3 = gx.A01;
        if (i16 != resultSign3) {
            A01 = C1070Bo.A01(i16, resultSign3);
            int i17 = A01 * i15;
            String[] strArr = A07;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "P8pKjaXeFiun6";
            strArr2[0] = "9cxjYqXmdfp1O";
            return i17;
        }
        int i18 = this.A04;
        int resultSign4 = gx.A04;
        if (i18 != resultSign4) {
            resultSign2 = C1070Bo.A01(i18, resultSign4);
            return resultSign2 * i15;
        }
        resultSign = C1070Bo.A01(this.A00, gx.A00);
        return resultSign * i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GX gx = (GX) obj;
        if (this.A05 == gx.A05 && this.A03 == gx.A03 && this.A02 == gx.A02 && this.A01 == gx.A01) {
            int i9 = this.A04;
            if (A07[3].charAt(10) != 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "D3QBn";
            strArr[2] = "QopBq";
            if (i9 == gx.A04 && this.A00 == gx.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A05;
        int i9 = result * 31;
        int result2 = this.A03;
        int result3 = (((i9 + result2) * 31) + this.A02) * 31;
        int result4 = this.A01;
        int result5 = (((result3 + result4) * 31) + this.A04) * 31;
        int result6 = this.A00;
        return result5 + result6;
    }
}
