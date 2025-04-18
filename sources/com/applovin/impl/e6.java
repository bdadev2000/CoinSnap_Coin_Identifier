package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.td;

/* loaded from: classes2.dex */
public final class e6 implements kc {

    /* renamed from: a, reason: collision with root package name */
    private final float f23583a;

    /* renamed from: b, reason: collision with root package name */
    private final float f23584b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23585c;
    private final float d;
    private final long e;

    /* renamed from: f, reason: collision with root package name */
    private final long f23586f;

    /* renamed from: g, reason: collision with root package name */
    private final float f23587g;

    /* renamed from: h, reason: collision with root package name */
    private long f23588h;

    /* renamed from: i, reason: collision with root package name */
    private long f23589i;

    /* renamed from: j, reason: collision with root package name */
    private long f23590j;

    /* renamed from: k, reason: collision with root package name */
    private long f23591k;

    /* renamed from: l, reason: collision with root package name */
    private long f23592l;

    /* renamed from: m, reason: collision with root package name */
    private long f23593m;

    /* renamed from: n, reason: collision with root package name */
    private float f23594n;

    /* renamed from: o, reason: collision with root package name */
    private float f23595o;

    /* renamed from: p, reason: collision with root package name */
    private float f23596p;

    /* renamed from: q, reason: collision with root package name */
    private long f23597q;

    /* renamed from: r, reason: collision with root package name */
    private long f23598r;

    /* renamed from: s, reason: collision with root package name */
    private long f23599s;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f23600a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f23601b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f23602c = 1000;
        private float d = 1.0E-7f;
        private long e = t2.a(20L);

        /* renamed from: f, reason: collision with root package name */
        private long f23603f = t2.a(500L);

        /* renamed from: g, reason: collision with root package name */
        private float f23604g = 0.999f;

        public e6 a() {
            return new e6(this.f23600a, this.f23601b, this.f23602c, this.d, this.e, this.f23603f, this.f23604g);
        }
    }

    private e6(float f2, float f3, long j2, float f4, long j3, long j4, float f5) {
        this.f23583a = f2;
        this.f23584b = f3;
        this.f23585c = j2;
        this.d = f4;
        this.e = j3;
        this.f23586f = j4;
        this.f23587g = f5;
        this.f23588h = -9223372036854775807L;
        this.f23589i = -9223372036854775807L;
        this.f23591k = -9223372036854775807L;
        this.f23592l = -9223372036854775807L;
        this.f23595o = f2;
        this.f23594n = f3;
        this.f23596p = 1.0f;
        this.f23597q = -9223372036854775807L;
        this.f23590j = -9223372036854775807L;
        this.f23593m = -9223372036854775807L;
        this.f23598r = -9223372036854775807L;
        this.f23599s = -9223372036854775807L;
    }

    private static long a(long j2, long j3, float f2) {
        return ((1.0f - f2) * ((float) j3)) + (((float) j2) * f2);
    }

    private void c() {
        long j2 = this.f23588h;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f23589i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.f23591k;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f23592l;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f23590j == j2) {
            return;
        }
        this.f23590j = j2;
        this.f23593m = j2;
        this.f23598r = -9223372036854775807L;
        this.f23599s = -9223372036854775807L;
        this.f23597q = -9223372036854775807L;
    }

    @Override // com.applovin.impl.kc
    public long b() {
        return this.f23593m;
    }

    private void b(long j2) {
        long j3 = (this.f23599s * 3) + this.f23598r;
        if (this.f23593m > j3) {
            float a2 = (float) t2.a(this.f23585c);
            this.f23593m = sc.a(j3, this.f23590j, this.f23593m - (((this.f23596p - 1.0f) * a2) + ((this.f23594n - 1.0f) * a2)));
            return;
        }
        long b2 = xp.b(j2 - (Math.max(0.0f, this.f23596p - 1.0f) / this.d), this.f23593m, j3);
        this.f23593m = b2;
        long j4 = this.f23592l;
        if (j4 == -9223372036854775807L || b2 <= j4) {
            return;
        }
        this.f23593m = j4;
    }

    @Override // com.applovin.impl.kc
    public void a() {
        long j2 = this.f23593m;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.f23586f;
        this.f23593m = j3;
        long j4 = this.f23592l;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.f23593m = j4;
        }
        this.f23597q = -9223372036854775807L;
    }

    @Override // com.applovin.impl.kc
    public float a(long j2, long j3) {
        if (this.f23588h == -9223372036854775807L) {
            return 1.0f;
        }
        b(j2, j3);
        if (this.f23597q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f23597q < this.f23585c) {
            return this.f23596p;
        }
        this.f23597q = SystemClock.elapsedRealtime();
        b(j2);
        long j4 = j2 - this.f23593m;
        if (Math.abs(j4) < this.e) {
            this.f23596p = 1.0f;
        } else {
            this.f23596p = xp.a((this.d * ((float) j4)) + 1.0f, this.f23595o, this.f23594n);
        }
        return this.f23596p;
    }

    private void b(long j2, long j3) {
        long j4 = j2 - j3;
        long j5 = this.f23598r;
        if (j5 == -9223372036854775807L) {
            this.f23598r = j4;
            this.f23599s = 0L;
        } else {
            long max = Math.max(j4, a(j5, j4, this.f23587g));
            this.f23598r = max;
            this.f23599s = a(this.f23599s, Math.abs(j4 - max), this.f23587g);
        }
    }

    @Override // com.applovin.impl.kc
    public void a(td.f fVar) {
        this.f23588h = t2.a(fVar.f27093a);
        this.f23591k = t2.a(fVar.f27094b);
        this.f23592l = t2.a(fVar.f27095c);
        float f2 = fVar.d;
        if (f2 == -3.4028235E38f) {
            f2 = this.f23583a;
        }
        this.f23595o = f2;
        float f3 = fVar.f27096f;
        if (f3 == -3.4028235E38f) {
            f3 = this.f23584b;
        }
        this.f23594n = f3;
        c();
    }

    @Override // com.applovin.impl.kc
    public void a(long j2) {
        this.f23589i = j2;
        c();
    }
}
