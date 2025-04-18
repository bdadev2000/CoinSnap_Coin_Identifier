package n1;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31103a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.l f31104b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31105c;

    public m(int i2, k1.h hVar) {
        this.f31103a = i2;
        if (i2 != 1) {
            this.f31104b = hVar;
            this.f31105c = new g1.c(1);
        } else {
            this.f31104b = hVar;
            this.f31105c = new ConcurrentHashMap();
        }
    }

    public final k1.a a(x0.c cVar) {
        Object obj;
        Object putIfAbsent;
        switch (this.f31103a) {
            case 0:
                obj = ((g1.c) this.f31105c).get(p0.a.i0(cVar));
                p0.a.r(obj, "get(...)");
                o0 o0Var = (o0) obj;
                Object obj2 = o0Var.f31117a.get();
                if (obj2 == null) {
                    obj2 = o0Var.a(new h.a0(1, this, cVar));
                }
                return ((h) obj2).f31080a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f31105c;
                Class i02 = p0.a.i0(cVar);
                Object obj3 = concurrentHashMap.get(i02);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(i02, (obj3 = new h((k1.a) this.f31104b.invoke(cVar))))) != null) {
                    obj3 = putIfAbsent;
                }
                return ((h) obj3).f31080a;
        }
    }
}
