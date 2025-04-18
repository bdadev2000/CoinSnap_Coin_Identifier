package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.cd;
import com.applovin.impl.id;
import com.applovin.impl.xq;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class kd extends gd {

    /* renamed from: s1, reason: collision with root package name */
    private static final int[] f5648s1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: t1, reason: collision with root package name */
    private static boolean f5649t1;

    /* renamed from: u1, reason: collision with root package name */
    private static boolean f5650u1;
    private final Context J0;
    private final wq K0;
    private final xq.a L0;
    private final long M0;
    private final int N0;
    private final boolean O0;
    private a P0;
    private boolean Q0;
    private boolean R0;
    private Surface S0;
    private f7 T0;
    private boolean U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private long Z0;

    /* renamed from: a1, reason: collision with root package name */
    private long f5651a1;

    /* renamed from: b1, reason: collision with root package name */
    private long f5652b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f5653c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f5654d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f5655e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f5656f1;

    /* renamed from: g1, reason: collision with root package name */
    private long f5657g1;

    /* renamed from: h1, reason: collision with root package name */
    private long f5658h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f5659i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f5660j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f5661k1;

    /* renamed from: l1, reason: collision with root package name */
    private int f5662l1;

    /* renamed from: m1, reason: collision with root package name */
    private float f5663m1;

    /* renamed from: n1, reason: collision with root package name */
    private yq f5664n1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f5665o1;

    /* renamed from: p1, reason: collision with root package name */
    private int f5666p1;

    /* renamed from: q1, reason: collision with root package name */
    b f5667q1;

    /* renamed from: r1, reason: collision with root package name */
    private vq f5668r1;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5669b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5670c;

        public a(int i10, int i11, int i12) {
            this.a = i10;
            this.f5669b = i11;
            this.f5670c = i12;
        }
    }

    public kd(Context context, cd.b bVar, hd hdVar, long j3, boolean z10, Handler handler, xq xqVar, int i10) {
        super(2, bVar, hdVar, z10, 30.0f);
        this.M0 = j3;
        this.N0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.J0 = applicationContext;
        this.K0 = new wq(applicationContext);
        this.L0 = new xq.a(handler, xqVar);
        this.O0 = e0();
        this.f5651a1 = C.TIME_UNSET;
        this.f5660j1 = -1;
        this.f5661k1 = -1;
        this.f5663m1 = -1.0f;
        this.V0 = 1;
        this.f5666p1 = 0;
        d0();
    }

    private static Point b(fd fdVar, d9 d9Var) {
        int i10 = d9Var.f4234s;
        int i11 = d9Var.f4233r;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f5648s1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (yp.a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point a10 = fdVar.a(i15, i13);
                if (fdVar.a(a10.x, a10.y, d9Var.f4235t)) {
                    return a10;
                }
            } else {
                try {
                    int a11 = yp.a(i13, 16) * 16;
                    int a12 = yp.a(i14, 16) * 16;
                    if (a11 * a12 <= id.b()) {
                        int i16 = z10 ? a12 : a11;
                        if (!z10) {
                            a11 = a12;
                        }
                        return new Point(i16, a11);
                    }
                } catch (id.c unused) {
                }
            }
        }
        return null;
    }

    public static int c(fd fdVar, d9 d9Var) {
        if (d9Var.f4229n != -1) {
            int size = d9Var.f4230o.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) d9Var.f4230o.get(i11)).length;
            }
            return d9Var.f4229n + i10;
        }
        return a(fdVar, d9Var);
    }

    private void c0() {
        cd I;
        this.W0 = false;
        if (yp.a >= 23 && this.f5665o1 && (I = I()) != null) {
            this.f5667q1 = new b(I);
        }
    }

    private void d0() {
        this.f5664n1 = null;
    }

    private static boolean e0() {
        return "NVIDIA".equals(yp.f9254c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x07cd, code lost:
    
        if (r0.equals("NX573J") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x082f, code lost:
    
        if (r0.equals("AFTN") == false) goto L610;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x0818. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean f0() {
        /*
            Method dump skipped, instructions count: 3044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.f0():boolean");
    }

    private static boolean g(long j3) {
        return j3 < -30000;
    }

    private void g0() {
        if (this.f5653c1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.L0.a(this.f5653c1, elapsedRealtime - this.f5652b1);
            this.f5653c1 = 0;
            this.f5652b1 = elapsedRealtime;
        }
    }

    private static boolean h(long j3) {
        return j3 < -500000;
    }

    private void i0() {
        int i10 = this.f5659i1;
        if (i10 != 0) {
            this.L0.b(this.f5658h1, i10);
            this.f5658h1 = 0L;
            this.f5659i1 = 0;
        }
    }

    private void j0() {
        int i10 = this.f5660j1;
        if (i10 != -1 || this.f5661k1 != -1) {
            yq yqVar = this.f5664n1;
            if (yqVar == null || yqVar.a != i10 || yqVar.f9269b != this.f5661k1 || yqVar.f9270c != this.f5662l1 || yqVar.f9271d != this.f5663m1) {
                yq yqVar2 = new yq(this.f5660j1, this.f5661k1, this.f5662l1, this.f5663m1);
                this.f5664n1 = yqVar2;
                this.L0.b(yqVar2);
            }
        }
    }

    private void k0() {
        if (this.U0) {
            this.L0.a(this.S0);
        }
    }

    private void l0() {
        yq yqVar = this.f5664n1;
        if (yqVar != null) {
            this.L0.b(yqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        a0();
    }

    private void n0() {
        long j3;
        if (this.M0 > 0) {
            j3 = SystemClock.elapsedRealtime() + this.M0;
        } else {
            j3 = C.TIME_UNSET;
        }
        this.f5651a1 = j3;
    }

    @Override // com.applovin.impl.gd
    public boolean K() {
        return this.f5665o1 && yp.a < 23;
    }

    @Override // com.applovin.impl.gd
    public void Q() {
        super.Q();
        c0();
    }

    @Override // com.applovin.impl.gd
    public void W() {
        super.W();
        this.f5655e1 = 0;
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean d() {
        f7 f7Var;
        if (super.d() && (this.W0 || (((f7Var = this.T0) != null && this.S0 == f7Var) || I() == null || this.f5665o1))) {
            this.f5651a1 = C.TIME_UNSET;
            return true;
        }
        if (this.f5651a1 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f5651a1) {
            return true;
        }
        this.f5651a1 = C.TIME_UNSET;
        return false;
    }

    public void f(int i10) {
        l5 l5Var = this.E0;
        l5Var.f5848g += i10;
        this.f5653c1 += i10;
        int i11 = this.f5654d1 + i10;
        this.f5654d1 = i11;
        l5Var.f5849h = Math.max(i11, l5Var.f5849h);
        int i12 = this.N0;
        if (i12 > 0 && this.f5653c1 >= i12) {
            g0();
        }
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public void h0() {
        this.Y0 = true;
        if (!this.W0) {
            this.W0 = true;
            this.L0.a(this.S0);
            this.U0 = true;
        }
    }

    public void i(long j3) {
        f(j3);
        j0();
        this.E0.f5846e++;
        h0();
        d(j3);
    }

    public void j(long j3) {
        this.E0.a(j3);
        this.f5658h1 += j3;
        this.f5659i1++;
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void v() {
        d0();
        c0();
        this.U0 = false;
        this.K0.b();
        this.f5667q1 = null;
        try {
            super.v();
        } finally {
            this.L0.a(this.E0);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void w() {
        try {
            super.w();
            f7 f7Var = this.T0;
            if (f7Var != null) {
                if (this.S0 == f7Var) {
                    this.S0 = null;
                }
                f7Var.release();
                this.T0 = null;
            }
        } catch (Throwable th2) {
            if (this.T0 != null) {
                Surface surface = this.S0;
                f7 f7Var2 = this.T0;
                if (surface == f7Var2) {
                    this.S0 = null;
                }
                f7Var2.release();
                this.T0 = null;
            }
            throw th2;
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void x() {
        super.x();
        this.f5653c1 = 0;
        this.f5652b1 = SystemClock.elapsedRealtime();
        this.f5657g1 = SystemClock.elapsedRealtime() * 1000;
        this.f5658h1 = 0L;
        this.f5659i1 = 0;
        this.K0.e();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void y() {
        this.f5651a1 = C.TIME_UNSET;
        g0();
        i0();
        this.K0.f();
        super.y();
    }

    @Override // com.applovin.impl.gd
    public void g(String str) {
        this.L0.a(str);
    }

    public boolean h(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (kd.class) {
            if (!f5649t1) {
                f5650u1 = f0();
                f5649t1 = true;
            }
        }
        return f5650u1;
    }

    @Override // com.applovin.impl.gd
    public o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        o5 a10 = fdVar.a(d9Var, d9Var2);
        int i10 = a10.f6456e;
        int i11 = d9Var2.f4233r;
        a aVar = this.P0;
        if (i11 > aVar.a || d9Var2.f4234s > aVar.f5669b) {
            i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (c(fdVar, d9Var2) > this.P0.f5670c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new o5(fdVar.a, d9Var, d9Var2, i12 != 0 ? 0 : a10.f6455d, i12);
    }

    /* loaded from: classes.dex */
    public final class b implements cd.c, Handler.Callback {
        private final Handler a;

        public b(cd cdVar) {
            Handler a = yp.a((Handler.Callback) this);
            this.a = a;
            cdVar.a(this, a);
        }

        private void a(long j3) {
            kd kdVar = kd.this;
            if (this != kdVar.f5667q1) {
                return;
            }
            if (j3 == Long.MAX_VALUE) {
                kdVar.m0();
                return;
            }
            try {
                kdVar.i(j3);
            } catch (y7 e2) {
                kd.this.a(e2);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(yp.c(message.arg1, message.arg2));
            return true;
        }

        @Override // com.applovin.impl.cd.c
        public void a(cd cdVar, long j3, long j10) {
            if (yp.a < 30) {
                this.a.sendMessageAtFrontOfQueue(Message.obtain(this.a, 0, (int) (j3 >> 32), (int) j3));
            } else {
                a(j3);
            }
        }
    }

    public void c(cd cdVar, int i10, long j3) {
        lo.a("skipVideoBuffer");
        cdVar.a(i10, false);
        lo.a();
        this.E0.f5847f++;
    }

    @Override // com.applovin.impl.gd
    public void d(long j3) {
        super.d(j3);
        if (this.f5665o1) {
            return;
        }
        this.f5655e1--;
    }

    private static void a(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private boolean c(fd fdVar) {
        return yp.a >= 23 && !this.f5665o1 && !h(fdVar.a) && (!fdVar.f4689g || f7.b(this.J0));
    }

    public boolean d(long j3, long j10) {
        return g(j3) && j10 > 100000;
    }

    public void a(cd cdVar, int i10, long j3) {
        lo.a("dropVideoBuffer");
        cdVar.a(i10, false);
        lo.a();
        f(1);
    }

    public boolean b(long j3, boolean z10) {
        int b3 = b(j3);
        if (b3 == 0) {
            return false;
        }
        l5 l5Var = this.E0;
        l5Var.f5850i++;
        int i10 = this.f5655e1 + b3;
        if (z10) {
            l5Var.f5847f += i10;
        } else {
            f(i10);
        }
        G();
        return true;
    }

    public kd(Context context, hd hdVar, long j3, boolean z10, Handler handler, xq xqVar, int i10) {
        this(context, cd.b.a, hdVar, j3, z10, handler, xqVar, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0070, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H265) == false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x007d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.applovin.impl.fd r10, com.applovin.impl.d9 r11) {
        /*
            int r0 = r11.f4233r
            int r1 = r11.f4234s
            r2 = -1
            if (r0 == r2) goto Lc3
            if (r1 != r2) goto Lb
            goto Lc3
        Lb:
            java.lang.String r3 = r11.f4228m
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = com.applovin.impl.id.a(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r11 == r3) goto L31
            if (r11 == r6) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r7
        L34:
            r3.getClass()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r6 = r2
            goto L7d
        L42:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L4b
            goto L40
        L4b:
            r6 = 5
            goto L7d
        L4d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L56
            goto L40
        L56:
            r6 = r4
            goto L7d
        L58:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L5f
            goto L40
        L5f:
            r6 = r9
            goto L7d
        L61:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L6a
            goto L40
        L6a:
            r6 = r8
            goto L7d
        L6c:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L7c
            goto L40
        L7c:
            r6 = 0
        L7d:
            switch(r6) {
                case 0: goto Lbc;
                case 1: goto Lb9;
                case 2: goto Lbc;
                case 3: goto L81;
                case 4: goto Lbc;
                case 5: goto Lb9;
                default: goto L80;
            }
        L80:
            return r2
        L81:
            java.lang.String r11 = com.applovin.impl.yp.f9255d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb8
            java.lang.String r3 = com.applovin.impl.yp.f9254c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Laa
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb8
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Laa
            boolean r10 = r10.f4689g
            if (r10 == 0) goto Laa
            goto Lb8
        Laa:
            r10 = 16
            int r11 = com.applovin.impl.yp.a(r0, r10)
            int r10 = com.applovin.impl.yp.a(r1, r10)
            int r10 = r10 * r11
            int r10 = r10 * 256
            goto Lbe
        Lb8:
            return r2
        Lb9:
            int r10 = r0 * r1
            goto Lbf
        Lbc:
            int r10 = r0 * r1
        Lbe:
            r4 = r8
        Lbf:
            int r10 = r10 * r9
            int r4 = r4 * r8
            int r10 = r10 / r4
            return r10
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.a(com.applovin.impl.fd, com.applovin.impl.d9):int");
    }

    @Override // com.applovin.impl.gd
    public void b(n5 n5Var) {
        boolean z10 = this.f5665o1;
        if (!z10) {
            this.f5655e1++;
        }
        if (yp.a >= 23 || !z10) {
            return;
        }
        i(n5Var.f6353f);
    }

    public void b(cd cdVar, int i10, long j3) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i10, true);
        lo.a();
        this.f5657g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.f5846e++;
        this.f5654d1 = 0;
        h0();
    }

    public a a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int a10;
        int i10 = d9Var.f4233r;
        int i11 = d9Var.f4234s;
        int c10 = c(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            if (c10 != -1 && (a10 = a(fdVar, d9Var)) != -1) {
                c10 = Math.min((int) (c10 * 1.5f), a10);
            }
            return new a(i10, i11, c10);
        }
        int length = d9VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            d9 d9Var2 = d9VarArr[i12];
            if (d9Var.f4239y != null && d9Var2.f4239y == null) {
                d9Var2 = d9Var2.a().a(d9Var.f4239y).a();
            }
            if (fdVar.a(d9Var, d9Var2).f6455d != 0) {
                int i13 = d9Var2.f4233r;
                z10 |= i13 == -1 || d9Var2.f4234s == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, d9Var2.f4234s);
                c10 = Math.max(c10, c(fdVar, d9Var2));
            }
        }
        if (z10) {
            kc.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point b3 = b(fdVar, d9Var);
            if (b3 != null) {
                i10 = Math.max(i10, b3.x);
                i11 = Math.max(i11, b3.y);
                c10 = Math.max(c10, a(fdVar, d9Var.a().q(i10).g(i11).a()));
                kc.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new a(i10, i11, c10);
    }

    public boolean b(long j3, long j10, boolean z10) {
        return g(j3) && !z10;
    }

    @Override // com.applovin.impl.gd
    public boolean b(fd fdVar) {
        return this.S0 != null || c(fdVar);
    }

    @Override // com.applovin.impl.gd
    public float a(float f10, d9 d9Var, d9[] d9VarArr) {
        float f11 = -1.0f;
        for (d9 d9Var2 : d9VarArr) {
            float f12 = d9Var2.f4235t;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // com.applovin.impl.gd
    public List a(hd hdVar, d9 d9Var, boolean z10) {
        return a(hdVar, d9Var, z10, this.f5665o1);
    }

    private static List a(hd hdVar, d9 d9Var, boolean z10, boolean z11) {
        Pair a10;
        String str = d9Var.f4228m;
        if (str == null) {
            return Collections.emptyList();
        }
        List a11 = id.a(hdVar.a(str, z10, z11), d9Var);
        if ("video/dolby-vision".equals(str) && (a10 = id.a(d9Var)) != null) {
            int intValue = ((Integer) a10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                a11.addAll(hdVar.a(MimeTypes.VIDEO_H265, z10, z11));
            } else if (intValue == 512) {
                a11.addAll(hdVar.a(MimeTypes.VIDEO_H264, z10, z11));
            }
        }
        return Collections.unmodifiableList(a11);
    }

    @Override // com.applovin.impl.gd
    public cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f10) {
        f7 f7Var = this.T0;
        if (f7Var != null && f7Var.a != fdVar.f4689g) {
            f7Var.release();
            this.T0 = null;
        }
        String str = fdVar.f4685c;
        a a10 = a(fdVar, d9Var, t());
        this.P0 = a10;
        MediaFormat a11 = a(d9Var, str, a10, f10, this.O0, this.f5665o1 ? this.f5666p1 : 0);
        if (this.S0 == null) {
            if (c(fdVar)) {
                if (this.T0 == null) {
                    this.T0 = f7.a(this.J0, fdVar.f4689g);
                }
                this.S0 = this.T0;
            } else {
                throw new IllegalStateException();
            }
        }
        return cd.a.a(fdVar, a11, d9Var, this.S0, mediaCrypto);
    }

    public MediaFormat a(d9 d9Var, String str, a aVar, float f10, boolean z10, int i10) {
        Pair a10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", d9Var.f4233r);
        mediaFormat.setInteger("height", d9Var.f4234s);
        nd.a(mediaFormat, d9Var.f4230o);
        nd.a(mediaFormat, "frame-rate", d9Var.f4235t);
        nd.a(mediaFormat, "rotation-degrees", d9Var.u);
        nd.a(mediaFormat, d9Var.f4239y);
        if ("video/dolby-vision".equals(d9Var.f4228m) && (a10 = id.a(d9Var)) != null) {
            nd.a(mediaFormat, Scopes.PROFILE, ((Integer) a10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.a);
        mediaFormat.setInteger("max-height", aVar.f5669b);
        nd.a(mediaFormat, "max-input-size", aVar.f5670c);
        if (yp.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            a(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // com.applovin.impl.gd
    public void a(n5 n5Var) {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) a1.a(n5Var.f6354g);
            if (byteBuffer.remaining() >= 7) {
                byte b3 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b3 == -75 && s5 == 60 && s10 == 1 && b10 == 4 && b11 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(I(), bArr);
                }
            }
        }
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.oh.b
    public void a(int i10, Object obj) {
        if (i10 == 1) {
            a(obj);
            return;
        }
        if (i10 == 7) {
            this.f5668r1 = (vq) obj;
            return;
        }
        if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f5666p1 != intValue) {
                this.f5666p1 = intValue;
                if (this.f5665o1) {
                    U();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.a(i10, obj);
                return;
            } else {
                this.K0.a(((Integer) obj).intValue());
                return;
            }
        }
        this.V0 = ((Integer) obj).intValue();
        cd I = I();
        if (I != null) {
            I.c(this.V0);
        }
    }

    private void a(long j3, long j10, d9 d9Var) {
        vq vqVar = this.f5668r1;
        if (vqVar != null) {
            vqVar.a(j3, j10, d9Var, L());
        }
    }

    @Override // com.applovin.impl.gd
    public void a(Exception exc) {
        kc.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.L0.b(exc);
    }

    @Override // com.applovin.impl.gd
    public void a(String str, long j3, long j10) {
        this.L0.a(str, j3, j10);
        this.Q0 = h(str);
        this.R0 = ((fd) a1.a(J())).b();
        if (yp.a < 23 || !this.f5665o1) {
            return;
        }
        this.f5667q1 = new b((cd) a1.a(I()));
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        boolean z12 = q().a;
        a1.b((z12 && this.f5666p1 == 0) ? false : true);
        if (this.f5665o1 != z12) {
            this.f5665o1 = z12;
            U();
        }
        this.L0.b(this.E0);
        this.K0.c();
        this.X0 = z11;
        this.Y0 = false;
    }

    @Override // com.applovin.impl.gd
    public o5 a(e9 e9Var) {
        o5 a10 = super.a(e9Var);
        this.L0.a(e9Var.f4413b, a10);
        return a10;
    }

    @Override // com.applovin.impl.gd
    public void a(d9 d9Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        cd I = I();
        if (I != null) {
            I.c(this.V0);
        }
        if (this.f5665o1) {
            this.f5660j1 = d9Var.f4233r;
            this.f5661k1 = d9Var.f4234s;
        } else {
            a1.a(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f5660j1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f5661k1 = integer2;
        }
        float f10 = d9Var.f4236v;
        this.f5663m1 = f10;
        if (yp.a >= 21) {
            int i10 = d9Var.u;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f5660j1;
                this.f5660j1 = this.f5661k1;
                this.f5661k1 = i11;
                this.f5663m1 = 1.0f / f10;
            }
        } else {
            this.f5662l1 = d9Var.u;
        }
        this.K0.a(d9Var.f4235t);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void a(long j3, boolean z10) {
        super.a(j3, z10);
        c0();
        this.K0.d();
        this.f5656f1 = C.TIME_UNSET;
        this.Z0 = C.TIME_UNSET;
        this.f5654d1 = 0;
        if (z10) {
            n0();
        } else {
            this.f5651a1 = C.TIME_UNSET;
        }
    }

    @Override // com.applovin.impl.gd
    public boolean a(long j3, long j10, cd cdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, d9 d9Var) {
        boolean z12;
        long j12;
        a1.a(cdVar);
        if (this.Z0 == C.TIME_UNSET) {
            this.Z0 = j3;
        }
        if (j11 != this.f5656f1) {
            this.K0.b(j11);
            this.f5656f1 = j11;
        }
        long M = M();
        long j13 = j11 - M;
        if (z10 && !z11) {
            c(cdVar, i10, j13);
            return true;
        }
        double N = N();
        boolean z13 = b() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j14 = (long) ((j11 - j3) / N);
        if (z13) {
            j14 -= elapsedRealtime - j10;
        }
        if (this.S0 == this.T0) {
            if (!g(j14)) {
                return false;
            }
            c(cdVar, i10, j13);
            j(j14);
            return true;
        }
        long j15 = elapsedRealtime - this.f5657g1;
        if (this.Y0 ? this.W0 : !(z13 || this.X0)) {
            j12 = j15;
            z12 = false;
        } else {
            z12 = true;
            j12 = j15;
        }
        if (this.f5651a1 == C.TIME_UNSET && j3 >= M && (z12 || (z13 && d(j14, j12)))) {
            long nanoTime = System.nanoTime();
            a(j13, nanoTime, d9Var);
            if (yp.a >= 21) {
                a(cdVar, i10, j13, nanoTime);
            } else {
                b(cdVar, i10, j13);
            }
            j(j14);
            return true;
        }
        if (z13 && j3 != this.Z0) {
            long nanoTime2 = System.nanoTime();
            long a10 = this.K0.a((j14 * 1000) + nanoTime2);
            long j16 = (a10 - nanoTime2) / 1000;
            boolean z14 = this.f5651a1 != C.TIME_UNSET;
            if (a(j16, j10, z11) && b(j3, z14)) {
                return false;
            }
            if (b(j16, j10, z11)) {
                if (z14) {
                    c(cdVar, i10, j13);
                } else {
                    a(cdVar, i10, j13);
                }
                j(j16);
                return true;
            }
            if (yp.a >= 21) {
                if (j16 < 50000) {
                    a(j13, a10, d9Var);
                    a(cdVar, i10, j13, a10);
                    j(j16);
                    return true;
                }
            } else if (j16 < 30000) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j13, a10, d9Var);
                b(cdVar, i10, j13);
                j(j16);
                return true;
            }
        }
        return false;
    }

    public void a(cd cdVar, int i10, long j3, long j10) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i10, j10);
        lo.a();
        this.f5657g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.f5846e++;
        this.f5654d1 = 0;
        h0();
    }

    private static void a(cd cdVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        cdVar.a(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.applovin.impl.gd, com.applovin.impl.d2, com.applovin.impl.kd] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void a(Object obj) {
        f7 f7Var = obj instanceof Surface ? (Surface) obj : null;
        if (f7Var == null) {
            f7 f7Var2 = this.T0;
            if (f7Var2 != null) {
                f7Var = f7Var2;
            } else {
                fd J = J();
                if (J != null && c(J)) {
                    f7Var = f7.a(this.J0, J.f4689g);
                    this.T0 = f7Var;
                }
            }
        }
        if (this.S0 != f7Var) {
            this.S0 = f7Var;
            this.K0.a(f7Var);
            this.U0 = false;
            int b3 = b();
            cd I = I();
            if (I != null) {
                if (yp.a >= 23 && f7Var != null && !this.Q0) {
                    a(I, f7Var);
                } else {
                    U();
                    P();
                }
            }
            if (f7Var != null && f7Var != this.T0) {
                l0();
                c0();
                if (b3 == 2) {
                    n0();
                    return;
                }
                return;
            }
            d0();
            c0();
            return;
        }
        if (f7Var == null || f7Var == this.T0) {
            return;
        }
        l0();
        k0();
    }

    public void a(cd cdVar, Surface surface) {
        cdVar.a(surface);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public void a(float f10, float f11) {
        super.a(f10, f11);
        this.K0.b(f10);
    }

    public boolean a(long j3, long j10, boolean z10) {
        return h(j3) && !z10;
    }

    @Override // com.applovin.impl.gd
    public int a(hd hdVar, d9 d9Var) {
        int i10 = 0;
        if (!df.i(d9Var.f4228m)) {
            return mi.a(0);
        }
        boolean z10 = d9Var.f4231p != null;
        List a10 = a(hdVar, d9Var, z10, false);
        if (z10 && a10.isEmpty()) {
            a10 = a(hdVar, d9Var, false, false);
        }
        if (a10.isEmpty()) {
            return mi.a(1);
        }
        if (!gd.d(d9Var)) {
            return mi.a(2);
        }
        fd fdVar = (fd) a10.get(0);
        boolean b3 = fdVar.b(d9Var);
        int i11 = fdVar.c(d9Var) ? 16 : 8;
        if (b3) {
            List a11 = a(hdVar, d9Var, z10, true);
            if (!a11.isEmpty()) {
                fd fdVar2 = (fd) a11.get(0);
                if (fdVar2.b(d9Var) && fdVar2.c(d9Var)) {
                    i10 = 32;
                }
            }
        }
        return mi.a(b3 ? 4 : 3, i11, i10);
    }

    @Override // com.applovin.impl.gd
    public ed a(Throwable th2, fd fdVar) {
        return new jd(th2, fdVar, this.S0);
    }
}
