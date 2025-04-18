package com.applovin.impl;

import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public abstract class h2 {
    protected final a a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f5064b;

    /* renamed from: c, reason: collision with root package name */
    protected c f5065c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5066d;

    /* loaded from: classes.dex */
    public static class a implements ej {
        private final d a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5067b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5068c;

        /* renamed from: d, reason: collision with root package name */
        private final long f5069d;

        /* renamed from: e, reason: collision with root package name */
        private final long f5070e;

        /* renamed from: f, reason: collision with root package name */
        private final long f5071f;

        /* renamed from: g, reason: collision with root package name */
        private final long f5072g;

        public a(d dVar, long j3, long j10, long j11, long j12, long j13, long j14) {
            this.a = dVar;
            this.f5067b = j3;
            this.f5068c = j10;
            this.f5069d = j11;
            this.f5070e = j12;
            this.f5071f = j13;
            this.f5072g = j14;
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return true;
        }

        public long c(long j3) {
            return this.a.a(j3);
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.f5067b;
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j3) {
            return new ej.a(new gj(j3, c.a(this.a.a(j3), this.f5068c, this.f5069d, this.f5070e, this.f5071f, this.f5072g)));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // com.applovin.impl.h2.d
        public long a(long j3) {
            return j3;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        private final long a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5073b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5074c;

        /* renamed from: d, reason: collision with root package name */
        private long f5075d;

        /* renamed from: e, reason: collision with root package name */
        private long f5076e;

        /* renamed from: f, reason: collision with root package name */
        private long f5077f;

        /* renamed from: g, reason: collision with root package name */
        private long f5078g;

        /* renamed from: h, reason: collision with root package name */
        private long f5079h;

        public c(long j3, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.a = j3;
            this.f5073b = j10;
            this.f5075d = j11;
            this.f5076e = j12;
            this.f5077f = j13;
            this.f5078g = j14;
            this.f5074c = j15;
            this.f5079h = a(j10, j11, j12, j13, j14, j15);
        }

        private void f() {
            this.f5079h = a(this.f5073b, this.f5075d, this.f5076e, this.f5077f, this.f5078g, this.f5074c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.f5079h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.f5073b;
        }

        public static long a(long j3, long j10, long j11, long j12, long j13, long j14) {
            if (j12 + 1 >= j13 || j10 + 1 >= j11) {
                return j12;
            }
            long j15 = ((float) (j3 - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
            return yp.b(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f5077f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j3, long j10) {
            this.f5075d = j3;
            this.f5077f = j10;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.f5078g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j3, long j10) {
            this.f5076e = j3;
            this.f5078g = j10;
            f();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long a(long j3);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f5080d = new e(-3, C.TIME_UNSET, -1);
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5081b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5082c;

        private e(int i10, long j3, long j10) {
            this.a = i10;
            this.f5081b = j3;
            this.f5082c = j10;
        }

        public static e a(long j3, long j10) {
            return new e(-1, j3, j10);
        }

        public static e b(long j3, long j10) {
            return new e(-2, j3, j10);
        }

        public static e a(long j3) {
            return new e(0, C.TIME_UNSET, j3);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        e a(j8 j8Var, long j3);

        default void a() {
        }
    }

    public h2(d dVar, f fVar, long j3, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f5064b = fVar;
        this.f5066d = i10;
        this.a = new a(dVar, j3, j10, j11, j12, j13, j14);
    }

    public final ej a() {
        return this.a;
    }

    public void b(boolean z10, long j3) {
    }

    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            c cVar = (c) a1.b(this.f5065c);
            long b3 = cVar.b();
            long a10 = cVar.a();
            long c10 = cVar.c();
            if (a10 - b3 <= this.f5066d) {
                a(false, b3);
                return a(j8Var, b3, qhVar);
            }
            if (!a(j8Var, c10)) {
                return a(j8Var, c10, qhVar);
            }
            j8Var.b();
            e a11 = this.f5064b.a(j8Var, cVar.e());
            int i10 = a11.a;
            if (i10 == -3) {
                a(false, c10);
                return a(j8Var, c10, qhVar);
            }
            if (i10 == -2) {
                cVar.b(a11.f5081b, a11.f5082c);
            } else {
                if (i10 != -1) {
                    if (i10 == 0) {
                        a(j8Var, a11.f5082c);
                        a(true, a11.f5082c);
                        return a(j8Var, a11.f5082c, qhVar);
                    }
                    throw new IllegalStateException("Invalid case");
                }
                cVar.a(a11.f5081b, a11.f5082c);
            }
        }
    }

    public final boolean b() {
        return this.f5065c != null;
    }

    public final void b(long j3) {
        c cVar = this.f5065c;
        if (cVar == null || cVar.d() != j3) {
            this.f5065c = a(j3);
        }
    }

    public final void a(boolean z10, long j3) {
        this.f5065c = null;
        this.f5064b.a();
        b(z10, j3);
    }

    public final int a(j8 j8Var, long j3, qh qhVar) {
        if (j3 == j8Var.f()) {
            return 0;
        }
        qhVar.a = j3;
        return 1;
    }

    public final boolean a(j8 j8Var, long j3) {
        long f10 = j3 - j8Var.f();
        if (f10 < 0 || f10 > 262144) {
            return false;
        }
        j8Var.a((int) f10);
        return true;
    }

    public c a(long j3) {
        return new c(j3, this.a.c(j3), this.a.f5068c, this.a.f5069d, this.a.f5070e, this.a.f5071f, this.a.f5072g);
    }
}
