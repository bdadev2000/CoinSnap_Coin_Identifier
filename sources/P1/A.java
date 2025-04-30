package P1;

import k2.InterfaceC2430b;

/* loaded from: classes.dex */
public final class A implements B, InterfaceC2430b {

    /* renamed from: g, reason: collision with root package name */
    public static final C.c f2267g = k2.d.a(20, new R3.e(8));
    public final k2.e b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public B f2268c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2269d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2270f;

    @Override // P1.B
    public final synchronized void a() {
        this.b.a();
        this.f2270f = true;
        if (!this.f2269d) {
            this.f2268c.a();
            this.f2268c = null;
            f2267g.b(this);
        }
    }

    @Override // k2.InterfaceC2430b
    public final k2.e b() {
        return this.b;
    }

    @Override // P1.B
    public final Class c() {
        return this.f2268c.c();
    }

    public final synchronized void d() {
        this.b.a();
        if (this.f2269d) {
            this.f2269d = false;
            if (this.f2270f) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // P1.B
    public final Object get() {
        return this.f2268c.get();
    }

    @Override // P1.B
    public final int getSize() {
        return this.f2268c.getSize();
    }
}
