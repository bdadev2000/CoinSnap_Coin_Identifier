package com.instagram.common.viewpoint.core;

import com.android.volley.DefaultRetryPolicy;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class YJ extends AbstractC0477Ct {
    public static byte[] A01;
    public static String[] A02 = {"9zUE1kBCLrpctXUh4di4teUCMMnlOwHm", "hxL5RrPmAhc7c6Sqok7geqGtoBQuG54z", "7qxsi95CwX1d32mD6PhTx1jG463xSlTg", "ROqSYZWleG9mDiFvnXHBa66Bw", "byItOkkTBkpZWV9t1cXQ", "rK61A2vaMRzsIHVSYP2n5X", "FfCvZ6O62JH3XUMkSbfnO7", "CFRLGqs9mpPSc58Q2JPSfTLdlWu7MMes"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-26, 7, 12, 10, -16, 4, -13, -8, -2, -66, -2, -1, 4, 2};
    }

    static {
        A02();
        A03 = IK.A08(A01(0, 4, 83));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i2;
        int i3;
        int frames = bArr[0] & UnsignedBytes.MAX_VALUE;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i2 = 1;
                break;
            case 1:
            case 2:
                i2 = 2;
                break;
            default:
                int toc2 = bArr[1];
                i2 = toc2 & 63;
                break;
        }
        int config = frames >> 3;
        int frames2 = config & 3;
        if (config >= 16) {
            i3 = DefaultRetryPolicy.DEFAULT_TIMEOUT_MS << frames2;
        } else if (config >= 12) {
            int length = frames2 & 1;
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int frames3 = str.length();
            int toc3 = str2.length();
            if (frames3 != toc3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "3r7DJYLfzRYqaRlcvCuDWA";
            strArr2[5] = "1ZUf0xo6oEwAlYAqSthqXk";
            i3 = 10000 << length;
        } else if (frames2 == 3) {
            i3 = 60000;
        } else {
            i3 = 10000 << frames2;
        }
        return i2 * i3;
    }

    private void A03(List<byte[]> initializationData, int i2) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i2 * 1000000000) / 48000).array());
    }

    public static boolean A04(I4 i4) {
        if (i4.A04() < A04.length) {
            return false;
        }
        byte[] bArr = new byte[A04.length];
        byte[] header = A04;
        i4.A0c(bArr, 0, header.length);
        byte[] header2 = A04;
        return Arrays.equals(bArr, header2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final long A07(I4 i4) {
        return A04(A00(i4.A00));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final void A09(boolean z2) {
        super.A09(z2);
        if (z2) {
            this.A00 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final boolean A0A(I4 i4, long j2, C0476Cs c0476Cs) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(i4.A00, i4.A07());
            int i2 = copyOf[9] & UnsignedBytes.MAX_VALUE;
            int i3 = ((copyOf[11] & UnsignedBytes.MAX_VALUE) << 8) | (copyOf[10] & UnsignedBytes.MAX_VALUE);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, i3);
            A03(arrayList, 3840);
            c0476Cs.A00 = Format.A07(null, A01(4, 10, 75), null, -1, -1, i2, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean headerPacket = i4.A08() == A03;
        String[] strArr = A02;
        if (strArr[2].charAt(8) == strArr[0].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "JHJxUYNn6gdFJmATsQeXbTNgPw95NmiQ";
        strArr2[0] = "1OX1ZlBLBQsnobg1X9ALf0NdaXPdAO6N";
        i4.A0Y(0);
        return headerPacket;
    }
}
