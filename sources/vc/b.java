package vc;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b extends com.google.gson.c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f26413c = new a();
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final x f26414b;

    public b(com.google.gson.n nVar, com.google.gson.c0 c0Var, Class cls) {
        this.f26414b = new x(nVar, c0Var, cls);
        this.a = cls;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.t()) {
            arrayList.add(this.f26414b.b(aVar));
        }
        aVar.p();
        int size = arrayList.size();
        Class cls = this.a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) cls, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(newInstance, i10, arrayList.get(i10));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        if (obj == null) {
            bVar.t();
            return;
        }
        bVar.g();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f26414b.c(bVar, Array.get(obj, i10));
        }
        bVar.p();
    }
}
