package ei;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes5.dex */
public final class t implements Closeable {
    public static final e0 D;
    public final b0 A;
    public final n B;
    public final LinkedHashSet C;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17456b;

    /* renamed from: c, reason: collision with root package name */
    public final j f17457c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f17458d;

    /* renamed from: f, reason: collision with root package name */
    public final String f17459f;

    /* renamed from: g, reason: collision with root package name */
    public int f17460g;

    /* renamed from: h, reason: collision with root package name */
    public int f17461h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17462i;

    /* renamed from: j, reason: collision with root package name */
    public final ai.f f17463j;

    /* renamed from: k, reason: collision with root package name */
    public final ai.c f17464k;

    /* renamed from: l, reason: collision with root package name */
    public final ai.c f17465l;

    /* renamed from: m, reason: collision with root package name */
    public final ai.c f17466m;

    /* renamed from: n, reason: collision with root package name */
    public final y5.f f17467n;

    /* renamed from: o, reason: collision with root package name */
    public long f17468o;

    /* renamed from: p, reason: collision with root package name */
    public long f17469p;

    /* renamed from: q, reason: collision with root package name */
    public long f17470q;

    /* renamed from: r, reason: collision with root package name */
    public long f17471r;

    /* renamed from: s, reason: collision with root package name */
    public long f17472s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f17473t;
    public e0 u;

    /* renamed from: v, reason: collision with root package name */
    public long f17474v;

    /* renamed from: w, reason: collision with root package name */
    public long f17475w;

    /* renamed from: x, reason: collision with root package name */
    public long f17476x;

    /* renamed from: y, reason: collision with root package name */
    public long f17477y;

    /* renamed from: z, reason: collision with root package name */
    public final Socket f17478z;

    static {
        e0 e0Var = new e0();
        e0Var.c(7, 65535);
        e0Var.c(5, JsonLexerKt.BATCH_SIZE);
        D = e0Var;
    }

    public t(h builder) {
        int i10;
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z10 = builder.a;
        this.f17456b = z10;
        this.f17457c = builder.f17426g;
        this.f17458d = new LinkedHashMap();
        String str = builder.f17423d;
        ki.k kVar = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f17459f = str;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f17461h = i10;
        ai.f fVar = builder.f17421b;
        this.f17463j = fVar;
        ai.c f10 = fVar.f();
        this.f17464k = f10;
        this.f17465l = fVar.f();
        this.f17466m = fVar.f();
        this.f17467n = builder.f17427h;
        e0 e0Var = new e0();
        if (z10) {
            e0Var.c(7, 16777216);
        }
        this.f17473t = e0Var;
        this.u = D;
        this.f17477y = r3.a();
        Socket socket = builder.f17422c;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            socket = null;
        }
        this.f17478z = socket;
        ki.j jVar = builder.f17425f;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            jVar = null;
        }
        this.A = new b0(jVar, z10);
        ki.k kVar2 = builder.f17424e;
        if (kVar2 != null) {
            kVar = kVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.B = new n(this, new w(kVar, z10));
        this.C = new LinkedHashSet();
        int i11 = builder.f17428i;
        if (i11 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i11);
            f10.c(new r(Intrinsics.stringPlus(str, " ping"), this, nanos), nanos);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(b.NO_ERROR, b.CANCEL, null);
    }

    public final void d(b connectionCode, b streamCode, IOException iOException) {
        int i10;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = xh.b.a;
        try {
            p(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f17458d.isEmpty()) {
                objArr = this.f17458d.values().toArray(new a0[0]);
                if (objArr != null) {
                    this.f17458d.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } else {
                objArr = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        a0[] a0VarArr = (a0[]) objArr;
        if (a0VarArr != null) {
            for (a0 a0Var : a0VarArr) {
                try {
                    a0Var.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f17478z.close();
        } catch (IOException unused4) {
        }
        this.f17464k.f();
        this.f17465l.f();
        this.f17466m.f();
    }

    public final void flush() {
        b0 b0Var = this.A;
        synchronized (b0Var) {
            if (!b0Var.f17388g) {
                b0Var.f17384b.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void g(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        d(bVar, bVar, iOException);
    }

    public final synchronized a0 j(int i10) {
        return (a0) this.f17458d.get(Integer.valueOf(i10));
    }

    public final synchronized a0 k(int i10) {
        a0 a0Var;
        a0Var = (a0) this.f17458d.remove(Integer.valueOf(i10));
        notifyAll();
        return a0Var;
    }

    public final void p(b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.A) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f17462i) {
                    return;
                }
                this.f17462i = true;
                int i10 = this.f17460g;
                intRef.element = i10;
                Unit unit = Unit.INSTANCE;
                this.A.k(i10, statusCode, xh.b.a);
            }
        }
    }

    public final synchronized void q(long j3) {
        long j10 = this.f17474v + j3;
        this.f17474v = j10;
        long j11 = j10 - this.f17475w;
        if (j11 >= this.f17473t.a() / 2) {
            t(0, j11);
            this.f17475w += j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.A.f17387f);
        r6 = r2;
        r8.f17476x += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r9, boolean r10, ki.i r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            ei.b0 r12 = r8.A
            r12.g(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.f17476x     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            long r6 = r8.f17477y     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.LinkedHashMap r2 = r8.f17458d     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L59
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L59
            ei.b0 r4 = r8.A     // Catch: java.lang.Throwable -> L59
            int r4 = r4.f17387f     // Catch: java.lang.Throwable -> L59
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L59
            long r4 = r8.f17476x     // Catch: java.lang.Throwable -> L59
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L59
            long r4 = r4 + r6
            r8.f17476x = r4     // Catch: java.lang.Throwable -> L59
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
            monitor-exit(r8)
            long r12 = r12 - r6
            ei.b0 r4 = r8.A
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.g(r5, r9, r11, r2)
            goto Ld
        L59:
            r9 = move-exception
            goto L68
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L59
            r9.interrupt()     // Catch: java.lang.Throwable -> L59
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L59
            throw r9     // Catch: java.lang.Throwable -> L59
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.t.r(int, boolean, ki.i, long):void");
    }

    public final void s(int i10, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f17464k.c(new q(this.f17459f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] writeSynReset", this, i10, errorCode, 1), 0L);
    }

    public final void t(int i10, long j3) {
        this.f17464k.c(new s(this.f17459f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] windowUpdate", this, i10, j3), 0L);
    }
}
