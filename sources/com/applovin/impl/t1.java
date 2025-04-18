package com.applovin.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class t1 {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f8106b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f8107c;

    /* renamed from: d, reason: collision with root package name */
    private int f8108d;

    /* renamed from: e, reason: collision with root package name */
    private int f8109e;

    /* renamed from: f, reason: collision with root package name */
    private s1 f8110f;

    /* renamed from: g, reason: collision with root package name */
    private int f8111g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8112h;

    /* renamed from: i, reason: collision with root package name */
    private long f8113i;

    /* renamed from: j, reason: collision with root package name */
    private float f8114j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8115k;

    /* renamed from: l, reason: collision with root package name */
    private long f8116l;

    /* renamed from: m, reason: collision with root package name */
    private long f8117m;

    /* renamed from: n, reason: collision with root package name */
    private Method f8118n;

    /* renamed from: o, reason: collision with root package name */
    private long f8119o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8120p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8121q;

    /* renamed from: r, reason: collision with root package name */
    private long f8122r;

    /* renamed from: s, reason: collision with root package name */
    private long f8123s;

    /* renamed from: t, reason: collision with root package name */
    private long f8124t;
    private long u;

    /* renamed from: v, reason: collision with root package name */
    private int f8125v;

    /* renamed from: w, reason: collision with root package name */
    private int f8126w;

    /* renamed from: x, reason: collision with root package name */
    private long f8127x;

    /* renamed from: y, reason: collision with root package name */
    private long f8128y;

    /* renamed from: z, reason: collision with root package name */
    private long f8129z;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, long j3);

        void a(long j3);

        void a(long j3, long j10, long j11, long j12);

        void b(long j3);

        void b(long j3, long j10, long j11, long j12);
    }

    public t1(a aVar) {
        this.a = (a) a1.a(aVar);
        if (yp.a >= 18) {
            try {
                this.f8118n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f8106b = new long[10];
    }

    private boolean a() {
        return this.f8112h && ((AudioTrack) a1.a(this.f8107c)).getPlayState() == 2 && b() == 0;
    }

    private void h(long j3) {
        Method method;
        if (!this.f8121q || (method = this.f8118n) == null || j3 - this.f8122r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) yp.a((Integer) method.invoke(a1.a(this.f8107c), new Object[0]))).intValue() * 1000) - this.f8113i;
            this.f8119o = intValue;
            long max = Math.max(intValue, 0L);
            this.f8119o = max;
            if (max > 5000000) {
                this.a.b(max);
                this.f8119o = 0L;
            }
        } catch (Exception unused) {
            this.f8118n = null;
        }
        this.f8122r = j3;
    }

    public int b(long j3) {
        return this.f8109e - ((int) (j3 - (b() * this.f8108d)));
    }

    public long c(long j3) {
        return r2.b(a(j3 - b()));
    }

    public void d(long j3) {
        this.f8129z = b();
        this.f8127x = SystemClock.elapsedRealtime() * 1000;
        this.A = j3;
    }

    public boolean e(long j3) {
        return j3 > b() || a();
    }

    public boolean f(long j3) {
        return this.f8128y != C.TIME_UNSET && j3 > 0 && SystemClock.elapsedRealtime() - this.f8128y >= 200;
    }

    public boolean g(long j3) {
        int playState = ((AudioTrack) a1.a(this.f8107c)).getPlayState();
        if (this.f8112h) {
            if (playState == 2) {
                this.f8120p = false;
                return false;
            }
            if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z10 = this.f8120p;
        boolean e2 = e(j3);
        this.f8120p = e2;
        if (z10 && !e2 && playState != 1) {
            this.a.a(this.f8109e, r2.b(this.f8113i));
        }
        return true;
    }

    public void i() {
        ((s1) a1.a(this.f8110f)).f();
    }

    private long c() {
        return a(b());
    }

    private void e() {
        long c10 = c();
        if (c10 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f8117m >= 30000) {
            long[] jArr = this.f8106b;
            int i10 = this.f8125v;
            jArr[i10] = c10 - nanoTime;
            this.f8125v = (i10 + 1) % 10;
            int i11 = this.f8126w;
            if (i11 < 10) {
                this.f8126w = i11 + 1;
            }
            this.f8117m = nanoTime;
            this.f8116l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f8126w;
                if (i12 >= i13) {
                    break;
                }
                this.f8116l = (this.f8106b[i12] / i13) + this.f8116l;
                i12++;
            }
        }
        if (this.f8112h) {
            return;
        }
        a(nanoTime, c10);
        h(nanoTime);
    }

    private long b() {
        AudioTrack audioTrack = (AudioTrack) a1.a(this.f8107c);
        if (this.f8127x != C.TIME_UNSET) {
            return Math.min(this.A, this.f8129z + ((((SystemClock.elapsedRealtime() * 1000) - this.f8127x) * this.f8111g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f8112h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.f8123s;
            }
            playbackHeadPosition += this.u;
        }
        if (yp.a <= 29) {
            if (playbackHeadPosition == 0 && this.f8123s > 0 && playState == 3) {
                if (this.f8128y == C.TIME_UNSET) {
                    this.f8128y = SystemClock.elapsedRealtime();
                }
                return this.f8123s;
            }
            this.f8128y = C.TIME_UNSET;
        }
        if (this.f8123s > playbackHeadPosition) {
            this.f8124t++;
        }
        this.f8123s = playbackHeadPosition;
        return playbackHeadPosition + (this.f8124t << 32);
    }

    public boolean f() {
        h();
        if (this.f8127x != C.TIME_UNSET) {
            return false;
        }
        ((s1) a1.a(this.f8110f)).f();
        return true;
    }

    private long a(long j3) {
        return (j3 * 1000000) / this.f8111g;
    }

    public boolean d() {
        return ((AudioTrack) a1.a(this.f8107c)).getPlayState() == 3;
    }

    public long a(boolean z10) {
        long j3;
        long j10;
        if (((AudioTrack) a1.a(this.f8107c)).getPlayState() == 3) {
            e();
        }
        long nanoTime = System.nanoTime() / 1000;
        s1 s1Var = (s1) a1.a(this.f8110f);
        boolean d10 = s1Var.d();
        if (d10) {
            j10 = yp.a(nanoTime - s1Var.c(), this.f8114j) + a(s1Var.b());
        } else {
            if (this.f8126w == 0) {
                j3 = c();
            } else {
                j3 = this.f8116l + nanoTime;
            }
            j10 = j3;
            if (!z10) {
                j10 = Math.max(0L, j10 - this.f8119o);
            }
        }
        if (this.D != d10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime - this.F;
        if (j11 < 1000000) {
            long a10 = yp.a(j11, this.f8114j) + this.E;
            long j12 = (j11 * 1000) / 1000000;
            j10 = (((1000 - j12) * a10) + (j10 * j12)) / 1000;
        }
        if (!this.f8115k) {
            long j13 = this.B;
            if (j10 > j13) {
                this.f8115k = true;
                this.a.a(System.currentTimeMillis() - r2.b(yp.b(r2.b(j10 - j13), this.f8114j)));
            }
        }
        this.C = nanoTime;
        this.B = j10;
        this.D = d10;
        return j10;
    }

    public void g() {
        h();
        this.f8107c = null;
        this.f8110f = null;
    }

    private void h() {
        this.f8116l = 0L;
        this.f8126w = 0;
        this.f8125v = 0;
        this.f8117m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f8115k = false;
    }

    private void a(long j3, long j10) {
        s1 s1Var = (s1) a1.a(this.f8110f);
        if (s1Var.a(j3)) {
            long c10 = s1Var.c();
            long b3 = s1Var.b();
            if (Math.abs(c10 - j3) > 5000000) {
                this.a.b(b3, c10, j3, j10);
                s1Var.e();
            } else if (Math.abs(a(b3) - j10) > 5000000) {
                this.a.a(b3, c10, j3, j10);
                s1Var.e();
            } else {
                s1Var.a();
            }
        }
    }

    public void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f8107c = audioTrack;
        this.f8108d = i11;
        this.f8109e = i12;
        this.f8110f = new s1(audioTrack);
        this.f8111g = audioTrack.getSampleRate();
        this.f8112h = z10 && a(i10);
        boolean g10 = yp.g(i10);
        this.f8121q = g10;
        this.f8113i = g10 ? a(i12 / i11) : -9223372036854775807L;
        this.f8123s = 0L;
        this.f8124t = 0L;
        this.u = 0L;
        this.f8120p = false;
        this.f8127x = C.TIME_UNSET;
        this.f8128y = C.TIME_UNSET;
        this.f8122r = 0L;
        this.f8119o = 0L;
        this.f8114j = 1.0f;
    }

    public void a(float f10) {
        this.f8114j = f10;
        s1 s1Var = this.f8110f;
        if (s1Var != null) {
            s1Var.f();
        }
    }

    private static boolean a(int i10) {
        return yp.a < 23 && (i10 == 5 || i10 == 6);
    }
}
