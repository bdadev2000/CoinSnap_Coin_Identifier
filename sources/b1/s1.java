package b1;

/* loaded from: classes2.dex */
public final class s1 extends j0 {
    public final h0.g d;

    public s1(h0.l lVar, q0.p pVar) {
        super(lVar, false);
        this.d = f0.j(this, this, pVar);
    }

    @Override // b1.r1
    public final void h0() {
        try {
            g1.a.c(f0.r(this.d), d0.b0.f30125a, null);
        } catch (Throwable th) {
            resumeWith(kotlin.jvm.internal.q.d(th));
            throw th;
        }
    }
}
