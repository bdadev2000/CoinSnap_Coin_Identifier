package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0728Lf {
    public static byte[] A00;
    public static String[] A01 = {"XEo7ApDkixomJl", "UTo8fMhBtcAYVBkj97ZdrNE79DqyVdeE", "qjsfLXTzdQjFcrr1MQWDVCv1RezJVkpD", "uyyak5D0vLW0qS4el0H9V3NvWvs7WmEw", "dfkt", "aZ9WVO7oGzsQrfntNmAENBSB60kWMi8d", "vBzt6OuEytEA3fr2a70IMY3R4BM3PC0Z", "3Sjf17E3qVEfPkL5Ydo7ZoDPJxNqRPuV"};
    public static final InterfaceC0727Le A02 = null;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-76, -67, -62, -11, 84, 81, 85, 86, 87, -83, -53, -40, -111, -34, -118, -48, -39, -36, -41, -53, -34, -118, -34, -45, -41, -49, -104};
    }

    static {
        A07();
    }

    public static long A00() {
        InterfaceC0727Le interfaceC0727Le = A02;
        if (interfaceC0727Le != null) {
            return interfaceC0727Le.A50();
        }
        return System.currentTimeMillis();
    }

    public static long A01(long j3) {
        if (j3 == -1) {
            return -1L;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = A01;
        if (strArr[1].charAt(28) != strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        A01[3] = "urCZ1k15svGSg9r6LMSBF5zX9epx6b4x";
        return currentTimeMillis - j3;
    }

    public static String A02(double d10) {
        try {
            return String.format(Locale.US, A03(0, 4, 118), Double.valueOf(d10));
        } catch (Exception e2) {
            Log.e(C0728Lf.class.getSimpleName(), A03(9, 18, 81), e2);
            return A03(4, 5, 10);
        }
    }

    public static String A04(long j3) {
        return String.valueOf(A01(j3));
    }

    @Deprecated
    public static String A05(long j3) {
        return A02(j3 / 1000.0d);
    }

    public static String A06(long j3) {
        return Long.toString(j3);
    }
}
