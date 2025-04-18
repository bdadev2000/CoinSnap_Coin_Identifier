package n1;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c1 extends p {

    /* renamed from: b, reason: collision with root package name */
    public final b f31059b;

    public c1(x0.c cVar, k1.a aVar) {
        super(aVar);
        this.f31059b = new b(aVar.b(), 0);
    }

    @Override // k1.a
    public final l1.f b() {
        return this.f31059b;
    }

    @Override // n1.a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        p0.a.s(objArr, "<this>");
        return kotlin.jvm.internal.e.t(objArr);
    }

    @Override // n1.a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        p0.a.s(objArr, "<this>");
        return objArr.length;
    }
}
