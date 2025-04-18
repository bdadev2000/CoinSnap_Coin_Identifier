package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class r8 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f26273c;
    private boolean d;

    /* renamed from: f, reason: collision with root package name */
    private int f26274f;

    /* renamed from: a, reason: collision with root package name */
    private a f26271a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f26272b = new a();
    private long e = -9223372036854775807L;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f26275a;

        /* renamed from: b, reason: collision with root package name */
        private long f26276b;

        /* renamed from: c, reason: collision with root package name */
        private long f26277c;
        private long d;
        private long e;

        /* renamed from: f, reason: collision with root package name */
        private long f26278f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f26279g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f26280h;

        public long a() {
            long j2 = this.e;
            if (j2 == 0) {
                return 0L;
            }
            return this.f26278f / j2;
        }

        public long b() {
            return this.f26278f;
        }

        public boolean c() {
            long j2 = this.d;
            if (j2 == 0) {
                return false;
            }
            return this.f26279g[a(j2 - 1)];
        }

        public boolean d() {
            return this.d > 15 && this.f26280h == 0;
        }

        public void e() {
            this.d = 0L;
            this.e = 0L;
            this.f26278f = 0L;
            this.f26280h = 0;
            Arrays.fill(this.f26279g, false);
        }

        private static int a(long j2) {
            return (int) (j2 % 15);
        }

        public void b(long j2) {
            long j3 = this.d;
            if (j3 == 0) {
                this.f26275a = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f26275a;
                this.f26276b = j4;
                this.f26278f = j4;
                this.e = 1L;
            } else {
                long j5 = j2 - this.f26277c;
                int a2 = a(j3);
                if (Math.abs(j5 - this.f26276b) <= 1000000) {
                    this.e++;
                    this.f26278f += j5;
                    boolean[] zArr = this.f26279g;
                    if (zArr[a2]) {
                        zArr[a2] = false;
                        this.f26280h--;
                    }
                } else {
                    boolean[] zArr2 = this.f26279g;
                    if (!zArr2[a2]) {
                        zArr2[a2] = true;
                        this.f26280h++;
                    }
                }
            }
            this.d++;
            this.f26277c = j2;
        }
    }

    public long a() {
        if (e()) {
            return this.f26271a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f26271a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f26274f;
    }

    public long d() {
        if (e()) {
            return this.f26271a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f26271a.d();
    }

    public void f() {
        this.f26271a.e();
        this.f26272b.e();
        this.f26273c = false;
        this.e = -9223372036854775807L;
        this.f26274f = 0;
    }

    public void a(long j2) {
        this.f26271a.b(j2);
        if (this.f26271a.d() && !this.d) {
            this.f26273c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.f26273c || this.f26272b.c()) {
                this.f26272b.e();
                this.f26272b.b(this.e);
            }
            this.f26273c = true;
            this.f26272b.b(j2);
        }
        if (this.f26273c && this.f26272b.d()) {
            a aVar = this.f26271a;
            this.f26271a = this.f26272b;
            this.f26272b = aVar;
            this.f26273c = false;
            this.d = false;
        }
        this.e = j2;
        this.f26274f = this.f26271a.d() ? 0 : this.f26274f + 1;
    }
}
