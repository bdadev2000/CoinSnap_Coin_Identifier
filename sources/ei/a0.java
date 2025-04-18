package ei;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final t f17362b;

    /* renamed from: c, reason: collision with root package name */
    public long f17363c;

    /* renamed from: d, reason: collision with root package name */
    public long f17364d;

    /* renamed from: e, reason: collision with root package name */
    public long f17365e;

    /* renamed from: f, reason: collision with root package name */
    public long f17366f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f17367g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17368h;

    /* renamed from: i, reason: collision with root package name */
    public final y f17369i;

    /* renamed from: j, reason: collision with root package name */
    public final x f17370j;

    /* renamed from: k, reason: collision with root package name */
    public final z f17371k;

    /* renamed from: l, reason: collision with root package name */
    public final z f17372l;

    /* renamed from: m, reason: collision with root package name */
    public b f17373m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f17374n;

    public a0(int i10, t connection, boolean z10, boolean z11, wh.z zVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.a = i10;
        this.f17362b = connection;
        this.f17366f = connection.u.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f17367g = arrayDeque;
        this.f17369i = new y(this, connection.f17473t.a(), z11);
        this.f17370j = new x(this, z10);
        this.f17371k = new z(this);
        this.f17372l = new z(this);
        if (zVar != null) {
            if (!g()) {
                arrayDeque.add(zVar);
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
        boolean z10;
        boolean h10;
        byte[] bArr = xh.b.a;
        synchronized (this) {
            y yVar = this.f17369i;
            if (!yVar.f17502c && yVar.f17505g) {
                x xVar = this.f17370j;
                if (xVar.f17497b || xVar.f17499d) {
                    z10 = true;
                    h10 = h();
                    Unit unit = Unit.INSTANCE;
                }
            }
            z10 = false;
            h10 = h();
            Unit unit2 = Unit.INSTANCE;
        }
        if (z10) {
            c(b.CANCEL, null);
        } else if (!h10) {
            this.f17362b.k(this.a);
        }
    }

    public final void b() {
        x xVar = this.f17370j;
        if (!xVar.f17499d) {
            if (!xVar.f17497b) {
                if (this.f17373m != null) {
                    IOException iOException = this.f17374n;
                    if (iOException == null) {
                        b bVar = this.f17373m;
                        Intrinsics.checkNotNull(bVar);
                        throw new f0(bVar);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (!d(statusCode, iOException)) {
            return;
        }
        t tVar = this.f17362b;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        tVar.A.q(this.a, statusCode);
    }

    public final boolean d(b bVar, IOException iOException) {
        b bVar2;
        byte[] bArr = xh.b.a;
        synchronized (this) {
            synchronized (this) {
                bVar2 = this.f17373m;
            }
        }
        if (bVar2 != null) {
            return false;
        }
        if (this.f17369i.f17502c && this.f17370j.f17497b) {
            return false;
        }
        this.f17373m = bVar;
        this.f17374n = iOException;
        notifyAll();
        Unit unit = Unit.INSTANCE;
        this.f17362b.k(this.a);
        return true;
    }

    public final void e(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (!d(errorCode, null)) {
            return;
        }
        this.f17362b.s(this.a, errorCode);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ei.x f() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f17368h     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.g()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            ei.x r0 = r2.f17370j
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.a0.f():ei.x");
    }

    public final boolean g() {
        boolean z10;
        if ((this.a & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f17362b.f17456b == z10) {
            return true;
        }
        return false;
    }

    public final synchronized boolean h() {
        if (this.f17373m != null) {
            return false;
        }
        y yVar = this.f17369i;
        if (yVar.f17502c || yVar.f17505g) {
            x xVar = this.f17370j;
            if (xVar.f17497b || xVar.f17499d) {
                if (this.f17368h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(wh.z r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = xh.b.a
            monitor-enter(r2)
            boolean r0 = r2.f17368h     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            ei.y r3 = r2.f17369i     // Catch: java.lang.Throwable -> L37
            r3.getClass()     // Catch: java.lang.Throwable -> L37
            goto L1d
        L16:
            r2.f17368h = r1     // Catch: java.lang.Throwable -> L37
            java.util.ArrayDeque r0 = r2.f17367g     // Catch: java.lang.Throwable -> L37
            r0.add(r3)     // Catch: java.lang.Throwable -> L37
        L1d:
            if (r4 == 0) goto L23
            ei.y r3 = r2.f17369i     // Catch: java.lang.Throwable -> L37
            r3.f17502c = r1     // Catch: java.lang.Throwable -> L37
        L23:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L37
            r2.notifyAll()     // Catch: java.lang.Throwable -> L37
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            if (r3 != 0) goto L36
            ei.t r3 = r2.f17362b
            int r4 = r2.a
            r3.k(r4)
        L36:
            return
        L37:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.a0.i(wh.z, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
