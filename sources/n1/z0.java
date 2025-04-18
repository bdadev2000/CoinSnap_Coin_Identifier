package n1;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class z0 extends p {

    /* renamed from: b, reason: collision with root package name */
    public final y0 f31162b;

    public z0(k1.a aVar) {
        super(aVar);
        this.f31162b = new y0(aVar.b());
    }

    @Override // n1.p, k1.a
    public final void a(p0.a aVar, Object obj) {
        p0.a.s(aVar, "encoder");
        int d = d(obj);
        p0.a.s(this.f31162b, "descriptor");
        e(aVar, obj, d);
    }

    @Override // k1.a
    public final l1.f b() {
        return this.f31162b;
    }

    @Override // n1.a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    public abstract void e(p0.a aVar, Object obj, int i2);
}
