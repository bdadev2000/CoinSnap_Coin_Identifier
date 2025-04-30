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
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class kd extends gd {
    private static final int[] s1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean t1;

    /* renamed from: u1, reason: collision with root package name */
    private static boolean f8620u1;

    /* renamed from: J0, reason: collision with root package name */
    private final Context f8621J0;
    private final wq K0;

    /* renamed from: L0, reason: collision with root package name */
    private final xq.a f8622L0;

    /* renamed from: M0, reason: collision with root package name */
    private final long f8623M0;

    /* renamed from: N0, reason: collision with root package name */
    private final int f8624N0;

    /* renamed from: O0, reason: collision with root package name */
    private final boolean f8625O0;
    private a P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f8626Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f8627R0;

    /* renamed from: S0, reason: collision with root package name */
    private Surface f8628S0;

    /* renamed from: T0, reason: collision with root package name */
    private f7 f8629T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f8630U0;

    /* renamed from: V0, reason: collision with root package name */
    private int f8631V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f8632W0;

    /* renamed from: X0, reason: collision with root package name */
    private boolean f8633X0;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean f8634Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private long f8635Z0;

    /* renamed from: a1, reason: collision with root package name */
    private long f8636a1;

    /* renamed from: b1, reason: collision with root package name */
    private long f8637b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f8638c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f8639d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f8640e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f8641f1;

    /* renamed from: g1, reason: collision with root package name */
    private long f8642g1;
    private long h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f8643i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f8644j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f8645k1;
    private int l1;

    /* renamed from: m1, reason: collision with root package name */
    private float f8646m1;

    /* renamed from: n1, reason: collision with root package name */
    private yq f8647n1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f8648o1;

    /* renamed from: p1, reason: collision with root package name */
    private int f8649p1;

    /* renamed from: q1, reason: collision with root package name */
    b f8650q1;

    /* renamed from: r1, reason: collision with root package name */
    private vq f8651r1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8652a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8653c;

        public a(int i9, int i10, int i11) {
            this.f8652a = i9;
            this.b = i10;
            this.f8653c = i11;
        }
    }

    public kd(Context context, cd.b bVar, hd hdVar, long j7, boolean z8, Handler handler, xq xqVar, int i9) {
        super(2, bVar, hdVar, z8, 30.0f);
        this.f8623M0 = j7;
        this.f8624N0 = i9;
        Context applicationContext = context.getApplicationContext();
        this.f8621J0 = applicationContext;
        this.K0 = new wq(applicationContext);
        this.f8622L0 = new xq.a(handler, xqVar);
        this.f8625O0 = e0();
        this.f8636a1 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8644j1 = -1;
        this.f8645k1 = -1;
        this.f8646m1 = -1.0f;
        this.f8631V0 = 1;
        this.f8649p1 = 0;
        d0();
    }

    private static Point b(fd fdVar, d9 d9Var) {
        int i9 = d9Var.f7216s;
        int i10 = d9Var.f7215r;
        boolean z8 = i9 > i10;
        int i11 = z8 ? i9 : i10;
        if (z8) {
            i9 = i10;
        }
        float f9 = i9 / i11;
        for (int i12 : s1) {
            int i13 = (int) (i12 * f9);
            if (i12 <= i11 || i13 <= i9) {
                break;
            }
            if (yp.f12451a >= 21) {
                int i14 = z8 ? i13 : i12;
                if (!z8) {
                    i12 = i13;
                }
                Point a6 = fdVar.a(i14, i12);
                if (fdVar.a(a6.x, a6.y, d9Var.f7217t)) {
                    return a6;
                }
            } else {
                try {
                    int a9 = yp.a(i12, 16) * 16;
                    int a10 = yp.a(i13, 16) * 16;
                    if (a9 * a10 <= id.b()) {
                        int i15 = z8 ? a10 : a9;
                        if (!z8) {
                            a9 = a10;
                        }
                        return new Point(i15, a9);
                    }
                } catch (id.c unused) {
                }
            }
        }
        return null;
    }

    public static int c(fd fdVar, d9 d9Var) {
        if (d9Var.f7211n != -1) {
            int size = d9Var.f7212o.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                i9 += ((byte[]) d9Var.f7212o.get(i10)).length;
            }
            return d9Var.f7211n + i9;
        }
        return a(fdVar, d9Var);
    }

    private void c0() {
        cd I5;
        this.f8632W0 = false;
        if (yp.f12451a >= 23 && this.f8648o1 && (I5 = I()) != null) {
            this.f8650q1 = new b(I5);
        }
    }

    private void d0() {
        this.f8647n1 = null;
    }

    private static boolean e0() {
        return "NVIDIA".equals(yp.f12452c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x06b8, code lost:
    
        if (r9.equals("A10-70L") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x082e, code lost:
    
        if (r0.equals("AFTN") == false) goto L608;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0817. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean f0() {
        /*
            Method dump skipped, instructions count: 3042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.f0():boolean");
    }

    private static boolean g(long j7) {
        return j7 < -30000;
    }

    private void g0() {
        if (this.f8638c1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f8622L0.a(this.f8638c1, elapsedRealtime - this.f8637b1);
            this.f8638c1 = 0;
            this.f8637b1 = elapsedRealtime;
        }
    }

    private static boolean h(long j7) {
        return j7 < -500000;
    }

    private void i0() {
        int i9 = this.f8643i1;
        if (i9 != 0) {
            this.f8622L0.b(this.h1, i9);
            this.h1 = 0L;
            this.f8643i1 = 0;
        }
    }

    private void j0() {
        int i9 = this.f8644j1;
        if (i9 != -1 || this.f8645k1 != -1) {
            yq yqVar = this.f8647n1;
            if (yqVar == null || yqVar.f12465a != i9 || yqVar.b != this.f8645k1 || yqVar.f12466c != this.l1 || yqVar.f12467d != this.f8646m1) {
                yq yqVar2 = new yq(this.f8644j1, this.f8645k1, this.l1, this.f8646m1);
                this.f8647n1 = yqVar2;
                this.f8622L0.b(yqVar2);
            }
        }
    }

    private void k0() {
        if (this.f8630U0) {
            this.f8622L0.a(this.f8628S0);
        }
    }

    private void l0() {
        yq yqVar = this.f8647n1;
        if (yqVar != null) {
            this.f8622L0.b(yqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        a0();
    }

    private void n0() {
        long j7;
        if (this.f8623M0 > 0) {
            j7 = SystemClock.elapsedRealtime() + this.f8623M0;
        } else {
            j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        this.f8636a1 = j7;
    }

    @Override // com.applovin.impl.gd
    public boolean K() {
        if (this.f8648o1 && yp.f12451a < 23) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.gd
    public void Q() {
        super.Q();
        c0();
    }

    @Override // com.applovin.impl.gd
    public void W() {
        super.W();
        this.f8640e1 = 0;
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean d() {
        f7 f7Var;
        if (super.d() && (this.f8632W0 || (((f7Var = this.f8629T0) != null && this.f8628S0 == f7Var) || I() == null || this.f8648o1))) {
            this.f8636a1 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            return true;
        }
        if (this.f8636a1 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f8636a1) {
            return true;
        }
        this.f8636a1 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        return false;
    }

    public void f(int i9) {
        l5 l5Var = this.f7833E0;
        l5Var.f8815g += i9;
        this.f8638c1 += i9;
        int i10 = this.f8639d1 + i9;
        this.f8639d1 = i10;
        l5Var.f8816h = Math.max(i10, l5Var.f8816h);
        int i11 = this.f8624N0;
        if (i11 > 0 && this.f8638c1 >= i11) {
            g0();
        }
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public void h0() {
        this.f8634Y0 = true;
        if (!this.f8632W0) {
            this.f8632W0 = true;
            this.f8622L0.a(this.f8628S0);
            this.f8630U0 = true;
        }
    }

    public void i(long j7) {
        f(j7);
        j0();
        this.f7833E0.f8813e++;
        h0();
        d(j7);
    }

    public void j(long j7) {
        this.f7833E0.a(j7);
        this.h1 += j7;
        this.f8643i1++;
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void v() {
        d0();
        c0();
        this.f8630U0 = false;
        this.K0.b();
        this.f8650q1 = null;
        try {
            super.v();
        } finally {
            this.f8622L0.a(this.f7833E0);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void w() {
        try {
            super.w();
            f7 f7Var = this.f8629T0;
            if (f7Var != null) {
                if (this.f8628S0 == f7Var) {
                    this.f8628S0 = null;
                }
                f7Var.release();
                this.f8629T0 = null;
            }
        } catch (Throwable th) {
            if (this.f8629T0 != null) {
                Surface surface = this.f8628S0;
                f7 f7Var2 = this.f8629T0;
                if (surface == f7Var2) {
                    this.f8628S0 = null;
                }
                f7Var2.release();
                this.f8629T0 = null;
            }
            throw th;
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void x() {
        super.x();
        this.f8638c1 = 0;
        this.f8637b1 = SystemClock.elapsedRealtime();
        this.f8642g1 = SystemClock.elapsedRealtime() * 1000;
        this.h1 = 0L;
        this.f8643i1 = 0;
        this.K0.e();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void y() {
        this.f8636a1 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        g0();
        i0();
        this.K0.f();
        super.y();
    }

    @Override // com.applovin.impl.gd
    public void g(String str) {
        this.f8622L0.a(str);
    }

    public boolean h(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (kd.class) {
            try {
                if (!t1) {
                    f8620u1 = f0();
                    t1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8620u1;
    }

    @Override // com.applovin.impl.gd
    public o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        o5 a6 = fdVar.a(d9Var, d9Var2);
        int i9 = a6.f9386e;
        int i10 = d9Var2.f7215r;
        a aVar = this.P0;
        if (i10 > aVar.f8652a || d9Var2.f7216s > aVar.b) {
            i9 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (c(fdVar, d9Var2) > this.P0.f8653c) {
            i9 |= 64;
        }
        int i11 = i9;
        return new o5(fdVar.f7633a, d9Var, d9Var2, i11 != 0 ? 0 : a6.f9385d, i11);
    }

    /* loaded from: classes.dex */
    public final class b implements cd.c, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f8654a;

        public b(cd cdVar) {
            Handler a6 = yp.a((Handler.Callback) this);
            this.f8654a = a6;
            cdVar.a(this, a6);
        }

        private void a(long j7) {
            kd kdVar = kd.this;
            if (this != kdVar.f8650q1) {
                return;
            }
            if (j7 == Long.MAX_VALUE) {
                kdVar.m0();
                return;
            }
            try {
                kdVar.i(j7);
            } catch (y7 e4) {
                kd.this.a(e4);
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
        public void a(cd cdVar, long j7, long j9) {
            if (yp.f12451a < 30) {
                this.f8654a.sendMessageAtFrontOfQueue(Message.obtain(this.f8654a, 0, (int) (j7 >> 32), (int) j7));
            } else {
                a(j7);
            }
        }
    }

    public void c(cd cdVar, int i9, long j7) {
        lo.a("skipVideoBuffer");
        cdVar.a(i9, false);
        lo.a();
        this.f7833E0.f8814f++;
    }

    @Override // com.applovin.impl.gd
    public void d(long j7) {
        super.d(j7);
        if (this.f8648o1) {
            return;
        }
        this.f8640e1--;
    }

    private static void a(MediaFormat mediaFormat, int i9) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i9);
    }

    private boolean c(fd fdVar) {
        return yp.f12451a >= 23 && !this.f8648o1 && !h(fdVar.f7633a) && (!fdVar.f7638g || f7.b(this.f8621J0));
    }

    public boolean d(long j7, long j9) {
        return g(j7) && j9 > 100000;
    }

    public void a(cd cdVar, int i9, long j7) {
        lo.a("dropVideoBuffer");
        cdVar.a(i9, false);
        lo.a();
        f(1);
    }

    public boolean b(long j7, boolean z8) {
        int b8 = b(j7);
        if (b8 == 0) {
            return false;
        }
        l5 l5Var = this.f7833E0;
        l5Var.f8817i++;
        int i9 = this.f8640e1 + b8;
        if (z8) {
            l5Var.f8814f += i9;
        } else {
            f(i9);
        }
        G();
        return true;
    }

    public kd(Context context, hd hdVar, long j7, boolean z8, Handler handler, xq xqVar, int i9) {
        this(context, cd.b.f7084a, hdVar, j7, z8, handler, xqVar, i9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0070, code lost:
    
        if (r9.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H265) == false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x007d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.applovin.impl.fd r11, com.applovin.impl.d9 r12) {
        /*
            r0 = 4
            r1 = 3
            java.lang.String r2 = "video/hevc"
            java.lang.String r3 = "video/avc"
            r4 = 1
            r5 = 2
            int r6 = r12.f7215r
            int r7 = r12.f7216s
            r8 = -1
            if (r6 == r8) goto Lc4
            if (r7 != r8) goto L13
            goto Lc4
        L13:
            java.lang.String r9 = r12.m
            java.lang.String r10 = "video/dolby-vision"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L36
            android.util.Pair r12 = com.applovin.impl.id.a(r12)
            if (r12 == 0) goto L35
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9 = 512(0x200, float:7.17E-43)
            if (r12 == r9) goto L33
            if (r12 == r4) goto L33
            if (r12 != r5) goto L35
        L33:
            r9 = r3
            goto L36
        L35:
            r9 = r2
        L36:
            r9.getClass()
            int r12 = r9.hashCode()
            switch(r12) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r4 = r8
            goto L7d
        L42:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L4b
            goto L40
        L4b:
            r4 = 5
            goto L7d
        L4d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L56
            goto L40
        L56:
            r4 = r0
            goto L7d
        L58:
            boolean r12 = r9.equals(r3)
            if (r12 != 0) goto L5f
            goto L40
        L5f:
            r4 = r1
            goto L7d
        L61:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L6a
            goto L40
        L6a:
            r4 = r5
            goto L7d
        L6c:
            boolean r12 = r9.equals(r2)
            if (r12 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L7c
            goto L40
        L7c:
            r4 = 0
        L7d:
            switch(r4) {
                case 0: goto Lbd;
                case 1: goto Lba;
                case 2: goto Lbd;
                case 3: goto L81;
                case 4: goto Lbd;
                case 5: goto Lba;
                default: goto L80;
            }
        L80:
            return r8
        L81:
            java.lang.String r12 = com.applovin.impl.yp.f12453d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = com.applovin.impl.yp.f12452c
            java.lang.String r2 = "Amazon"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Laa
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = "AFTS"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto Laa
            boolean r11 = r11.f7638g
            if (r11 == 0) goto Laa
            goto Lb9
        Laa:
            r11 = 16
            int r12 = com.applovin.impl.yp.a(r6, r11)
            int r11 = com.applovin.impl.yp.a(r7, r11)
            int r11 = r11 * r12
            int r11 = r11 * 256
        Lb7:
            r0 = r5
            goto Lc0
        Lb9:
            return r8
        Lba:
            int r11 = r6 * r7
            goto Lc0
        Lbd:
            int r11 = r6 * r7
            goto Lb7
        Lc0:
            int r11 = r11 * r1
            int r0 = r0 * r5
            int r11 = r11 / r0
            return r11
        Lc4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.a(com.applovin.impl.fd, com.applovin.impl.d9):int");
    }

    @Override // com.applovin.impl.gd
    public void b(n5 n5Var) {
        boolean z8 = this.f8648o1;
        if (!z8) {
            this.f8640e1++;
        }
        if (yp.f12451a >= 23 || !z8) {
            return;
        }
        i(n5Var.f9275f);
    }

    public void b(cd cdVar, int i9, long j7) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i9, true);
        lo.a();
        this.f8642g1 = SystemClock.elapsedRealtime() * 1000;
        this.f7833E0.f8813e++;
        this.f8639d1 = 0;
        h0();
    }

    public a a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int a6;
        int i9 = d9Var.f7215r;
        int i10 = d9Var.f7216s;
        int c9 = c(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            if (c9 != -1 && (a6 = a(fdVar, d9Var)) != -1) {
                c9 = Math.min((int) (c9 * 1.5f), a6);
            }
            return new a(i9, i10, c9);
        }
        int length = d9VarArr.length;
        boolean z8 = false;
        for (int i11 = 0; i11 < length; i11++) {
            d9 d9Var2 = d9VarArr[i11];
            if (d9Var.f7222y != null && d9Var2.f7222y == null) {
                d9Var2 = d9Var2.a().a(d9Var.f7222y).a();
            }
            if (fdVar.a(d9Var, d9Var2).f9385d != 0) {
                int i12 = d9Var2.f7215r;
                z8 |= i12 == -1 || d9Var2.f7216s == -1;
                i9 = Math.max(i9, i12);
                i10 = Math.max(i10, d9Var2.f7216s);
                c9 = Math.max(c9, c(fdVar, d9Var2));
            }
        }
        if (z8) {
            kc.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i9 + "x" + i10);
            Point b8 = b(fdVar, d9Var);
            if (b8 != null) {
                i9 = Math.max(i9, b8.x);
                i10 = Math.max(i10, b8.y);
                c9 = Math.max(c9, a(fdVar, d9Var.a().q(i9).g(i10).a()));
                kc.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i9 + "x" + i10);
            }
        }
        return new a(i9, i10, c9);
    }

    public boolean b(long j7, long j9, boolean z8) {
        return g(j7) && !z8;
    }

    @Override // com.applovin.impl.gd
    public boolean b(fd fdVar) {
        return this.f8628S0 != null || c(fdVar);
    }

    @Override // com.applovin.impl.gd
    public float a(float f9, d9 d9Var, d9[] d9VarArr) {
        float f10 = -1.0f;
        for (d9 d9Var2 : d9VarArr) {
            float f11 = d9Var2.f7217t;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f9;
    }

    @Override // com.applovin.impl.gd
    public List a(hd hdVar, d9 d9Var, boolean z8) {
        return a(hdVar, d9Var, z8, this.f8648o1);
    }

    private static List a(hd hdVar, d9 d9Var, boolean z8, boolean z9) {
        Pair a6;
        String str = d9Var.m;
        if (str == null) {
            return Collections.emptyList();
        }
        List a9 = id.a(hdVar.a(str, z8, z9), d9Var);
        if ("video/dolby-vision".equals(str) && (a6 = id.a(d9Var)) != null) {
            int intValue = ((Integer) a6.first).intValue();
            if (intValue == 16 || intValue == 256) {
                a9.addAll(hdVar.a(MimeTypes.VIDEO_H265, z8, z9));
            } else if (intValue == 512) {
                a9.addAll(hdVar.a(MimeTypes.VIDEO_H264, z8, z9));
            }
        }
        return Collections.unmodifiableList(a9);
    }

    @Override // com.applovin.impl.gd
    public cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f9) {
        f7 f7Var = this.f8629T0;
        if (f7Var != null && f7Var.f7569a != fdVar.f7638g) {
            f7Var.release();
            this.f8629T0 = null;
        }
        String str = fdVar.f7634c;
        a a6 = a(fdVar, d9Var, t());
        this.P0 = a6;
        MediaFormat a9 = a(d9Var, str, a6, f9, this.f8625O0, this.f8648o1 ? this.f8649p1 : 0);
        if (this.f8628S0 == null) {
            if (c(fdVar)) {
                if (this.f8629T0 == null) {
                    this.f8629T0 = f7.a(this.f8621J0, fdVar.f7638g);
                }
                this.f8628S0 = this.f8629T0;
            } else {
                throw new IllegalStateException();
            }
        }
        return cd.a.a(fdVar, a9, d9Var, this.f8628S0, mediaCrypto);
    }

    public MediaFormat a(d9 d9Var, String str, a aVar, float f9, boolean z8, int i9) {
        Pair a6;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", d9Var.f7215r);
        mediaFormat.setInteger("height", d9Var.f7216s);
        nd.a(mediaFormat, d9Var.f7212o);
        nd.a(mediaFormat, "frame-rate", d9Var.f7217t);
        nd.a(mediaFormat, "rotation-degrees", d9Var.f7218u);
        nd.a(mediaFormat, d9Var.f7222y);
        if ("video/dolby-vision".equals(d9Var.m) && (a6 = id.a(d9Var)) != null) {
            nd.a(mediaFormat, Scopes.PROFILE, ((Integer) a6.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f8652a);
        mediaFormat.setInteger("max-height", aVar.b);
        nd.a(mediaFormat, "max-input-size", aVar.f8653c);
        if (yp.f12451a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f9 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (z8) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i9 != 0) {
            a(mediaFormat, i9);
        }
        return mediaFormat;
    }

    @Override // com.applovin.impl.gd
    public void a(n5 n5Var) {
        if (this.f8627R0) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC0669a1.a(n5Var.f9276g);
            if (byteBuffer.remaining() >= 7) {
                byte b8 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b9 = byteBuffer.get();
                byte b10 = byteBuffer.get();
                byteBuffer.position(0);
                if (b8 == -75 && s5 == 60 && s9 == 1 && b9 == 4 && b10 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(I(), bArr);
                }
            }
        }
    }

    @Override // com.applovin.impl.AbstractC0685d2, com.applovin.impl.oh.b
    public void a(int i9, Object obj) {
        if (i9 == 1) {
            a(obj);
            return;
        }
        if (i9 == 7) {
            this.f8651r1 = (vq) obj;
            return;
        }
        if (i9 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f8649p1 != intValue) {
                this.f8649p1 = intValue;
                if (this.f8648o1) {
                    U();
                    return;
                }
                return;
            }
            return;
        }
        if (i9 != 4) {
            if (i9 != 5) {
                super.a(i9, obj);
                return;
            } else {
                this.K0.a(((Integer) obj).intValue());
                return;
            }
        }
        this.f8631V0 = ((Integer) obj).intValue();
        cd I5 = I();
        if (I5 != null) {
            I5.c(this.f8631V0);
        }
    }

    private void a(long j7, long j9, d9 d9Var) {
        vq vqVar = this.f8651r1;
        if (vqVar != null) {
            vqVar.a(j7, j9, d9Var, L());
        }
    }

    @Override // com.applovin.impl.gd
    public void a(Exception exc) {
        kc.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f8622L0.b(exc);
    }

    @Override // com.applovin.impl.gd
    public void a(String str, long j7, long j9) {
        this.f8622L0.a(str, j7, j9);
        this.f8626Q0 = h(str);
        this.f8627R0 = ((fd) AbstractC0669a1.a(J())).b();
        if (yp.f12451a < 23 || !this.f8648o1) {
            return;
        }
        this.f8650q1 = new b((cd) AbstractC0669a1.a(I()));
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void a(boolean z8, boolean z9) {
        super.a(z8, z9);
        boolean z10 = q().f9352a;
        AbstractC0669a1.b((z10 && this.f8649p1 == 0) ? false : true);
        if (this.f8648o1 != z10) {
            this.f8648o1 = z10;
            U();
        }
        this.f8622L0.b(this.f7833E0);
        this.K0.c();
        this.f8633X0 = z9;
        this.f8634Y0 = false;
    }

    @Override // com.applovin.impl.gd
    public o5 a(e9 e9Var) {
        o5 a6 = super.a(e9Var);
        this.f8622L0.a(e9Var.b, a6);
        return a6;
    }

    @Override // com.applovin.impl.gd
    public void a(d9 d9Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        cd I5 = I();
        if (I5 != null) {
            I5.c(this.f8631V0);
        }
        if (this.f8648o1) {
            this.f8644j1 = d9Var.f7215r;
            this.f8645k1 = d9Var.f7216s;
        } else {
            AbstractC0669a1.a(mediaFormat);
            boolean z8 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z8) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f8644j1 = integer;
            if (z8) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f8645k1 = integer2;
        }
        float f9 = d9Var.f7219v;
        this.f8646m1 = f9;
        if (yp.f12451a >= 21) {
            int i9 = d9Var.f7218u;
            if (i9 == 90 || i9 == 270) {
                int i10 = this.f8644j1;
                this.f8644j1 = this.f8645k1;
                this.f8645k1 = i10;
                this.f8646m1 = 1.0f / f9;
            }
        } else {
            this.l1 = d9Var.f7218u;
        }
        this.K0.a(d9Var.f7217t);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void a(long j7, boolean z8) {
        super.a(j7, z8);
        c0();
        this.K0.d();
        this.f8641f1 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8635Z0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8639d1 = 0;
        if (z8) {
            n0();
        } else {
            this.f8636a1 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
    }

    @Override // com.applovin.impl.gd
    public boolean a(long j7, long j9, cd cdVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j10, boolean z8, boolean z9, d9 d9Var) {
        boolean z10;
        long j11;
        AbstractC0669a1.a(cdVar);
        if (this.f8635Z0 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f8635Z0 = j7;
        }
        if (j10 != this.f8641f1) {
            this.K0.b(j10);
            this.f8641f1 = j10;
        }
        long M8 = M();
        long j12 = j10 - M8;
        if (z8 && !z9) {
            c(cdVar, i9, j12);
            return true;
        }
        double N8 = N();
        boolean z11 = b() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j13 = (long) ((j10 - j7) / N8);
        if (z11) {
            j13 -= elapsedRealtime - j9;
        }
        if (this.f8628S0 == this.f8629T0) {
            if (!g(j13)) {
                return false;
            }
            c(cdVar, i9, j12);
            j(j13);
            return true;
        }
        long j14 = elapsedRealtime - this.f8642g1;
        if (this.f8634Y0 ? this.f8632W0 : !(z11 || this.f8633X0)) {
            j11 = j14;
            z10 = false;
        } else {
            z10 = true;
            j11 = j14;
        }
        if (this.f8636a1 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 >= M8 && (z10 || (z11 && d(j13, j11)))) {
            long nanoTime = System.nanoTime();
            a(j12, nanoTime, d9Var);
            if (yp.f12451a >= 21) {
                a(cdVar, i9, j12, nanoTime);
            } else {
                b(cdVar, i9, j12);
            }
            j(j13);
            return true;
        }
        if (z11 && j7 != this.f8635Z0) {
            long nanoTime2 = System.nanoTime();
            long a6 = this.K0.a((j13 * 1000) + nanoTime2);
            long j15 = (a6 - nanoTime2) / 1000;
            boolean z12 = this.f8636a1 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            if (a(j15, j9, z9) && b(j7, z12)) {
                return false;
            }
            if (b(j15, j9, z9)) {
                if (z12) {
                    c(cdVar, i9, j12);
                } else {
                    a(cdVar, i9, j12);
                }
                j(j15);
                return true;
            }
            if (yp.f12451a >= 21) {
                if (j15 < 50000) {
                    a(j12, a6, d9Var);
                    a(cdVar, i9, j12, a6);
                    j(j15);
                    return true;
                }
            } else if (j15 < 30000) {
                if (j15 > 11000) {
                    try {
                        Thread.sleep((j15 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j12, a6, d9Var);
                b(cdVar, i9, j12);
                j(j15);
                return true;
            }
        }
        return false;
    }

    public void a(cd cdVar, int i9, long j7, long j9) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i9, j9);
        lo.a();
        this.f8642g1 = SystemClock.elapsedRealtime() * 1000;
        this.f7833E0.f8813e++;
        this.f8639d1 = 0;
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
            f7 f7Var2 = this.f8629T0;
            if (f7Var2 != null) {
                f7Var = f7Var2;
            } else {
                fd J8 = J();
                if (J8 != null && c(J8)) {
                    f7Var = f7.a(this.f8621J0, J8.f7638g);
                    this.f8629T0 = f7Var;
                }
            }
        }
        if (this.f8628S0 != f7Var) {
            this.f8628S0 = f7Var;
            this.K0.a(f7Var);
            this.f8630U0 = false;
            int b8 = b();
            cd I5 = I();
            if (I5 != null) {
                if (yp.f12451a >= 23 && f7Var != null && !this.f8626Q0) {
                    a(I5, f7Var);
                } else {
                    U();
                    P();
                }
            }
            if (f7Var != null && f7Var != this.f8629T0) {
                l0();
                c0();
                if (b8 == 2) {
                    n0();
                    return;
                }
                return;
            }
            d0();
            c0();
            return;
        }
        if (f7Var == null || f7Var == this.f8629T0) {
            return;
        }
        l0();
        k0();
    }

    public void a(cd cdVar, Surface surface) {
        cdVar.a(surface);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public void a(float f9, float f10) {
        super.a(f9, f10);
        this.K0.b(f9);
    }

    public boolean a(long j7, long j9, boolean z8) {
        return h(j7) && !z8;
    }

    @Override // com.applovin.impl.gd
    public int a(hd hdVar, d9 d9Var) {
        int i9 = 0;
        if (!df.i(d9Var.m)) {
            return mi.a(0);
        }
        boolean z8 = d9Var.f7213p != null;
        List a6 = a(hdVar, d9Var, z8, false);
        if (z8 && a6.isEmpty()) {
            a6 = a(hdVar, d9Var, false, false);
        }
        if (a6.isEmpty()) {
            return mi.a(1);
        }
        if (!gd.d(d9Var)) {
            return mi.a(2);
        }
        fd fdVar = (fd) a6.get(0);
        boolean b8 = fdVar.b(d9Var);
        int i10 = fdVar.c(d9Var) ? 16 : 8;
        if (b8) {
            List a9 = a(hdVar, d9Var, z8, true);
            if (!a9.isEmpty()) {
                fd fdVar2 = (fd) a9.get(0);
                if (fdVar2.b(d9Var) && fdVar2.c(d9Var)) {
                    i9 = 32;
                }
            }
        }
        return mi.a(b8 ? 4 : 3, i10, i9);
    }

    @Override // com.applovin.impl.gd
    public ed a(Throwable th, fd fdVar) {
        return new jd(th, fdVar, this.f8628S0);
    }
}
