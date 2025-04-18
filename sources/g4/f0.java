package g4;

/* loaded from: classes.dex */
public final class f0 implements g0, x4.b {

    /* renamed from: g, reason: collision with root package name */
    public static final h.c f18060g = p6.a.w(20, new com.facebook.b(10));

    /* renamed from: b, reason: collision with root package name */
    public final x4.d f18061b = new x4.d();

    /* renamed from: c, reason: collision with root package name */
    public g0 f18062c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18063d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18064f;

    @Override // g4.g0
    public final synchronized void a() {
        this.f18061b.a();
        this.f18064f = true;
        if (!this.f18063d) {
            this.f18062c.a();
            this.f18062c = null;
            f18060g.c(this);
        }
    }

    @Override // x4.b
    public final x4.d b() {
        return this.f18061b;
    }

    @Override // g4.g0
    public final Class c() {
        return this.f18062c.c();
    }

    public final synchronized void d() {
        this.f18061b.a();
        if (this.f18063d) {
            this.f18063d = false;
            if (this.f18064f) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // g4.g0
    public final Object get() {
        return this.f18062c.get();
    }

    @Override // g4.g0
    public final int getSize() {
        return this.f18062c.getSize();
    }
}
