package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0650Kg {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static SharedPreferences A00(C7j c7j) {
        return c7j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 40, 89), c7j), 0);
    }

    public final int A03(C7j c7j, String str, int i2) {
        return A00(c7j).getInt(str, i2);
    }

    public final String A04(C7j c7j, String str, String str2) {
        return A00(c7j).getString(str, str2);
    }

    public final void A05(C7j c7j, String str, int i2) {
        SharedPreferences btSP = A00(c7j);
        btSP.edit().putInt(str, i2).apply();
    }

    public final void A06(C7j c7j, String str, String str2) {
        SharedPreferences btSP = A00(c7j);
        btSP.edit().putString(str, str2).apply();
    }
}
