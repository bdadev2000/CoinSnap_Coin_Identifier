package com.meta.analytics.dsp.uinode;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class LM {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 46, 36, 49, 36, 43, 36};
    }

    public static PackageInfo A00(C09647f c09647f) {
        return A01(c09647f, A02(0, 19, 59));
    }

    public static PackageInfo A01(C09647f c09647f, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = c09647f.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(C09647f c09647f, String str) {
        PackageInfo packageInfo = A01(c09647f, str);
        return packageInfo != null;
    }
}
