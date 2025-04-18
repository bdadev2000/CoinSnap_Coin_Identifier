package vc;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class r extends com.google.gson.c0 {
    public final t a;

    public r(t tVar) {
        this.a = tVar;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        Object d10 = d();
        Map map = this.a.a;
        try {
            aVar.g();
            while (aVar.t()) {
                q qVar = (q) map.get(aVar.V());
                if (qVar == null) {
                    aVar.i0();
                } else {
                    f(d10, aVar, qVar);
                }
            }
            aVar.q();
            return e(d10);
        } catch (IllegalAccessException e2) {
            s.a aVar2 = xc.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalStateException e10) {
            throw new com.google.gson.v(e10);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        if (obj == null) {
            bVar.t();
            return;
        }
        bVar.j();
        try {
            Iterator it = this.a.f26470b.iterator();
            while (it.hasNext()) {
                ((q) it.next()).a(bVar, obj);
            }
            bVar.q();
        } catch (IllegalAccessException e2) {
            s.a aVar = xc.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, zc.a aVar, q qVar);
}
