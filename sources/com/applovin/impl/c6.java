package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.od;

/* loaded from: classes.dex */
public final class c6 implements fc {

    /* renamed from: a, reason: collision with root package name */
    private final float f6958a;
    private final float b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6959c;

    /* renamed from: d, reason: collision with root package name */
    private final float f6960d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6961e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6962f;

    /* renamed from: g, reason: collision with root package name */
    private final float f6963g;

    /* renamed from: h, reason: collision with root package name */
    private long f6964h;

    /* renamed from: i, reason: collision with root package name */
    private long f6965i;

    /* renamed from: j, reason: collision with root package name */
    private long f6966j;

    /* renamed from: k, reason: collision with root package name */
    private long f6967k;
    private long l;
    private long m;

    /* renamed from: n, reason: collision with root package name */
    private float f6968n;

    /* renamed from: o, reason: collision with root package name */
    private float f6969o;

    /* renamed from: p, reason: collision with root package name */
    private float f6970p;

    /* renamed from: q, reason: collision with root package name */
    private long f6971q;

    /* renamed from: r, reason: collision with root package name */
    private long f6972r;

    /* renamed from: s, reason: collision with root package name */
    private long f6973s;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f6974a = 0.97f;
        private float b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f6975c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f6976d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f6977e = AbstractC0744r2.a(20L);

        /* renamed from: f, reason: collision with root package name */
        private long f6978f = AbstractC0744r2.a(500L);

        /* renamed from: g, reason: collision with root package name */
        private float f6979g = 0.999f;

        public c6 a() {
            return new c6(this.f6974a, this.b, this.f6975c, this.f6976d, this.f6977e, this.f6978f, this.f6979g);
        }
    }

    private c6(float f9, float f10, long j7, float f11, long j9, long j10, float f12) {
        this.f6958a = f9;
        this.b = f10;
        this.f6959c = j7;
        this.f6960d = f11;
        this.f6961e = j9;
        this.f6962f = j10;
        this.f6963g = f12;
        this.f6964h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6965i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6967k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6969o = f9;
        this.f6968n = f10;
        this.f6970p = 1.0f;
        this.f6971q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6966j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6972r = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6973s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private static long a(long j7, long j9, float f9) {
        return ((1.0f - f9) * ((float) j9)) + (((float) j7) * f9);
    }

    private void b(long j7) {
        long j9 = (this.f6973s * 3) + this.f6972r;
        if (this.m > j9) {
            float a6 = (float) AbstractC0744r2.a(this.f6959c);
            this.m = nc.a(j9, this.f6966j, this.m - (((this.f6970p - 1.0f) * a6) + ((this.f6968n - 1.0f) * a6)));
            return;
        }
        long b8 = yp.b(j7 - (Math.max(0.0f, this.f6970p - 1.0f) / this.f6960d), this.m, j9);
        this.m = b8;
        long j10 = this.l;
        if (j10 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || b8 <= j10) {
            return;
        }
        this.m = j10;
    }

    private void c() {
        long j7 = this.f6964h;
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            long j9 = this.f6965i;
            if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j7 = j9;
            }
            long j10 = this.f6967k;
            if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 < j10) {
                j7 = j10;
            }
            long j11 = this.l;
            if (j11 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 > j11) {
                j7 = j11;
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f6966j == j7) {
            return;
        }
        this.f6966j = j7;
        this.m = j7;
        this.f6972r = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6973s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f6971q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.fc
    public float a(long j7, long j9) {
        if (this.f6964h == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return 1.0f;
        }
        b(j7, j9);
        if (this.f6971q != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f6971q < this.f6959c) {
            return this.f6970p;
        }
        this.f6971q = SystemClock.elapsedRealtime();
        b(j7);
        long j10 = j7 - this.m;
        if (Math.abs(j10) < this.f6961e) {
            this.f6970p = 1.0f;
        } else {
            this.f6970p = yp.a((this.f6960d * ((float) j10)) + 1.0f, this.f6969o, this.f6968n);
        }
        return this.f6970p;
    }

    @Override // com.applovin.impl.fc
    public long b() {
        return this.m;
    }

    private void b(long j7, long j9) {
        long j10 = j7 - j9;
        long j11 = this.f6972r;
        if (j11 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f6972r = j10;
            this.f6973s = 0L;
        } else {
            long max = Math.max(j10, a(j11, j10, this.f6963g));
            this.f6972r = max;
            this.f6973s = a(this.f6973s, Math.abs(j10 - max), this.f6963g);
        }
    }

    @Override // com.applovin.impl.fc
    public void a() {
        long j7 = this.m;
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return;
        }
        long j9 = j7 + this.f6962f;
        this.m = j9;
        long j10 = this.l;
        if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j9 > j10) {
            this.m = j10;
        }
        this.f6971q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.fc
    public void a(od.f fVar) {
        this.f6964h = AbstractC0744r2.a(fVar.f9449a);
        this.f6967k = AbstractC0744r2.a(fVar.b);
        this.l = AbstractC0744r2.a(fVar.f9450c);
        float f9 = fVar.f9451d;
        if (f9 == -3.4028235E38f) {
            f9 = this.f6958a;
        }
        this.f6969o = f9;
        float f10 = fVar.f9452f;
        if (f10 == -3.4028235E38f) {
            f10 = this.b;
        }
        this.f6968n = f10;
        c();
    }

    @Override // com.applovin.impl.fc
    public void a(long j7) {
        this.f6965i = j7;
        c();
    }
}
