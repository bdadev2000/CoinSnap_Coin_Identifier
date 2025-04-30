package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
final class p8 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f9986c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9987d;

    /* renamed from: f, reason: collision with root package name */
    private int f9989f;

    /* renamed from: a, reason: collision with root package name */
    private a f9985a = new a();
    private a b = new a();

    /* renamed from: e, reason: collision with root package name */
    private long f9988e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f9990a;
        private long b;

        /* renamed from: c, reason: collision with root package name */
        private long f9991c;

        /* renamed from: d, reason: collision with root package name */
        private long f9992d;

        /* renamed from: e, reason: collision with root package name */
        private long f9993e;

        /* renamed from: f, reason: collision with root package name */
        private long f9994f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f9995g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f9996h;

        public long a() {
            long j7 = this.f9993e;
            if (j7 == 0) {
                return 0L;
            }
            return this.f9994f / j7;
        }

        public long b() {
            return this.f9994f;
        }

        public boolean c() {
            long j7 = this.f9992d;
            if (j7 == 0) {
                return false;
            }
            return this.f9995g[a(j7 - 1)];
        }

        public boolean d() {
            if (this.f9992d > 15 && this.f9996h == 0) {
                return true;
            }
            return false;
        }

        public void e() {
            this.f9992d = 0L;
            this.f9993e = 0L;
            this.f9994f = 0L;
            this.f9996h = 0;
            Arrays.fill(this.f9995g, false);
        }

        private static int a(long j7) {
            return (int) (j7 % 15);
        }

        public void b(long j7) {
            long j9 = this.f9992d;
            if (j9 == 0) {
                this.f9990a = j7;
            } else if (j9 == 1) {
                long j10 = j7 - this.f9990a;
                this.b = j10;
                this.f9994f = j10;
                this.f9993e = 1L;
            } else {
                long j11 = j7 - this.f9991c;
                int a6 = a(j9);
                if (Math.abs(j11 - this.b) <= 1000000) {
                    this.f9993e++;
                    this.f9994f += j11;
                    boolean[] zArr = this.f9995g;
                    if (zArr[a6]) {
                        zArr[a6] = false;
                        this.f9996h--;
                    }
                } else {
                    boolean[] zArr2 = this.f9995g;
                    if (!zArr2[a6]) {
                        zArr2[a6] = true;
                        this.f9996h++;
                    }
                }
            }
            this.f9992d++;
            this.f9991c = j7;
        }
    }

    public long a() {
        return e() ? this.f9985a.a() : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f9985a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f9989f;
    }

    public long d() {
        if (e()) {
            return this.f9985a.b();
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public boolean e() {
        return this.f9985a.d();
    }

    public void f() {
        this.f9985a.e();
        this.b.e();
        this.f9986c = false;
        this.f9988e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f9989f = 0;
    }

    public void a(long j7) {
        this.f9985a.b(j7);
        if (this.f9985a.d() && !this.f9987d) {
            this.f9986c = false;
        } else if (this.f9988e != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            if (!this.f9986c || this.b.c()) {
                this.b.e();
                this.b.b(this.f9988e);
            }
            this.f9986c = true;
            this.b.b(j7);
        }
        if (this.f9986c && this.b.d()) {
            a aVar = this.f9985a;
            this.f9985a = this.b;
            this.b = aVar;
            this.f9986c = false;
            this.f9987d = false;
        }
        this.f9988e = j7;
        this.f9989f = this.f9985a.d() ? 0 : this.f9989f + 1;
    }
}
