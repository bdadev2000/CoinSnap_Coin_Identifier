package e8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import u7.AbstractC2815f;

/* loaded from: classes3.dex */
public final class e0 extends r {
    public final M7.b b;

    /* renamed from: c, reason: collision with root package name */
    public final C2227b f20161c;

    public e0(G7.e eVar, a8.b bVar) {
        super(bVar);
        this.b = eVar;
        c8.g descriptor = bVar.getDescriptor();
        G7.j.e(descriptor, "elementDesc");
        this.f20161c = new C2227b(descriptor, 0);
    }

    @Override // e8.AbstractC2226a
    public final Object a() {
        return new ArrayList();
    }

    @Override // e8.AbstractC2226a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        G7.j.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // e8.AbstractC2226a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        G7.j.e(objArr, "<this>");
        return G7.j.h(objArr);
    }

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        G7.j.e(objArr, "<this>");
        return objArr.length;
    }

    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        G7.j.e(null, "<this>");
        AbstractC2815f.t(null);
        throw null;
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return this.f20161c;
    }

    @Override // e8.AbstractC2226a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        G7.j.e(arrayList, "<this>");
        M7.b bVar = this.b;
        G7.j.e(bVar, "eClass");
        Object newInstance = Array.newInstance((Class<?>) com.facebook.appevents.g.n(bVar), arrayList.size());
        G7.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        G7.j.d(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }

    @Override // e8.r
    public final void i(int i9, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        G7.j.e(arrayList, "<this>");
        arrayList.add(i9, obj2);
    }
}
