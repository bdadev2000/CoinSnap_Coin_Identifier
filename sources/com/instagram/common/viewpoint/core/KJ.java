package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class KJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-1, -5, -6, 29, 9, 43, 30, 31, 44};
    }

    public static SharedPreferences A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 9, 67), context), 0);
    }
}
