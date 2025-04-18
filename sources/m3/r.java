package m3;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements w {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f21582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21583c;

    public /* synthetic */ r(x xVar, int i10, int i11) {
        this.a = i11;
        this.f21582b = xVar;
        this.f21583c = i10;
    }

    @Override // m3.w
    public final void run() {
        int i10 = this.a;
        int i11 = this.f21583c;
        x xVar = this.f21582b;
        switch (i10) {
            case 0:
                xVar.r(i11);
                return;
            case 1:
                xVar.n(i11);
                return;
            default:
                xVar.m(i11);
                return;
        }
    }
}
