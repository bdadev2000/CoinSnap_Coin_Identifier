package q;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public int f22566a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f22567c;

    /* renamed from: d, reason: collision with root package name */
    public int f22568d;

    /* renamed from: e, reason: collision with root package name */
    public int f22569e;

    /* renamed from: f, reason: collision with root package name */
    public int f22570f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22572h;

    public final void a(int i9, int i10) {
        this.f22567c = i9;
        this.f22568d = i10;
        this.f22572h = true;
        if (this.f22571g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f22566a = i10;
            }
            if (i9 != Integer.MIN_VALUE) {
                this.b = i9;
                return;
            }
            return;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f22566a = i9;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.b = i10;
        }
    }
}
