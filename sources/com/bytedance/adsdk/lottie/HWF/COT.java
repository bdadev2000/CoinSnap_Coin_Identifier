package com.bytedance.adsdk.lottie.HWF;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.KS.lMd.rV;
import com.bytedance.component.sdk.annotation.FloatRange;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class COT {
    private static final PointF zp = new PointF();

    public static boolean KS(float f9, float f10, float f11) {
        return f9 >= f10 && f9 <= f11;
    }

    private static int lMd(int i9, int i10) {
        int i11 = i9 / i10;
        return (((i9 ^ i10) >= 0) || i9 % i10 == 0) ? i11 : i11 - 1;
    }

    public static int zp(int i9, int i10, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
        return (int) ((f9 * (i10 - i9)) + i9);
    }

    public static PointF zp(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float lMd(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f9));
    }

    public static void zp(rV rVVar, Path path) {
        path.reset();
        PointF zp2 = rVVar.zp();
        path.moveTo(zp2.x, zp2.y);
        zp.set(zp2.x, zp2.y);
        for (int i9 = 0; i9 < rVVar.KS().size(); i9++) {
            com.bytedance.adsdk.lottie.KS.zp zpVar = rVVar.KS().get(i9);
            PointF zp3 = zpVar.zp();
            PointF lMd = zpVar.lMd();
            PointF KS = zpVar.KS();
            PointF pointF = zp;
            if (zp3.equals(pointF) && lMd.equals(KS)) {
                path.lineTo(KS.x, KS.y);
            } else {
                path.cubicTo(zp3.x, zp3.y, lMd.x, lMd.y, KS.x, KS.y);
            }
            pointF.set(KS.x, KS.y);
        }
        if (rVVar.lMd()) {
            path.close();
        }
    }

    public static float zp(float f9, float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return AbstractC2914a.a(f10, f9, f11, f9);
    }

    public static int zp(float f9, float f10) {
        return zp((int) f9, (int) f10);
    }

    private static int zp(int i9, int i10) {
        return i9 - (i10 * lMd(i9, i10));
    }

    public static int zp(int i9, int i10, int i11) {
        return Math.max(i10, Math.min(i11, i9));
    }
}
