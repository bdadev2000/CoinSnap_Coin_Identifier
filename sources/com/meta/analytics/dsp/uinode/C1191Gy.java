package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1191Gy {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, 119, 105, -122, -103, -122, 120, -107, -118, -120, Byte.MIN_VALUE, -50};
    }

    public C1191Gy(Uri uri, long j7, long j9, long j10, String str, int i9) {
        this(uri, null, j7, j9, j10, str, i9);
    }

    public C1191Gy(Uri uri, long j7, long j9, String str) {
        this(uri, j7, j7, j9, str, 0);
    }

    public C1191Gy(Uri uri, long j7, long j9, String str, int i9) {
        this(uri, j7, j7, j9, str, i9);
    }

    public C1191Gy(Uri uri, byte[] bArr, long j7, long j9, long j10, String str, int i9) {
        boolean z8 = true;
        AbstractC1192Ha.A03(j7 >= 0);
        AbstractC1192Ha.A03(j9 >= 0);
        if (j10 <= 0 && j10 != -1) {
            z8 = false;
        }
        AbstractC1192Ha.A03(z8);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j7;
        this.A03 = j9;
        this.A02 = j10;
        this.A05 = str;
        this.A00 = i9;
    }

    public final boolean A02(int i9) {
        return (this.A00 & i9) == i9;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(2, 9, 16)).append(this.A04);
        String A00 = A00(0, 2, 66);
        return append.append(A00).append(Arrays.toString(this.A06)).append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A02).append(A00).append(this.A05).append(A00).append(this.A00).append(A00(11, 1, 92)).toString();
    }
}
