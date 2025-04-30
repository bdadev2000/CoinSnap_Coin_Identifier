package com.bytedance.adsdk.ugeno.lMd;

/* loaded from: classes.dex */
public final class KS {
    public static float zp(String str, float f9) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f9;
        }
    }

    public static int zp(String str, int i9) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i9;
        }
    }

    public static long zp(String str, long j7) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j7;
        }
    }

    public static boolean zp(String str, boolean z8) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z8;
        }
    }
}
