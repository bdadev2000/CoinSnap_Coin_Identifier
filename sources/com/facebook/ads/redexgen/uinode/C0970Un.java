package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0970Un implements KZ {
    public static byte[] A00;
    public static String[] A01 = {"8dTs7O5twSBYJQLkIxmvSEVrFVEvVCci", "69NA9D5Z6BuLX3eP6NdAfQAgnNKJrDbv", "acKGpr4PBH5WFf0tOIi0bMoNuU2uM3j", "PyBLhH8YgyLL4rtY0CuV5vjOqs5FO6aV", "QGo0VGIKP6OUkgre", "Fn5N", "qAtdKl9ehcjQMJLKj9xOFxL36VJ6lS2D", "CGei2tUyEESFCVHjI0JHW7BbjnmVvUdx"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {119, 115, 114, -90, -107, -102, -106, -97, -108, -106, Byte.MAX_VALUE, -106, -91, -88, -96, -93, -100, -42, -17, -20, -17, -16, -8, -17, -95, -26, -7, -28, -26, -15, -11, -22, -16, -17, -81};
        if (A01[5].length() != 4) {
            throw new RuntimeException();
        }
        A01[1] = "MK2VCqgBd9SNnNeGly9LCo5Q0MZYLIwM";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.uinode.KZ
    public final void A9S(int i10, Throwable th2) {
        Log.e(A00(0, 17, 10), A00(17, 18, 90), th2);
    }
}
