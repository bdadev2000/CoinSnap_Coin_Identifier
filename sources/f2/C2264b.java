package f2;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2264b implements InterfaceC2266d, InterfaceC2265c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20290a;
    public final InterfaceC2266d b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC2265c f20291c;

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC2265c f20292d;

    /* renamed from: e, reason: collision with root package name */
    public int f20293e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f20294f = 3;

    public C2264b(Object obj, InterfaceC2266d interfaceC2266d) {
        this.f20290a = obj;
        this.b = interfaceC2266d;
    }

    @Override // f2.InterfaceC2266d, f2.InterfaceC2265c
    public final boolean a() {
        boolean z8;
        synchronized (this.f20290a) {
            try {
                if (!this.f20291c.a() && !this.f20292d.a()) {
                    z8 = false;
                }
                z8 = true;
            } finally {
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2266d
    public final boolean b(InterfaceC2265c interfaceC2265c) {
        boolean z8;
        synchronized (this.f20290a) {
            InterfaceC2266d interfaceC2266d = this.b;
            if (interfaceC2266d != null && !interfaceC2266d.b(this)) {
                z8 = false;
            }
            z8 = true;
        }
        return z8;
    }

    @Override // f2.InterfaceC2266d
    public final boolean c(InterfaceC2265c interfaceC2265c) {
        boolean z8;
        boolean z9;
        int i9;
        synchronized (this.f20290a) {
            InterfaceC2266d interfaceC2266d = this.b;
            z8 = false;
            if (interfaceC2266d == null || interfaceC2266d.c(this)) {
                if (this.f20293e != 5) {
                    z9 = interfaceC2265c.equals(this.f20291c);
                } else if (interfaceC2265c.equals(this.f20292d) && ((i9 = this.f20294f) == 4 || i9 == 5)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final void clear() {
        synchronized (this.f20290a) {
            try {
                this.f20293e = 3;
                this.f20291c.clear();
                if (this.f20294f != 3) {
                    this.f20294f = 3;
                    this.f20292d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f2.InterfaceC2266d
    public final void d(InterfaceC2265c interfaceC2265c) {
        synchronized (this.f20290a) {
            try {
                if (!interfaceC2265c.equals(this.f20292d)) {
                    this.f20293e = 5;
                    if (this.f20294f != 1) {
                        this.f20294f = 1;
                        this.f20292d.h();
                    }
                    return;
                }
                this.f20294f = 5;
                InterfaceC2266d interfaceC2266d = this.b;
                if (interfaceC2266d != null) {
                    interfaceC2266d.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f2.InterfaceC2266d
    public final void e(InterfaceC2265c interfaceC2265c) {
        synchronized (this.f20290a) {
            try {
                if (interfaceC2265c.equals(this.f20291c)) {
                    this.f20293e = 4;
                } else if (interfaceC2265c.equals(this.f20292d)) {
                    this.f20294f = 4;
                }
                InterfaceC2266d interfaceC2266d = this.b;
                if (interfaceC2266d != null) {
                    interfaceC2266d.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f2.InterfaceC2265c
    public final boolean f(InterfaceC2265c interfaceC2265c) {
        if (!(interfaceC2265c instanceof C2264b)) {
            return false;
        }
        C2264b c2264b = (C2264b) interfaceC2265c;
        if (!this.f20291c.f(c2264b.f20291c) || !this.f20292d.f(c2264b.f20292d)) {
            return false;
        }
        return true;
    }

    @Override // f2.InterfaceC2265c
    public final boolean g() {
        boolean z8;
        synchronized (this.f20290a) {
            try {
                if (this.f20293e == 3 && this.f20294f == 3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2266d
    public final InterfaceC2266d getRoot() {
        InterfaceC2266d interfaceC2266d;
        synchronized (this.f20290a) {
            try {
                InterfaceC2266d interfaceC2266d2 = this.b;
                if (interfaceC2266d2 != null) {
                    interfaceC2266d = interfaceC2266d2.getRoot();
                } else {
                    interfaceC2266d = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2266d;
    }

    @Override // f2.InterfaceC2265c
    public final void h() {
        synchronized (this.f20290a) {
            try {
                if (this.f20293e != 1) {
                    this.f20293e = 1;
                    this.f20291c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f2.InterfaceC2265c
    public final boolean i() {
        boolean z8;
        synchronized (this.f20290a) {
            try {
                if (this.f20293e != 4 && this.f20294f != 4) {
                    z8 = false;
                }
                z8 = true;
            } finally {
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f20290a) {
            try {
                z8 = true;
                if (this.f20293e != 1 && this.f20294f != 1) {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2266d
    public final boolean j(InterfaceC2265c interfaceC2265c) {
        boolean z8;
        synchronized (this.f20290a) {
            InterfaceC2266d interfaceC2266d = this.b;
            if ((interfaceC2266d == null || interfaceC2266d.j(this)) && interfaceC2265c.equals(this.f20291c)) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final void pause() {
        synchronized (this.f20290a) {
            try {
                if (this.f20293e == 1) {
                    this.f20293e = 2;
                    this.f20291c.pause();
                }
                if (this.f20294f == 1) {
                    this.f20294f = 2;
                    this.f20292d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
