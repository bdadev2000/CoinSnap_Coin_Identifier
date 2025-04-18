package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Gy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0625Gy {
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

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, 119, 105, -122, -103, -122, 120, -107, -118, -120, ByteCompanionObject.MIN_VALUE, -50};
    }

    public C0625Gy(Uri uri, long j3, long j10, long j11, String str, int i10) {
        this(uri, null, j3, j10, j11, str, i10);
    }

    public C0625Gy(Uri uri, long j3, long j10, String str) {
        this(uri, j3, j3, j10, str, 0);
    }

    public C0625Gy(Uri uri, long j3, long j10, String str, int i10) {
        this(uri, j3, j3, j10, str, i10);
    }

    public C0625Gy(Uri uri, byte[] bArr, long j3, long j10, long j11, String str, int i10) {
        boolean z10 = true;
        AbstractC0626Ha.A03(j3 >= 0);
        AbstractC0626Ha.A03(j10 >= 0);
        if (j11 <= 0 && j11 != -1) {
            z10 = false;
        }
        AbstractC0626Ha.A03(z10);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j3;
        this.A03 = j10;
        this.A02 = j11;
        this.A05 = str;
        this.A00 = i10;
    }

    public final boolean A02(int i10) {
        return (this.A00 & i10) == i10;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(2, 9, 16)).append(this.A04);
        String A00 = A00(0, 2, 66);
        return append.append(A00).append(Arrays.toString(this.A06)).append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A02).append(A00).append(this.A05).append(A00).append(this.A00).append(A00(11, 1, 92)).toString();
    }
}
