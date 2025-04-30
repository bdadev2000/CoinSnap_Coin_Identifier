package p8;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f22493a;
    public final s b;

    /* renamed from: c, reason: collision with root package name */
    public long f22494c;

    /* renamed from: d, reason: collision with root package name */
    public long f22495d;

    /* renamed from: e, reason: collision with root package name */
    public long f22496e;

    /* renamed from: f, reason: collision with root package name */
    public long f22497f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f22498g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22499h;

    /* renamed from: i, reason: collision with root package name */
    public final y f22500i;

    /* renamed from: j, reason: collision with root package name */
    public final x f22501j;

    /* renamed from: k, reason: collision with root package name */
    public final m8.h f22502k;
    public final m8.h l;
    public EnumC2574b m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f22503n;

    public z(int i9, s sVar, boolean z8, boolean z9, i8.s sVar2) {
        G7.j.e(sVar, "connection");
        this.f22493a = i9;
        this.b = sVar;
        this.f22497f = sVar.f22463u.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f22498g = arrayDeque;
        this.f22500i = new y(this, sVar.f22462t.a(), z9);
        this.f22501j = new x(this, z8);
        this.f22502k = new m8.h(this);
        this.l = new m8.h(this);
        if (sVar2 != null) {
            if (!g()) {
                arrayDeque.add(sVar2);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        }
        if (g()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z8;
        boolean h6;
        byte[] bArr = j8.b.f21214a;
        synchronized (this) {
            y yVar = this.f22500i;
            if (!yVar.f22488c && yVar.f22491g) {
                x xVar = this.f22501j;
                if (xVar.b || xVar.f22486d) {
                    z8 = true;
                    h6 = h();
                }
            }
            z8 = false;
            h6 = h();
        }
        if (z8) {
            c(EnumC2574b.CANCEL, null);
        } else if (!h6) {
            this.b.h(this.f22493a);
        }
    }

    public final void b() {
        x xVar = this.f22501j;
        if (!xVar.f22486d) {
            if (!xVar.b) {
                if (this.m != null) {
                    IOException iOException = this.f22503n;
                    if (iOException == null) {
                        EnumC2574b enumC2574b = this.m;
                        G7.j.b(enumC2574b);
                        throw new E(enumC2574b);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(EnumC2574b enumC2574b, IOException iOException) {
        if (!d(enumC2574b, iOException)) {
            return;
        }
        s sVar = this.b;
        sVar.getClass();
        sVar.f22445A.j(this.f22493a, enumC2574b);
    }

    public final boolean d(EnumC2574b enumC2574b, IOException iOException) {
        EnumC2574b enumC2574b2;
        byte[] bArr = j8.b.f21214a;
        synchronized (this) {
            synchronized (this) {
                enumC2574b2 = this.m;
            }
        }
        if (enumC2574b2 != null) {
            return false;
        }
        if (this.f22500i.f22488c && this.f22501j.b) {
            return false;
        }
        this.m = enumC2574b;
        this.f22503n = iOException;
        notifyAll();
        this.b.h(this.f22493a);
        return true;
    }

    public final void e(EnumC2574b enumC2574b) {
        if (!d(enumC2574b, null)) {
            return;
        }
        this.b.l(this.f22493a, enumC2574b);
    }

    public final x f() {
        synchronized (this) {
            if (!this.f22499h && !g()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f22501j;
    }

    public final boolean g() {
        boolean z8;
        if ((this.f22493a & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.b.b == z8) {
            return true;
        }
        return false;
    }

    public final synchronized boolean h() {
        if (this.m != null) {
            return false;
        }
        y yVar = this.f22500i;
        if (yVar.f22488c || yVar.f22491g) {
            x xVar = this.f22501j;
            if (xVar.b || xVar.f22486d) {
                if (this.f22499h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(i8.s r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            G7.j.e(r3, r0)
            byte[] r0 = j8.b.f21214a
            monitor-enter(r2)
            boolean r0 = r2.f22499h     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            p8.y r3 = r2.f22500i     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L37
        L18:
            r2.f22499h = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f22498g     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            p8.y r3 = r2.f22500i     // Catch: java.lang.Throwable -> L16
            r3.f22488c = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L36
            p8.s r3 = r2.b
            int r4 = r2.f22493a
            r3.h(r4)
        L36:
            return
        L37:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.z.i(i8.s, boolean):void");
    }

    public final synchronized void j(EnumC2574b enumC2574b) {
        if (this.m == null) {
            this.m = enumC2574b;
            notifyAll();
        }
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
