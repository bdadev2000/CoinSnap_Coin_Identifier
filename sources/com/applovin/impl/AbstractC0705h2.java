package com.applovin.impl;

import com.applovin.impl.ej;

/* renamed from: com.applovin.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0705h2 {

    /* renamed from: a, reason: collision with root package name */
    protected final a f8031a;
    protected final f b;

    /* renamed from: c, reason: collision with root package name */
    protected c f8032c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8033d;

    /* renamed from: com.applovin.impl.h2$a */
    /* loaded from: classes.dex */
    public static class a implements ej {

        /* renamed from: a, reason: collision with root package name */
        private final d f8034a;
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        private final long f8035c;

        /* renamed from: d, reason: collision with root package name */
        private final long f8036d;

        /* renamed from: e, reason: collision with root package name */
        private final long f8037e;

        /* renamed from: f, reason: collision with root package name */
        private final long f8038f;

        /* renamed from: g, reason: collision with root package name */
        private final long f8039g;

        public a(d dVar, long j7, long j9, long j10, long j11, long j12, long j13) {
            this.f8034a = dVar;
            this.b = j7;
            this.f8035c = j9;
            this.f8036d = j10;
            this.f8037e = j11;
            this.f8038f = j12;
            this.f8039g = j13;
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return true;
        }

        public long c(long j7) {
            return this.f8034a.a(j7);
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.b;
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j7) {
            return new ej.a(new gj(j7, c.a(this.f8034a.a(j7), this.f8035c, this.f8036d, this.f8037e, this.f8038f, this.f8039g)));
        }
    }

    /* renamed from: com.applovin.impl.h2$b */
    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // com.applovin.impl.AbstractC0705h2.d
        public long a(long j7) {
            return j7;
        }
    }

    /* renamed from: com.applovin.impl.h2$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f8040a;
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        private final long f8041c;

        /* renamed from: d, reason: collision with root package name */
        private long f8042d;

        /* renamed from: e, reason: collision with root package name */
        private long f8043e;

        /* renamed from: f, reason: collision with root package name */
        private long f8044f;

        /* renamed from: g, reason: collision with root package name */
        private long f8045g;

        /* renamed from: h, reason: collision with root package name */
        private long f8046h;

        public c(long j7, long j9, long j10, long j11, long j12, long j13, long j14) {
            this.f8040a = j7;
            this.b = j9;
            this.f8042d = j10;
            this.f8043e = j11;
            this.f8044f = j12;
            this.f8045g = j13;
            this.f8041c = j14;
            this.f8046h = a(j9, j10, j11, j12, j13, j14);
        }

        private void f() {
            this.f8046h = a(this.b, this.f8042d, this.f8043e, this.f8044f, this.f8045g, this.f8041c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.f8046h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f8040a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.b;
        }

        public static long a(long j7, long j9, long j10, long j11, long j12, long j13) {
            if (j11 + 1 >= j12 || j9 + 1 >= j10) {
                return j11;
            }
            long j14 = ((float) (j7 - j9)) * (((float) (j12 - j11)) / ((float) (j10 - j9)));
            return yp.b(((j14 + j11) - j13) - (j14 / 20), j11, j12 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f8044f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j7, long j9) {
            this.f8042d = j7;
            this.f8044f = j9;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.f8045g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j7, long j9) {
            this.f8043e = j7;
            this.f8045g = j9;
            f();
        }
    }

    /* renamed from: com.applovin.impl.h2$d */
    /* loaded from: classes.dex */
    public interface d {
        long a(long j7);
    }

    /* renamed from: com.applovin.impl.h2$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f8047d = new e(-3, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f8048a;
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        private final long f8049c;

        private e(int i9, long j7, long j9) {
            this.f8048a = i9;
            this.b = j7;
            this.f8049c = j9;
        }

        public static e a(long j7, long j9) {
            return new e(-1, j7, j9);
        }

        public static e b(long j7, long j9) {
            return new e(-2, j7, j9);
        }

        public static e a(long j7) {
            return new e(0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, j7);
        }
    }

    /* renamed from: com.applovin.impl.h2$f */
    /* loaded from: classes.dex */
    public interface f {
        e a(j8 j8Var, long j7);

        default void a() {
        }
    }

    public AbstractC0705h2(d dVar, f fVar, long j7, long j9, long j10, long j11, long j12, long j13, int i9) {
        this.b = fVar;
        this.f8033d = i9;
        this.f8031a = new a(dVar, j7, j9, j10, j11, j12, j13);
    }

    public final ej a() {
        return this.f8031a;
    }

    public void b(boolean z8, long j7) {
    }

    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            c cVar = (c) AbstractC0669a1.b(this.f8032c);
            long b8 = cVar.b();
            long a6 = cVar.a();
            long c9 = cVar.c();
            if (a6 - b8 <= this.f8033d) {
                a(false, b8);
                return a(j8Var, b8, qhVar);
            }
            if (!a(j8Var, c9)) {
                return a(j8Var, c9, qhVar);
            }
            j8Var.b();
            e a9 = this.b.a(j8Var, cVar.e());
            int i9 = a9.f8048a;
            if (i9 == -3) {
                a(false, c9);
                return a(j8Var, c9, qhVar);
            }
            if (i9 == -2) {
                cVar.b(a9.b, a9.f8049c);
            } else {
                if (i9 != -1) {
                    if (i9 == 0) {
                        a(j8Var, a9.f8049c);
                        a(true, a9.f8049c);
                        return a(j8Var, a9.f8049c, qhVar);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                cVar.a(a9.b, a9.f8049c);
            }
        }
    }

    public final boolean b() {
        return this.f8032c != null;
    }

    public final void b(long j7) {
        c cVar = this.f8032c;
        if (cVar == null || cVar.d() != j7) {
            this.f8032c = a(j7);
        }
    }

    public final void a(boolean z8, long j7) {
        this.f8032c = null;
        this.b.a();
        b(z8, j7);
    }

    public final int a(j8 j8Var, long j7, qh qhVar) {
        if (j7 == j8Var.f()) {
            return 0;
        }
        qhVar.f10346a = j7;
        return 1;
    }

    public final boolean a(j8 j8Var, long j7) {
        long f9 = j7 - j8Var.f();
        if (f9 < 0 || f9 > 262144) {
            return false;
        }
        j8Var.a((int) f9);
        return true;
    }

    public c a(long j7) {
        return new c(j7, this.f8031a.c(j7), this.f8031a.f8035c, this.f8031a.f8036d, this.f8031a.f8037e, this.f8031a.f8038f, this.f8031a.f8039g);
    }
}
