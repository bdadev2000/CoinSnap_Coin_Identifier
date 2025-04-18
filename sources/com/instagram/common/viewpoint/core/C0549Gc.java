package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;

/* renamed from: com.facebook.ads.redexgen.X.Gc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0549Gc implements Comparable<C0549Gc> {
    public static String[] A07 = {"Pg1hszkiSUaQ1Q3zUSDOGcwj", "XShA8NFwXMYGNPNQ1BnInLPPJxqL39cw", "4AD4jwCbTLaGqX9NncWpOLB6kKpQgghq", "doOTHA4oEA3dklajbgRwWhS1FJUNjIcN", "kRAYWFoIfk1tahKyvQkcWyD9", "v3c98y91ZIbNDnVgLScu", "QZvUGrumLzA7euHuZCA08HkLf7D5kSmU", "3DTCIPMv7b0hO08Etp6WfnPKrfF9T0Ka"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public C0549Gc(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i2) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = D1.A0H(i2, false) ? 1 : 0;
        this.A03 = D1.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0549Gc c0549Gc) {
        int resultSign;
        int resultSign2;
        int resultSign3;
        int A01;
        int A012;
        int A013;
        int A014;
        if (this.A05 != c0549Gc.A05) {
            A014 = D1.A01(this.A05, c0549Gc.A05);
            return A014;
        }
        if (this.A03 != c0549Gc.A03) {
            A013 = D1.A01(this.A03, c0549Gc.A03);
            return A013;
        }
        if (this.A02 != c0549Gc.A02) {
            A012 = D1.A01(this.A02, c0549Gc.A02);
            return A012;
        }
        if (this.A06.A0D) {
            int i2 = c0549Gc.A00;
            if (A07[3].charAt(16) == 'v') {
                throw new RuntimeException();
            }
            A07[1] = "Pc63tSmZUGJUTTfLdPyCZoSTnPj3qyRn";
            A01 = D1.A01(i2, this.A00);
            return A01;
        }
        int i3 = this.A05 != 1 ? -1 : 1;
        int i4 = this.A01;
        int resultSign4 = c0549Gc.A01;
        if (i4 != resultSign4) {
            int i5 = this.A01;
            int resultSign5 = c0549Gc.A01;
            resultSign3 = D1.A01(i5, resultSign5);
            return resultSign3 * i3;
        }
        int i6 = this.A04;
        int resultSign6 = c0549Gc.A04;
        if (i6 != resultSign6) {
            int i7 = this.A04;
            int resultSign7 = c0549Gc.A04;
            resultSign2 = D1.A01(i7, resultSign7);
            return resultSign2 * i3;
        }
        int i8 = this.A00;
        int resultSign8 = c0549Gc.A00;
        resultSign = D1.A01(i8, resultSign8);
        return resultSign * i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0549Gc c0549Gc = (C0549Gc) obj;
        return this.A05 == c0549Gc.A05 && this.A03 == c0549Gc.A03 && this.A02 == c0549Gc.A02 && this.A01 == c0549Gc.A01 && this.A04 == c0549Gc.A04 && this.A00 == c0549Gc.A00;
    }

    public final int hashCode() {
        int result = this.A05;
        int i2 = result * 31;
        int result2 = this.A03;
        int result3 = (((i2 + result2) * 31) + this.A02) * 31;
        int result4 = this.A01;
        int result5 = (((result3 + result4) * 31) + this.A04) * 31;
        int result6 = this.A00;
        return result5 + result6;
    }
}
