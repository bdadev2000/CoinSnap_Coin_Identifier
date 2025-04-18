package n1;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class p extends a {

    /* renamed from: a, reason: collision with root package name */
    public final k1.a f31119a;

    public p(k1.a aVar) {
        this.f31119a = aVar;
    }

    @Override // k1.a
    public void a(p0.a aVar, Object obj) {
        p0.a.s(aVar, "encoder");
        int d = d(obj);
        p0.a.s(b(), "descriptor");
        Iterator c2 = c(obj);
        for (int i2 = 0; i2 < d; i2++) {
            aVar.Y(b(), i2, this.f31119a, c2.next());
        }
    }
}
