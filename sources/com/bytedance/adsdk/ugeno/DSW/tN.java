package com.bytedance.adsdk.ugeno.DSW;

/* loaded from: classes.dex */
public final class tN {
    public static float YFl(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static int YFl(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static long YFl(String str, long j3) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j3;
        }
    }

    public static boolean YFl(String str, boolean z10) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z10;
        }
    }
}
