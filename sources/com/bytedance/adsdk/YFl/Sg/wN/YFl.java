package com.bytedance.adsdk.YFl.Sg.wN;

/* loaded from: classes.dex */
public class YFl {
    public static boolean AlY(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }

    public static boolean Sg(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean YFl(char c10) {
        return c10 == ' ';
    }

    public static boolean tN(char c10) {
        return c10 >= '0' && c10 <= '9';
    }
}
