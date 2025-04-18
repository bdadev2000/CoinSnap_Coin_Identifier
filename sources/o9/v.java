package o9;

import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;

/* loaded from: classes3.dex */
public final class v {
    public final d a = new d();

    /* renamed from: b, reason: collision with root package name */
    public final r f23252b;

    /* renamed from: c, reason: collision with root package name */
    public final u f23253c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23254d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f23255e;

    /* renamed from: f, reason: collision with root package name */
    public float f23256f;

    /* renamed from: g, reason: collision with root package name */
    public float f23257g;

    /* renamed from: h, reason: collision with root package name */
    public float f23258h;

    /* renamed from: i, reason: collision with root package name */
    public float f23259i;

    /* renamed from: j, reason: collision with root package name */
    public int f23260j;

    /* renamed from: k, reason: collision with root package name */
    public long f23261k;

    /* renamed from: l, reason: collision with root package name */
    public long f23262l;

    /* renamed from: m, reason: collision with root package name */
    public long f23263m;

    /* renamed from: n, reason: collision with root package name */
    public long f23264n;

    /* renamed from: o, reason: collision with root package name */
    public long f23265o;

    /* renamed from: p, reason: collision with root package name */
    public long f23266p;

    /* renamed from: q, reason: collision with root package name */
    public long f23267q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            o9.d r0 = new o9.d
            r0.<init>()
            r3.a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = n9.h0.a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            o9.t r2 = new o9.t
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            o9.s r2 = new o9.s
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f23252b = r2
            if (r2 == 0) goto L41
            o9.u r0 = o9.u.f23247g
        L41:
            r3.f23253c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f23261k = r0
            r3.f23262l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f23256f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f23259i = r4
            r4 = 0
            r3.f23260j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.v.<init>(android.content.Context):void");
    }

    public final long a(long j3) {
        long j10;
        u uVar;
        long j11;
        long j12;
        boolean z10;
        if (this.f23266p != -1 && this.a.a()) {
            d dVar = this.a;
            if (dVar.a()) {
                c cVar = dVar.a;
                long j13 = cVar.f23193e;
                if (j13 == 0) {
                    j12 = 0;
                } else {
                    j12 = cVar.f23194f / j13;
                }
            } else {
                j12 = -9223372036854775807L;
            }
            j10 = this.f23267q + (((float) ((this.f23263m - this.f23266p) * j12)) / this.f23259i);
            if (Math.abs(j3 - j10) <= 20000000) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f23263m = 0L;
                this.f23266p = -1L;
                this.f23264n = -1L;
            }
            this.f23264n = this.f23263m;
            this.f23265o = j10;
            uVar = this.f23253c;
            if (uVar == null && this.f23261k != C.TIME_UNSET) {
                long j14 = uVar.f23248b;
                if (j14 == C.TIME_UNSET) {
                    return j10;
                }
                long j15 = this.f23261k;
                long j16 = (((j10 - j14) / j15) * j15) + j14;
                if (j10 <= j16) {
                    j11 = j16 - j15;
                } else {
                    j11 = j16;
                    j16 = j15 + j16;
                }
                if (j16 - j10 >= j10 - j11) {
                    j16 = j11;
                }
                return j16 - this.f23262l;
            }
            return j10;
        }
        j10 = j3;
        this.f23264n = this.f23263m;
        this.f23265o = j10;
        uVar = this.f23253c;
        if (uVar == null) {
        }
        return j10;
    }

    public final void b() {
        Surface surface;
        if (h0.a >= 30 && (surface = this.f23255e) != null && this.f23260j != Integer.MIN_VALUE && this.f23258h != 0.0f) {
            this.f23258h = 0.0f;
            q.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r11) {
        /*
            r10 = this;
            long r0 = r10.f23264n
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Le
            r10.f23266p = r0
            long r0 = r10.f23265o
            r10.f23267q = r0
        Le:
            long r0 = r10.f23263m
            r2 = 1
            long r0 = r0 + r2
            r10.f23263m = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            o9.d r0 = r10.a
            o9.c r1 = r0.a
            r1.b(r11)
            o9.c r1 = r0.a
            boolean r1 = r1.a()
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            r0.f23198c = r5
            goto L65
        L2c:
            long r6 = r0.f23199d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L65
            boolean r1 = r0.f23198c
            if (r1 == 0) goto L52
            o9.c r1 = r0.f23197b
            long r6 = r1.f23192d
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L47
            r1 = r5
            goto L50
        L47:
            long r6 = r6 - r2
            r2 = 15
            long r6 = r6 % r2
            int r2 = (int) r6
            boolean[] r1 = r1.f23195g
            boolean r1 = r1[r2]
        L50:
            if (r1 == 0) goto L5e
        L52:
            o9.c r1 = r0.f23197b
            r1.c()
            o9.c r1 = r0.f23197b
            long r2 = r0.f23199d
            r1.b(r2)
        L5e:
            r0.f23198c = r4
            o9.c r1 = r0.f23197b
            r1.b(r11)
        L65:
            boolean r1 = r0.f23198c
            if (r1 == 0) goto L7b
            o9.c r1 = r0.f23197b
            boolean r1 = r1.a()
            if (r1 == 0) goto L7b
            o9.c r1 = r0.a
            o9.c r2 = r0.f23197b
            r0.a = r2
            r0.f23197b = r1
            r0.f23198c = r5
        L7b:
            r0.f23199d = r11
            o9.c r11 = r0.a
            boolean r11 = r11.a()
            if (r11 == 0) goto L86
            goto L8a
        L86:
            int r11 = r0.f23200e
            int r5 = r11 + 1
        L8a:
            r0.f23200e = r5
            r10.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.v.c(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (java.lang.Math.abs(r2 - r9.f23257g) < r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if (r0.f23200e >= 30) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r9 = this;
            int r0 = n9.h0.a
            r1 = 30
            if (r0 < r1) goto L8f
            android.view.Surface r0 = r9.f23255e
            if (r0 != 0) goto Lc
            goto L8f
        Lc:
            o9.d r0 = r9.a
            boolean r2 = r0.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L35
            boolean r2 = r0.a()
            if (r2 == 0) goto L33
            o9.c r2 = r0.a
            long r4 = r2.f23193e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L27
            goto L2a
        L27:
            long r6 = r2.f23194f
            long r6 = r6 / r4
        L2a:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L37
        L33:
            r2 = r3
            goto L37
        L35:
            float r2 = r9.f23256f
        L37:
            float r4 = r9.f23257g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L3e
            return
        L3e:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L7f
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L7f
            boolean r1 = r0.a()
            if (r1 == 0) goto L69
            boolean r1 = r0.a()
            if (r1 == 0) goto L59
            o9.c r0 = r0.a
            long r0 = r0.f23194f
            goto L5e
        L59:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5e:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L69
            r0 = r7
            goto L6a
        L69:
            r0 = r6
        L6a:
            if (r0 == 0) goto L70
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L72
        L70:
            r0 = 1065353216(0x3f800000, float:1.0)
        L72:
            float r1 = r9.f23257g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L87
            goto L88
        L7f:
            if (r5 == 0) goto L82
            goto L88
        L82:
            int r0 = r0.f23200e
            if (r0 < r1) goto L87
            goto L88
        L87:
            r7 = r6
        L88:
            if (r7 == 0) goto L8f
            r9.f23257g = r2
            r9.e(r6)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.v.d():void");
    }

    public final void e(boolean z10) {
        Surface surface;
        float f10;
        if (h0.a >= 30 && (surface = this.f23255e) != null && this.f23260j != Integer.MIN_VALUE) {
            if (this.f23254d) {
                float f11 = this.f23257g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f23259i;
                    if (z10 && this.f23258h == f10) {
                        return;
                    }
                    this.f23258h = f10;
                    q.a(surface, f10);
                }
            }
            f10 = 0.0f;
            if (z10) {
            }
            this.f23258h = f10;
            q.a(surface, f10);
        }
    }
}
