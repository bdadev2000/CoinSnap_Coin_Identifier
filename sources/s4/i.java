package s4;

/* loaded from: classes.dex */
public final class i implements d, c {
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24236b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f24237c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f24238d;

    /* renamed from: e, reason: collision with root package name */
    public int f24239e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f24240f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24241g;

    public i(Object obj, d dVar) {
        this.f24236b = obj;
        this.a = dVar;
    }

    @Override // s4.d, s4.c
    public final boolean a() {
        boolean z10;
        synchronized (this.f24236b) {
            if (!this.f24238d.a() && !this.f24237c.a()) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // s4.d
    public final boolean b(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f24236b) {
            d dVar = this.a;
            z10 = false;
            if (dVar != null && !dVar.b(this)) {
                z11 = false;
                if (z11 && (cVar.equals(this.f24237c) || this.f24239e != 4)) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // s4.d
    public final boolean c(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f24236b) {
            d dVar = this.a;
            z10 = false;
            if (dVar != null && !dVar.c(this)) {
                z11 = false;
                if (z11 && cVar.equals(this.f24237c) && this.f24239e != 2) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // s4.c
    public final void clear() {
        synchronized (this.f24236b) {
            this.f24241g = false;
            this.f24239e = 3;
            this.f24240f = 3;
            this.f24238d.clear();
            this.f24237c.clear();
        }
    }

    @Override // s4.d
    public final void d(c cVar) {
        synchronized (this.f24236b) {
            if (!cVar.equals(this.f24237c)) {
                this.f24240f = 5;
                return;
            }
            this.f24239e = 5;
            d dVar = this.a;
            if (dVar != null) {
                dVar.d(this);
            }
        }
    }

    @Override // s4.d
    public final void e(c cVar) {
        synchronized (this.f24236b) {
            if (cVar.equals(this.f24238d)) {
                this.f24240f = 4;
                return;
            }
            this.f24239e = 4;
            d dVar = this.a;
            if (dVar != null) {
                dVar.e(this);
            }
            if (!kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.a(this.f24240f)) {
                this.f24238d.clear();
            }
        }
    }

    @Override // s4.c
    public final boolean f() {
        boolean z10;
        synchronized (this.f24236b) {
            if (this.f24239e == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // s4.c
    public final boolean g() {
        boolean z10;
        synchronized (this.f24236b) {
            if (this.f24239e == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // s4.d
    public final d getRoot() {
        d dVar;
        synchronized (this.f24236b) {
            d dVar2 = this.a;
            if (dVar2 != null) {
                dVar = dVar2.getRoot();
            } else {
                dVar = this;
            }
        }
        return dVar;
    }

    @Override // s4.c
    public final boolean h(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f24237c == null) {
            if (iVar.f24237c != null) {
                return false;
            }
        } else if (!this.f24237c.h(iVar.f24237c)) {
            return false;
        }
        if (this.f24238d == null) {
            if (iVar.f24238d != null) {
                return false;
            }
        } else if (!this.f24238d.h(iVar.f24238d)) {
            return false;
        }
        return true;
    }

    @Override // s4.d
    public final boolean i(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f24236b) {
            d dVar = this.a;
            z10 = false;
            if (dVar != null && !dVar.i(this)) {
                z11 = false;
                if (z11 && cVar.equals(this.f24237c) && !a()) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // s4.c
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f24236b) {
            z10 = true;
            if (this.f24239e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // s4.c
    public final void j() {
        synchronized (this.f24236b) {
            this.f24241g = true;
            try {
                if (this.f24239e != 4 && this.f24240f != 1) {
                    this.f24240f = 1;
                    this.f24238d.j();
                }
                if (this.f24241g && this.f24239e != 1) {
                    this.f24239e = 1;
                    this.f24237c.j();
                }
            } finally {
                this.f24241g = false;
            }
        }
    }

    @Override // s4.c
    public final void pause() {
        synchronized (this.f24236b) {
            if (!kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.a(this.f24240f)) {
                this.f24240f = 2;
                this.f24238d.pause();
            }
            if (!kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.a(this.f24239e)) {
                this.f24239e = 2;
                this.f24237c.pause();
            }
        }
    }
}
