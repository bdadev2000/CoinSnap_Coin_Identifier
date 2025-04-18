package y0;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f31437a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.l f31438b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.l f31439c;

    public h(j jVar, q0.l lVar) {
        p pVar = p.f31447a;
        p0.a.s(jVar, "sequence");
        this.f31437a = jVar;
        this.f31438b = lVar;
        this.f31439c = pVar;
    }

    @Override // y0.j
    public final Iterator iterator() {
        return new g(this);
    }
}
