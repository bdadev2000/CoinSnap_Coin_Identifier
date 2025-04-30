package F1;

import android.graphics.Color;
import android.graphics.PointF;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class f implements E {

    /* renamed from: c, reason: collision with root package name */
    public static final f f1076c = new f(0);

    /* renamed from: d, reason: collision with root package name */
    public static final f f1077d = new f(1);

    /* renamed from: f, reason: collision with root package name */
    public static final f f1078f = new f(2);

    /* renamed from: g, reason: collision with root package name */
    public static final f f1079g = new f(3);

    /* renamed from: h, reason: collision with root package name */
    public static final f f1080h = new f(4);

    /* renamed from: i, reason: collision with root package name */
    public static final f f1081i = new f(5);
    public final /* synthetic */ int b;

    public /* synthetic */ f(int i9) {
        this.b = i9;
    }

    @Override // F1.E
    public final Object a(G1.c cVar, float f9) {
        double d2;
        switch (this.b) {
            case 0:
                boolean z8 = true;
                if (cVar.o() != 1) {
                    z8 = false;
                }
                if (z8) {
                    cVar.a();
                }
                double l = cVar.l();
                double l2 = cVar.l();
                double l6 = cVar.l();
                if (cVar.o() == 7) {
                    d2 = cVar.l();
                } else {
                    d2 = 1.0d;
                }
                if (z8) {
                    cVar.c();
                }
                if (l <= 1.0d && l2 <= 1.0d && l6 <= 1.0d) {
                    l *= 255.0d;
                    l2 *= 255.0d;
                    l6 *= 255.0d;
                    if (d2 <= 1.0d) {
                        d2 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) d2, (int) l, (int) l2, (int) l6));
            case 1:
                return Float.valueOf(o.d(cVar) * f9);
            case 2:
                return Integer.valueOf(Math.round(o.d(cVar) * f9));
            case 3:
                return o.b(cVar, f9);
            case 4:
                int o3 = cVar.o();
                if (o3 == 1) {
                    return o.b(cVar, f9);
                }
                if (o3 == 3) {
                    return o.b(cVar, f9);
                }
                if (o3 == 7) {
                    PointF pointF = new PointF(((float) cVar.l()) * f9, ((float) cVar.l()) * f9);
                    while (cVar.j()) {
                        cVar.s();
                    }
                    return pointF;
                }
                throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(AbstractC2914a.n(o3)));
            default:
                boolean z9 = true;
                if (cVar.o() != 1) {
                    z9 = false;
                }
                if (z9) {
                    cVar.a();
                }
                float l7 = (float) cVar.l();
                float l9 = (float) cVar.l();
                while (cVar.j()) {
                    cVar.s();
                }
                if (z9) {
                    cVar.c();
                }
                return new I1.c((l7 / 100.0f) * f9, (l9 / 100.0f) * f9);
        }
    }
}
