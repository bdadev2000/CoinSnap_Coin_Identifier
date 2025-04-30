package p8;

/* loaded from: classes3.dex */
public final class x implements w8.x {
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final w8.f f22485c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22486d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f22487f;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, w8.f] */
    public x(z zVar, boolean z8) {
        G7.j.e(zVar, "this$0");
        this.f22487f = zVar;
        this.b = z8;
        this.f22485c = new Object();
    }

    public final void a(boolean z8) {
        long min;
        boolean z9;
        boolean z10;
        z zVar = this.f22487f;
        synchronized (zVar) {
            zVar.l.h();
            while (zVar.f22496e >= zVar.f22497f && !this.b && !this.f22486d) {
                try {
                    synchronized (zVar) {
                        EnumC2574b enumC2574b = zVar.m;
                        if (enumC2574b != null) {
                            break;
                        } else {
                            zVar.k();
                        }
                    }
                } catch (Throwable th) {
                    zVar.l.l();
                    throw th;
                }
            }
            zVar.l.l();
            zVar.b();
            min = Math.min(zVar.f22497f - zVar.f22496e, this.f22485c.f24014c);
            zVar.f22496e += min;
            if (z8 && min == this.f22485c.f24014c) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z9;
        }
        this.f22487f.l.h();
        try {
            z zVar2 = this.f22487f;
            zVar2.b.k(zVar2.f22493a, z10, this.f22485c, min);
        } finally {
            this.f22487f.l.l();
        }
    }

    @Override // w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z8;
        z zVar = this.f22487f;
        byte[] bArr = j8.b.f21214a;
        synchronized (zVar) {
            if (this.f22486d) {
                return;
            }
            synchronized (zVar) {
                EnumC2574b enumC2574b = zVar.m;
                if (enumC2574b == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            z zVar2 = this.f22487f;
            if (!zVar2.f22501j.b) {
                if (this.f22485c.f24014c > 0) {
                    while (this.f22485c.f24014c > 0) {
                        a(true);
                    }
                } else if (z8) {
                    zVar2.b.k(zVar2.f22493a, true, null, 0L);
                }
            }
            synchronized (this.f22487f) {
                this.f22486d = true;
            }
            this.f22487f.b.flush();
            this.f22487f.a();
        }
    }

    @Override // w8.x
    public final void d(w8.f fVar, long j7) {
        G7.j.e(fVar, "source");
        byte[] bArr = j8.b.f21214a;
        w8.f fVar2 = this.f22485c;
        fVar2.d(fVar, j7);
        while (fVar2.f24014c >= 16384) {
            a(false);
        }
    }

    @Override // w8.x, java.io.Flushable
    public final void flush() {
        z zVar = this.f22487f;
        byte[] bArr = j8.b.f21214a;
        synchronized (zVar) {
            zVar.b();
        }
        while (this.f22485c.f24014c > 0) {
            a(false);
            this.f22487f.b.flush();
        }
    }

    @Override // w8.x
    public final w8.A timeout() {
        return this.f22487f.l;
    }
}
