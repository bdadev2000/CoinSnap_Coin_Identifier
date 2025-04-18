package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class KE {
    public static byte[] A00;
    public static String[] A01 = {"Q0cgd8ZooYecE", "J2BVhp7vuHAIAp7SnVNGb8HH1cbMxubt", "iqQBNrIT5Q3AC", "t9KuhFyRWu3gNFkI0HekeVuTW0avorLV", "OYjVlNdFlUPlcN7lAyHGk2JCraJWPiHi", "vCXknpIYzaKLfC11Hy3POPlfgXO", "n2KyTvvQ13Vg6RKdtgKJvEFdzL71NxtZ", "o17fQXz1EMvktucDmPwTMbcvnBIuog9r"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-48, -52, -53, -18, -38, -4, -17, -16, -3};
        if (A01[5].length() == 9) {
            throw new RuntimeException();
        }
        A01[4] = "oolqHAu5YIFMgU7X3X8w7PUngZkPIqyX";
        A00 = bArr;
    }

    static {
        A02();
    }

    public static SharedPreferences A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 9, 95), context), 0);
    }
}
