package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class H3 {
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

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{111, 99, 110, 75, 94, 75, 121, 90, 79, 73, 113, 71};
    }

    public H3(Uri uri, long j2, long j3, long j4, String str, int i2) {
        this(uri, null, j2, j3, j4, str, i2);
    }

    public H3(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    public H3(Uri uri, long j2, long j3, String str, int i2) {
        this(uri, j2, j2, j3, str, i2);
    }

    public H3(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        boolean z2 = true;
        AbstractC0576Hf.A03(j2 >= 0);
        AbstractC0576Hf.A03(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z2 = false;
        }
        AbstractC0576Hf.A03(z2);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j2;
        this.A03 = j3;
        this.A02 = j4;
        this.A05 = str;
        this.A00 = i2;
    }

    public final boolean A02(int i2) {
        return (this.A00 & i2) == i2;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(2, 9, 67)).append(this.A04);
        String A00 = A00(0, 2, 42);
        return append.append(A00).append(Arrays.toString(this.A06)).append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A02).append(A00).append(this.A05).append(A00).append(this.A00).append(A00(11, 1, Opcodes.DREM)).toString();
    }
}
