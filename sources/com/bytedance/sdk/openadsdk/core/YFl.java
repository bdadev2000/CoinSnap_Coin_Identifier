package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class YFl {
    private static final String YFl = tN();
    private static final String Sg = lG.AlY().tN();

    public static String Sg() {
        return new String(Base64.decode(Sg, 0)).substring(2);
    }

    public static String YFl() {
        return new String(Base64.decode(YFl, 0)).substring(2);
    }

    private static String tN() {
        char[] cArr = {203, Typography.paragraph, 168, Typography.degree, 207, 148, 149, 178, 205, Typography.paragraph, 149, 166, 134, 178, 184, Typography.degree, 206, Typography.registered, 187, 178, 150, 185, Typography.section, 166};
        char[] cArr2 = new char[24];
        for (int i10 = 23; i10 >= 0; i10--) {
            cArr2[23 - i10] = (char) (cArr[i10] ^ 255);
        }
        return new String(cArr2);
    }
}
