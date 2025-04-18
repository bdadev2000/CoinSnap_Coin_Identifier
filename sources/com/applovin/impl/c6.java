package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.od;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class c6 implements fc {
    private final float a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3987b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3988c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3989d;

    /* renamed from: e, reason: collision with root package name */
    private final long f3990e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3991f;

    /* renamed from: g, reason: collision with root package name */
    private final float f3992g;

    /* renamed from: h, reason: collision with root package name */
    private long f3993h;

    /* renamed from: i, reason: collision with root package name */
    private long f3994i;

    /* renamed from: j, reason: collision with root package name */
    private long f3995j;

    /* renamed from: k, reason: collision with root package name */
    private long f3996k;

    /* renamed from: l, reason: collision with root package name */
    private long f3997l;

    /* renamed from: m, reason: collision with root package name */
    private long f3998m;

    /* renamed from: n, reason: collision with root package name */
    private float f3999n;

    /* renamed from: o, reason: collision with root package name */
    private float f4000o;

    /* renamed from: p, reason: collision with root package name */
    private float f4001p;

    /* renamed from: q, reason: collision with root package name */
    private long f4002q;

    /* renamed from: r, reason: collision with root package name */
    private long f4003r;

    /* renamed from: s, reason: collision with root package name */
    private long f4004s;

    /* loaded from: classes.dex */
    public static final class b {
        private float a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f4005b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f4006c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f4007d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f4008e = r2.a(20L);

        /* renamed from: f, reason: collision with root package name */
        private long f4009f = r2.a(500L);

        /* renamed from: g, reason: collision with root package name */
        private float f4010g = 0.999f;

        public c6 a() {
            return new c6(this.a, this.f4005b, this.f4006c, this.f4007d, this.f4008e, this.f4009f, this.f4010g);
        }
    }

    private c6(float f10, float f11, long j3, float f12, long j10, long j11, float f13) {
        this.a = f10;
        this.f3987b = f11;
        this.f3988c = j3;
        this.f3989d = f12;
        this.f3990e = j10;
        this.f3991f = j11;
        this.f3992g = f13;
        this.f3993h = C.TIME_UNSET;
        this.f3994i = C.TIME_UNSET;
        this.f3996k = C.TIME_UNSET;
        this.f3997l = C.TIME_UNSET;
        this.f4000o = f10;
        this.f3999n = f11;
        this.f4001p = 1.0f;
        this.f4002q = C.TIME_UNSET;
        this.f3995j = C.TIME_UNSET;
        this.f3998m = C.TIME_UNSET;
        this.f4003r = C.TIME_UNSET;
        this.f4004s = C.TIME_UNSET;
    }

    private static long a(long j3, long j10, float f10) {
        return ((1.0f - f10) * ((float) j10)) + (((float) j3) * f10);
    }

    private void b(long j3) {
        long j10 = (this.f4004s * 3) + this.f4003r;
        if (this.f3998m > j10) {
            float a10 = (float) r2.a(this.f3988c);
            this.f3998m = nc.a(j10, this.f3995j, this.f3998m - (((this.f4001p - 1.0f) * a10) + ((this.f3999n - 1.0f) * a10)));
            return;
        }
        long b3 = yp.b(j3 - (Math.max(0.0f, this.f4001p - 1.0f) / this.f3989d), this.f3998m, j10);
        this.f3998m = b3;
        long j11 = this.f3997l;
        if (j11 == C.TIME_UNSET || b3 <= j11) {
            return;
        }
        this.f3998m = j11;
    }

    private void c() {
        long j3 = this.f3993h;
        if (j3 != C.TIME_UNSET) {
            long j10 = this.f3994i;
            if (j10 != C.TIME_UNSET) {
                j3 = j10;
            }
            long j11 = this.f3996k;
            if (j11 != C.TIME_UNSET && j3 < j11) {
                j3 = j11;
            }
            long j12 = this.f3997l;
            if (j12 != C.TIME_UNSET && j3 > j12) {
                j3 = j12;
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f3995j == j3) {
            return;
        }
        this.f3995j = j3;
        this.f3998m = j3;
        this.f4003r = C.TIME_UNSET;
        this.f4004s = C.TIME_UNSET;
        this.f4002q = C.TIME_UNSET;
    }

    @Override // com.applovin.impl.fc
    public float a(long j3, long j10) {
        if (this.f3993h == C.TIME_UNSET) {
            return 1.0f;
        }
        b(j3, j10);
        if (this.f4002q != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f4002q < this.f3988c) {
            return this.f4001p;
        }
        this.f4002q = SystemClock.elapsedRealtime();
        b(j3);
        long j11 = j3 - this.f3998m;
        if (Math.abs(j11) < this.f3990e) {
            this.f4001p = 1.0f;
        } else {
            this.f4001p = yp.a((this.f3989d * ((float) j11)) + 1.0f, this.f4000o, this.f3999n);
        }
        return this.f4001p;
    }

    @Override // com.applovin.impl.fc
    public long b() {
        return this.f3998m;
    }

    private void b(long j3, long j10) {
        long j11 = j3 - j10;
        long j12 = this.f4003r;
        if (j12 == C.TIME_UNSET) {
            this.f4003r = j11;
            this.f4004s = 0L;
        } else {
            long max = Math.max(j11, a(j12, j11, this.f3992g));
            this.f4003r = max;
            this.f4004s = a(this.f4004s, Math.abs(j11 - max), this.f3992g);
        }
    }

    @Override // com.applovin.impl.fc
    public void a() {
        long j3 = this.f3998m;
        if (j3 == C.TIME_UNSET) {
            return;
        }
        long j10 = j3 + this.f3991f;
        this.f3998m = j10;
        long j11 = this.f3997l;
        if (j11 != C.TIME_UNSET && j10 > j11) {
            this.f3998m = j11;
        }
        this.f4002q = C.TIME_UNSET;
    }

    @Override // com.applovin.impl.fc
    public void a(od.f fVar) {
        this.f3993h = r2.a(fVar.a);
        this.f3996k = r2.a(fVar.f6516b);
        this.f3997l = r2.a(fVar.f6517c);
        float f10 = fVar.f6518d;
        if (f10 == -3.4028235E38f) {
            f10 = this.a;
        }
        this.f4000o = f10;
        float f11 = fVar.f6519f;
        if (f11 == -3.4028235E38f) {
            f11 = this.f3987b;
        }
        this.f3999n = f11;
        c();
    }

    @Override // com.applovin.impl.fc
    public void a(long j3) {
        this.f3994i = j3;
        c();
    }
}
