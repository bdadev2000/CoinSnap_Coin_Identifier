package m3;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements w {
    public final /* synthetic */ x a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21591c;

    public /* synthetic */ v(x xVar, int i10, int i11) {
        this.a = xVar;
        this.f21590b = i10;
        this.f21591c = i11;
    }

    @Override // m3.w
    public final void run() {
        x xVar = this.a;
        j jVar = xVar.f21592b;
        int i10 = this.f21590b;
        int i11 = this.f21591c;
        if (jVar == null) {
            xVar.f21597h.add(new v(xVar, i10, i11));
        } else {
            xVar.f21593c.t(i10, i11 + 0.99f);
        }
    }
}
