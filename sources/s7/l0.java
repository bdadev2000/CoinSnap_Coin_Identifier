package s7;

/* loaded from: classes3.dex */
public final class l0 {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public a2 f24510b;

    /* renamed from: c, reason: collision with root package name */
    public int f24511c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24512d;

    /* renamed from: e, reason: collision with root package name */
    public int f24513e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24514f;

    /* renamed from: g, reason: collision with root package name */
    public int f24515g;

    public l0(a2 a2Var) {
        this.f24510b = a2Var;
    }

    public final void a(int i10) {
        boolean z10;
        boolean z11 = this.a;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.a = z11 | z10;
        this.f24511c += i10;
    }
}
