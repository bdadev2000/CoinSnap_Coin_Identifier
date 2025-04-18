package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.6S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6S {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{45, 59, Ascii.DLE, 42, 55, 59, Base64.padSymbol, 46, 60, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 38, 41, 36, 102, 42, 60, 45, 48, 60, 58, 41, 59};
    }

    public static SharedPreferences A00(C03987f c03987f) {
        return c03987f.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 105), c03987f), 0);
    }

    public final String A03(C03987f c03987f) {
        return A00(c03987f).getString(A01(0, 9, 110), null);
    }

    public final void A04(C03987f c03987f, String str) {
        SharedPreferences btSP = A00(c03987f);
        btSP.edit().putString(A01(0, 9, 110), str).apply();
    }
}
