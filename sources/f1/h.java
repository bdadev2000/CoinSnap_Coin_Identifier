package F1;

import android.graphics.PointF;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class h implements E {
    public static final h b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final a7.b f1083c = a7.b.u("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, A1.b] */
    @Override // F1.E
    public final Object a(G1.c cVar, float f9) {
        String str;
        cVar.b();
        String str2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = true;
        int i12 = 3;
        String str3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (cVar.j()) {
            switch (cVar.q(f1083c)) {
                case 0:
                    str2 = cVar.n();
                    continue;
                case 1:
                    str = str2;
                    str3 = cVar.n();
                    break;
                case 2:
                    str = str2;
                    f10 = (float) cVar.l();
                    break;
                case 3:
                    str = str2;
                    int m = cVar.m();
                    if (m <= 2 && m >= 0) {
                        i12 = AbstractC2965e.e(3)[m];
                        break;
                    } else {
                        i12 = 3;
                        break;
                    }
                case 4:
                    i9 = cVar.m();
                    continue;
                case 5:
                    f11 = (float) cVar.l();
                    continue;
                case 6:
                    f12 = (float) cVar.l();
                    continue;
                case 7:
                    i10 = o.a(cVar);
                    continue;
                case 8:
                    i11 = o.a(cVar);
                    continue;
                case 9:
                    f13 = (float) cVar.l();
                    continue;
                case 10:
                    z8 = cVar.k();
                    continue;
                case 11:
                    cVar.a();
                    pointF = new PointF(((float) cVar.l()) * f9, ((float) cVar.l()) * f9);
                    cVar.c();
                    continue;
                case 12:
                    cVar.a();
                    str = str2;
                    pointF2 = new PointF(((float) cVar.l()) * f9, ((float) cVar.l()) * f9);
                    cVar.c();
                    break;
                default:
                    cVar.r();
                    cVar.s();
                    continue;
            }
            str2 = str;
        }
        cVar.h();
        ?? obj = new Object();
        obj.f4a = str2;
        obj.b = str3;
        obj.f5c = f10;
        obj.f6d = i12;
        obj.f7e = i9;
        obj.f8f = f11;
        obj.f9g = f12;
        obj.f10h = i10;
        obj.f11i = i11;
        obj.f12j = f13;
        obj.f13k = z8;
        obj.l = pointF;
        obj.m = pointF2;
        return obj;
    }
}
