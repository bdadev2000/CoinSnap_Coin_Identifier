package bi;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s7.h1;
import wh.l0;
import wh.o0;
import wh.u0;

/* loaded from: classes5.dex */
public final class i implements wh.k {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f2467b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f2468c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2469d;

    /* renamed from: f, reason: collision with root package name */
    public final l f2470f;

    /* renamed from: g, reason: collision with root package name */
    public final y5.f f2471g;

    /* renamed from: h, reason: collision with root package name */
    public final h f2472h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f2473i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2474j;

    /* renamed from: k, reason: collision with root package name */
    public e f2475k;

    /* renamed from: l, reason: collision with root package name */
    public k f2476l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2477m;

    /* renamed from: n, reason: collision with root package name */
    public a4.f f2478n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2479o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2480p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2481q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f2482r;

    /* renamed from: s, reason: collision with root package name */
    public volatile a4.f f2483s;

    /* renamed from: t, reason: collision with root package name */
    public volatile k f2484t;

    public i(l0 client, o0 originalRequest, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f2467b = client;
        this.f2468c = originalRequest;
        this.f2469d = z10;
        this.f2470f = (l) client.f27110c.f27991b;
        y5.f this_asFactory = (y5.f) client.f27113g.f18380c;
        byte[] bArr = xh.b.a;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(this, "it");
        this.f2471g = this_asFactory;
        h hVar = new h(this);
        client.getClass();
        hVar.g(0, TimeUnit.MILLISECONDS);
        this.f2472h = hVar;
        this.f2473i = new AtomicBoolean();
        this.f2481q = true;
    }

    public static final String a(i iVar) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (iVar.f2482r) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (iVar.f2469d) {
            str2 = "web socket";
        } else {
            str2 = NotificationCompat.CATEGORY_CALL;
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(iVar.f2468c.a.g());
        return sb2.toString();
    }

    public final void b(k connection) {
        boolean z10;
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = xh.b.a;
        if (this.f2476l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2476l = connection;
            connection.f2499p.add(new g(this, this.f2474j));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException c(IOException iOException) {
        IOException ioe;
        Socket j3;
        boolean z10;
        byte[] bArr = xh.b.a;
        k connection = this.f2476l;
        if (connection != null) {
            synchronized (connection) {
                j3 = j();
            }
            if (this.f2476l == null) {
                if (j3 != null) {
                    xh.b.d(j3);
                }
                this.f2471g.getClass();
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else {
                if (j3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (this.f2477m || !this.f2472h.i()) {
            ioe = iOException;
        } else {
            ioe = new InterruptedIOException("timeout");
            if (iOException != null) {
                ioe.initCause(iOException);
            }
        }
        if (iOException != null) {
            y5.f fVar = this.f2471g;
            Intrinsics.checkNotNull(ioe);
            fVar.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
        } else {
            this.f2471g.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
        }
        return ioe;
    }

    public final void cancel() {
        Socket socket;
        if (this.f2482r) {
            return;
        }
        this.f2482r = true;
        a4.f fVar = this.f2483s;
        if (fVar != null) {
            ((ci.d) fVar.f113e).cancel();
        }
        k kVar = this.f2484t;
        if (kVar != null && (socket = kVar.f2486c) != null) {
            xh.b.d(socket);
        }
        this.f2471g.getClass();
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public final Object clone() {
        return new i(this.f2467b, this.f2468c, this.f2469d);
    }

    public final void d(wh.l responseCallback) {
        f other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (this.f2473i.compareAndSet(false, true)) {
            gi.l lVar = gi.l.a;
            this.f2474j = gi.l.a.g();
            this.f2471g.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            h1 h1Var = this.f2467b.f27109b;
            f call = new f(this, responseCallback);
            h1Var.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            synchronized (h1Var) {
                ((ArrayDeque) h1Var.f24389e).add(call);
                i iVar = call.f2465d;
                if (!iVar.f2469d && (other = h1Var.c(iVar.f2468c.a.f27035d)) != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f2464c = other.f2464c;
                }
                Unit unit = Unit.INSTANCE;
            }
            h1Var.f();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final u0 e() {
        if (this.f2473i.compareAndSet(false, true)) {
            this.f2472h.h();
            gi.l lVar = gi.l.a;
            this.f2474j = gi.l.a.g();
            this.f2471g.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            try {
                h1 h1Var = this.f2467b.f27109b;
                synchronized (h1Var) {
                    Intrinsics.checkNotNullParameter(this, "call");
                    ((ArrayDeque) h1Var.f24391g).add(this);
                }
                return g();
            } finally {
                h1 h1Var2 = this.f2467b.f27109b;
                h1Var2.getClass();
                Intrinsics.checkNotNullParameter(this, NotificationCompat.CATEGORY_CALL);
                h1Var2.d((ArrayDeque) h1Var2.f24391g, this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void f(boolean z10) {
        a4.f fVar;
        synchronized (this) {
            if (this.f2481q) {
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (fVar = this.f2483s) != null) {
            ((ci.d) fVar.f113e).cancel();
            ((i) fVar.a).h(fVar, true, true, null);
        }
        this.f2478n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wh.u0 g() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            wh.l0 r0 = r10.f2467b
            java.util.List r0 = r0.f27111d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.a(r2, r0)
            ci.g r0 = new ci.g
            wh.l0 r1 = r10.f2467b
            r0.<init>(r1)
            r2.add(r0)
            ci.a r0 = new ci.a
            wh.l0 r1 = r10.f2467b
            wh.t r1 = r1.f27118l
            r0.<init>(r1)
            r2.add(r0)
            zh.b r0 = new zh.b
            wh.l0 r1 = r10.f2467b
            wh.h r1 = r1.f27119m
            r0.<init>(r1)
            r2.add(r0)
            bi.a r0 = bi.a.a
            r2.add(r0)
            boolean r0 = r10.f2469d
            if (r0 != 0) goto L42
            wh.l0 r0 = r10.f2467b
            java.util.List r0 = r0.f27112f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.a(r2, r0)
        L42:
            ci.b r0 = new ci.b
            boolean r1 = r10.f2469d
            r0.<init>(r1)
            r2.add(r0)
            ci.f r9 = new ci.f
            r3 = 0
            r4 = 0
            wh.o0 r5 = r10.f2468c
            wh.l0 r0 = r10.f2467b
            int r6 = r0.f27130y
            int r7 = r0.f27131z
            int r8 = r0.A
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            wh.o0 r1 = r10.f2468c     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            wh.u0 r1 = r9.b(r1)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            boolean r2 = r10.f2482r     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            if (r2 != 0) goto L6e
            r10.i(r0)
            return r1
        L6e:
            xh.b.c(r1)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
            throw r1     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7c
        L79:
            r1 = move-exception
            r2 = 0
            goto L8e
        L7c:
            r1 = move-exception
            java.io.IOException r1 = r10.i(r1)     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L8b
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            r2 = 1
        L8e:
            if (r2 != 0) goto L93
            r10.i(r0)
        L93:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.i.g():wh.u0");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001c), top: B:49:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:50:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001c), top: B:49:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException h(a4.f r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            a4.f r0 = r2.f2483s
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 != 0) goto Le
            return r6
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f2479o     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L62
        L1a:
            if (r5 == 0) goto L41
            boolean r1 = r2.f2480p     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L41
        L20:
            if (r4 == 0) goto L24
            r2.f2479o = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f2480p = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.f2479o     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f2480p     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f2480p     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f2481q     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L42
        L41:
            r4 = r0
        L42:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L5a
            r5 = 0
            r2.f2483s = r5
            bi.k r5 = r2.f2476l
            if (r5 != 0) goto L4f
            goto L5a
        L4f:
            monitor-enter(r5)
            int r0 = r5.f2496m     // Catch: java.lang.Throwable -> L57
            int r0 = r0 + r3
            r5.f2496m = r0     // Catch: java.lang.Throwable -> L57
            monitor-exit(r5)
            goto L5a
        L57:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L5a:
            if (r4 == 0) goto L61
            java.io.IOException r3 = r2.c(r6)
            return r3
        L61:
            return r6
        L62:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.i.h(a4.f, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f2481q) {
                this.f2481q = false;
                if (!this.f2479o && !this.f2480p) {
                    z10 = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z10) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket j() {
        boolean z10;
        k connection = this.f2476l;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = xh.b.a;
        ArrayList arrayList = connection.f2499p;
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.remove(i10);
            this.f2476l = null;
            if (arrayList.isEmpty()) {
                connection.f2500q = System.nanoTime();
                l lVar = this.f2470f;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(connection, "connection");
                byte[] bArr2 = xh.b.a;
                boolean z12 = connection.f2493j;
                ai.c cVar = lVar.f2502c;
                if (!z12 && lVar.a != 0) {
                    ai.c.d(cVar, lVar.f2503d);
                } else {
                    connection.f2493j = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f2504e;
                    concurrentLinkedQueue.remove(connection);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    z11 = true;
                }
                if (z11) {
                    Socket socket = connection.f2487d;
                    Intrinsics.checkNotNull(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
