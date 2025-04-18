package m3;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements w {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f21580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f21581c;

    public /* synthetic */ q(x xVar, float f10, int i10) {
        this.a = i10;
        this.f21580b = xVar;
        this.f21581c = f10;
    }

    @Override // m3.w
    public final void run() {
        int i10 = this.a;
        float f10 = this.f21581c;
        x xVar = this.f21580b;
        switch (i10) {
            case 0:
                xVar.u(f10);
                return;
            case 1:
                xVar.t(f10);
                return;
            default:
                xVar.p(f10);
                return;
        }
    }
}
