package com.bytedance.adsdk.lottie.HWF;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class lMd {
    private static float lMd(float f9) {
        if (f9 <= 0.04045f) {
            return f9 / 12.92f;
        }
        return (float) Math.pow((f9 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float zp(float f9) {
        return f9 <= 0.0031308f ? f9 * 12.92f : (float) ((Math.pow(f9, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int zp(float f9, int i9, int i10) {
        if (i9 == i10) {
            return i9;
        }
        float f10 = ((i9 >> 24) & 255) / 255.0f;
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float lMd = lMd(((i9 >> 16) & 255) / 255.0f);
        float lMd2 = lMd(((i9 >> 8) & 255) / 255.0f);
        float lMd3 = lMd((i9 & 255) / 255.0f);
        float lMd4 = lMd(((i10 >> 16) & 255) / 255.0f);
        float lMd5 = lMd(((i10 >> 8) & 255) / 255.0f);
        float lMd6 = lMd((i10 & 255) / 255.0f);
        float a6 = AbstractC2914a.a(f11, f10, f9, f10);
        float a9 = AbstractC2914a.a(lMd4, lMd, f9, lMd);
        float a10 = AbstractC2914a.a(lMd5, lMd2, f9, lMd2);
        float a11 = AbstractC2914a.a(lMd6, lMd3, f9, lMd3);
        float zp = zp(a9) * 255.0f;
        float zp2 = zp(a10) * 255.0f;
        return Math.round(zp(a11) * 255.0f) | (Math.round(zp) << 16) | (Math.round(a6 * 255.0f) << 24) | (Math.round(zp2) << 8);
    }
}
