package m3;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements w {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f21584b;

    public /* synthetic */ s(x xVar, int i10) {
        this.a = i10;
        this.f21584b = xVar;
    }

    @Override // m3.w
    public final void run() {
        int i10 = this.a;
        x xVar = this.f21584b;
        switch (i10) {
            case 0:
                xVar.l();
                return;
            default:
                xVar.j();
                return;
        }
    }
}
