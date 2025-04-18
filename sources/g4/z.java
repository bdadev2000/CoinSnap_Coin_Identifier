package g4;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class z implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18189b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18190c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f18191d;

    /* renamed from: f, reason: collision with root package name */
    public final y f18192f;

    /* renamed from: g, reason: collision with root package name */
    public final e4.j f18193g;

    /* renamed from: h, reason: collision with root package name */
    public int f18194h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18195i;

    public z(g0 g0Var, boolean z10, boolean z11, e4.j jVar, y yVar) {
        com.bumptech.glide.c.l(g0Var);
        this.f18191d = g0Var;
        this.f18189b = z10;
        this.f18190c = z11;
        this.f18193g = jVar;
        com.bumptech.glide.c.l(yVar);
        this.f18192f = yVar;
    }

    @Override // g4.g0
    public final synchronized void a() {
        if (this.f18194h <= 0) {
            if (!this.f18195i) {
                this.f18195i = true;
                if (this.f18190c) {
                    this.f18191d.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized void b() {
        if (!this.f18195i) {
            this.f18194h++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // g4.g0
    public final Class c() {
        return this.f18191d.c();
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f18194h;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f18194h = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            ((r) this.f18192f).d(this.f18193g, this);
        }
    }

    @Override // g4.g0
    public final Object get() {
        return this.f18191d.get();
    }

    @Override // g4.g0
    public final int getSize() {
        return this.f18191d.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f18189b + ", listener=" + this.f18192f + ", key=" + this.f18193g + ", acquired=" + this.f18194h + ", isRecycled=" + this.f18195i + ", resource=" + this.f18191d + AbstractJsonLexerKt.END_OBJ;
    }
}
