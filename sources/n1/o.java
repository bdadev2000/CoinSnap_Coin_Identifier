package n1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31114a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.p f31115b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31116c;

    public o(k1.g gVar, int i2) {
        this.f31114a = i2;
        if (i2 != 1) {
            this.f31115b = gVar;
            this.f31116c = new g1.c(1);
        } else {
            this.f31115b = gVar;
            this.f31116c = new ConcurrentHashMap();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlin.jvm.internal.r, q0.a] */
    public final Object a(x0.c cVar, ArrayList arrayList) {
        Object obj;
        Object d;
        Object d2;
        Object putIfAbsent;
        switch (this.f31114a) {
            case 0:
                obj = ((g1.c) this.f31116c).get(p0.a.i0(cVar));
                p0.a.r(obj, "get(...)");
                o0 o0Var = (o0) obj;
                Object obj2 = o0Var.f31117a.get();
                if (obj2 == null) {
                    obj2 = o0Var.a(new kotlin.jvm.internal.r(0));
                }
                u0 u0Var = (u0) obj2;
                ArrayList arrayList2 = new ArrayList(e0.q.M(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new f0((x0.o) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = u0Var.f31139a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        d = (k1.a) this.f31115b.invoke(cVar, arrayList);
                    } catch (Throwable th) {
                        d = kotlin.jvm.internal.q.d(th);
                    }
                    d0.n nVar = new d0.n(d);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, nVar);
                    obj3 = putIfAbsent2 == null ? nVar : putIfAbsent2;
                }
                return ((d0.n) obj3).f30137a;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f31116c;
                Class i02 = p0.a.i0(cVar);
                Object obj4 = concurrentHashMap2.get(i02);
                if (obj4 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(i02, (obj4 = new u0()))) != null) {
                    obj4 = putIfAbsent;
                }
                u0 u0Var2 = (u0) obj4;
                ArrayList arrayList3 = new ArrayList(e0.q.M(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new f0((x0.o) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = u0Var2.f31139a;
                Object obj5 = concurrentHashMap3.get(arrayList3);
                if (obj5 == null) {
                    try {
                        d2 = (k1.a) this.f31115b.invoke(cVar, arrayList);
                    } catch (Throwable th2) {
                        d2 = kotlin.jvm.internal.q.d(th2);
                    }
                    d0.n nVar2 = new d0.n(d2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, nVar2);
                    obj5 = putIfAbsent3 == null ? nVar2 : putIfAbsent3;
                }
                return ((d0.n) obj5).f30137a;
        }
    }
}
