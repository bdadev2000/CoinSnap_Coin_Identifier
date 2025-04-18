package yg;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class g extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final a f28237d = new a(1);
    public final p6.a a;

    /* renamed from: b, reason: collision with root package name */
    public final f[] f28238b;

    /* renamed from: c, reason: collision with root package name */
    public final o f28239c;

    public g(p6.a aVar, TreeMap treeMap) {
        this.a = aVar;
        this.f28238b = (f[]) treeMap.values().toArray(new f[treeMap.size()]);
        this.f28239c = o.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        try {
            Object m10 = this.a.m();
            try {
                pVar.g();
                while (pVar.p()) {
                    int w10 = pVar.w(this.f28239c);
                    if (w10 == -1) {
                        pVar.x();
                        pVar.T();
                    } else {
                        f fVar = this.f28238b[w10];
                        fVar.f28235b.set(m10, fVar.f28236c.fromJson(pVar));
                    }
                }
                pVar.k();
                return m10;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e10) {
            zg.b.g(e10);
            throw null;
        }
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        try {
            sVar.g();
            for (f fVar : this.f28238b) {
                sVar.k(fVar.a);
                fVar.f28236c.toJson(sVar, fVar.f28235b.get(obj));
            }
            sVar.j();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + ")";
    }
}
