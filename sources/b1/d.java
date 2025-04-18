package b1;

/* loaded from: classes4.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f22295a;

    public d(c[] cVarArr) {
        this.f22295a = cVarArr;
    }

    @Override // b1.j
    public final void b(Throwable th) {
        c();
    }

    public final void c() {
        for (c cVar : this.f22295a) {
            q0 q0Var = cVar.f22291g;
            if (q0Var == null) {
                p0.a.B0("handle");
                throw null;
            }
            q0Var.dispose();
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        c();
        return d0.b0.f30125a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f22295a + ']';
    }
}
