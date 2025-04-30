package f2;

import com.mbridge.msdk.foundation.entity.o;

/* renamed from: f2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2270h implements InterfaceC2266d, InterfaceC2265c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2266d f20321a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC2265c f20322c;

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC2265c f20323d;

    /* renamed from: e, reason: collision with root package name */
    public int f20324e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f20325f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20326g;

    public C2270h(Object obj, InterfaceC2266d interfaceC2266d) {
        this.b = obj;
        this.f20321a = interfaceC2266d;
    }

    @Override // f2.InterfaceC2266d, f2.InterfaceC2265c
    public final boolean a() {
        boolean z8;
        synchronized (this.b) {
            try {
                if (!this.f20323d.a() && !this.f20322c.a()) {
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
        synchronized (this.b) {
            try {
                InterfaceC2266d interfaceC2266d = this.f20321a;
                if ((interfaceC2266d != null && !interfaceC2266d.b(this)) || (!interfaceC2265c.equals(this.f20322c) && this.f20324e == 4)) {
                    z8 = false;
                }
                z8 = true;
            } finally {
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2266d
    public final boolean c(InterfaceC2265c interfaceC2265c) {
        boolean z8;
        synchronized (this.b) {
            try {
                InterfaceC2266d interfaceC2266d = this.f20321a;
                if ((interfaceC2266d == null || interfaceC2266d.c(this)) && interfaceC2265c.equals(this.f20322c) && !a()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final void clear() {
        synchronized (this.b) {
            this.f20326g = false;
            this.f20324e = 3;
            this.f20325f = 3;
            this.f20323d.clear();
            this.f20322c.clear();
        }
    }

    @Override // f2.InterfaceC2266d
    public final void d(InterfaceC2265c interfaceC2265c) {
        synchronized (this.b) {
            try {
                if (!interfaceC2265c.equals(this.f20322c)) {
                    this.f20325f = 5;
                    return;
                }
                this.f20324e = 5;
                InterfaceC2266d interfaceC2266d = this.f20321a;
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
        synchronized (this.b) {
            try {
                if (interfaceC2265c.equals(this.f20323d)) {
                    this.f20325f = 4;
                    return;
                }
                this.f20324e = 4;
                InterfaceC2266d interfaceC2266d = this.f20321a;
                if (interfaceC2266d != null) {
                    interfaceC2266d.e(this);
                }
                if (!o.d(this.f20325f)) {
                    this.f20323d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f2.InterfaceC2265c
    public final boolean f(InterfaceC2265c interfaceC2265c) {
        if (!(interfaceC2265c instanceof C2270h)) {
            return false;
        }
        C2270h c2270h = (C2270h) interfaceC2265c;
        if (this.f20322c == null) {
            if (c2270h.f20322c != null) {
                return false;
            }
        } else if (!this.f20322c.f(c2270h.f20322c)) {
            return false;
        }
        if (this.f20323d == null) {
            if (c2270h.f20323d != null) {
                return false;
            }
        } else if (!this.f20323d.f(c2270h.f20323d)) {
            return false;
        }
        return true;
    }

    @Override // f2.InterfaceC2265c
    public final boolean g() {
        boolean z8;
        synchronized (this.b) {
            if (this.f20324e == 3) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2266d
    public final InterfaceC2266d getRoot() {
        InterfaceC2266d interfaceC2266d;
        synchronized (this.b) {
            try {
                InterfaceC2266d interfaceC2266d2 = this.f20321a;
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
        synchronized (this.b) {
            try {
                this.f20326g = true;
                try {
                    if (this.f20324e != 4 && this.f20325f != 1) {
                        this.f20325f = 1;
                        this.f20323d.h();
                    }
                    if (this.f20326g && this.f20324e != 1) {
                        this.f20324e = 1;
                        this.f20322c.h();
                    }
                    this.f20326g = false;
                } catch (Throwable th) {
                    this.f20326g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f2.InterfaceC2265c
    public final boolean i() {
        boolean z8;
        synchronized (this.b) {
            if (this.f20324e == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.b) {
            z8 = true;
            if (this.f20324e != 1) {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2266d
    public final boolean j(InterfaceC2265c interfaceC2265c) {
        boolean z8;
        synchronized (this.b) {
            try {
                InterfaceC2266d interfaceC2266d = this.f20321a;
                if ((interfaceC2266d == null || interfaceC2266d.j(this)) && interfaceC2265c.equals(this.f20322c) && this.f20324e != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!o.d(this.f20325f)) {
                    this.f20325f = 2;
                    this.f20323d.pause();
                }
                if (!o.d(this.f20324e)) {
                    this.f20324e = 2;
                    this.f20322c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
