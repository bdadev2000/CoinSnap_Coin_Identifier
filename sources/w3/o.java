package w3;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class o {
    public static final d3.g a = d3.g.z("x", "y");

    public static int a(x3.b bVar) {
        bVar.d();
        int r6 = (int) (bVar.r() * 255.0d);
        int r10 = (int) (bVar.r() * 255.0d);
        int r11 = (int) (bVar.r() * 255.0d);
        while (bVar.p()) {
            bVar.T();
        }
        bVar.j();
        return Color.argb(255, r6, r10, r11);
    }

    public static PointF b(x3.b bVar, float f10) {
        int b3 = t.h.b(bVar.u());
        if (b3 != 0) {
            if (b3 != 2) {
                if (b3 == 6) {
                    float r6 = (float) bVar.r();
                    float r10 = (float) bVar.r();
                    while (bVar.p()) {
                        bVar.T();
                    }
                    return new PointF(r6 * f10, r10 * f10);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(vd.e.j(bVar.u())));
            }
            bVar.g();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (bVar.p()) {
                int w10 = bVar.w(a);
                if (w10 != 0) {
                    if (w10 != 1) {
                        bVar.x();
                        bVar.T();
                    } else {
                        f12 = d(bVar);
                    }
                } else {
                    f11 = d(bVar);
                }
            }
            bVar.k();
            return new PointF(f11 * f10, f12 * f10);
        }
        bVar.d();
        float r11 = (float) bVar.r();
        float r12 = (float) bVar.r();
        while (bVar.u() != 2) {
            bVar.T();
        }
        bVar.j();
        return new PointF(r11 * f10, r12 * f10);
    }

    public static ArrayList c(x3.b bVar, float f10) {
        ArrayList arrayList = new ArrayList();
        bVar.d();
        while (bVar.u() == 1) {
            bVar.d();
            arrayList.add(b(bVar, f10));
            bVar.j();
        }
        bVar.j();
        return arrayList;
    }

    public static float d(x3.b bVar) {
        int u = bVar.u();
        int b3 = t.h.b(u);
        if (b3 != 0) {
            if (b3 == 6) {
                return (float) bVar.r();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(vd.e.j(u)));
        }
        bVar.d();
        float r6 = (float) bVar.r();
        while (bVar.p()) {
            bVar.T();
        }
        bVar.j();
        return r6;
    }
}
