package b1;

/* loaded from: classes3.dex */
public final class m1 extends l {

    /* renamed from: j, reason: collision with root package name */
    public final r1 f22346j;

    public m1(h0.g gVar, r1 r1Var) {
        super(1, gVar);
        this.f22346j = r1Var;
    }

    @Override // b1.l
    public final Throwable n(r1 r1Var) {
        Throwable b2;
        Object T = this.f22346j.T();
        return (!(T instanceof o1) || (b2 = ((o1) T).b()) == null) ? T instanceof u ? ((u) T).f22378a : r1Var.n() : b2;
    }

    @Override // b1.l
    public final String v() {
        return "AwaitContinuation";
    }
}
