package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23510a;
    public final /* synthetic */ v b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23511c;

    public /* synthetic */ o(v vVar, int i9, int i10) {
        this.f23510a = i10;
        this.b = vVar;
        this.f23511c = i9;
    }

    @Override // v1.u
    public final void run() {
        switch (this.f23510a) {
            case 0:
                this.b.n(this.f23511c);
                return;
            case 1:
                this.b.q(this.f23511c);
                return;
            default:
                this.b.m(this.f23511c);
                return;
        }
    }
}
