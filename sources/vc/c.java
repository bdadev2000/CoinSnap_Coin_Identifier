package vc;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c extends com.google.gson.c0 {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26415b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26416c;

    public c(com.google.gson.n nVar, Type type, com.google.gson.c0 c0Var, uc.n nVar2) {
        this.f26415b = new x(nVar, c0Var, type);
        this.f26416c = nVar2;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        int i10 = this.a;
        Object obj = this.f26415b;
        Object obj2 = this.f26416c;
        switch (i10) {
            case 0:
                if (aVar.b0() == 9) {
                    aVar.X();
                    return null;
                }
                Collection collection = (Collection) ((uc.n) obj2).b();
                aVar.d();
                while (aVar.t()) {
                    collection.add(((com.google.gson.c0) obj).b(aVar));
                }
                aVar.p();
                return collection;
            default:
                Object b3 = ((u0) obj2).f26477d.b(aVar);
                if (b3 != null) {
                    Class cls = (Class) obj;
                    if (!cls.isInstance(b3)) {
                        throw new com.google.gson.v("Expected a " + cls.getName() + " but was " + b3.getClass().getName() + "; at path " + aVar.s(true));
                    }
                }
                return b3;
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    bVar.t();
                    return;
                }
                bVar.g();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((com.google.gson.c0) this.f26415b).c(bVar, it.next());
                }
                bVar.p();
                return;
            default:
                ((u0) this.f26416c).f26477d.c(bVar, obj);
                return;
        }
    }

    public c(u0 u0Var, Class cls) {
        this.f26416c = u0Var;
        this.f26415b = cls;
    }
}
