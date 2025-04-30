package e8;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class b0 extends r {
    public final a0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a8.b bVar) {
        super(bVar);
        G7.j.e(bVar, "primitiveSerializer");
        this.b = new a0(bVar.getDescriptor());
    }

    @Override // e8.AbstractC2226a
    public final Object a() {
        return (Z) g(j());
    }

    @Override // e8.AbstractC2226a
    public final int b(Object obj) {
        Z z8 = (Z) obj;
        G7.j.e(z8, "<this>");
        return z8.d();
    }

    @Override // e8.AbstractC2226a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // e8.AbstractC2226a, a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return e(cVar);
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return this.b;
    }

    @Override // e8.AbstractC2226a
    public final Object h(Object obj) {
        Z z8 = (Z) obj;
        G7.j.e(z8, "<this>");
        return z8.a();
    }

    @Override // e8.r
    public final void i(int i9, Object obj, Object obj2) {
        G7.j.e((Z) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Object j();

    public abstract void k(d8.b bVar, Object obj, int i9);

    @Override // e8.r, a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        int d2 = d(obj);
        a0 a0Var = this.b;
        d8.b s5 = dVar.s(a0Var, d2);
        k(s5, obj, d2);
        s5.c(a0Var);
    }
}
