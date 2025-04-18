package b1;

/* loaded from: classes3.dex */
public abstract class y0 extends z {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f22396g = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f22397c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public e0.n f22398f;

    public final void l0(boolean z2) {
        long j2 = this.f22397c - (z2 ? 4294967296L : 1L);
        this.f22397c = j2;
        if (j2 <= 0 && this.d) {
            shutdown();
        }
    }

    public final void m0(n0 n0Var) {
        e0.n nVar = this.f22398f;
        if (nVar == null) {
            nVar = new e0.n();
            this.f22398f = nVar;
        }
        nVar.addLast(n0Var);
    }

    public abstract Thread n0();

    public final void o0(boolean z2) {
        this.f22397c = (z2 ? 4294967296L : 1L) + this.f22397c;
        if (z2) {
            return;
        }
        this.d = true;
    }

    public final boolean p0() {
        return this.f22397c >= 4294967296L;
    }

    public abstract long q0();

    public final boolean r0() {
        e0.n nVar = this.f22398f;
        if (nVar == null) {
            return false;
        }
        n0 n0Var = (n0) (nVar.isEmpty() ? null : nVar.removeFirst());
        if (n0Var == null) {
            return false;
        }
        n0Var.run();
        return true;
    }

    public void s0(long j2, v0 v0Var) {
        g0.f22320k.w0(j2, v0Var);
    }

    public abstract void shutdown();
}
