package e1;

/* loaded from: classes4.dex */
public final class u0 extends f1.d {

    /* renamed from: a, reason: collision with root package name */
    public long f30350a;

    /* renamed from: b, reason: collision with root package name */
    public b1.l f30351b;

    @Override // f1.d
    public final boolean a(f1.b bVar) {
        s0 s0Var = (s0) bVar;
        if (this.f30350a >= 0) {
            return false;
        }
        long j2 = s0Var.f30338j;
        if (j2 < s0Var.f30339k) {
            s0Var.f30339k = j2;
        }
        this.f30350a = j2;
        return true;
    }

    @Override // f1.d
    public final h0.g[] b(f1.b bVar) {
        long j2 = this.f30350a;
        this.f30350a = -1L;
        this.f30351b = null;
        return ((s0) bVar).t(j2);
    }
}
