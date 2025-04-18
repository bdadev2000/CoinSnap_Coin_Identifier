package u7;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class z {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public final n0 a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25713b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f25714c;

    /* renamed from: d, reason: collision with root package name */
    public int f25715d;

    /* renamed from: e, reason: collision with root package name */
    public int f25716e;

    /* renamed from: f, reason: collision with root package name */
    public y f25717f;

    /* renamed from: g, reason: collision with root package name */
    public int f25718g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25719h;

    /* renamed from: i, reason: collision with root package name */
    public long f25720i;

    /* renamed from: j, reason: collision with root package name */
    public float f25721j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25722k;

    /* renamed from: l, reason: collision with root package name */
    public long f25723l;

    /* renamed from: m, reason: collision with root package name */
    public long f25724m;

    /* renamed from: n, reason: collision with root package name */
    public Method f25725n;

    /* renamed from: o, reason: collision with root package name */
    public long f25726o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25727p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25728q;

    /* renamed from: r, reason: collision with root package name */
    public long f25729r;

    /* renamed from: s, reason: collision with root package name */
    public long f25730s;

    /* renamed from: t, reason: collision with root package name */
    public long f25731t;
    public long u;

    /* renamed from: v, reason: collision with root package name */
    public long f25732v;

    /* renamed from: w, reason: collision with root package name */
    public int f25733w;

    /* renamed from: x, reason: collision with root package name */
    public int f25734x;

    /* renamed from: y, reason: collision with root package name */
    public long f25735y;

    /* renamed from: z, reason: collision with root package name */
    public long f25736z;

    public z(n0 n0Var) {
        this.a = n0Var;
        if (n9.h0.a >= 18) {
            try {
                this.f25725n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f25713b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021d A[Catch: Exception -> 0x0237, TRY_LEAVE, TryCatch #0 {Exception -> 0x0237, blocks: (B:64:0x01f7, B:66:0x021d), top: B:63:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r31) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.z.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f25735y;
        if (j3 != C.TIME_UNSET) {
            return Math.min(this.B, this.A + ((n9.h0.q((elapsedRealtime * 1000) - j3, this.f25721j) * this.f25718g) / 1000000));
        }
        if (elapsedRealtime - this.f25730s >= 5) {
            AudioTrack audioTrack = this.f25714c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f25719h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f25732v = this.f25731t;
                    }
                    playbackHeadPosition += this.f25732v;
                }
                if (n9.h0.a <= 29) {
                    if (playbackHeadPosition == 0 && this.f25731t > 0 && playState == 3) {
                        if (this.f25736z == C.TIME_UNSET) {
                            this.f25736z = elapsedRealtime;
                        }
                    } else {
                        this.f25736z = C.TIME_UNSET;
                    }
                }
                if (this.f25731t > playbackHeadPosition) {
                    this.u++;
                }
                this.f25731t = playbackHeadPosition;
            }
            this.f25730s = elapsedRealtime;
        }
        return this.f25731t + (this.u << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(long r6) {
        /*
            r5 = this;
            r0 = 0
            long r1 = r5.a(r0)
            int r3 = r5.f25718g
            long r3 = (long) r3
            long r1 = r1 * r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r7 = 1
            if (r6 > 0) goto L31
            boolean r6 = r5.f25719h
            if (r6 == 0) goto L2e
            android.media.AudioTrack r6 = r5.f25714c
            r6.getClass()
            int r6 = r6.getPlayState()
            r1 = 2
            if (r6 != r1) goto L2e
            long r1 = r5.b()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L2e
            r6 = r7
            goto L2f
        L2e:
            r6 = r0
        L2f:
            if (r6 == 0) goto L32
        L31:
            r0 = r7
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.z.c(long):boolean");
    }

    public final void d() {
        this.f25723l = 0L;
        this.f25734x = 0;
        this.f25733w = 0;
        this.f25724m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f25722k = false;
    }
}
