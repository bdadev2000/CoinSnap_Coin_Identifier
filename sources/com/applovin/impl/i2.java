package com.applovin.impl;

import com.applovin.impl.ij;

/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a, reason: collision with root package name */
    protected final a f24400a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f24401b;

    /* renamed from: c, reason: collision with root package name */
    protected c f24402c;
    private final int d;

    /* loaded from: classes.dex */
    public static class a implements ij {

        /* renamed from: a, reason: collision with root package name */
        private final d f24403a;

        /* renamed from: b, reason: collision with root package name */
        private final long f24404b;

        /* renamed from: c, reason: collision with root package name */
        private final long f24405c;
        private final long d;
        private final long e;

        /* renamed from: f, reason: collision with root package name */
        private final long f24406f;

        /* renamed from: g, reason: collision with root package name */
        private final long f24407g;

        public a(d dVar, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f24403a = dVar;
            this.f24404b = j2;
            this.f24405c = j3;
            this.d = j4;
            this.e = j5;
            this.f24406f = j6;
            this.f24407g = j7;
        }

        @Override // com.applovin.impl.ij
        public boolean b() {
            return true;
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.f24404b;
        }

        public long c(long j2) {
            return this.f24403a.a(j2);
        }

        @Override // com.applovin.impl.ij
        public ij.a b(long j2) {
            return new ij.a(new kj(j2, c.a(this.f24403a.a(j2), this.f24405c, this.d, this.e, this.f24406f, this.f24407g)));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // com.applovin.impl.i2.d
        public long a(long j2) {
            return j2;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f24408a;

        /* renamed from: b, reason: collision with root package name */
        private final long f24409b;

        /* renamed from: c, reason: collision with root package name */
        private final long f24410c;
        private long d;
        private long e;

        /* renamed from: f, reason: collision with root package name */
        private long f24411f;

        /* renamed from: g, reason: collision with root package name */
        private long f24412g;

        /* renamed from: h, reason: collision with root package name */
        private long f24413h;

        public c(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.f24408a = j2;
            this.f24409b = j3;
            this.d = j4;
            this.e = j5;
            this.f24411f = j6;
            this.f24412g = j7;
            this.f24410c = j8;
            this.f24413h = a(j3, j4, j5, j6, j7, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.f24412g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f24411f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.f24413h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f24408a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.f24409b;
        }

        private void f() {
            this.f24413h = a(this.f24409b, this.d, this.e, this.f24411f, this.f24412g, this.f24410c);
        }

        public static long a(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || j3 + 1 >= j4) {
                return j5;
            }
            long j8 = ((float) (j2 - j3)) * (((float) (j6 - j5)) / ((float) (j4 - j3)));
            return xp.b(((j8 + j5) - j7) - (j8 / 20), j5, j6 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j2, long j3) {
            this.d = j2;
            this.f24411f = j3;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j2, long j3) {
            this.e = j2;
            this.f24412g = j3;
            f();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long a(long j2);
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f24414a;

        /* renamed from: b, reason: collision with root package name */
        private final long f24415b;

        /* renamed from: c, reason: collision with root package name */
        private final long f24416c;

        private e(int i2, long j2, long j3) {
            this.f24414a = i2;
            this.f24415b = j2;
            this.f24416c = j3;
        }

        public static e a(long j2, long j3) {
            return new e(-1, j2, j3);
        }

        public static e b(long j2, long j3) {
            return new e(-2, j2, j3);
        }

        public static e a(long j2) {
            return new e(0, -9223372036854775807L, j2);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        e a(l8 l8Var, long j2);

        default void a() {
        }
    }

    public i2(d dVar, f fVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.f24401b = fVar;
        this.d = i2;
        this.f24400a = new a(dVar, j2, j3, j4, j5, j6, j7);
    }

    public final ij a() {
        return this.f24400a;
    }

    public void b(boolean z2, long j2) {
    }

    public int a(l8 l8Var, th thVar) {
        while (true) {
            c cVar = (c) b1.b(this.f24402c);
            long b2 = cVar.b();
            long a2 = cVar.a();
            long c2 = cVar.c();
            if (a2 - b2 <= this.d) {
                a(false, b2);
                return a(l8Var, b2, thVar);
            }
            if (!a(l8Var, c2)) {
                return a(l8Var, c2, thVar);
            }
            l8Var.b();
            e a3 = this.f24401b.a(l8Var, cVar.e());
            int i2 = a3.f24414a;
            if (i2 == -3) {
                a(false, c2);
                return a(l8Var, c2, thVar);
            }
            if (i2 == -2) {
                cVar.b(a3.f24415b, a3.f24416c);
            } else {
                if (i2 != -1) {
                    if (i2 == 0) {
                        a(l8Var, a3.f24416c);
                        a(true, a3.f24416c);
                        return a(l8Var, a3.f24416c, thVar);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                cVar.a(a3.f24415b, a3.f24416c);
            }
        }
    }

    public final boolean b() {
        return this.f24402c != null;
    }

    public final void b(long j2) {
        c cVar = this.f24402c;
        if (cVar == null || cVar.d() != j2) {
            this.f24402c = a(j2);
        }
    }

    public final void a(boolean z2, long j2) {
        this.f24402c = null;
        this.f24401b.a();
        b(z2, j2);
    }

    public final int a(l8 l8Var, long j2, th thVar) {
        if (j2 == l8Var.f()) {
            return 0;
        }
        thVar.f27165a = j2;
        return 1;
    }

    public final boolean a(l8 l8Var, long j2) {
        long f2 = j2 - l8Var.f();
        if (f2 < 0 || f2 > 262144) {
            return false;
        }
        l8Var.a((int) f2);
        return true;
    }

    public c a(long j2) {
        return new c(j2, this.f24400a.c(j2), this.f24400a.f24405c, this.f24400a.d, this.f24400a.e, this.f24400a.f24406f, this.f24400a.f24407g);
    }
}
