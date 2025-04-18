package com.applovin.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class u1 {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a, reason: collision with root package name */
    private final a f27244a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f27245b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f27246c;
    private int d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private t1 f27247f;

    /* renamed from: g, reason: collision with root package name */
    private int f27248g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27249h;

    /* renamed from: i, reason: collision with root package name */
    private long f27250i;

    /* renamed from: j, reason: collision with root package name */
    private float f27251j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27252k;

    /* renamed from: l, reason: collision with root package name */
    private long f27253l;

    /* renamed from: m, reason: collision with root package name */
    private long f27254m;

    /* renamed from: n, reason: collision with root package name */
    private Method f27255n;

    /* renamed from: o, reason: collision with root package name */
    private long f27256o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f27257p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27258q;

    /* renamed from: r, reason: collision with root package name */
    private long f27259r;

    /* renamed from: s, reason: collision with root package name */
    private long f27260s;

    /* renamed from: t, reason: collision with root package name */
    private long f27261t;

    /* renamed from: u, reason: collision with root package name */
    private long f27262u;

    /* renamed from: v, reason: collision with root package name */
    private int f27263v;
    private int w;
    private long x;

    /* renamed from: y, reason: collision with root package name */
    private long f27264y;

    /* renamed from: z, reason: collision with root package name */
    private long f27265z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i2, long j2);

        void a(long j2);

        void a(long j2, long j3, long j4, long j5);

        void b(long j2);

        void b(long j2, long j3, long j4, long j5);
    }

    public u1(a aVar) {
        this.f27244a = (a) b1.a(aVar);
        if (xp.f27962a >= 18) {
            try {
                this.f27255n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f27245b = new long[10];
    }

    private boolean a() {
        return this.f27249h && ((AudioTrack) b1.a(this.f27246c)).getPlayState() == 2 && b() == 0;
    }

    private void h() {
        this.f27253l = 0L;
        this.w = 0;
        this.f27263v = 0;
        this.f27254m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f27252k = false;
    }

    public int b(long j2) {
        return this.e - ((int) (j2 - (b() * this.d)));
    }

    public long c(long j2) {
        return t2.b(a(j2 - b()));
    }

    public void d(long j2) {
        this.f27265z = b();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j2;
    }

    public boolean e(long j2) {
        return j2 > b() || a();
    }

    public boolean f(long j2) {
        return this.f27264y != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.f27264y >= 200;
    }

    public boolean g(long j2) {
        int playState = ((AudioTrack) b1.a(this.f27246c)).getPlayState();
        if (this.f27249h) {
            if (playState == 2) {
                this.f27257p = false;
                return false;
            }
            if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z2 = this.f27257p;
        boolean e = e(j2);
        this.f27257p = e;
        if (z2 && !e && playState != 1) {
            this.f27244a.a(this.e, t2.b(this.f27250i));
        }
        return true;
    }

    public void i() {
        ((t1) b1.a(this.f27247f)).f();
    }

    private long b() {
        AudioTrack audioTrack = (AudioTrack) b1.a(this.f27246c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.f27265z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.f27248g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f27249h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f27262u = this.f27260s;
            }
            playbackHeadPosition += this.f27262u;
        }
        if (xp.f27962a <= 29) {
            if (playbackHeadPosition == 0 && this.f27260s > 0 && playState == 3) {
                if (this.f27264y == -9223372036854775807L) {
                    this.f27264y = SystemClock.elapsedRealtime();
                }
                return this.f27260s;
            }
            this.f27264y = -9223372036854775807L;
        }
        if (this.f27260s > playbackHeadPosition) {
            this.f27261t++;
        }
        this.f27260s = playbackHeadPosition;
        return playbackHeadPosition + (this.f27261t << 32);
    }

    private long c() {
        return a(b());
    }

    private void e() {
        long c2 = c();
        if (c2 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f27254m >= 30000) {
            long[] jArr = this.f27245b;
            int i2 = this.f27263v;
            jArr[i2] = c2 - nanoTime;
            this.f27263v = (i2 + 1) % 10;
            int i3 = this.w;
            if (i3 < 10) {
                this.w = i3 + 1;
            }
            this.f27254m = nanoTime;
            this.f27253l = 0L;
            int i4 = 0;
            while (true) {
                int i5 = this.w;
                if (i4 >= i5) {
                    break;
                }
                this.f27253l = (this.f27245b[i4] / i5) + this.f27253l;
                i4++;
            }
        }
        if (this.f27249h) {
            return;
        }
        a(nanoTime, c2);
        h(nanoTime);
    }

    private void h(long j2) {
        Method method;
        if (!this.f27258q || (method = this.f27255n) == null || j2 - this.f27259r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) xp.a((Integer) method.invoke(b1.a(this.f27246c), new Object[0]))).intValue() * 1000) - this.f27250i;
            this.f27256o = intValue;
            long max = Math.max(intValue, 0L);
            this.f27256o = max;
            if (max > 5000000) {
                this.f27244a.b(max);
                this.f27256o = 0L;
            }
        } catch (Exception unused) {
            this.f27255n = null;
        }
        this.f27259r = j2;
    }

    public boolean f() {
        h();
        if (this.x != -9223372036854775807L) {
            return false;
        }
        ((t1) b1.a(this.f27247f)).f();
        return true;
    }

    private long a(long j2) {
        return (j2 * 1000000) / this.f27248g;
    }

    public boolean d() {
        return ((AudioTrack) b1.a(this.f27246c)).getPlayState() == 3;
    }

    public long a(boolean z2) {
        long c2;
        if (((AudioTrack) b1.a(this.f27246c)).getPlayState() == 3) {
            e();
        }
        long nanoTime = System.nanoTime() / 1000;
        t1 t1Var = (t1) b1.a(this.f27247f);
        boolean d = t1Var.d();
        if (d) {
            c2 = xp.a(nanoTime - t1Var.c(), this.f27251j) + a(t1Var.b());
        } else {
            c2 = this.w == 0 ? c() : this.f27253l + nanoTime;
            if (!z2) {
                c2 = Math.max(0L, c2 - this.f27256o);
            }
        }
        if (this.D != d) {
            this.F = this.C;
            this.E = this.B;
        }
        long j2 = nanoTime - this.F;
        if (j2 < 1000000) {
            long a2 = xp.a(j2, this.f27251j) + this.E;
            long j3 = (j2 * 1000) / 1000000;
            c2 = (((1000 - j3) * a2) + (c2 * j3)) / 1000;
        }
        if (!this.f27252k) {
            long j4 = this.B;
            if (c2 > j4) {
                this.f27252k = true;
                this.f27244a.a(System.currentTimeMillis() - t2.b(xp.b(t2.b(c2 - j4), this.f27251j)));
            }
        }
        this.C = nanoTime;
        this.B = c2;
        this.D = d;
        return c2;
    }

    public void g() {
        h();
        this.f27246c = null;
        this.f27247f = null;
    }

    private void a(long j2, long j3) {
        t1 t1Var = (t1) b1.a(this.f27247f);
        if (t1Var.a(j2)) {
            long c2 = t1Var.c();
            long b2 = t1Var.b();
            if (Math.abs(c2 - j2) > 5000000) {
                this.f27244a.b(b2, c2, j2, j3);
                t1Var.e();
            } else if (Math.abs(a(b2) - j3) > 5000000) {
                this.f27244a.a(b2, c2, j2, j3);
                t1Var.e();
            } else {
                t1Var.a();
            }
        }
    }

    public void a(AudioTrack audioTrack, boolean z2, int i2, int i3, int i4) {
        this.f27246c = audioTrack;
        this.d = i3;
        this.e = i4;
        this.f27247f = new t1(audioTrack);
        this.f27248g = audioTrack.getSampleRate();
        this.f27249h = z2 && a(i2);
        boolean g2 = xp.g(i2);
        this.f27258q = g2;
        this.f27250i = g2 ? a(i4 / i3) : -9223372036854775807L;
        this.f27260s = 0L;
        this.f27261t = 0L;
        this.f27262u = 0L;
        this.f27257p = false;
        this.x = -9223372036854775807L;
        this.f27264y = -9223372036854775807L;
        this.f27259r = 0L;
        this.f27256o = 0L;
        this.f27251j = 1.0f;
    }

    public void a(float f2) {
        this.f27251j = f2;
        t1 t1Var = this.f27247f;
        if (t1Var != null) {
            t1Var.f();
        }
    }

    private static boolean a(int i2) {
        return xp.f27962a < 23 && (i2 == 5 || i2 == 6);
    }
}
