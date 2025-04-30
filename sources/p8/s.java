package p8;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class s implements Closeable {

    /* renamed from: D, reason: collision with root package name */
    public static final D f22444D;

    /* renamed from: A, reason: collision with root package name */
    public final A f22445A;

    /* renamed from: B, reason: collision with root package name */
    public final m f22446B;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashSet f22447C;

    /* renamed from: c, reason: collision with root package name */
    public final i f22448c;

    /* renamed from: f, reason: collision with root package name */
    public final String f22450f;

    /* renamed from: g, reason: collision with root package name */
    public int f22451g;

    /* renamed from: h, reason: collision with root package name */
    public int f22452h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22453i;

    /* renamed from: j, reason: collision with root package name */
    public final l8.c f22454j;

    /* renamed from: k, reason: collision with root package name */
    public final l8.b f22455k;
    public final l8.b l;
    public final l8.b m;

    /* renamed from: n, reason: collision with root package name */
    public final C f22456n;

    /* renamed from: o, reason: collision with root package name */
    public long f22457o;

    /* renamed from: p, reason: collision with root package name */
    public long f22458p;

    /* renamed from: q, reason: collision with root package name */
    public long f22459q;

    /* renamed from: r, reason: collision with root package name */
    public long f22460r;

    /* renamed from: s, reason: collision with root package name */
    public long f22461s;

    /* renamed from: t, reason: collision with root package name */
    public final D f22462t;

    /* renamed from: u, reason: collision with root package name */
    public D f22463u;

    /* renamed from: v, reason: collision with root package name */
    public long f22464v;

    /* renamed from: w, reason: collision with root package name */
    public long f22465w;

    /* renamed from: x, reason: collision with root package name */
    public long f22466x;

    /* renamed from: y, reason: collision with root package name */
    public long f22467y;

    /* renamed from: z, reason: collision with root package name */
    public final Socket f22468z;
    public final boolean b = true;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f22449d = new LinkedHashMap();

    static {
        D d2 = new D();
        d2.c(7, 65535);
        d2.c(5, 16384);
        f22444D = d2;
    }

    public s(P4.a aVar) {
        this.f22448c = (i) aVar.f2420g;
        String str = (String) aVar.b;
        if (str != null) {
            this.f22450f = str;
            this.f22452h = 3;
            l8.c cVar = (l8.c) aVar.f2416c;
            this.f22454j = cVar;
            l8.b f9 = cVar.f();
            this.f22455k = f9;
            this.l = cVar.f();
            this.m = cVar.f();
            this.f22456n = C.f22381a;
            D d2 = new D();
            d2.c(7, 16777216);
            this.f22462t = d2;
            this.f22463u = f22444D;
            this.f22467y = r3.a();
            Socket socket = (Socket) aVar.f2417d;
            if (socket != null) {
                this.f22468z = socket;
                w8.g gVar = (w8.g) aVar.f2419f;
                if (gVar != null) {
                    this.f22445A = new A(gVar, true);
                    w8.h hVar = (w8.h) aVar.f2418e;
                    if (hVar != null) {
                        this.f22446B = new m(this, new w(hVar, true));
                        this.f22447C = new LinkedHashSet();
                        int i9 = aVar.f2415a;
                        if (i9 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i9);
                            f9.c(new q(G7.j.j(" ping", str), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    G7.j.k("source");
                    throw null;
                }
                G7.j.k("sink");
                throw null;
            }
            G7.j.k("socket");
            throw null;
        }
        G7.j.k("connectionName");
        throw null;
    }

    public final void a(EnumC2574b enumC2574b, EnumC2574b enumC2574b2, IOException iOException) {
        int i9;
        Object[] objArr;
        byte[] bArr = j8.b.f21214a;
        try {
            i(enumC2574b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f22449d.isEmpty()) {
                objArr = this.f22449d.values().toArray(new z[0]);
                if (objArr != null) {
                    this.f22449d.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } else {
                objArr = null;
            }
        }
        z[] zVarArr = (z[]) objArr;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.c(enumC2574b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f22445A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f22468z.close();
        } catch (IOException unused4) {
        }
        this.f22455k.f();
        this.l.f();
        this.m.f();
    }

    public final void b(IOException iOException) {
        EnumC2574b enumC2574b = EnumC2574b.PROTOCOL_ERROR;
        a(enumC2574b, enumC2574b, iOException);
    }

    public final synchronized z c(int i9) {
        return (z) this.f22449d.get(Integer.valueOf(i9));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC2574b.NO_ERROR, EnumC2574b.CANCEL, null);
    }

    public final void flush() {
        this.f22445A.flush();
    }

    public final synchronized z h(int i9) {
        z zVar;
        zVar = (z) this.f22449d.remove(Integer.valueOf(i9));
        notifyAll();
        return zVar;
    }

    public final void i(EnumC2574b enumC2574b) {
        synchronized (this.f22445A) {
            synchronized (this) {
                if (this.f22453i) {
                    return;
                }
                this.f22453i = true;
                this.f22445A.h(this.f22451g, enumC2574b, j8.b.f21214a);
            }
        }
    }

    public final synchronized void j(long j7) {
        long j9 = this.f22464v + j7;
        this.f22464v = j9;
        long j10 = j9 - this.f22465w;
        if (j10 >= this.f22462t.a() / 2) {
            m(0, j10);
            this.f22465w += j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f22445A.f22376f);
        r6 = r2;
        r8.f22466x += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r9, boolean r10, w8.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            p8.A r12 = r8.f22445A
            r12.b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f22466x     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f22467y     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f22449d     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            p8.A r4 = r8.f22445A     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f22376f     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f22466x     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f22466x = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            p8.A r4 = r8.f22445A
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.b(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.s.k(int, boolean, w8.f, long):void");
    }

    public final void l(int i9, EnumC2574b enumC2574b) {
        this.f22455k.c(new p(this.f22450f + '[' + i9 + "] writeSynReset", this, i9, enumC2574b, 1), 0L);
    }

    public final void m(int i9, long j7) {
        this.f22455k.c(new r(this.f22450f + '[' + i9 + "] windowUpdate", this, i9, j7), 0L);
    }
}
