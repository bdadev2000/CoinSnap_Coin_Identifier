package com.bytedance.adsdk.lottie;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
class dQp implements Interpolator {
    private final float[] lMd;
    private final float[] zp;

    public dQp(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i9 = (int) (length / 0.002f);
        int i10 = i9 + 1;
        this.zp = new float[i10];
        this.lMd = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((i11 * length) / i9, fArr, null);
            this.zp[i11] = fArr[0];
            this.lMd[i11] = fArr[1];
        }
    }

    private static Path zp(float f9, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f9, f10, f11, f12, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f9) {
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        int length = this.zp.length - 1;
        int i9 = 0;
        while (length - i9 > 1) {
            int i10 = (i9 + length) / 2;
            if (f9 < this.zp[i10]) {
                length = i10;
            } else {
                i9 = i10;
            }
        }
        float[] fArr = this.zp;
        float f10 = fArr[length];
        float f11 = fArr[i9];
        float f12 = f10 - f11;
        if (f12 == 0.0f) {
            return this.lMd[i9];
        }
        float f13 = (f9 - f11) / f12;
        float[] fArr2 = this.lMd;
        float f14 = fArr2[i9];
        return AbstractC2914a.a(fArr2[length], f14, f13, f14);
    }

    public dQp(float f9, float f10, float f11, float f12) {
        this(zp(f9, f10, f11, f12));
    }
}
