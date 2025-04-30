package com.applovin.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: com.applovin.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0759t1 {

    /* renamed from: A, reason: collision with root package name */
    private long f11255A;

    /* renamed from: B, reason: collision with root package name */
    private long f11256B;

    /* renamed from: C, reason: collision with root package name */
    private long f11257C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f11258D;

    /* renamed from: E, reason: collision with root package name */
    private long f11259E;

    /* renamed from: F, reason: collision with root package name */
    private long f11260F;

    /* renamed from: a, reason: collision with root package name */
    private final a f11261a;
    private final long[] b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f11262c;

    /* renamed from: d, reason: collision with root package name */
    private int f11263d;

    /* renamed from: e, reason: collision with root package name */
    private int f11264e;

    /* renamed from: f, reason: collision with root package name */
    private C0747s1 f11265f;

    /* renamed from: g, reason: collision with root package name */
    private int f11266g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11267h;

    /* renamed from: i, reason: collision with root package name */
    private long f11268i;

    /* renamed from: j, reason: collision with root package name */
    private float f11269j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11270k;
    private long l;
    private long m;

    /* renamed from: n, reason: collision with root package name */
    private Method f11271n;

    /* renamed from: o, reason: collision with root package name */
    private long f11272o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11273p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11274q;

    /* renamed from: r, reason: collision with root package name */
    private long f11275r;

    /* renamed from: s, reason: collision with root package name */
    private long f11276s;

    /* renamed from: t, reason: collision with root package name */
    private long f11277t;

    /* renamed from: u, reason: collision with root package name */
    private long f11278u;

    /* renamed from: v, reason: collision with root package name */
    private int f11279v;

    /* renamed from: w, reason: collision with root package name */
    private int f11280w;

    /* renamed from: x, reason: collision with root package name */
    private long f11281x;

    /* renamed from: y, reason: collision with root package name */
    private long f11282y;

    /* renamed from: z, reason: collision with root package name */
    private long f11283z;

    /* renamed from: com.applovin.impl.t1$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i9, long j7);

        void a(long j7);

        void a(long j7, long j9, long j10, long j11);

        void b(long j7);

        void b(long j7, long j9, long j10, long j11);
    }

    public C0759t1(a aVar) {
        this.f11261a = (a) AbstractC0669a1.a(aVar);
        if (yp.f12451a >= 18) {
            try {
                this.f11271n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    private boolean a() {
        return this.f11267h && ((AudioTrack) AbstractC0669a1.a(this.f11262c)).getPlayState() == 2 && b() == 0;
    }

    private void h(long j7) {
        Method method;
        if (!this.f11274q || (method = this.f11271n) == null || j7 - this.f11275r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) yp.a((Integer) method.invoke(AbstractC0669a1.a(this.f11262c), null))).intValue() * 1000) - this.f11268i;
            this.f11272o = intValue;
            long max = Math.max(intValue, 0L);
            this.f11272o = max;
            if (max > 5000000) {
                this.f11261a.b(max);
                this.f11272o = 0L;
            }
        } catch (Exception unused) {
            this.f11271n = null;
        }
        this.f11275r = j7;
    }

    public int b(long j7) {
        return this.f11264e - ((int) (j7 - (b() * this.f11263d)));
    }

    public long c(long j7) {
        return AbstractC0744r2.b(a(j7 - b()));
    }

    public void d(long j7) {
        this.f11283z = b();
        this.f11281x = SystemClock.elapsedRealtime() * 1000;
        this.f11255A = j7;
    }

    public boolean e(long j7) {
        return j7 > b() || a();
    }

    public boolean f(long j7) {
        return this.f11282y != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 > 0 && SystemClock.elapsedRealtime() - this.f11282y >= 200;
    }

    public boolean g(long j7) {
        int playState = ((AudioTrack) AbstractC0669a1.a(this.f11262c)).getPlayState();
        if (this.f11267h) {
            if (playState == 2) {
                this.f11273p = false;
                return false;
            }
            if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z8 = this.f11273p;
        boolean e4 = e(j7);
        this.f11273p = e4;
        if (z8 && !e4 && playState != 1) {
            this.f11261a.a(this.f11264e, AbstractC0744r2.b(this.f11268i));
        }
        return true;
    }

    public void i() {
        ((C0747s1) AbstractC0669a1.a(this.f11265f)).f();
    }

    private long c() {
        return a(b());
    }

    private void e() {
        long c9 = c();
        if (c9 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.m >= 30000) {
            long[] jArr = this.b;
            int i9 = this.f11279v;
            jArr[i9] = c9 - nanoTime;
            this.f11279v = (i9 + 1) % 10;
            int i10 = this.f11280w;
            if (i10 < 10) {
                this.f11280w = i10 + 1;
            }
            this.m = nanoTime;
            this.l = 0L;
            int i11 = 0;
            while (true) {
                int i12 = this.f11280w;
                if (i11 >= i12) {
                    break;
                }
                this.l = (this.b[i11] / i12) + this.l;
                i11++;
            }
        }
        if (this.f11267h) {
            return;
        }
        a(nanoTime, c9);
        h(nanoTime);
    }

    private long b() {
        AudioTrack audioTrack = (AudioTrack) AbstractC0669a1.a(this.f11262c);
        if (this.f11281x != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return Math.min(this.f11255A, this.f11283z + ((((SystemClock.elapsedRealtime() * 1000) - this.f11281x) * this.f11266g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f11267h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f11278u = this.f11276s;
            }
            playbackHeadPosition += this.f11278u;
        }
        if (yp.f12451a <= 29) {
            if (playbackHeadPosition == 0 && this.f11276s > 0 && playState == 3) {
                if (this.f11282y == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    this.f11282y = SystemClock.elapsedRealtime();
                }
                return this.f11276s;
            }
            this.f11282y = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        if (this.f11276s > playbackHeadPosition) {
            this.f11277t++;
        }
        this.f11276s = playbackHeadPosition;
        return playbackHeadPosition + (this.f11277t << 32);
    }

    public boolean f() {
        h();
        if (this.f11281x != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return false;
        }
        ((C0747s1) AbstractC0669a1.a(this.f11265f)).f();
        return true;
    }

    private long a(long j7) {
        return (j7 * 1000000) / this.f11266g;
    }

    public boolean d() {
        return ((AudioTrack) AbstractC0669a1.a(this.f11262c)).getPlayState() == 3;
    }

    public long a(boolean z8) {
        long j7;
        long j9;
        if (((AudioTrack) AbstractC0669a1.a(this.f11262c)).getPlayState() == 3) {
            e();
        }
        long nanoTime = System.nanoTime() / 1000;
        C0747s1 c0747s1 = (C0747s1) AbstractC0669a1.a(this.f11265f);
        boolean d2 = c0747s1.d();
        if (d2) {
            j9 = yp.a(nanoTime - c0747s1.c(), this.f11269j) + a(c0747s1.b());
        } else {
            if (this.f11280w == 0) {
                j7 = c();
            } else {
                j7 = this.l + nanoTime;
            }
            j9 = j7;
            if (!z8) {
                j9 = Math.max(0L, j9 - this.f11272o);
            }
        }
        if (this.f11258D != d2) {
            this.f11260F = this.f11257C;
            this.f11259E = this.f11256B;
        }
        long j10 = nanoTime - this.f11260F;
        if (j10 < 1000000) {
            long a6 = yp.a(j10, this.f11269j) + this.f11259E;
            long j11 = (j10 * 1000) / 1000000;
            j9 = (((1000 - j11) * a6) + (j9 * j11)) / 1000;
        }
        if (!this.f11270k) {
            long j12 = this.f11256B;
            if (j9 > j12) {
                this.f11270k = true;
                this.f11261a.a(System.currentTimeMillis() - AbstractC0744r2.b(yp.b(AbstractC0744r2.b(j9 - j12), this.f11269j)));
            }
        }
        this.f11257C = nanoTime;
        this.f11256B = j9;
        this.f11258D = d2;
        return j9;
    }

    public void g() {
        h();
        this.f11262c = null;
        this.f11265f = null;
    }

    private void h() {
        this.l = 0L;
        this.f11280w = 0;
        this.f11279v = 0;
        this.m = 0L;
        this.f11257C = 0L;
        this.f11260F = 0L;
        this.f11270k = false;
    }

    private void a(long j7, long j9) {
        C0747s1 c0747s1 = (C0747s1) AbstractC0669a1.a(this.f11265f);
        if (c0747s1.a(j7)) {
            long c9 = c0747s1.c();
            long b = c0747s1.b();
            if (Math.abs(c9 - j7) > 5000000) {
                this.f11261a.b(b, c9, j7, j9);
                c0747s1.e();
            } else if (Math.abs(a(b) - j9) > 5000000) {
                this.f11261a.a(b, c9, j7, j9);
                c0747s1.e();
            } else {
                c0747s1.a();
            }
        }
    }

    public void a(AudioTrack audioTrack, boolean z8, int i9, int i10, int i11) {
        this.f11262c = audioTrack;
        this.f11263d = i10;
        this.f11264e = i11;
        this.f11265f = new C0747s1(audioTrack);
        this.f11266g = audioTrack.getSampleRate();
        this.f11267h = z8 && a(i9);
        boolean g9 = yp.g(i9);
        this.f11274q = g9;
        this.f11268i = g9 ? a(i11 / i10) : -9223372036854775807L;
        this.f11276s = 0L;
        this.f11277t = 0L;
        this.f11278u = 0L;
        this.f11273p = false;
        this.f11281x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f11282y = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f11275r = 0L;
        this.f11272o = 0L;
        this.f11269j = 1.0f;
    }

    public void a(float f9) {
        this.f11269j = f9;
        C0747s1 c0747s1 = this.f11265f;
        if (c0747s1 != null) {
            c0747s1.f();
        }
    }

    private static boolean a(int i9) {
        return yp.f12451a < 23 && (i9 == 5 || i9 == 6);
    }
}
