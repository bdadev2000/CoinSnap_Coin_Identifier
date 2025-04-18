package com.facebook.ads.redexgen.uinode;

import android.media.MediaFormat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class DS {
    public static byte[] A00;
    public static String[] A01 = {"baVHNJzNANFnY1sXkXZczBpKXzzSELDJ", "FJDCDULbybk31yXIvavqVvo2MicyH1aO", "K5IelWz6", "FdTbrt0ZL", "L8wW0lj5Otl6fi1MjRxzAQsIUgUke571", "mk5Gt8c3oV5jI8LyKcE86", "7JcRYM5esVvDeFOwjRyEQKpjADMcRwiD", "vrbl2XRh5nY8mdFWk2TMR4MRI9Bh0"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{45, 57, 54, 57, 60, -9, 60, 43, 56, 49, 47, -11, 1, -2, 1, 4, -65, 5, 6, -13, 0, -10, -13, 4, -10, Ascii.DC2, Ascii.RS, Ascii.ESC, Ascii.RS, 33, -36, 35, 33, Ascii.DLE, Ascii.GS, 34, Ascii.NAK, Ascii.DC4, 33, 3, 19, 4, -51, -14, -18, -4, -73, -3, -2, -21, -2, -13, -19, -73, -13, -8, -16, -7};
    }

    static {
        A01();
    }

    public static void A02(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 59), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 30), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 86), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 22), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void A06(MediaFormat mediaFormat, List<byte[]> list) {
        int i10 = 0;
        while (true) {
            int size = list.size();
            if (A01[2].length() != 8) {
                throw new RuntimeException();
            }
            A01[0] = "5g98DeOKXRonF2SHWvMVynJwaAQ3gOVI";
            if (i10 < size) {
                mediaFormat.setByteBuffer(A00(39, 4, 44) + i10, ByteBuffer.wrap(list.get(i10)));
                i10++;
            } else {
                return;
            }
        }
    }
}
