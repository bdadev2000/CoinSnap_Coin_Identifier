package b1;

/* loaded from: classes2.dex */
public final class t0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final k f22376c;
    public final /* synthetic */ x0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, long j2, l lVar) {
        super(j2);
        this.d = x0Var;
        this.f22376c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22376c.E(this.d);
    }

    @Override // b1.v0
    public final String toString() {
        return super.toString() + this.f22376c;
    }
}
