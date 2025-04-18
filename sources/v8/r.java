package v8;

import s7.v2;
import s7.w2;
import s7.x2;

/* loaded from: classes3.dex */
public final class r extends n {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f26257g = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f26258d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f26259f;

    public r(x2 x2Var, Object obj, Object obj2) {
        super(x2Var);
        this.f26258d = obj;
        this.f26259f = obj2;
    }

    @Override // v8.n, s7.x2
    public final int b(Object obj) {
        Object obj2;
        if (f26257g.equals(obj) && (obj2 = this.f26259f) != null) {
            obj = obj2;
        }
        return this.f26213c.b(obj);
    }

    @Override // v8.n, s7.x2
    public final v2 f(int i10, v2 v2Var, boolean z10) {
        this.f26213c.f(i10, v2Var, z10);
        if (n9.h0.a(v2Var.f24786c, this.f26259f) && z10) {
            v2Var.f24786c = f26257g;
        }
        return v2Var;
    }

    @Override // v8.n, s7.x2
    public final Object l(int i10) {
        Object l10 = this.f26213c.l(i10);
        if (n9.h0.a(l10, this.f26259f)) {
            return f26257g;
        }
        return l10;
    }

    @Override // v8.n, s7.x2
    public final w2 n(int i10, w2 w2Var, long j3) {
        this.f26213c.n(i10, w2Var, j3);
        if (n9.h0.a(w2Var.f24839b, this.f26258d)) {
            w2Var.f24839b = w2.f24833t;
        }
        return w2Var;
    }
}
