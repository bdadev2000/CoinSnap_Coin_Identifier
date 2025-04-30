package F1;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a7.b f1100a = a7.b.u("x", "y");

    public static int a(G1.c cVar) {
        cVar.a();
        int l = (int) (cVar.l() * 255.0d);
        int l2 = (int) (cVar.l() * 255.0d);
        int l6 = (int) (cVar.l() * 255.0d);
        while (cVar.j()) {
            cVar.s();
        }
        cVar.c();
        return Color.argb(255, l, l2, l6);
    }

    public static PointF b(G1.c cVar, float f9) {
        int d2 = AbstractC2965e.d(cVar.o());
        if (d2 != 0) {
            if (d2 != 2) {
                if (d2 == 6) {
                    float l = (float) cVar.l();
                    float l2 = (float) cVar.l();
                    while (cVar.j()) {
                        cVar.s();
                    }
                    return new PointF(l * f9, l2 * f9);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(AbstractC2914a.n(cVar.o())));
            }
            cVar.b();
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (cVar.j()) {
                int q9 = cVar.q(f1100a);
                if (q9 != 0) {
                    if (q9 != 1) {
                        cVar.r();
                        cVar.s();
                    } else {
                        f11 = d(cVar);
                    }
                } else {
                    f10 = d(cVar);
                }
            }
            cVar.h();
            return new PointF(f10 * f9, f11 * f9);
        }
        cVar.a();
        float l6 = (float) cVar.l();
        float l7 = (float) cVar.l();
        while (cVar.o() != 2) {
            cVar.s();
        }
        cVar.c();
        return new PointF(l6 * f9, l7 * f9);
    }

    public static ArrayList c(G1.c cVar, float f9) {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.o() == 1) {
            cVar.a();
            arrayList.add(b(cVar, f9));
            cVar.c();
        }
        cVar.c();
        return arrayList;
    }

    public static float d(G1.c cVar) {
        int o3 = cVar.o();
        int d2 = AbstractC2965e.d(o3);
        if (d2 != 0) {
            if (d2 == 6) {
                return (float) cVar.l();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(AbstractC2914a.n(o3)));
        }
        cVar.a();
        float l = (float) cVar.l();
        while (cVar.j()) {
            cVar.s();
        }
        cVar.c();
        return l;
    }
}
