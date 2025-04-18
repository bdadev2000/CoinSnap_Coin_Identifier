package v8;

/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f26188c;

    public /* synthetic */ k0(p0 p0Var, int i10) {
        this.f26187b = i10;
        this.f26188c = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26187b;
        p0 p0Var = this.f26188c;
        switch (i10) {
            case 0:
                p0Var.i();
                return;
            case 1:
                if (!p0Var.N) {
                    v vVar = p0Var.f26239s;
                    vVar.getClass();
                    vVar.b(p0Var);
                    return;
                }
                return;
            default:
                p0Var.H = true;
                return;
        }
    }
}
