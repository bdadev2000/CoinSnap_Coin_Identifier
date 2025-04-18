package y0;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31451a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31452b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.l f31453c;

    public r(j jVar, q0.l lVar, int i2) {
        this.f31451a = i2;
        if (i2 != 1) {
            p0.a.s(jVar, "sequence");
            p0.a.s(lVar, "predicate");
            this.f31452b = jVar;
            this.f31453c = lVar;
            return;
        }
        p0.a.s(jVar, "sequence");
        p0.a.s(lVar, "transformer");
        this.f31452b = jVar;
        this.f31453c = lVar;
    }

    @Override // y0.j
    public final Iterator iterator() {
        switch (this.f31451a) {
            case 0:
                return new e(this);
            case 1:
                return new s(this);
            default:
                return new i(this);
        }
    }

    public r(g.b bVar, q0.l lVar) {
        this.f31451a = 2;
        this.f31452b = bVar;
        this.f31453c = lVar;
    }
}
