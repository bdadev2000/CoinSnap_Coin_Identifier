package com.instagram.common.viewpoint.core;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LQ {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, 57, 54, Byte.MAX_VALUE, 44, 120, 60, 61, 44, 61, 42, 53, 49, 54, 61, 120, 49, 62, 120, 57, 40, 40, 120, 49, 43, 120, 13, 54, 49, 44, 33, 118, 55, 13, 94, 43, 16, 23, 10, 7, 94, 31, 14, 14, 68, 94, 88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 73, 94, 90, 88, 79, 21, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, 18, 30, 28, 95, 4, 31, 24, 5, 8, 66, 21, 95, 1, 29, 16, 8, 20, 3, 95, 36, 31, 24, 5, 8, 33, 29, 16, 8, 20, 3, 48, 18, 5, 24, 7, 24, 5, 8};
    }

    static {
        A01();
        A02 = LQ.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i2, int i3) {
        return i2 >= 640 && i3 >= 640;
    }

    public static boolean A05(C7j c7j) {
        boolean z2 = false;
        try {
            PackageManager packageManager = c7j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c7j.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfoArr[i2].name);
                    if (!activityDeclared) {
                        i2++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = c7j.A04().A9O();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (c7j.A04().A9O()) {
                Log.e(A02, A00(0, 32, 79), th);
            }
            return false;
        }
    }
}
