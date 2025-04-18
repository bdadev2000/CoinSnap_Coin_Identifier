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
import com.applovin.impl.hd;
import com.applovin.impl.nd;
import com.applovin.impl.wq;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class pd extends ld {
    private static final int[] s1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean t1;
    private static boolean u1;
    private final Context J0;
    private final vq K0;
    private final wq.a L0;
    private final long M0;
    private final int N0;
    private final boolean O0;
    private a P0;
    private boolean Q0;
    private boolean R0;
    private Surface S0;
    private h7 T0;
    private boolean U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private long Z0;

    /* renamed from: a1, reason: collision with root package name */
    private long f26005a1;

    /* renamed from: b1, reason: collision with root package name */
    private long f26006b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f26007c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f26008d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f26009e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f26010f1;

    /* renamed from: g1, reason: collision with root package name */
    private long f26011g1;

    /* renamed from: h1, reason: collision with root package name */
    private long f26012h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f26013i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f26014j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f26015k1;

    /* renamed from: l1, reason: collision with root package name */
    private int f26016l1;
    private float m1;

    /* renamed from: n1, reason: collision with root package name */
    private xq f26017n1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f26018o1;

    /* renamed from: p1, reason: collision with root package name */
    private int f26019p1;
    b q1;
    private uq r1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f26020a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26021b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26022c;

        public a(int i2, int i3, int i4) {
            this.f26020a = i2;
            this.f26021b = i3;
            this.f26022c = i4;
        }
    }

    public pd(Context context, hd.b bVar, md mdVar, long j2, boolean z2, Handler handler, wq wqVar, int i2) {
        super(2, bVar, mdVar, z2, 30.0f);
        this.M0 = j2;
        this.N0 = i2;
        Context applicationContext = context.getApplicationContext();
        this.J0 = applicationContext;
        this.K0 = new vq(applicationContext);
        this.L0 = new wq.a(handler, wqVar);
        this.O0 = e0();
        this.f26005a1 = -9223372036854775807L;
        this.f26014j1 = -1;
        this.f26015k1 = -1;
        this.m1 = -1.0f;
        this.V0 = 1;
        this.f26019p1 = 0;
        d0();
    }

    private static Point b(kd kdVar, f9 f9Var) {
        int i2 = f9Var.f23846s;
        int i3 = f9Var.f23845r;
        boolean z2 = i2 > i3;
        int i4 = z2 ? i2 : i3;
        if (z2) {
            i2 = i3;
        }
        float f2 = i2 / i4;
        for (int i5 : s1) {
            int i6 = (int) (i5 * f2);
            if (i5 <= i4 || i6 <= i2) {
                break;
            }
            if (xp.f27962a >= 21) {
                int i7 = z2 ? i6 : i5;
                if (!z2) {
                    i5 = i6;
                }
                Point a2 = kdVar.a(i7, i5);
                if (kdVar.a(a2.x, a2.y, f9Var.f23847t)) {
                    return a2;
                }
            } else {
                try {
                    int a3 = xp.a(i5, 16) * 16;
                    int a4 = xp.a(i6, 16) * 16;
                    if (a3 * a4 <= nd.b()) {
                        int i8 = z2 ? a4 : a3;
                        if (!z2) {
                            a3 = a4;
                        }
                        return new Point(i8, a3);
                    }
                } catch (nd.c unused) {
                }
            }
        }
        return null;
    }

    public static int c(kd kdVar, f9 f9Var) {
        if (f9Var.f23841n != -1) {
            int size = f9Var.f23842o.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) f9Var.f23842o.get(i3)).length;
            }
            return f9Var.f23841n + i2;
        }
        return a(kdVar, f9Var);
    }

    private void c0() {
        hd I;
        this.W0 = false;
        if (xp.f27962a < 23 || !this.f26018o1 || (I = I()) == null) {
            return;
        }
        this.q1 = new b(I);
    }

    private void d0() {
        this.f26017n1 = null;
    }

    private static boolean e0() {
        return "NVIDIA".equals(xp.f27964c);
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.pd.f0():boolean");
    }

    private static boolean g(long j2) {
        return j2 < -30000;
    }

    private void g0() {
        if (this.f26007c1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.L0.a(this.f26007c1, elapsedRealtime - this.f26006b1);
            this.f26007c1 = 0;
            this.f26006b1 = elapsedRealtime;
        }
    }

    private static boolean h(long j2) {
        return j2 < -500000;
    }

    private void i0() {
        int i2 = this.f26013i1;
        if (i2 != 0) {
            this.L0.b(this.f26012h1, i2);
            this.f26012h1 = 0L;
            this.f26013i1 = 0;
        }
    }

    private void j0() {
        int i2 = this.f26014j1;
        if (i2 == -1 && this.f26015k1 == -1) {
            return;
        }
        xq xqVar = this.f26017n1;
        if (xqVar != null && xqVar.f27977a == i2 && xqVar.f27978b == this.f26015k1 && xqVar.f27979c == this.f26016l1 && xqVar.d == this.m1) {
            return;
        }
        xq xqVar2 = new xq(this.f26014j1, this.f26015k1, this.f26016l1, this.m1);
        this.f26017n1 = xqVar2;
        this.L0.b(xqVar2);
    }

    private void k0() {
        if (this.U0) {
            this.L0.a(this.S0);
        }
    }

    private void l0() {
        xq xqVar = this.f26017n1;
        if (xqVar != null) {
            this.L0.b(xqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        a0();
    }

    private void n0() {
        this.f26005a1 = this.M0 > 0 ? SystemClock.elapsedRealtime() + this.M0 : -9223372036854775807L;
    }

    @Override // com.applovin.impl.ld
    public boolean K() {
        return this.f26018o1 && xp.f27962a < 23;
    }

    @Override // com.applovin.impl.ld
    public void Q() {
        super.Q();
        c0();
    }

    @Override // com.applovin.impl.ld
    public void W() {
        super.W();
        this.f26009e1 = 0;
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.qi
    public boolean d() {
        h7 h7Var;
        if (super.d() && (this.W0 || (((h7Var = this.T0) != null && this.S0 == h7Var) || I() == null || this.f26018o1))) {
            this.f26005a1 = -9223372036854775807L;
            return true;
        }
        if (this.f26005a1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f26005a1) {
            return true;
        }
        this.f26005a1 = -9223372036854775807L;
        return false;
    }

    public void f(int i2) {
        n5 n5Var = this.E0;
        n5Var.f25673g += i2;
        this.f26007c1 += i2;
        int i3 = this.f26008d1 + i2;
        this.f26008d1 = i3;
        n5Var.f25674h = Math.max(i3, n5Var.f25674h);
        int i4 = this.N0;
        if (i4 <= 0 || this.f26007c1 < i4) {
            return;
        }
        g0();
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public void h0() {
        this.Y0 = true;
        if (this.W0) {
            return;
        }
        this.W0 = true;
        this.L0.a(this.S0);
        this.U0 = true;
    }

    public void i(long j2) {
        f(j2);
        j0();
        this.E0.e++;
        h0();
        d(j2);
    }

    public void j(long j2) {
        this.E0.a(j2);
        this.f26012h1 += j2;
        this.f26013i1++;
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void v() {
        d0();
        c0();
        this.U0 = false;
        this.K0.b();
        this.q1 = null;
        try {
            super.v();
        } finally {
            this.L0.a(this.E0);
        }
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void w() {
        try {
            super.w();
            h7 h7Var = this.T0;
            if (h7Var != null) {
                if (this.S0 == h7Var) {
                    this.S0 = null;
                }
                h7Var.release();
                this.T0 = null;
            }
        } catch (Throwable th) {
            if (this.T0 != null) {
                Surface surface = this.S0;
                h7 h7Var2 = this.T0;
                if (surface == h7Var2) {
                    this.S0 = null;
                }
                h7Var2.release();
                this.T0 = null;
            }
            throw th;
        }
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void x() {
        super.x();
        this.f26007c1 = 0;
        this.f26006b1 = SystemClock.elapsedRealtime();
        this.f26011g1 = SystemClock.elapsedRealtime() * 1000;
        this.f26012h1 = 0L;
        this.f26013i1 = 0;
        this.K0.e();
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void y() {
        this.f26005a1 = -9223372036854775807L;
        g0();
        i0();
        this.K0.f();
        super.y();
    }

    @Override // com.applovin.impl.ld
    public void g(String str) {
        this.L0.a(str);
    }

    public boolean h(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (pd.class) {
            try {
                if (!t1) {
                    u1 = f0();
                    t1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u1;
    }

    @Override // com.applovin.impl.ld
    public q5 a(kd kdVar, f9 f9Var, f9 f9Var2) {
        q5 a2 = kdVar.a(f9Var, f9Var2);
        int i2 = a2.e;
        int i3 = f9Var2.f23845r;
        a aVar = this.P0;
        if (i3 > aVar.f26020a || f9Var2.f23846s > aVar.f26021b) {
            i2 |= 256;
        }
        if (c(kdVar, f9Var2) > this.P0.f26022c) {
            i2 |= 64;
        }
        int i4 = i2;
        return new q5(kdVar.f24873a, f9Var, f9Var2, i4 != 0 ? 0 : a2.d, i4);
    }

    /* loaded from: classes.dex */
    public final class b implements hd.c, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f26023a;

        public b(hd hdVar) {
            Handler a2 = xp.a((Handler.Callback) this);
            this.f26023a = a2;
            hdVar.a(this, a2);
        }

        private void a(long j2) {
            pd pdVar = pd.this;
            if (this != pdVar.q1) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                pdVar.m0();
                return;
            }
            try {
                pdVar.i(j2);
            } catch (a8 e) {
                pd.this.a(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(xp.c(message.arg1, message.arg2));
            return true;
        }

        @Override // com.applovin.impl.hd.c
        public void a(hd hdVar, long j2, long j3) {
            if (xp.f27962a < 30) {
                this.f26023a.sendMessageAtFrontOfQueue(Message.obtain(this.f26023a, 0, (int) (j2 >> 32), (int) j2));
            } else {
                a(j2);
            }
        }
    }

    @Override // com.applovin.impl.ld
    public void d(long j2) {
        super.d(j2);
        if (this.f26018o1) {
            return;
        }
        this.f26009e1--;
    }

    public boolean d(long j2, long j3) {
        return g(j2) && j3 > 100000;
    }

    public void c(hd hdVar, int i2, long j2) {
        ko.a("skipVideoBuffer");
        hdVar.a(i2, false);
        ko.a();
        this.E0.f25672f++;
    }

    public pd(Context context, md mdVar, long j2, boolean z2, Handler handler, wq wqVar, int i2) {
        this(context, hd.b.f24309a, mdVar, j2, z2, handler, wqVar, i2);
    }

    private static void a(MediaFormat mediaFormat, int i2) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i2);
    }

    private boolean c(kd kdVar) {
        return xp.f27962a >= 23 && !this.f26018o1 && !h(kdVar.f24873a) && (!kdVar.f24877g || h7.b(this.J0));
    }

    public void a(hd hdVar, int i2, long j2) {
        ko.a("dropVideoBuffer");
        hdVar.a(i2, false);
        ko.a();
        f(1);
    }

    public boolean b(long j2, boolean z2) {
        int b2 = b(j2);
        if (b2 == 0) {
            return false;
        }
        n5 n5Var = this.E0;
        n5Var.f25675i++;
        int i2 = this.f26009e1 + b2;
        if (z2) {
            n5Var.f25672f += i2;
        } else {
            f(i2);
        }
        G();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0070, code lost:
    
        if (r3.equals("video/hevc") == false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x007d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.applovin.impl.kd r10, com.applovin.impl.f9 r11) {
        /*
            int r0 = r11.f23845r
            int r1 = r11.f23846s
            r2 = -1
            if (r0 == r2) goto Lc4
            if (r1 != r2) goto Lb
            goto Lc4
        Lb:
            java.lang.String r3 = r11.f23840m
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = com.applovin.impl.nd.a(r11)
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
                case 0: goto Lbd;
                case 1: goto Lba;
                case 2: goto Lbd;
                case 3: goto L81;
                case 4: goto Lbd;
                case 5: goto Lba;
                default: goto L80;
            }
        L80:
            return r2
        L81:
            java.lang.String r11 = com.applovin.impl.xp.d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb9
            java.lang.String r3 = com.applovin.impl.xp.f27964c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Laa
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb9
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Laa
            boolean r10 = r10.f24877g
            if (r10 == 0) goto Laa
            goto Lb9
        Laa:
            r10 = 16
            int r11 = com.applovin.impl.xp.a(r0, r10)
            int r10 = com.applovin.impl.xp.a(r1, r10)
            int r10 = r10 * r11
            int r10 = r10 * 256
        Lb7:
            r4 = r8
            goto Lc0
        Lb9:
            return r2
        Lba:
            int r10 = r0 * r1
            goto Lc0
        Lbd:
            int r10 = r0 * r1
            goto Lb7
        Lc0:
            int r10 = r10 * r9
            int r4 = r4 * r8
            int r10 = r10 / r4
            return r10
        Lc4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.pd.a(com.applovin.impl.kd, com.applovin.impl.f9):int");
    }

    @Override // com.applovin.impl.ld
    public void b(p5 p5Var) {
        boolean z2 = this.f26018o1;
        if (!z2) {
            this.f26009e1++;
        }
        if (xp.f27962a >= 23 || !z2) {
            return;
        }
        i(p5Var.f25964f);
    }

    public void b(hd hdVar, int i2, long j2) {
        j0();
        ko.a("releaseOutputBuffer");
        hdVar.a(i2, true);
        ko.a();
        this.f26011g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.f26008d1 = 0;
        h0();
    }

    public boolean b(long j2, long j3, boolean z2) {
        return g(j2) && !z2;
    }

    @Override // com.applovin.impl.ld
    public boolean b(kd kdVar) {
        return this.S0 != null || c(kdVar);
    }

    public a a(kd kdVar, f9 f9Var, f9[] f9VarArr) {
        int a2;
        int i2 = f9Var.f23845r;
        int i3 = f9Var.f23846s;
        int c2 = c(kdVar, f9Var);
        if (f9VarArr.length == 1) {
            if (c2 != -1 && (a2 = a(kdVar, f9Var)) != -1) {
                c2 = Math.min((int) (c2 * 1.5f), a2);
            }
            return new a(i2, i3, c2);
        }
        int length = f9VarArr.length;
        boolean z2 = false;
        for (int i4 = 0; i4 < length; i4++) {
            f9 f9Var2 = f9VarArr[i4];
            if (f9Var.f23850y != null && f9Var2.f23850y == null) {
                f9Var2 = f9Var2.a().a(f9Var.f23850y).a();
            }
            if (kdVar.a(f9Var, f9Var2).d != 0) {
                int i5 = f9Var2.f23845r;
                z2 |= i5 == -1 || f9Var2.f23846s == -1;
                i2 = Math.max(i2, i5);
                i3 = Math.max(i3, f9Var2.f23846s);
                c2 = Math.max(c2, c(kdVar, f9Var2));
            }
        }
        if (z2) {
            pc.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i2 + "x" + i3);
            Point b2 = b(kdVar, f9Var);
            if (b2 != null) {
                i2 = Math.max(i2, b2.x);
                i3 = Math.max(i3, b2.y);
                c2 = Math.max(c2, a(kdVar, f9Var.a().q(i2).g(i3).a()));
                pc.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i2 + "x" + i3);
            }
        }
        return new a(i2, i3, c2);
    }

    @Override // com.applovin.impl.ld
    public float a(float f2, f9 f9Var, f9[] f9VarArr) {
        float f3 = -1.0f;
        for (f9 f9Var2 : f9VarArr) {
            float f4 = f9Var2.f23847t;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // com.applovin.impl.ld
    public List a(md mdVar, f9 f9Var, boolean z2) {
        return a(mdVar, f9Var, z2, this.f26018o1);
    }

    private static List a(md mdVar, f9 f9Var, boolean z2, boolean z3) {
        Pair a2;
        String str = f9Var.f23840m;
        if (str == null) {
            return Collections.emptyList();
        }
        List a3 = nd.a(mdVar.a(str, z2, z3), f9Var);
        if ("video/dolby-vision".equals(str) && (a2 = nd.a(f9Var)) != null) {
            int intValue = ((Integer) a2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                a3.addAll(mdVar.a("video/hevc", z2, z3));
            } else if (intValue == 512) {
                a3.addAll(mdVar.a("video/avc", z2, z3));
            }
        }
        return Collections.unmodifiableList(a3);
    }

    @Override // com.applovin.impl.ld
    public hd.a a(kd kdVar, f9 f9Var, MediaCrypto mediaCrypto, float f2) {
        h7 h7Var = this.T0;
        if (h7Var != null && h7Var.f24234a != kdVar.f24877g) {
            h7Var.release();
            this.T0 = null;
        }
        String str = kdVar.f24875c;
        a a2 = a(kdVar, f9Var, t());
        this.P0 = a2;
        MediaFormat a3 = a(f9Var, str, a2, f2, this.O0, this.f26018o1 ? this.f26019p1 : 0);
        if (this.S0 == null) {
            if (!c(kdVar)) {
                throw new IllegalStateException();
            }
            if (this.T0 == null) {
                this.T0 = h7.a(this.J0, kdVar.f24877g);
            }
            this.S0 = this.T0;
        }
        return hd.a.a(kdVar, a3, f9Var, this.S0, mediaCrypto);
    }

    public MediaFormat a(f9 f9Var, String str, a aVar, float f2, boolean z2, int i2) {
        Pair a2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, f9Var.f23845r);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, f9Var.f23846s);
        sd.a(mediaFormat, f9Var.f23842o);
        sd.a(mediaFormat, "frame-rate", f9Var.f23847t);
        sd.a(mediaFormat, "rotation-degrees", f9Var.f23848u);
        sd.a(mediaFormat, f9Var.f23850y);
        if ("video/dolby-vision".equals(f9Var.f23840m) && (a2 = nd.a(f9Var)) != null) {
            sd.a(mediaFormat, Scopes.PROFILE, ((Integer) a2.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f26020a);
        mediaFormat.setInteger("max-height", aVar.f26021b);
        sd.a(mediaFormat, "max-input-size", aVar.f26022c);
        if (xp.f27962a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            a(mediaFormat, i2);
        }
        return mediaFormat;
    }

    @Override // com.applovin.impl.ld
    public void a(p5 p5Var) {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) b1.a(p5Var.f25965g);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s2 == 60 && s3 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(I(), bArr);
                }
            }
        }
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.rh.b
    public void a(int i2, Object obj) {
        if (i2 == 1) {
            a(obj);
            return;
        }
        if (i2 == 7) {
            this.r1 = (uq) obj;
            return;
        }
        if (i2 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f26019p1 != intValue) {
                this.f26019p1 = intValue;
                if (this.f26018o1) {
                    U();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 != 4) {
            if (i2 != 5) {
                super.a(i2, obj);
                return;
            } else {
                this.K0.a(((Integer) obj).intValue());
                return;
            }
        }
        this.V0 = ((Integer) obj).intValue();
        hd I = I();
        if (I != null) {
            I.c(this.V0);
        }
    }

    private void a(long j2, long j3, f9 f9Var) {
        uq uqVar = this.r1;
        if (uqVar != null) {
            uqVar.a(j2, j3, f9Var, L());
        }
    }

    @Override // com.applovin.impl.ld
    public void a(Exception exc) {
        pc.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.L0.b(exc);
    }

    @Override // com.applovin.impl.ld
    public void a(String str, long j2, long j3) {
        this.L0.a(str, j2, j3);
        this.Q0 = h(str);
        this.R0 = ((kd) b1.a(J())).b();
        if (xp.f27962a < 23 || !this.f26018o1) {
            return;
        }
        this.q1 = new b((hd) b1.a(I()));
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void a(boolean z2, boolean z3) {
        super.a(z2, z3);
        boolean z4 = q().f26902a;
        b1.b((z4 && this.f26019p1 == 0) ? false : true);
        if (this.f26018o1 != z4) {
            this.f26018o1 = z4;
            U();
        }
        this.L0.b(this.E0);
        this.K0.c();
        this.X0 = z3;
        this.Y0 = false;
    }

    @Override // com.applovin.impl.ld
    public q5 a(g9 g9Var) {
        q5 a2 = super.a(g9Var);
        this.L0.a(g9Var.f24058b, a2);
        return a2;
    }

    @Override // com.applovin.impl.ld
    public void a(f9 f9Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        hd I = I();
        if (I != null) {
            I.c(this.V0);
        }
        if (this.f26018o1) {
            this.f26014j1 = f9Var.f23845r;
            this.f26015k1 = f9Var.f23846s;
        } else {
            b1.a(mediaFormat);
            boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z2) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            }
            this.f26014j1 = integer;
            if (z2) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            }
            this.f26015k1 = integer2;
        }
        float f2 = f9Var.f23849v;
        this.m1 = f2;
        if (xp.f27962a >= 21) {
            int i2 = f9Var.f23848u;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.f26014j1;
                this.f26014j1 = this.f26015k1;
                this.f26015k1 = i3;
                this.m1 = 1.0f / f2;
            }
        } else {
            this.f26016l1 = f9Var.f23848u;
        }
        this.K0.a(f9Var.f23847t);
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void a(long j2, boolean z2) {
        super.a(j2, z2);
        c0();
        this.K0.d();
        this.f26010f1 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.f26008d1 = 0;
        if (z2) {
            n0();
        } else {
            this.f26005a1 = -9223372036854775807L;
        }
    }

    @Override // com.applovin.impl.ld
    public boolean a(long j2, long j3, hd hdVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, f9 f9Var) {
        boolean z4;
        long j5;
        b1.a(hdVar);
        if (this.Z0 == -9223372036854775807L) {
            this.Z0 = j2;
        }
        if (j4 != this.f26010f1) {
            this.K0.b(j4);
            this.f26010f1 = j4;
        }
        long M = M();
        long j6 = j4 - M;
        if (z2 && !z3) {
            c(hdVar, i2, j6);
            return true;
        }
        double N = N();
        boolean z5 = b() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j7 = (long) ((j4 - j2) / N);
        if (z5) {
            j7 -= elapsedRealtime - j3;
        }
        if (this.S0 == this.T0) {
            if (!g(j7)) {
                return false;
            }
            c(hdVar, i2, j6);
            j(j7);
            return true;
        }
        long j8 = elapsedRealtime - this.f26011g1;
        if (this.Y0 ? this.W0 : !(z5 || this.X0)) {
            j5 = j8;
            z4 = false;
        } else {
            z4 = true;
            j5 = j8;
        }
        if (this.f26005a1 == -9223372036854775807L && j2 >= M && (z4 || (z5 && d(j7, j5)))) {
            long nanoTime = System.nanoTime();
            a(j6, nanoTime, f9Var);
            if (xp.f27962a >= 21) {
                a(hdVar, i2, j6, nanoTime);
            } else {
                b(hdVar, i2, j6);
            }
            j(j7);
            return true;
        }
        if (z5 && j2 != this.Z0) {
            long nanoTime2 = System.nanoTime();
            long a2 = this.K0.a((j7 * 1000) + nanoTime2);
            long j9 = (a2 - nanoTime2) / 1000;
            boolean z6 = this.f26005a1 != -9223372036854775807L;
            if (a(j9, j3, z3) && b(j2, z6)) {
                return false;
            }
            if (b(j9, j3, z3)) {
                if (z6) {
                    c(hdVar, i2, j6);
                } else {
                    a(hdVar, i2, j6);
                }
                j(j9);
                return true;
            }
            if (xp.f27962a >= 21) {
                if (j9 < 50000) {
                    a(j6, a2, f9Var);
                    a(hdVar, i2, j6, a2);
                    j(j9);
                    return true;
                }
            } else if (j9 < 30000) {
                if (j9 > 11000) {
                    try {
                        Thread.sleep((j9 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j6, a2, f9Var);
                b(hdVar, i2, j6);
                j(j9);
                return true;
            }
        }
        return false;
    }

    public void a(hd hdVar, int i2, long j2, long j3) {
        j0();
        ko.a("releaseOutputBuffer");
        hdVar.a(i2, j3);
        ko.a();
        this.f26011g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.f26008d1 = 0;
        h0();
    }

    private static void a(hd hdVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hdVar.a(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.applovin.impl.e2, com.applovin.impl.ld, com.applovin.impl.pd] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void a(Object obj) {
        h7 h7Var = obj instanceof Surface ? (Surface) obj : null;
        if (h7Var == null) {
            h7 h7Var2 = this.T0;
            if (h7Var2 != null) {
                h7Var = h7Var2;
            } else {
                kd J = J();
                if (J != null && c(J)) {
                    h7Var = h7.a(this.J0, J.f24877g);
                    this.T0 = h7Var;
                }
            }
        }
        if (this.S0 == h7Var) {
            if (h7Var == null || h7Var == this.T0) {
                return;
            }
            l0();
            k0();
            return;
        }
        this.S0 = h7Var;
        this.K0.a(h7Var);
        this.U0 = false;
        int b2 = b();
        hd I = I();
        if (I != null) {
            if (xp.f27962a >= 23 && h7Var != null && !this.Q0) {
                a(I, h7Var);
            } else {
                U();
                P();
            }
        }
        if (h7Var != null && h7Var != this.T0) {
            l0();
            c0();
            if (b2 == 2) {
                n0();
                return;
            }
            return;
        }
        d0();
        c0();
    }

    public void a(hd hdVar, Surface surface) {
        hdVar.a(surface);
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.qi
    public void a(float f2, float f3) {
        super.a(f2, f3);
        this.K0.b(f2);
    }

    public boolean a(long j2, long j3, boolean z2) {
        return h(j2) && !z2;
    }

    @Override // com.applovin.impl.ld
    public int a(md mdVar, f9 f9Var) {
        int i2 = 0;
        if (!Cif.i(f9Var.f23840m)) {
            return ri.a(0);
        }
        boolean z2 = f9Var.f23843p != null;
        List a2 = a(mdVar, f9Var, z2, false);
        if (z2 && a2.isEmpty()) {
            a2 = a(mdVar, f9Var, false, false);
        }
        if (a2.isEmpty()) {
            return ri.a(1);
        }
        if (!ld.d(f9Var)) {
            return ri.a(2);
        }
        kd kdVar = (kd) a2.get(0);
        boolean b2 = kdVar.b(f9Var);
        int i3 = kdVar.c(f9Var) ? 16 : 8;
        if (b2) {
            List a3 = a(mdVar, f9Var, z2, true);
            if (!a3.isEmpty()) {
                kd kdVar2 = (kd) a3.get(0);
                if (kdVar2.b(f9Var) && kdVar2.c(f9Var)) {
                    i2 = 32;
                }
            }
        }
        return ri.a(b2 ? 4 : 3, i3, i2);
    }

    @Override // com.applovin.impl.ld
    public jd a(Throwable th, kd kdVar) {
        return new od(th, kdVar, this.S0);
    }
}
