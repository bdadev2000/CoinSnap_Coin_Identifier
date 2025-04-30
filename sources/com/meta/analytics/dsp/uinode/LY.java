package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.StringTokenizer;

/* loaded from: assets/audience_network.dex */
public abstract class LY {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.EM, 65, 65, 65};
    }

    public static String A01(String str) {
        if (str != null) {
            String truncatedBody = A00(0, 1, 88);
            StringTokenizer stringTokenizer = new StringTokenizer(str, truncatedBody, true);
            int i9 = 0;
            int maxLength = str.length();
            if (maxLength > 90) {
                int tokenLength = str.length();
                String A002 = A00(1, 3, 14);
                if (tokenLength > 93 || !str.endsWith(A002)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int length = stringTokenizer.nextToken().length();
                        int maxLength2 = i9 + length;
                        if (maxLength2 < 90) {
                            i9 += length;
                        }
                    }
                    return i9 == 0 ? str.substring(0, 90) + A002 : str.substring(0, i9) + A002;
                }
                return str;
            }
            return str;
        }
        return str;
    }
}
