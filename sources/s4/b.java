package s4;

/* loaded from: classes.dex */
public final class b implements d, c {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final d f24207b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f24208c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f24209d;

    /* renamed from: e, reason: collision with root package name */
    public int f24210e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f24211f = 3;

    public b(Object obj, d dVar) {
        this.a = obj;
        this.f24207b = dVar;
    }

    @Override // s4.d, s4.c
    public final boolean a() {
        boolean z10;
        synchronized (this.a) {
            if (!this.f24208c.a() && !this.f24209d.a()) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // s4.d
    public final boolean b(c cVar) {
        boolean z10;
        synchronized (this.a) {
            d dVar = this.f24207b;
            if (dVar != null && !dVar.b(this)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // s4.d
    public final boolean c(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.a) {
            d dVar = this.f24207b;
            z10 = false;
            if (dVar != null && !dVar.c(this)) {
                z11 = false;
                if (z11 && cVar.equals(this.f24208c)) {
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
        synchronized (this.a) {
            this.f24210e = 3;
            this.f24208c.clear();
            if (this.f24211f != 3) {
                this.f24211f = 3;
                this.f24209d.clear();
            }
        }
    }

    @Override // s4.d
    public final void d(c cVar) {
        synchronized (this.a) {
            if (!cVar.equals(this.f24209d)) {
                this.f24210e = 5;
                if (this.f24211f != 1) {
                    this.f24211f = 1;
                    this.f24209d.j();
                }
                return;
            }
            this.f24211f = 5;
            d dVar = this.f24207b;
            if (dVar != null) {
                dVar.d(this);
            }
        }
    }

    @Override // s4.d
    public final void e(c cVar) {
        synchronized (this.a) {
            if (cVar.equals(this.f24208c)) {
                this.f24210e = 4;
            } else if (cVar.equals(this.f24209d)) {
                this.f24211f = 4;
            }
            d dVar = this.f24207b;
            if (dVar != null) {
                dVar.e(this);
            }
        }
    }

    @Override // s4.c
    public final boolean f() {
        boolean z10;
        synchronized (this.a) {
            if (this.f24210e == 3 && this.f24211f == 3) {
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
        synchronized (this.a) {
            if (this.f24210e != 4 && this.f24211f != 4) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // s4.d
    public final d getRoot() {
        d dVar;
        synchronized (this.a) {
            d dVar2 = this.f24207b;
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
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        if (!this.f24208c.h(bVar.f24208c) || !this.f24209d.h(bVar.f24209d)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0015, B:13:0x001a, B:16:0x0021, B:18:0x0029, B:23:0x0036), top: B:3:0x0003 }] */
    @Override // s4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(s4.c r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            s4.d r1 = r5.f24207b     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r1 = r1.i(r5)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            if (r1 == 0) goto L36
            int r1 = r5.f24210e     // Catch: java.lang.Throwable -> L38
            r4 = 5
            if (r1 == r4) goto L21
            s4.c r1 = r5.f24208c     // Catch: java.lang.Throwable -> L38
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            goto L33
        L21:
            s4.c r1 = r5.f24209d     // Catch: java.lang.Throwable -> L38
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L32
            int r6 = r5.f24211f     // Catch: java.lang.Throwable -> L38
            r1 = 4
            if (r6 == r1) goto L30
            if (r6 != r4) goto L32
        L30:
            r6 = r3
            goto L33
        L32:
            r6 = r2
        L33:
            if (r6 == 0) goto L36
            r2 = r3
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r2
        L38:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.b.i(s4.c):boolean");
    }

    @Override // s4.c
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.a) {
            z10 = true;
            if (this.f24210e != 1 && this.f24211f != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // s4.c
    public final void j() {
        synchronized (this.a) {
            if (this.f24210e != 1) {
                this.f24210e = 1;
                this.f24208c.j();
            }
        }
    }

    @Override // s4.c
    public final void pause() {
        synchronized (this.a) {
            if (this.f24210e == 1) {
                this.f24210e = 2;
                this.f24208c.pause();
            }
            if (this.f24211f == 1) {
                this.f24211f = 2;
                this.f24209d.pause();
            }
        }
    }
}
