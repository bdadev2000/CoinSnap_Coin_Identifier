package com.bytedance.adsdk.Sg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import vd.e;

/* loaded from: classes.dex */
class rkt implements Interpolator {
    private final float[] Sg;
    private final float[] YFl;

    public rkt(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = ((int) (length / 0.002f)) + 1;
        this.YFl = new float[i10];
        this.Sg = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((i11 * length) / (i10 - 1), fArr, null);
            this.YFl[i11] = fArr[0];
            this.Sg[i11] = fArr[1];
        }
    }

    private static Path YFl(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.YFl.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.YFl[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.YFl;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.Sg[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.Sg;
        float f15 = fArr2[i10];
        return e.b(fArr2[length], f15, f14, f15);
    }

    public rkt(float f10, float f11, float f12, float f13) {
        this(YFl(f10, f11, f12, f13));
    }
}
