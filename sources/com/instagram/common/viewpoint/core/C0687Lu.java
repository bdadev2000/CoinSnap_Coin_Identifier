package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Lu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0687Lu {
    public static byte[] A00;
    public static String[] A01 = {"kzsYhm9LKsU0BkYF5GBD4cHOfO5I2S", "FiiX6q", "juV27aOscABEXHLMFQmBucT", "1EXxaj", "f1sOyyKe81qkTfSynlEtElAllv4GRKo", "lzeqJRba", "GXB72S", "F9UQYukVDOEwI1lxcupNtKixpZh4OtVr"};
    public static final InterfaceC0686Lt A02 = null;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{64, 75, 86, 3, 23, 8, 20, 21, 18, 16, 50, 61, 116, 39, 115, 53, 60, 33, 62, 50, 39, 115, 39, 58, 62, 54, 125};
    }

    static {
        A07();
    }

    public static long A00() {
        if (A02 != null) {
            return A02.A5M();
        }
        return System.currentTimeMillis();
    }

    public static long A01(long j2) {
        if (j2 == -1) {
            return -1L;
        }
        return System.currentTimeMillis() - j2;
    }

    public static String A02(double d) {
        try {
            return String.format(Locale.US, A03(0, 4, Opcodes.DREM), Double.valueOf(d));
        } catch (Exception e) {
            String simpleName = C0687Lu.class.getSimpleName();
            if (A01[3].length() == 20) {
                Exception e2 = new RuntimeException();
                throw e2;
            }
            A01[0] = "ylDYykVZ0MQgZWbzvTC4Y0QCoTAruV";
            Log.e(simpleName, A03(9, 18, 69), e);
            return A03(4, 5, 48);
        }
    }

    public static String A04(long j2) {
        return String.valueOf(A01(j2));
    }

    @Deprecated
    public static String A05(long j2) {
        return A02(j2 / 1000.0d);
    }

    public static String A06(long j2) {
        return Long.toString(j2);
    }
}
