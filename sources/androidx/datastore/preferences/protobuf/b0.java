package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class b0 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f1330b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f1331c;

    public b0(e0 e0Var) {
        this.f1330b = e0Var;
        if (!e0Var.j()) {
            this.f1331c = (e0) e0Var.f();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void d(e0 e0Var, b bVar) {
        h1 h1Var = h1.f1372c;
        h1Var.getClass();
        h1Var.a(e0Var.getClass()).mergeFrom(e0Var, bVar);
    }

    public final e0 a() {
        e0 b3 = b();
        b3.getClass();
        if (e0.i(b3, true)) {
            return b3;
        }
        throw new r1();
    }

    public final e0 b() {
        if (!this.f1331c.j()) {
            return this.f1331c;
        }
        e0 e0Var = this.f1331c;
        e0Var.getClass();
        h1 h1Var = h1.f1372c;
        h1Var.getClass();
        h1Var.a(e0Var.getClass()).makeImmutable(e0Var);
        e0Var.k();
        return this.f1331c;
    }

    public final void c() {
        if (!this.f1331c.j()) {
            e0 e0Var = (e0) this.f1330b.f();
            d(e0Var, this.f1331c);
            this.f1331c = e0Var;
        }
    }

    public final Object clone() {
        b0 b0Var = (b0) this.f1330b.e(d0.NEW_BUILDER);
        b0Var.f1331c = b();
        return b0Var;
    }
}
