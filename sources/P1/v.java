package P1;

/* loaded from: classes.dex */
public final class v implements B {
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2398c;

    /* renamed from: d, reason: collision with root package name */
    public final B f2399d;

    /* renamed from: f, reason: collision with root package name */
    public final u f2400f;

    /* renamed from: g, reason: collision with root package name */
    public final N1.f f2401g;

    /* renamed from: h, reason: collision with root package name */
    public int f2402h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2403i;

    public v(B b, boolean z8, boolean z9, N1.f fVar, u uVar) {
        j2.g.c(b, "Argument must not be null");
        this.f2399d = b;
        this.b = z8;
        this.f2398c = z9;
        this.f2401g = fVar;
        j2.g.c(uVar, "Argument must not be null");
        this.f2400f = uVar;
    }

    @Override // P1.B
    public final synchronized void a() {
        if (this.f2402h <= 0) {
            if (!this.f2403i) {
                this.f2403i = true;
                if (this.f2398c) {
                    this.f2399d.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized void b() {
        if (!this.f2403i) {
            this.f2402h++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // P1.B
    public final Class c() {
        return this.f2399d.c();
    }

    public final void d() {
        boolean z8;
        synchronized (this) {
            int i9 = this.f2402h;
            if (i9 > 0) {
                z8 = true;
                int i10 = i9 - 1;
                this.f2402h = i10;
                if (i10 != 0) {
                    z8 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z8) {
            ((n) this.f2400f).e(this.f2401g, this);
        }
    }

    @Override // P1.B
    public final Object get() {
        return this.f2399d.get();
    }

    @Override // P1.B
    public final int getSize() {
        return this.f2399d.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.b + ", listener=" + this.f2400f + ", key=" + this.f2401g + ", acquired=" + this.f2402h + ", isRecycled=" + this.f2403i + ", resource=" + this.f2399d + '}';
    }
}
