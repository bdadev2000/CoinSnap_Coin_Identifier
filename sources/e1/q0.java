package e1;

/* loaded from: classes4.dex */
public final class q0 implements b1.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f30320a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30321b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30322c;
    public final h0.g d;

    public q0(s0 s0Var, long j2, Object obj, b1.l lVar) {
        this.f30320a = s0Var;
        this.f30321b = j2;
        this.f30322c = obj;
        this.d = lVar;
    }

    @Override // b1.q0
    public final void dispose() {
        s0 s0Var = this.f30320a;
        synchronized (s0Var) {
            if (this.f30321b < s0Var.m()) {
                return;
            }
            Object[] objArr = s0Var.f30337i;
            p0.a.p(objArr);
            long j2 = this.f30321b;
            if (objArr[((int) j2) & (objArr.length - 1)] != this) {
                return;
            }
            t0.d(objArr, j2, t0.f30345a);
            s0Var.h();
        }
    }
}
