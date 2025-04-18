package com.facebook.ads.redexgen.uinode;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02862p {
    public static byte[] A00;
    public static String[] A01 = {"5xFyhJyAmXwpndJ9EoKqTFqqLI0O0t2g", "XKBE22ujheeLcTYagdBtfv4d5l35c1GL", "dLXeMiu6Rni", "1iBW7", "i8dAz", "3kaHypJVzQjnFbgNDhrnWnyYOdOCg92b", "E8vO87QQkuay4qK7aMyGFQLc0ZjeOzJS", "6MpCOYCclTS"};
    public static final ThreadLocal<double[]> A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-104, -93, -89, -97, -104, 87, -92, -84, -86, -85, 87, -103, -100, 87, -103, -100, -85, -82, -100, -100, -91, 87, 103, 87, -104, -91, -101, 87, 105, 108, 108, 101, -59, -53, -54, -82, -49, -48, 118, -61, -53, -55, -54, 118, -66, -73, -52, -69, 118, -73, 118, -62, -69, -60, -67, -54, -66, 118, -59, -68, 118, -119, -124};
    }

    static {
        A04();
        A02 = new ThreadLocal<>();
    }

    public static double A00(int i10) {
        double[] A07 = A07();
        A06(i10, A07);
        return A07[1] / 100.0d;
    }

    public static int A01(int i10, int i11) {
        if (i11 >= 0) {
            String[] strArr = A01;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "QbRpT";
            strArr2[3] = "VTwjf";
            if (i11 <= 255) {
                return (16777215 & i10) | (i11 << 24);
            }
        }
        throw new IllegalArgumentException(A03(0, 32, 3));
    }

    public static int A02(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        float inverseRatio = Color.alpha(i11);
        float g10 = (Color.alpha(i10) * f11) + (inverseRatio * f10);
        float inverseRatio2 = Color.red(i11);
        float r6 = (Color.red(i10) * f11) + (inverseRatio2 * f10);
        float a = Color.green(i10);
        float inverseRatio3 = Color.green(i11);
        float a10 = (a * f11) + (inverseRatio3 * f10);
        float inverseRatio4 = Color.blue(i11);
        float b3 = (Color.blue(i10) * f11) + (inverseRatio4 * f10);
        return Color.argb((int) g10, (int) r6, (int) a10, (int) b3);
    }

    public static void A05(int i10, int i11, int i12, double[] dArr) {
        double sb2;
        double sr;
        double sb3;
        if (dArr.length == 3) {
            double sb4 = i10 / 255.0d;
            if (sb4 < 0.04045d) {
                sb2 = sb4 / 12.92d;
            } else {
                sb2 = Math.pow((sb4 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = i11 / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                sr = Math.pow((sr2 + 0.055d) / 1.055d, 2.4d);
            }
            double sb5 = i12 / 255.0d;
            if (sb5 < 0.04045d) {
                sb3 = sb5 / 12.92d;
            } else {
                double sg2 = 0.055d + sb5;
                sb3 = Math.pow(sg2 / 1.055d, 2.4d);
            }
            double sg3 = 0.4124d * sb2;
            dArr[0] = (sg3 + (0.3576d * sr) + (0.1805d * sb3)) * 100.0d;
            double sg4 = 0.2126d * sb2;
            dArr[1] = (sg4 + (0.7152d * sr) + (0.0722d * sb3)) * 100.0d;
            double sg5 = 0.0193d * sb2;
            dArr[2] = (sg5 + (0.1192d * sr) + (0.9505d * sb3)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A03(32, 31, 34));
    }

    public static void A06(int i10, double[] dArr) {
        A05(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static double[] A07() {
        ThreadLocal<double[]> threadLocal = A02;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
