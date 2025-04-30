package com.bytedance.adsdk.zp.lMd.COT;

/* loaded from: classes.dex */
public class zp {
    public static boolean KS(char c9) {
        return c9 >= '0' && c9 <= '9';
    }

    public static boolean jU(char c9) {
        return '+' == c9 || '-' == c9 || '*' == c9 || '/' == c9 || '%' == c9 || '=' == c9 || '>' == c9 || '<' == c9 || '!' == c9 || '&' == c9 || '|' == c9 || '?' == c9 || ':' == c9;
    }

    public static boolean lMd(char c9) {
        if (c9 < 'A' || c9 > 'Z') {
            return c9 >= 'a' && c9 <= 'z';
        }
        return true;
    }

    public static boolean zp(char c9) {
        return c9 == ' ';
    }
}
