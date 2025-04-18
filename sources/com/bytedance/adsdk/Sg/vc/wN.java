package com.bytedance.adsdk.Sg.vc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.Sg.tN.Sg.pDU;
import com.bytedance.component.sdk.annotation.FloatRange;
import vd.e;

/* loaded from: classes.dex */
public class wN {
    private static final PointF YFl = new PointF();

    private static int Sg(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static float YFl(float f10, float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        return e.b(f11, f10, f12, f10);
    }

    public static boolean tN(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static int YFl(int i10, int i11, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return (int) ((f10 * (i11 - i10)) + i10);
    }

    public static float Sg(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static PointF YFl(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void YFl(pDU pdu, Path path) {
        path.reset();
        PointF YFl2 = pdu.YFl();
        path.moveTo(YFl2.x, YFl2.y);
        YFl.set(YFl2.x, YFl2.y);
        for (int i10 = 0; i10 < pdu.tN().size(); i10++) {
            com.bytedance.adsdk.Sg.tN.YFl yFl = pdu.tN().get(i10);
            PointF YFl3 = yFl.YFl();
            PointF Sg = yFl.Sg();
            PointF tN = yFl.tN();
            PointF pointF = YFl;
            if (YFl3.equals(pointF) && Sg.equals(tN)) {
                path.lineTo(tN.x, tN.y);
            } else {
                path.cubicTo(YFl3.x, YFl3.y, Sg.x, Sg.y, tN.x, tN.y);
            }
            pointF.set(tN.x, tN.y);
        }
        if (pdu.Sg()) {
            path.close();
        }
    }

    public static int YFl(float f10, float f11) {
        return YFl((int) f10, (int) f11);
    }

    private static int YFl(int i10, int i11) {
        return i10 - (i11 * Sg(i10, i11));
    }

    public static int YFl(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
