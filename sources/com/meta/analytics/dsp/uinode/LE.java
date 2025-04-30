package com.meta.analytics.dsp.uinode;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LE {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 78, 65, 8, 91, Ascii.SI, 75, 74, 91, 74, 93, 66, 70, 65, 74, Ascii.SI, 70, 73, Ascii.SI, 78, 95, 95, Ascii.SI, 70, 92, Ascii.SI, 122, 65, 70, 91, 86, 1, Ascii.CAN, 34, 113, 4, 63, 56, 37, 40, 113, 48, 33, 33, 107, 113, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 103, 112, 116, 118, 97, 59, 71, 112, 116, 118, 97, 84, 118, 97, 124, 99, 124, 97, 108, 4, 8, 10, 73, Ascii.DC2, 9, Ascii.SO, 19, Ascii.RS, 84, 3, 73, Ascii.ETB, Ascii.VT, 6, Ascii.RS, 2, Ascii.NAK, 73, 50, 9, Ascii.SO, 19, Ascii.RS, 55, Ascii.VT, 6, Ascii.RS, 2, Ascii.NAK, 38, 4, 19, Ascii.SO, 17, Ascii.SO, 19, Ascii.RS};
    }

    static {
        A01();
        A01 = LE.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i9, int i10) {
        return i9 >= 640 && i10 >= 640;
    }

    public static boolean A05(C09647f c09647f) {
        boolean z8 = false;
        try {
            PackageManager packageManager = c09647f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c09647f.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 62).equals(activityInfoArr[i9].name);
                    if (!activityDeclared) {
                        i9++;
                    } else {
                        z8 = true;
                        break;
                    }
                }
            }
            if (!z8) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = c09647f.A04().A8z();
            if (activityDeclared3) {
                String str = A00(32, 14, 8) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (c09647f.A04().A8z()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
