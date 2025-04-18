package v8;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0.c f26075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f26076d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f26077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f26078g;

    public /* synthetic */ b0(f0.c cVar, d0 d0Var, p pVar, u uVar, int i10) {
        this.f26074b = i10;
        this.f26075c = cVar;
        this.f26076d = d0Var;
        this.f26077f = pVar;
        this.f26078g = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26074b;
        u uVar = this.f26078g;
        p pVar = this.f26077f;
        d0 d0Var = this.f26076d;
        f0.c cVar = this.f26075c;
        switch (i10) {
            case 0:
                d0Var.E(cVar.f17515b, (z) cVar.f17516c, pVar, uVar);
                return;
            case 1:
                d0Var.e(cVar.f17515b, (z) cVar.f17516c, pVar, uVar);
                return;
            default:
                d0Var.q(cVar.f17515b, (z) cVar.f17516c, pVar, uVar);
                return;
        }
    }
}
