package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0468Ck {
    public static byte[] A05;
    public static String[] A06 = {"mFOOXeT", "LexbahN", "kVTxxC3LTF0fLMRDW8jGaPZPlig8JQO1", "0AoiW04D4LYaxFko3LbiIyYKfV5E85gy", "aSBFun93hJrKs5fmh7DDxXeNBftzg4Tu", "XwteBG2Aw0OJWJhPb8yklLP0HTcb60fQ", "dNH0H93SgKuqiJfOfkHJjHC2B9TjjrRJ", "a4Tt0YroJWfViDs7yV1XUKalqcZLTf7A"};
    public final int A00;
    public final C8 A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = copyOfRange[i5] - i4;
            String[] strArr = A06;
            if (strArr[7].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            A06[5] = "YmrJEBKdiRZ1L6ltRDAiNut0MqgfCokc";
            copyOfRange[i5] = (byte) (i6 - 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-7, 0, -14, 19, 69, 69, 71, Utf8.REPLACEMENT_BYTE, 59, 64, 57, -14, 19, 23, 37, -1, 21, 38, 36, -14, 53, 68, 75, 66, 70, 65, -14, Utf8.REPLACEMENT_BYTE, 65, 54, 55, 0, -18, 12, -5, -3, 5, -33, 8, -3, 12, 19, 10, 14, 3, 9, 8, -36, 9, 18, 22, 47, 52, 54, 49, 49, 48, 51, 53, 38, 37, -31, 49, 51, 48, 53, 38, 36, 53, 42, 48, 47, -31, 52, 36, 41, 38, 46, 38, -31, 53, 58, 49, 38, -31, -24, 33, 32, 33, -17, 11, 10, 11, 27, -31, -29, -20, -31, 24, 26, 35, 40};
    }

    static {
        A02();
    }

    public C0468Ck(boolean z2, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        AbstractC0576Hf.A03((bArr2 == null) ^ (i2 == 0));
        this.A03 = z2;
        this.A02 = str;
        this.A00 = i2;
        this.A04 = bArr2;
        this.A01 = new C8(A00(str), bArr, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c2;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 71))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 49))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 7))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3049895:
                if (str.equals(A01(98, 4, 62))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                Log.w(A01(32, 18, 35), A01(50, 36, 74) + str + A01(0, 32, 91));
                return 1;
        }
    }
}
