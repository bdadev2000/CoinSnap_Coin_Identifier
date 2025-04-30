package U7;

import x7.EnumC2928a;
import y7.AbstractC2952a;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final H0.a f3378a = new H0.a("NULL", 2);

    public static final Object a(w7.k kVar, Object obj, Object obj2, F7.p pVar, w7.f fVar) {
        Object g9;
        Object l = V7.a.l(kVar, obj2);
        try {
            w wVar = new w(fVar, kVar);
            if (!(pVar instanceof AbstractC2952a)) {
                g9 = F2.h.a0(pVar, obj, wVar);
            } else {
                G7.v.b(2, pVar);
                g9 = pVar.g(obj, wVar);
            }
            V7.a.g(kVar, l);
            if (g9 == EnumC2928a.b) {
                G7.j.e(fVar, "frame");
            }
            return g9;
        } catch (Throwable th) {
            V7.a.g(kVar, l);
            throw th;
        }
    }
}
