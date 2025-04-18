package m;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f21406g = new HashMap();

    @Override // m.g
    public final c a(Object obj) {
        return (c) this.f21406g.get(obj);
    }

    @Override // m.g
    public final Object b(Object obj, Object obj2) {
        c a = a(obj);
        if (a != null) {
            return a.f21409c;
        }
        HashMap hashMap = this.f21406g;
        c cVar = new c(obj, obj2);
        this.f21420f++;
        c cVar2 = this.f21418c;
        if (cVar2 == null) {
            this.f21417b = cVar;
            this.f21418c = cVar;
        } else {
            cVar2.f21410d = cVar;
            cVar.f21411f = cVar2;
            this.f21418c = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }

    @Override // m.g
    public final Object c(Object obj) {
        Object c10 = super.c(obj);
        this.f21406g.remove(obj);
        return c10;
    }
}
