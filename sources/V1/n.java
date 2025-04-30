package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23508a;
    public final /* synthetic */ v b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23509c;

    public /* synthetic */ n(v vVar, String str, int i9) {
        this.f23508a = i9;
        this.b = vVar;
        this.f23509c = str;
    }

    @Override // v1.u
    public final void run() {
        switch (this.f23508a) {
            case 0:
                this.b.p(this.f23509c);
                return;
            case 1:
                this.b.o(this.f23509c);
                return;
            default:
                this.b.r(this.f23509c);
                return;
        }
    }
}
