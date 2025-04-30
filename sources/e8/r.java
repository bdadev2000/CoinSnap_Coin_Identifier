package e8;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class r extends AbstractC2226a {

    /* renamed from: a, reason: collision with root package name */
    public final a8.b f20188a;

    public r(a8.b bVar) {
        this.f20188a = bVar;
    }

    @Override // e8.AbstractC2226a
    public void f(d8.a aVar, int i9, Object obj, boolean z8) {
        i(i9, obj, aVar.A(getDescriptor(), i9, this.f20188a, null));
    }

    public abstract void i(int i9, Object obj, Object obj2);

    @Override // a8.b
    public void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        int d2 = d(obj);
        c8.g descriptor = getDescriptor();
        d8.b s5 = dVar.s(descriptor, d2);
        Iterator c9 = c(obj);
        for (int i9 = 0; i9 < d2; i9++) {
            s5.m(getDescriptor(), i9, this.f20188a, c9.next());
        }
        s5.c(descriptor);
    }
}
