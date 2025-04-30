package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* loaded from: classes.dex */
public final class zp {
    private static final String zp = KS();
    private static final String lMd = KVG.jU().KS();

    private static String KS() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i9 = 23; i9 >= 0; i9--) {
            cArr2[23 - i9] = (char) (cArr[i9] ^ 255);
        }
        return new String(cArr2);
    }

    public static String lMd() {
        return new String(Base64.decode(lMd, 0)).substring(2);
    }

    public static String zp() {
        return new String(Base64.decode(zp, 0)).substring(2);
    }
}
