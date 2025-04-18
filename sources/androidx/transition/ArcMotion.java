package androidx.transition;

import android.graphics.Path;
import android.support.v4.media.d;

/* loaded from: classes.dex */
public class ArcMotion extends PathMotion {
    static {
        Math.tan(Math.toRadians(35.0d));
    }

    @Override // androidx.transition.PathMotion
    public final Path getPath(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f8 = f4 - f2;
        float f9 = f5 - f3;
        float f10 = (f9 * f9) + (f8 * f8);
        float f11 = (f2 + f4) / 2.0f;
        float f12 = (f3 + f5) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z2 = f3 > f5;
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z2) {
                f7 = abs + f5;
                f6 = f4;
            } else {
                f7 = abs + f3;
                f6 = f2;
            }
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z2) {
                f7 = f3;
                f6 = f14 + f2;
            } else {
                f6 = f4 - f14;
                f7 = f5;
            }
        }
        float f15 = f13 * 0.0f * 0.0f;
        float f16 = f11 - f6;
        float f17 = f12 - f7;
        float f18 = (f17 * f17) + (f16 * f16);
        float f19 = f13 * 0.0f * 0.0f;
        if (f18 >= f15) {
            f15 = f18 > f19 ? f19 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f6 = d.a(f6, f11, sqrt, f11);
            f7 = d.a(f7, f12, sqrt, f12);
        }
        path.cubicTo((f2 + f6) / 2.0f, (f3 + f7) / 2.0f, (f6 + f4) / 2.0f, (f7 + f5) / 2.0f, f4, f5);
        return path;
    }
}
