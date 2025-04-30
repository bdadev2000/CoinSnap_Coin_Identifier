package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6S {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{45, 59, Ascii.DLE, 42, 55, 59, 61, 46, 60, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 38, 41, 36, 102, 42, 60, 45, 48, 60, 58, 41, 59};
    }

    public static SharedPreferences A00(C09647f c09647f) {
        return c09647f.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 105), c09647f), 0);
    }

    public final String A03(C09647f c09647f) {
        return A00(c09647f).getString(A01(0, 9, 110), null);
    }

    public final void A04(C09647f c09647f, String str) {
        SharedPreferences btSP = A00(c09647f);
        btSP.edit().putString(A01(0, 9, 110), str).apply();
    }
}
