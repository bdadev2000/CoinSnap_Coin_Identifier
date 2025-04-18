package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes.dex */
final class p8 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f6916c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6917d;

    /* renamed from: f, reason: collision with root package name */
    private int f6919f;
    private a a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f6915b = new a();

    /* renamed from: e, reason: collision with root package name */
    private long f6918e = C.TIME_UNSET;

    /* loaded from: classes.dex */
    public static final class a {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private long f6920b;

        /* renamed from: c, reason: collision with root package name */
        private long f6921c;

        /* renamed from: d, reason: collision with root package name */
        private long f6922d;

        /* renamed from: e, reason: collision with root package name */
        private long f6923e;

        /* renamed from: f, reason: collision with root package name */
        private long f6924f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f6925g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f6926h;

        public long a() {
            long j3 = this.f6923e;
            if (j3 == 0) {
                return 0L;
            }
            return this.f6924f / j3;
        }

        public long b() {
            return this.f6924f;
        }

        public boolean c() {
            long j3 = this.f6922d;
            if (j3 == 0) {
                return false;
            }
            return this.f6925g[a(j3 - 1)];
        }

        public boolean d() {
            return this.f6922d > 15 && this.f6926h == 0;
        }

        public void e() {
            this.f6922d = 0L;
            this.f6923e = 0L;
            this.f6924f = 0L;
            this.f6926h = 0;
            Arrays.fill(this.f6925g, false);
        }

        private static int a(long j3) {
            return (int) (j3 % 15);
        }

        public void b(long j3) {
            long j10 = this.f6922d;
            if (j10 == 0) {
                this.a = j3;
            } else if (j10 == 1) {
                long j11 = j3 - this.a;
                this.f6920b = j11;
                this.f6924f = j11;
                this.f6923e = 1L;
            } else {
                long j12 = j3 - this.f6921c;
                int a = a(j10);
                if (Math.abs(j12 - this.f6920b) <= 1000000) {
                    this.f6923e++;
                    this.f6924f += j12;
                    boolean[] zArr = this.f6925g;
                    if (zArr[a]) {
                        zArr[a] = false;
                        this.f6926h--;
                    }
                } else {
                    boolean[] zArr2 = this.f6925g;
                    if (!zArr2[a]) {
                        zArr2[a] = true;
                        this.f6926h++;
                    }
                }
            }
            this.f6922d++;
            this.f6921c = j3;
        }
    }

    public long a() {
        return e() ? this.a.a() : C.TIME_UNSET;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f6919f;
    }

    public long d() {
        return e() ? this.a.b() : C.TIME_UNSET;
    }

    public boolean e() {
        return this.a.d();
    }

    public void f() {
        this.a.e();
        this.f6915b.e();
        this.f6916c = false;
        this.f6918e = C.TIME_UNSET;
        this.f6919f = 0;
    }

    public void a(long j3) {
        this.a.b(j3);
        if (this.a.d() && !this.f6917d) {
            this.f6916c = false;
        } else if (this.f6918e != C.TIME_UNSET) {
            if (!this.f6916c || this.f6915b.c()) {
                this.f6915b.e();
                this.f6915b.b(this.f6918e);
            }
            this.f6916c = true;
            this.f6915b.b(j3);
        }
        if (this.f6916c && this.f6915b.d()) {
            a aVar = this.a;
            this.a = this.f6915b;
            this.f6915b = aVar;
            this.f6916c = false;
            this.f6917d = false;
        }
        this.f6918e = j3;
        this.f6919f = this.a.d() ? 0 : this.f6919f + 1;
    }
}
