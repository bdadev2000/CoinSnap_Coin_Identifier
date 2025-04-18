package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public class eT {
    public static long YFl(float f10, float f11) {
        return Float.floatToRawIntBits(f11) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static long YFl(int i10, int i11) {
        return YFl(i10, i11);
    }
}
