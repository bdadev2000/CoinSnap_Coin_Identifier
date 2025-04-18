package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class L4 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-60, -52, 8, Ascii.CR, Ascii.ETB, Ascii.DC4, Ascii.DLE, 5, Ascii.GS, 9, 8, -60, 10, 19, Ascii.SYN, -60, Ascii.CAN, 9, Ascii.ETB, Ascii.CAN, -60, 5, 8, Ascii.ETB, -60, 19, Ascii.DC2, Ascii.DLE, Ascii.GS, -51};
    }

    public static void A02(Context context, String str) {
        if (AdInternalSettings.isTestMode(context)) {
            String str2 = str + A00(0, 30, 46);
        }
    }
}
