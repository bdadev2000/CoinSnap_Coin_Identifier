package m8;

import J1.B;
import androidx.core.app.NotificationCompat;
import i8.C;
import i8.C2365b;
import i8.I;
import i8.InterfaceC2373j;
import i8.t;
import i8.u;
import i8.z;
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

/* loaded from: classes3.dex */
public final class i implements InterfaceC2373j {
    public final z b;

    /* renamed from: c, reason: collision with root package name */
    public final C f21783c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21784d;

    /* renamed from: f, reason: collision with root package name */
    public final l f21785f;

    /* renamed from: g, reason: collision with root package name */
    public final C2365b f21786g;

    /* renamed from: h, reason: collision with root package name */
    public final h f21787h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f21788i;

    /* renamed from: j, reason: collision with root package name */
    public Object f21789j;

    /* renamed from: k, reason: collision with root package name */
    public e f21790k;
    public k l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public B f21791n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21792o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21793p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21794q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f21795r;

    /* renamed from: s, reason: collision with root package name */
    public volatile B f21796s;

    /* renamed from: t, reason: collision with root package name */
    public volatile k f21797t;

    public i(z zVar, C c9) {
        G7.j.e(zVar, "client");
        this.b = zVar;
        this.f21783c = c9;
        this.f21784d = false;
        this.f21785f = (l) zVar.f20920c.f12819c;
        C2365b c2365b = (C2365b) zVar.f20923g.f1130c;
        G7.j.e(c2365b, "$this_asFactory");
        this.f21786g = c2365b;
        h hVar = new h(this, 0);
        hVar.g(0, TimeUnit.MILLISECONDS);
        this.f21787h = hVar;
        this.f21788i = new AtomicBoolean();
        this.f21794q = true;
    }

    public static final String a(i iVar) {
        String str;
        String str2;
        t tVar;
        StringBuilder sb = new StringBuilder();
        if (iVar.f21795r) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (iVar.f21784d) {
            str2 = "web socket";
        } else {
            str2 = NotificationCompat.CATEGORY_CALL;
        }
        sb.append(str2);
        sb.append(" to ");
        u uVar = iVar.f21783c.f20754a;
        uVar.getClass();
        try {
            tVar = new t();
            tVar.d(uVar, "/...");
        } catch (IllegalArgumentException unused) {
            tVar = null;
        }
        G7.j.b(tVar);
        tVar.f20879f = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        tVar.f20880g = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        sb.append(tVar.a().f20891i);
        return sb.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = j8.b.f21214a;
        if (this.l == null) {
            this.l = kVar;
            kVar.f21810p.add(new g(this, this.f21789j));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i9;
        byte[] bArr = j8.b.f21214a;
        k kVar = this.l;
        if (kVar != null) {
            synchronized (kVar) {
                i9 = i();
            }
            if (this.l == null) {
                if (i9 != null) {
                    j8.b.d(i9);
                }
                this.f21786g.getClass();
            } else if (i9 != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (this.m || !this.f21787h.i()) {
            interruptedIOException = iOException;
        } else {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        }
        if (iOException != null) {
            C2365b c2365b = this.f21786g;
            G7.j.b(interruptedIOException);
            c2365b.getClass();
        } else {
            this.f21786g.getClass();
        }
        return interruptedIOException;
    }

    public final void cancel() {
        Socket socket;
        if (this.f21795r) {
            return;
        }
        this.f21795r = true;
        B b = this.f21796s;
        if (b != null) {
            ((n8.d) b.f1490e).cancel();
        }
        k kVar = this.f21797t;
        if (kVar != null && (socket = kVar.f21799c) != null) {
            j8.b.d(socket);
        }
        this.f21786g.getClass();
    }

    public final Object clone() {
        return new i(this.b, this.f21783c);
    }

    public final I d() {
        if (this.f21788i.compareAndSet(false, true)) {
            this.f21787h.h();
            r8.m mVar = r8.m.f22950a;
            this.f21789j = r8.m.f22950a.g();
            this.f21786g.getClass();
            try {
                b1.h hVar = this.b.b;
                synchronized (hVar) {
                    ((ArrayDeque) hVar.f5272f).add(this);
                }
                return f();
            } finally {
                b1.h hVar2 = this.b.b;
                hVar2.getClass();
                hVar2.b((ArrayDeque) hVar2.f5272f, this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void e(boolean z8) {
        B b;
        synchronized (this) {
            if (!this.f21794q) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z8 && (b = this.f21796s) != null) {
            ((n8.d) b.f1490e).cancel();
            ((i) b.b).g(b, true, true, null);
        }
        this.f21791n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i8.I f() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            i8.z r0 = r11.b
            java.util.List r0 = r0.f20921d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            u7.AbstractC2822m.G(r0, r2)
            n8.a r0 = new n8.a
            i8.z r1 = r11.b
            r0.<init>(r1)
            r2.add(r0)
            n8.a r0 = new n8.a
            i8.z r1 = r11.b
            i8.b r1 = r1.l
            r0.<init>(r1)
            r2.add(r0)
            k8.b r0 = new k8.b
            i8.z r1 = r11.b
            i8.g r1 = r1.m
            r0.<init>(r1)
            r2.add(r0)
            m8.a r0 = m8.a.f21756a
            r2.add(r0)
            boolean r0 = r11.f21784d
            if (r0 != 0) goto L42
            i8.z r0 = r11.b
            java.util.List r0 = r0.f20922f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            u7.AbstractC2822m.G(r0, r2)
        L42:
            n8.b r0 = new n8.b
            boolean r1 = r11.f21784d
            r0.<init>(r1)
            r2.add(r0)
            n8.f r9 = new n8.f
            i8.C r5 = r11.f21783c
            i8.z r0 = r11.b
            int r6 = r0.f20939y
            int r7 = r0.f20940z
            int r8 = r0.f20918A
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            i8.C r2 = r11.f21783c     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            i8.I r2 = r9.b(r2)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            boolean r3 = r11.f21795r     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            if (r3 != 0) goto L6f
            r11.h(r0)
            return r2
        L6f:
            j8.b.c(r2)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            throw r2     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
        L7a:
            r2 = move-exception
            goto L92
        L7c:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.h(r1)     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L91
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            throw r1     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
            goto L92
        L91:
            throw r1     // Catch: java.lang.Throwable -> L8c
        L92:
            if (r1 != 0) goto L97
            r11.h(r0)
        L97:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.i.f():i8.I");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException g(J1.B r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            G7.j.e(r3, r0)
            J1.B r0 = r2.f21796s
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le
            return r6
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f21792o     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L41
        L1a:
            if (r5 == 0) goto L43
            boolean r1 = r2.f21793p     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L43
        L20:
            if (r4 == 0) goto L24
            r2.f21792o = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f21793p = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.f21792o     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f21793p     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f21793p     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f21794q     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L44
        L41:
            monitor-exit(r2)
            throw r3
        L43:
            r4 = r0
        L44:
            monitor-exit(r2)
            if (r0 == 0) goto L5a
            r5 = 0
            r2.f21796s = r5
            m8.k r5 = r2.l
            if (r5 != 0) goto L4f
            goto L5a
        L4f:
            monitor-enter(r5)
            int r0 = r5.m     // Catch: java.lang.Throwable -> L57
            int r0 = r0 + r3
            r5.m = r0     // Catch: java.lang.Throwable -> L57
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
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.i.g(J1.B, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException h(IOException iOException) {
        boolean z8;
        synchronized (this) {
            z8 = false;
            if (this.f21794q) {
                this.f21794q = false;
                if (!this.f21792o) {
                    if (!this.f21793p) {
                        z8 = true;
                    }
                }
            }
        }
        if (z8) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket i() {
        k kVar = this.l;
        G7.j.b(kVar);
        byte[] bArr = j8.b.f21214a;
        ArrayList arrayList = kVar.f21810p;
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (G7.j.a(((Reference) it.next()).get(), this)) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 != -1) {
            arrayList.remove(i9);
            this.l = null;
            if (arrayList.isEmpty()) {
                kVar.f21811q = System.nanoTime();
                l lVar = this.f21785f;
                lVar.getClass();
                byte[] bArr2 = j8.b.f21214a;
                boolean z8 = kVar.f21806j;
                l8.b bVar = lVar.f21813c;
                if (!z8 && lVar.f21812a != 0) {
                    bVar.c(lVar.f21814d, 0L);
                } else {
                    kVar.f21806j = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f21815e;
                    concurrentLinkedQueue.remove(kVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        bVar.a();
                    }
                    Socket socket = kVar.f21800d;
                    G7.j.b(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
