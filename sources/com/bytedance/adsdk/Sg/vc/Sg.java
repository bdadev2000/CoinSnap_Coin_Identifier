package com.bytedance.adsdk.Sg.vc;

import vd.e;

/* loaded from: classes.dex */
public class Sg {
    private static float Sg(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float YFl(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int YFl(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float Sg = Sg(((i10 >> 16) & 255) / 255.0f);
        float Sg2 = Sg(((i10 >> 8) & 255) / 255.0f);
        float Sg3 = Sg((i10 & 255) / 255.0f);
        float Sg4 = Sg(((i11 >> 16) & 255) / 255.0f);
        float Sg5 = Sg(((i11 >> 8) & 255) / 255.0f);
        float Sg6 = Sg((i11 & 255) / 255.0f);
        float b3 = e.b(f12, f11, f10, f11);
        float b10 = e.b(Sg4, Sg, f10, Sg);
        float b11 = e.b(Sg5, Sg2, f10, Sg2);
        float b12 = e.b(Sg6, Sg3, f10, Sg3);
        float YFl = YFl(b10) * 255.0f;
        float YFl2 = YFl(b11) * 255.0f;
        return Math.round(YFl(b12) * 255.0f) | (Math.round(YFl) << 16) | (Math.round(b3 * 255.0f) << 24) | (Math.round(YFl2) << 8);
    }
}
