package vc;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class s extends r {

    /* renamed from: b, reason: collision with root package name */
    public final uc.n f26468b;

    public s(uc.n nVar, t tVar) {
        super(tVar);
        this.f26468b = nVar;
    }

    @Override // vc.r
    public final Object d() {
        return this.f26468b.b();
    }

    @Override // vc.r
    public final Object e(Object obj) {
        return obj;
    }

    @Override // vc.r
    public final void f(Object obj, zc.a aVar, q qVar) {
        Object b3 = qVar.f26465g.b(aVar);
        if (b3 != null || !qVar.f26466h) {
            boolean z10 = qVar.f26462d;
            Field field = qVar.f26460b;
            if (z10) {
                v.b(obj, field);
            } else if (qVar.f26467i) {
                throw new com.google.gson.q(vd.e.e("Cannot set value of 'static final' ", xc.c.d(field, false)));
            }
            field.set(obj, b3);
        }
    }
}
