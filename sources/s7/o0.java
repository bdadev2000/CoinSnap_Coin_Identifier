package s7;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class o0 implements Handler.Callback, v8.v, n {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public n0 K;
    public long L;
    public int M;
    public boolean N;
    public r O;
    public long P = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public final g[] f24613b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f24614c;

    /* renamed from: d, reason: collision with root package name */
    public final g[] f24615d;

    /* renamed from: f, reason: collision with root package name */
    public final k9.t f24616f;

    /* renamed from: g, reason: collision with root package name */
    public final k9.x f24617g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f24618h;

    /* renamed from: i, reason: collision with root package name */
    public final m9.e f24619i;

    /* renamed from: j, reason: collision with root package name */
    public final n9.e0 f24620j;

    /* renamed from: k, reason: collision with root package name */
    public final HandlerThread f24621k;

    /* renamed from: l, reason: collision with root package name */
    public final Looper f24622l;

    /* renamed from: m, reason: collision with root package name */
    public final w2 f24623m;

    /* renamed from: n, reason: collision with root package name */
    public final v2 f24624n;

    /* renamed from: o, reason: collision with root package name */
    public final long f24625o;

    /* renamed from: p, reason: collision with root package name */
    public final o f24626p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f24627q;

    /* renamed from: r, reason: collision with root package name */
    public final n9.a f24628r;

    /* renamed from: s, reason: collision with root package name */
    public final y f24629s;

    /* renamed from: t, reason: collision with root package name */
    public final o1 f24630t;
    public final w1 u;

    /* renamed from: v, reason: collision with root package name */
    public final l f24631v;

    /* renamed from: w, reason: collision with root package name */
    public p2 f24632w;

    /* renamed from: x, reason: collision with root package name */
    public a2 f24633x;

    /* renamed from: y, reason: collision with root package name */
    public l0 f24634y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24635z;

    public o0(g[] gVarArr, k9.t tVar, k9.x xVar, u0 u0Var, m9.e eVar, int i10, boolean z10, t7.a aVar, p2 p2Var, l lVar, boolean z11, Looper looper, n9.a aVar2, y yVar, t7.x xVar2) {
        this.f24629s = yVar;
        this.f24613b = gVarArr;
        this.f24616f = tVar;
        this.f24617g = xVar;
        this.f24618h = u0Var;
        this.f24619i = eVar;
        this.E = i10;
        this.F = z10;
        this.f24632w = p2Var;
        this.f24631v = lVar;
        this.A = z11;
        this.f24628r = aVar2;
        this.f24625o = ((m) u0Var).f24573g;
        a2 g10 = a2.g(xVar);
        this.f24633x = g10;
        this.f24634y = new l0(g10);
        this.f24615d = new g[gVarArr.length];
        k9.o oVar = (k9.o) tVar;
        oVar.getClass();
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            g gVar = gVarArr[i11];
            gVar.f24362g = i11;
            gVar.f24363h = xVar2;
            this.f24615d[i11] = gVar;
            synchronized (gVar.f24358b) {
                gVar.f24371p = oVar;
            }
        }
        this.f24626p = new o(this, aVar2);
        this.f24627q = new ArrayList();
        this.f24614c = Collections.newSetFromMap(new IdentityHashMap());
        this.f24623m = new w2();
        this.f24624n = new v2();
        tVar.a = this;
        tVar.f20477b = eVar;
        this.N = true;
        n9.c0 c0Var = (n9.c0) aVar2;
        n9.e0 a = c0Var.a(looper, null);
        this.f24630t = new o1(aVar, a);
        this.u = new w1(this, aVar, a, xVar2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f24621k = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f24622l = looper2;
        this.f24620j = c0Var.a(looper2, this);
    }

    public static Pair E(x2 x2Var, n0 n0Var, boolean z10, int i10, boolean z11, w2 w2Var, v2 v2Var) {
        x2 x2Var2;
        Pair i11;
        Object F;
        x2 x2Var3 = n0Var.a;
        if (x2Var.p()) {
            return null;
        }
        if (x2Var3.p()) {
            x2Var2 = x2Var;
        } else {
            x2Var2 = x2Var3;
        }
        try {
            i11 = x2Var2.i(w2Var, v2Var, n0Var.f24597b, n0Var.f24598c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (x2Var.equals(x2Var2)) {
            return i11;
        }
        if (x2Var.b(i11.first) != -1) {
            if (x2Var2.g(i11.first, v2Var).f24790h && x2Var2.m(v2Var.f24787d, w2Var).f24853q == x2Var2.b(i11.first)) {
                return x2Var.i(w2Var, v2Var, x2Var.g(i11.first, v2Var).f24787d, n0Var.f24598c);
            }
            return i11;
        }
        if (z10 && (F = F(w2Var, v2Var, i10, z11, i11.first, x2Var2, x2Var)) != null) {
            return x2Var.i(w2Var, v2Var, x2Var.g(F, v2Var).f24787d, C.TIME_UNSET);
        }
        return null;
    }

    public static Object F(w2 w2Var, v2 v2Var, int i10, boolean z10, Object obj, x2 x2Var, x2 x2Var2) {
        int b3 = x2Var.b(obj);
        int h10 = x2Var.h();
        int i11 = b3;
        int i12 = -1;
        for (int i13 = 0; i13 < h10 && i12 == -1; i13++) {
            i11 = x2Var.d(i11, v2Var, w2Var, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = x2Var2.b(x2Var.l(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return x2Var2.l(i12);
    }

    public static void K(g gVar, long j3) {
        gVar.f24369n = true;
        if (gVar instanceof a9.o) {
            a9.o oVar = (a9.o) gVar;
            v8.u0.m(oVar.f24369n);
            oVar.E = j3;
        }
    }

    public static boolean q(g gVar) {
        return gVar.f24364i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (r0 == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.o0.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        boolean z10;
        m1 m1Var = this.f24630t.f24642h;
        if (m1Var != null && m1Var.f24585f.f24605h && this.A) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B = z10;
    }

    public final void C(long j3) {
        long j10;
        m1 m1Var = this.f24630t.f24642h;
        if (m1Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = m1Var.f24594o;
        }
        long j11 = j3 + j10;
        this.L = j11;
        this.f24626p.f24607b.b(j11);
        for (g gVar : this.f24613b) {
            if (q(gVar)) {
                long j12 = this.L;
                gVar.f24369n = false;
                gVar.f24368m = j12;
                gVar.l(j12, false);
            }
        }
        for (m1 m1Var2 = r0.f24642h; m1Var2 != null; m1Var2 = m1Var2.f24591l) {
            for (k9.q qVar : m1Var2.f24593n.f20526c) {
                if (qVar != null) {
                    qVar.d();
                }
            }
        }
    }

    public final void D(x2 x2Var, x2 x2Var2) {
        if (x2Var.p() && x2Var2.p()) {
            return;
        }
        ArrayList arrayList = this.f24627q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a4.j.t(arrayList.get(size));
            throw null;
        }
    }

    public final void G(boolean z10) {
        v8.z zVar = this.f24630t.f24642h.f24585f.a;
        long I = I(zVar, this.f24633x.f24281r, true, false);
        if (I != this.f24633x.f24281r) {
            a2 a2Var = this.f24633x;
            this.f24633x = o(zVar, I, a2Var.f24266c, a2Var.f24267d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:6:0x009d, B:8:0x00a7, B:15:0x00ad, B:17:0x00b3, B:18:0x00b6, B:19:0x00bb, B:21:0x00c5, B:23:0x00cb, B:27:0x00d3, B:28:0x00dd, B:30:0x00ed, B:34:0x00f7, B:36:0x010b, B:39:0x0114, B:42:0x011f), top: B:5:0x009d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(s7.n0 r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.o0.H(s7.n0):void");
    }

    public final long I(v8.z zVar, long j3, boolean z10, boolean z11) {
        Z();
        this.C = false;
        if (z11 || this.f24633x.f24268e == 3) {
            U(2);
        }
        o1 o1Var = this.f24630t;
        m1 m1Var = o1Var.f24642h;
        m1 m1Var2 = m1Var;
        while (m1Var2 != null && !zVar.equals(m1Var2.f24585f.a)) {
            m1Var2 = m1Var2.f24591l;
        }
        if (z10 || m1Var != m1Var2 || (m1Var2 != null && m1Var2.f24594o + j3 < 0)) {
            g[] gVarArr = this.f24613b;
            for (g gVar : gVarArr) {
                d(gVar);
            }
            if (m1Var2 != null) {
                while (o1Var.f24642h != m1Var2) {
                    o1Var.a();
                }
                o1Var.l(m1Var2);
                m1Var2.f24594o = 1000000000000L;
                f(new boolean[gVarArr.length]);
            }
        }
        if (m1Var2 != null) {
            o1Var.l(m1Var2);
            if (!m1Var2.f24583d) {
                m1Var2.f24585f = m1Var2.f24585f.b(j3);
            } else if (m1Var2.f24584e) {
                v8.w wVar = m1Var2.a;
                j3 = wVar.seekToUs(j3);
                wVar.o(j3 - this.f24625o);
            }
            C(j3);
            s();
        } else {
            o1Var.b();
            C(j3);
        }
        k(false);
        this.f24620j.d(2);
        return j3;
    }

    public final void J(j2 j2Var) {
        Looper looper = j2Var.f24462f;
        if (!looper.getThread().isAlive()) {
            n9.o.f("TAG", "Trying to send message on a dead thread.");
            j2Var.b(false);
        } else {
            ((n9.c0) this.f24628r).a(looper, null).c(new com.facebook.r0(14, this, j2Var));
        }
    }

    public final void L(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.G != z10) {
            this.G = z10;
            if (!z10) {
                for (g gVar : this.f24613b) {
                    if (!q(gVar) && this.f24614c.remove(gVar)) {
                        gVar.u();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void M(k0 k0Var) {
        this.f24634y.a(1);
        int i10 = k0Var.f24469c;
        v8.c1 c1Var = k0Var.f24468b;
        List list = k0Var.a;
        if (i10 != -1) {
            this.K = new n0(new l2(list, c1Var), k0Var.f24469c, k0Var.f24470d);
        }
        w1 w1Var = this.u;
        ArrayList arrayList = w1Var.f24822b;
        w1Var.g(0, arrayList.size());
        l(w1Var.a(arrayList.size(), list, c1Var), false);
    }

    public final void N(boolean z10) {
        if (z10 == this.I) {
            return;
        }
        this.I = z10;
        if (!z10 && this.f24633x.f24278o) {
            this.f24620j.d(2);
        }
    }

    public final void O(boolean z10) {
        this.A = z10;
        B();
        if (this.B) {
            o1 o1Var = this.f24630t;
            if (o1Var.f24643i != o1Var.f24642h) {
                G(true);
                k(false);
            }
        }
    }

    public final void P(int i10, int i11, boolean z10, boolean z11) {
        this.f24634y.a(z11 ? 1 : 0);
        l0 l0Var = this.f24634y;
        l0Var.a = true;
        l0Var.f24514f = true;
        l0Var.f24515g = i11;
        this.f24633x = this.f24633x.c(i10, z10);
        this.C = false;
        for (m1 m1Var = this.f24630t.f24642h; m1Var != null; m1Var = m1Var.f24591l) {
            for (k9.q qVar : m1Var.f24593n.f20526c) {
                if (qVar != null) {
                    qVar.e(z10);
                }
            }
        }
        if (!V()) {
            Z();
            c0();
            return;
        }
        int i12 = this.f24633x.f24268e;
        n9.e0 e0Var = this.f24620j;
        if (i12 == 3) {
            X();
            e0Var.d(2);
        } else if (i12 == 2) {
            e0Var.d(2);
        }
    }

    public final void Q(b2 b2Var) {
        this.f24620j.a.removeMessages(16);
        o oVar = this.f24626p;
        oVar.a(b2Var);
        b2 playbackParameters = oVar.getPlaybackParameters();
        n(playbackParameters, playbackParameters.f24302b, true, true);
    }

    public final void R(int i10) {
        this.E = i10;
        x2 x2Var = this.f24633x.a;
        o1 o1Var = this.f24630t;
        o1Var.f24640f = i10;
        if (!o1Var.o(x2Var)) {
            G(true);
        }
        k(false);
    }

    public final void S(boolean z10) {
        this.F = z10;
        x2 x2Var = this.f24633x.a;
        o1 o1Var = this.f24630t;
        o1Var.f24641g = z10;
        if (!o1Var.o(x2Var)) {
            G(true);
        }
        k(false);
    }

    public final void T(v8.c1 c1Var) {
        this.f24634y.a(1);
        w1 w1Var = this.u;
        int size = w1Var.f24822b.size();
        if (c1Var.f26083b.length != size) {
            c1Var = new v8.c1(new Random(c1Var.a.nextLong())).a(0, size);
        }
        w1Var.f24830j = c1Var;
        l(w1Var.b(), false);
    }

    public final void U(int i10) {
        a2 a2Var = this.f24633x;
        if (a2Var.f24268e != i10) {
            if (i10 != 2) {
                this.P = C.TIME_UNSET;
            }
            this.f24633x = a2Var.e(i10);
        }
    }

    public final boolean V() {
        a2 a2Var = this.f24633x;
        return a2Var.f24275l && a2Var.f24276m == 0;
    }

    public final boolean W(x2 x2Var, v8.z zVar) {
        if (zVar.a() || x2Var.p()) {
            return false;
        }
        int i10 = x2Var.g(zVar.a, this.f24624n).f24787d;
        w2 w2Var = this.f24623m;
        x2Var.m(i10, w2Var);
        if (!w2Var.a() || !w2Var.f24847k || w2Var.f24844h == C.TIME_UNSET) {
            return false;
        }
        return true;
    }

    public final void X() {
        boolean z10;
        this.C = false;
        o oVar = this.f24626p;
        oVar.f24612h = true;
        oVar.f24607b.c();
        for (g gVar : this.f24613b) {
            if (q(gVar)) {
                if (gVar.f24364i == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v8.u0.m(z10);
                gVar.f24364i = 2;
                gVar.o();
            }
        }
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.G) {
            z12 = false;
        } else {
            z12 = true;
        }
        A(z12, false, true, false);
        this.f24634y.a(z11 ? 1 : 0);
        ((m) this.f24618h).b(true);
        U(1);
    }

    public final void Z() {
        int i10;
        boolean z10;
        o oVar = this.f24626p;
        oVar.f24612h = false;
        n9.b0 b0Var = oVar.f24607b;
        if (b0Var.f22520c) {
            b0Var.b(b0Var.getPositionUs());
            b0Var.f22520c = false;
        }
        for (g gVar : this.f24613b) {
            if (q(gVar) && (i10 = gVar.f24364i) == 2) {
                if (i10 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v8.u0.m(z10);
                gVar.f24364i = 1;
                gVar.p();
            }
        }
    }

    @Override // v8.v
    public final void a(v8.w wVar) {
        this.f24620j.a(8, wVar).a();
    }

    public final void a0() {
        boolean z10;
        m1 m1Var = this.f24630t.f24644j;
        if (!this.D && (m1Var == null || !m1Var.a.isLoading())) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        a2 a2Var = this.f24633x;
        if (z11 != a2Var.f24270g) {
            this.f24633x = new a2(a2Var.a, a2Var.f24265b, a2Var.f24266c, a2Var.f24267d, a2Var.f24268e, a2Var.f24269f, z11, a2Var.f24271h, a2Var.f24272i, a2Var.f24273j, a2Var.f24274k, a2Var.f24275l, a2Var.f24276m, a2Var.f24277n, a2Var.f24279p, a2Var.f24280q, a2Var.f24281r, a2Var.f24282s, a2Var.f24278o);
        }
    }

    @Override // v8.a1
    public final void b(v8.b1 b1Var) {
        this.f24620j.a(9, (v8.w) b1Var).a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0021. Please report as an issue. */
    public final void b0(k9.x xVar) {
        x2 x2Var = this.f24633x.a;
        k9.q[] qVarArr = xVar.f20526c;
        m mVar = (m) this.f24618h;
        int i10 = mVar.f24572f;
        boolean z10 = false;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                g[] gVarArr = this.f24613b;
                int length = gVarArr.length;
                int i13 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i11 < length) {
                    if (qVarArr[i11] != null) {
                        switch (gVarArr[i11].f24359c) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 1:
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i12);
                }
            }
        }
        mVar.f24574h = i10;
        m9.q qVar = mVar.a;
        synchronized (qVar) {
            if (i10 < qVar.f21716c) {
                z10 = true;
            }
            qVar.f21716c = i10;
            if (z10) {
                qVar.a();
            }
        }
    }

    public final void c(k0 k0Var, int i10) {
        this.f24634y.a(1);
        w1 w1Var = this.u;
        if (i10 == -1) {
            i10 = w1Var.f24822b.size();
        }
        l(w1Var.a(i10, k0Var.a, k0Var.f24468b), false);
    }

    public final void c0() {
        long j3;
        boolean z10;
        boolean z11;
        long max;
        long max2;
        float f10;
        m1 m1Var = this.f24630t.f24642h;
        if (m1Var == null) {
            return;
        }
        if (m1Var.f24583d) {
            j3 = m1Var.a.readDiscontinuity();
        } else {
            j3 = -9223372036854775807L;
        }
        if (j3 != C.TIME_UNSET) {
            C(j3);
            if (j3 != this.f24633x.f24281r) {
                a2 a2Var = this.f24633x;
                this.f24633x = o(a2Var.f24265b, j3, a2Var.f24266c, j3, true, 5);
            }
        } else {
            o oVar = this.f24626p;
            if (m1Var != this.f24630t.f24643i) {
                z10 = true;
            } else {
                z10 = false;
            }
            g gVar = oVar.f24609d;
            if (gVar != null && !gVar.h() && (oVar.f24609d.i() || (!z10 && !oVar.f24609d.g()))) {
                z11 = false;
            } else {
                z11 = true;
            }
            n9.b0 b0Var = oVar.f24607b;
            if (z11) {
                oVar.f24611g = true;
                if (oVar.f24612h) {
                    b0Var.c();
                }
            } else {
                n9.p pVar = oVar.f24610f;
                pVar.getClass();
                long positionUs = pVar.getPositionUs();
                if (oVar.f24611g) {
                    if (positionUs < b0Var.getPositionUs()) {
                        if (b0Var.f22520c) {
                            b0Var.b(b0Var.getPositionUs());
                            b0Var.f22520c = false;
                        }
                    } else {
                        oVar.f24611g = false;
                        if (oVar.f24612h) {
                            b0Var.c();
                        }
                    }
                }
                b0Var.b(positionUs);
                b2 playbackParameters = pVar.getPlaybackParameters();
                if (!playbackParameters.equals(b0Var.f22523g)) {
                    b0Var.a(playbackParameters);
                    ((o0) oVar.f24608c).f24620j.a(16, playbackParameters).a();
                }
            }
            long positionUs2 = oVar.getPositionUs();
            this.L = positionUs2;
            long j10 = positionUs2 - m1Var.f24594o;
            long j11 = this.f24633x.f24281r;
            if (!this.f24627q.isEmpty() && !this.f24633x.f24265b.a()) {
                if (this.N) {
                    this.N = false;
                }
                a2 a2Var2 = this.f24633x;
                a2Var2.a.b(a2Var2.f24265b.a);
                int min = Math.min(this.M, this.f24627q.size());
                if (min > 0) {
                    a4.j.t(this.f24627q.get(min - 1));
                }
                if (min < this.f24627q.size()) {
                    a4.j.t(this.f24627q.get(min));
                }
                this.M = min;
            }
            a2 a2Var3 = this.f24633x;
            a2Var3.f24281r = j10;
            a2Var3.f24282s = SystemClock.elapsedRealtime();
        }
        this.f24633x.f24279p = this.f24630t.f24644j.d();
        a2 a2Var4 = this.f24633x;
        long j12 = a2Var4.f24279p;
        m1 m1Var2 = this.f24630t.f24644j;
        if (m1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j12 - (this.L - m1Var2.f24594o));
        }
        a2Var4.f24280q = max;
        a2 a2Var5 = this.f24633x;
        if (a2Var5.f24275l && a2Var5.f24268e == 3 && W(a2Var5.a, a2Var5.f24265b)) {
            a2 a2Var6 = this.f24633x;
            if (a2Var6.f24277n.f24302b == 1.0f) {
                l lVar = this.f24631v;
                long g10 = g(a2Var6.a, a2Var6.f24265b.a, a2Var6.f24281r);
                long j13 = this.f24633x.f24279p;
                m1 m1Var3 = this.f24630t.f24644j;
                if (m1Var3 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j13 - (this.L - m1Var3.f24594o));
                }
                if (lVar.f24498d == C.TIME_UNSET) {
                    f10 = 1.0f;
                } else {
                    long j14 = g10 - max2;
                    long j15 = lVar.f24508n;
                    if (j15 == C.TIME_UNSET) {
                        lVar.f24508n = j14;
                        lVar.f24509o = 0L;
                    } else {
                        float f11 = lVar.f24497c;
                        float f12 = ((float) j15) * f11;
                        float f13 = 1.0f - f11;
                        lVar.f24508n = Math.max(j14, (((float) j14) * f13) + f12);
                        lVar.f24509o = (f13 * ((float) Math.abs(j14 - r4))) + (((float) lVar.f24509o) * f11);
                    }
                    if (lVar.f24507m != C.TIME_UNSET && SystemClock.elapsedRealtime() - lVar.f24507m < 1000) {
                        f10 = lVar.f24506l;
                    } else {
                        lVar.f24507m = SystemClock.elapsedRealtime();
                        long j16 = (lVar.f24509o * 3) + lVar.f24508n;
                        if (lVar.f24503i > j16) {
                            float H = (float) n9.h0.H(1000L);
                            long[] jArr = {j16, lVar.f24500f, lVar.f24503i - (((lVar.f24506l - 1.0f) * H) + ((lVar.f24504j - 1.0f) * H))};
                            long j17 = j16;
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j18 = jArr[i10];
                                if (j18 > j17) {
                                    j17 = j18;
                                }
                            }
                            lVar.f24503i = j17;
                        } else {
                            long i11 = n9.h0.i(g10 - (Math.max(0.0f, lVar.f24506l - 1.0f) / 1.0E-7f), lVar.f24503i, j16);
                            lVar.f24503i = i11;
                            long j19 = lVar.f24502h;
                            if (j19 != C.TIME_UNSET && i11 > j19) {
                                lVar.f24503i = j19;
                            }
                        }
                        long j20 = g10 - lVar.f24503i;
                        if (Math.abs(j20) < lVar.a) {
                            lVar.f24506l = 1.0f;
                        } else {
                            lVar.f24506l = n9.h0.g((1.0E-7f * ((float) j20)) + 1.0f, lVar.f24505k, lVar.f24504j);
                        }
                        f10 = lVar.f24506l;
                    }
                }
                if (this.f24626p.getPlaybackParameters().f24302b != f10) {
                    b2 b2Var = new b2(f10, this.f24633x.f24277n.f24303c);
                    this.f24620j.a.removeMessages(16);
                    this.f24626p.a(b2Var);
                    n(this.f24633x.f24277n, this.f24626p.getPlaybackParameters().f24302b, false, false);
                }
            }
        }
    }

    public final void d(g gVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = gVar.f24364i;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        o oVar = this.f24626p;
        if (gVar == oVar.f24609d) {
            oVar.f24610f = null;
            oVar.f24609d = null;
            oVar.f24611g = true;
        }
        if (i10 == 2) {
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            v8.u0.m(z12);
            gVar.f24364i = 1;
            gVar.p();
        }
        if (gVar.f24364i == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        v8.u0.m(z11);
        gVar.f24360d.i();
        gVar.f24364i = 0;
        gVar.f24365j = null;
        gVar.f24366k = null;
        gVar.f24369n = false;
        gVar.j();
        this.J--;
    }

    public final void d0(x2 x2Var, v8.z zVar, x2 x2Var2, v8.z zVar2, long j3, boolean z10) {
        Object obj;
        b2 b2Var;
        if (!W(x2Var, zVar)) {
            if (zVar.a()) {
                b2Var = b2.f24301f;
            } else {
                b2Var = this.f24633x.f24277n;
            }
            o oVar = this.f24626p;
            if (!oVar.getPlaybackParameters().equals(b2Var)) {
                this.f24620j.a.removeMessages(16);
                oVar.a(b2Var);
                n(this.f24633x.f24277n, b2Var.f24302b, false, false);
                return;
            }
            return;
        }
        Object obj2 = zVar.a;
        v2 v2Var = this.f24624n;
        int i10 = x2Var.g(obj2, v2Var).f24787d;
        w2 w2Var = this.f24623m;
        x2Var.m(i10, w2Var);
        d1 d1Var = w2Var.f24849m;
        l lVar = this.f24631v;
        lVar.getClass();
        lVar.f24498d = n9.h0.H(d1Var.f24319b);
        lVar.f24501g = n9.h0.H(d1Var.f24320c);
        lVar.f24502h = n9.h0.H(d1Var.f24321d);
        float f10 = d1Var.f24322f;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        lVar.f24505k = f10;
        float f11 = d1Var.f24323g;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        lVar.f24504j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            lVar.f24498d = C.TIME_UNSET;
        }
        lVar.a();
        if (j3 != C.TIME_UNSET) {
            lVar.f24499e = g(x2Var, obj2, j3);
            lVar.a();
            return;
        }
        Object obj3 = w2Var.f24839b;
        if (!x2Var2.p()) {
            obj = x2Var2.m(x2Var2.g(zVar2.a, v2Var).f24787d, w2Var).f24839b;
        } else {
            obj = null;
        }
        if (!n9.h0.a(obj, obj3) || z10) {
            lVar.f24499e = C.TIME_UNSET;
            lVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r0.f24645k < 100) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0552, code lost:
    
        if (r8 == false) goto L368;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030b A[EDGE_INSN: B:155:0x030b->B:156:0x030b BREAK  A[LOOP:2: B:123:0x02ab->B:134:0x0308], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039c A[EDGE_INSN: B:189:0x039c->B:190:0x039c BREAK  A[LOOP:4: B:160:0x0316->B:186:0x0378], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.o0.e():void");
    }

    public final void f(boolean[] zArr) {
        g[] gVarArr;
        Set set;
        o1 o1Var;
        m1 m1Var;
        int i10;
        g[] gVarArr2;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        n9.p pVar;
        o1 o1Var2 = this.f24630t;
        m1 m1Var2 = o1Var2.f24643i;
        k9.x xVar = m1Var2.f24593n;
        int i12 = 0;
        while (true) {
            gVarArr = this.f24613b;
            int length = gVarArr.length;
            set = this.f24614c;
            if (i12 >= length) {
                break;
            }
            if (!xVar.b(i12) && set.remove(gVarArr[i12])) {
                gVarArr[i12].u();
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < gVarArr.length) {
            if (xVar.b(i13)) {
                boolean z15 = zArr[i13];
                g gVar = gVarArr[i13];
                if (!q(gVar)) {
                    m1 m1Var3 = o1Var2.f24643i;
                    if (m1Var3 == o1Var2.f24642h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k9.x xVar2 = m1Var3.f24593n;
                    o2 o2Var = xVar2.f20525b[i13];
                    k9.q qVar = xVar2.f20526c[i13];
                    if (qVar != null) {
                        i11 = qVar.length();
                    } else {
                        i11 = 0;
                    }
                    r0[] r0VarArr = new r0[i11];
                    for (int i14 = 0; i14 < i11; i14++) {
                        r0VarArr[i14] = qVar.getFormat(i14);
                    }
                    if (V() && this.f24633x.f24268e == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z15 && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.J++;
                    set.add(gVar);
                    v8.z0 z0Var = m1Var3.f24582c[i13];
                    o1Var = o1Var2;
                    m1Var = m1Var2;
                    long j3 = this.L;
                    long e2 = m1Var3.e();
                    i10 = i13;
                    gVarArr2 = gVarArr;
                    long j10 = m1Var3.f24594o;
                    if (gVar.f24364i == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    v8.u0.m(z13);
                    gVar.f24361f = o2Var;
                    gVar.f24364i = 1;
                    gVar.k(z12, z10);
                    gVar.t(r0VarArr, z0Var, e2, j10);
                    gVar.f24369n = false;
                    gVar.f24368m = j3;
                    gVar.l(j3, z12);
                    gVar.handleMessage(11, new j0(this));
                    o oVar = this.f24626p;
                    oVar.getClass();
                    n9.p e10 = gVar.e();
                    if (e10 != null && e10 != (pVar = oVar.f24610f)) {
                        if (pVar == null) {
                            oVar.f24610f = e10;
                            oVar.f24609d = gVar;
                            e10.a(oVar.f24607b.f22523g);
                        } else {
                            throw new r(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z11) {
                        if (gVar.f24364i == 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v8.u0.m(z14);
                        gVar.f24364i = 2;
                        gVar.o();
                    }
                    i13 = i10 + 1;
                    o1Var2 = o1Var;
                    m1Var2 = m1Var;
                    gVarArr = gVarArr2;
                }
            }
            o1Var = o1Var2;
            m1Var = m1Var2;
            i10 = i13;
            gVarArr2 = gVarArr;
            i13 = i10 + 1;
            o1Var2 = o1Var;
            m1Var2 = m1Var;
            gVarArr = gVarArr2;
        }
        m1Var2.f24586g = true;
    }

    public final long g(x2 x2Var, Object obj, long j3) {
        v2 v2Var = this.f24624n;
        int i10 = x2Var.g(obj, v2Var).f24787d;
        w2 w2Var = this.f24623m;
        x2Var.m(i10, w2Var);
        if (w2Var.f24844h == C.TIME_UNSET || !w2Var.a() || !w2Var.f24847k) {
            return C.TIME_UNSET;
        }
        return n9.h0.H(n9.h0.r(w2Var.f24845i) - w2Var.f24844h) - (j3 + v2Var.f24789g);
    }

    public final Pair h(x2 x2Var) {
        long j3 = 0;
        if (x2Var.p()) {
            return Pair.create(a2.f24264t, 0L);
        }
        Pair i10 = x2Var.i(this.f24623m, this.f24624n, x2Var.a(this.F), C.TIME_UNSET);
        v8.z n10 = this.f24630t.n(x2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (n10.a()) {
            Object obj = n10.a;
            v2 v2Var = this.f24624n;
            x2Var.g(obj, v2Var);
            if (n10.f26319c == v2Var.f(n10.f26318b)) {
                j3 = v2Var.f24791i.f26927d;
            }
            longValue = j3;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10;
        m1 m1Var;
        m1 m1Var2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    P(message.arg2, 1, z10, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    H((n0) message.obj);
                    break;
                case 4:
                    Q((b2) message.obj);
                    break;
                case 5:
                    this.f24632w = (p2) message.obj;
                    break;
                case 6:
                    Y(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((v8.w) message.obj);
                    break;
                case 9:
                    i((v8.w) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    R(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    S(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    L(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    j2 j2Var = (j2) message.obj;
                    j2Var.getClass();
                    Looper looper = j2Var.f24462f;
                    Looper looper2 = this.f24622l;
                    n9.e0 e0Var = this.f24620j;
                    if (looper == looper2) {
                        synchronized (j2Var) {
                        }
                        try {
                            j2Var.a.handleMessage(j2Var.f24460d, j2Var.f24461e);
                            j2Var.b(true);
                            int i12 = this.f24633x.f24268e;
                            if (i12 == 3 || i12 == 2) {
                                e0Var.d(2);
                                break;
                            }
                        } catch (Throwable th2) {
                            j2Var.b(true);
                            throw th2;
                        }
                    } else {
                        e0Var.a(15, j2Var).a();
                        break;
                    }
                case 15:
                    J((j2) message.obj);
                    break;
                case 16:
                    b2 b2Var = (b2) message.obj;
                    n(b2Var, b2Var.f24302b, true, false);
                    break;
                case 17:
                    M((k0) message.obj);
                    break;
                case 18:
                    c((k0) message.obj, message.arg1);
                    break;
                case 19:
                    a4.j.t(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (v8.c1) message.obj);
                    break;
                case 21:
                    T((v8.c1) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    O(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    N(z14);
                    break;
                case 25:
                    z();
                    G(true);
                    break;
                case 26:
                    z();
                    G(true);
                    break;
                default:
                    return false;
            }
        } catch (x7.m e2) {
            j(e2, e2.f27491b);
        } catch (IOException e10) {
            j(e10, 2000);
        } catch (RuntimeException e11) {
            if ((e11 instanceof IllegalStateException) || (e11 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            r rVar = new r(2, e11, i11);
            n9.o.d("ExoPlayerImplInternal", "Playback error", rVar);
            Y(true, false);
            this.f24633x = this.f24633x.d(rVar);
        } catch (m9.m e12) {
            j(e12, e12.f21685b);
        } catch (r e13) {
            r rVar2 = e13;
            int i13 = rVar2.f24687d;
            o1 o1Var = this.f24630t;
            if (i13 == 1 && (m1Var2 = o1Var.f24643i) != null) {
                rVar2 = rVar2.a(m1Var2.f24585f.a);
            }
            if (rVar2.f24693k && this.O == null) {
                n9.o.g("ExoPlayerImplInternal", "Recoverable renderer error", rVar2);
                this.O = rVar2;
                n9.e0 e0Var2 = this.f24620j;
                n9.d0 a = e0Var2.a(25, rVar2);
                e0Var2.getClass();
                Message message2 = a.a;
                message2.getClass();
                e0Var2.a.sendMessageAtFrontOfQueue(message2);
                a.a = null;
                ArrayList arrayList = n9.e0.f22535b;
                synchronized (arrayList) {
                    if (arrayList.size() < 50) {
                        arrayList.add(a);
                    }
                }
            } else {
                r rVar3 = this.O;
                if (rVar3 != null) {
                    rVar3.addSuppressed(rVar2);
                    rVar2 = this.O;
                }
                r rVar4 = rVar2;
                n9.o.d("ExoPlayerImplInternal", "Playback error", rVar4);
                if (rVar4.f24687d == 1 && o1Var.f24642h != o1Var.f24643i) {
                    while (true) {
                        m1Var = o1Var.f24642h;
                        if (m1Var == o1Var.f24643i) {
                            break;
                        }
                        o1Var.a();
                    }
                    m1Var.getClass();
                    n1 n1Var = m1Var.f24585f;
                    v8.z zVar = n1Var.a;
                    long j3 = n1Var.f24599b;
                    this.f24633x = o(zVar, j3, n1Var.f24600c, j3, true, 0);
                }
                Y(true, false);
                this.f24633x = this.f24633x.d(rVar4);
            }
        } catch (x1 e14) {
            boolean z15 = e14.f24862b;
            int i14 = e14.f24863c;
            if (i14 == 1) {
                if (z15) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else {
                if (i14 == 4) {
                    if (z15) {
                        i10 = 3002;
                    } else {
                        i10 = 3004;
                    }
                }
                j(e14, i11);
            }
            i11 = i10;
            j(e14, i11);
        } catch (v8.b e15) {
            j(e15, 1002);
        }
        t();
        return true;
    }

    public final void i(v8.w wVar) {
        boolean z10;
        m1 m1Var = this.f24630t.f24644j;
        boolean z11 = true;
        if (m1Var != null && m1Var.a == wVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        long j3 = this.L;
        if (m1Var != null) {
            if (m1Var.f24591l != null) {
                z11 = false;
            }
            v8.u0.m(z11);
            if (m1Var.f24583d) {
                m1Var.a.reevaluateBuffer(j3 - m1Var.f24594o);
            }
        }
        s();
    }

    public final void j(IOException iOException, int i10) {
        r rVar = new r(0, iOException, i10);
        m1 m1Var = this.f24630t.f24642h;
        if (m1Var != null) {
            rVar = rVar.a(m1Var.f24585f.a);
        }
        n9.o.d("ExoPlayerImplInternal", "Playback error", rVar);
        Y(false, false);
        this.f24633x = this.f24633x.d(rVar);
    }

    public final void k(boolean z10) {
        v8.z zVar;
        long d10;
        m1 m1Var = this.f24630t.f24644j;
        if (m1Var == null) {
            zVar = this.f24633x.f24265b;
        } else {
            zVar = m1Var.f24585f.a;
        }
        boolean z11 = !this.f24633x.f24274k.equals(zVar);
        if (z11) {
            this.f24633x = this.f24633x.a(zVar);
        }
        a2 a2Var = this.f24633x;
        if (m1Var == null) {
            d10 = a2Var.f24281r;
        } else {
            d10 = m1Var.d();
        }
        a2Var.f24279p = d10;
        a2 a2Var2 = this.f24633x;
        long j3 = a2Var2.f24279p;
        m1 m1Var2 = this.f24630t.f24644j;
        long j10 = 0;
        if (m1Var2 != null) {
            j10 = Math.max(0L, j3 - (this.L - m1Var2.f24594o));
        }
        a2Var2.f24280q = j10;
        if ((z11 || z10) && m1Var != null && m1Var.f24583d) {
            v8.z zVar2 = m1Var.f24585f.a;
            b0(m1Var.f24593n);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v57 ??, still in use, count: 1, list:
          (r0v57 ?? I:??[OBJECT, ARRAY]) from 0x0033: MOVE (r7v20 ?? I:??[OBJECT, ARRAY]) = (r0v57 ?? I:??[OBJECT, ARRAY]) (LINE:52)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void l(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v57 ??, still in use, count: 1, list:
          (r0v57 ?? I:??[OBJECT, ARRAY]) from 0x0033: MOVE (r7v20 ?? I:??[OBJECT, ARRAY]) = (r0v57 ?? I:??[OBJECT, ARRAY]) (LINE:52)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void m(v8.w wVar) {
        boolean z10;
        o1 o1Var = this.f24630t;
        m1 m1Var = o1Var.f24644j;
        if (m1Var != null && m1Var.a == wVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        float f10 = this.f24626p.getPlaybackParameters().f24302b;
        x2 x2Var = this.f24633x.a;
        m1Var.f24583d = true;
        m1Var.f24592m = m1Var.a.getTrackGroups();
        k9.x g10 = m1Var.g(f10);
        n1 n1Var = m1Var.f24585f;
        long j3 = n1Var.f24599b;
        long j10 = n1Var.f24602e;
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        long a = m1Var.a(g10, j3, false, new boolean[m1Var.f24588i.length]);
        long j11 = m1Var.f24594o;
        n1 n1Var2 = m1Var.f24585f;
        m1Var.f24594o = (n1Var2.f24599b - a) + j11;
        m1Var.f24585f = n1Var2.b(a);
        b0(m1Var.f24593n);
        if (m1Var == o1Var.f24642h) {
            C(m1Var.f24585f.f24599b);
            f(new boolean[this.f24613b.length]);
            a2 a2Var = this.f24633x;
            v8.z zVar = a2Var.f24265b;
            long j12 = m1Var.f24585f.f24599b;
            this.f24633x = o(zVar, j12, a2Var.f24266c, j12, false, 5);
        }
        s();
    }

    public final void n(b2 b2Var, float f10, boolean z10, boolean z11) {
        int i10;
        o0 o0Var = this;
        if (z10) {
            if (z11) {
                o0Var.f24634y.a(1);
            }
            a2 a2Var = o0Var.f24633x;
            o0Var = this;
            o0Var.f24633x = new a2(a2Var.a, a2Var.f24265b, a2Var.f24266c, a2Var.f24267d, a2Var.f24268e, a2Var.f24269f, a2Var.f24270g, a2Var.f24271h, a2Var.f24272i, a2Var.f24273j, a2Var.f24274k, a2Var.f24275l, a2Var.f24276m, b2Var, a2Var.f24279p, a2Var.f24280q, a2Var.f24281r, a2Var.f24282s, a2Var.f24278o);
        }
        float f11 = b2Var.f24302b;
        m1 m1Var = o0Var.f24630t.f24642h;
        while (true) {
            i10 = 0;
            if (m1Var == null) {
                break;
            }
            k9.q[] qVarArr = m1Var.f24593n.f20526c;
            int length = qVarArr.length;
            while (i10 < length) {
                k9.q qVar = qVarArr[i10];
                if (qVar != null) {
                    qVar.onPlaybackSpeed(f11);
                }
                i10++;
            }
            m1Var = m1Var.f24591l;
        }
        g[] gVarArr = o0Var.f24613b;
        int length2 = gVarArr.length;
        while (i10 < length2) {
            g gVar = gVarArr[i10];
            if (gVar != null) {
                gVar.v(f10, b2Var.f24302b);
            }
            i10++;
        }
    }

    public final a2 o(v8.z zVar, long j3, long j10, long j11, boolean z10, int i10) {
        boolean z11;
        v8.j1 j1Var;
        k9.x xVar;
        List list;
        long max;
        boolean z12;
        v8.j1 j1Var2;
        k9.x xVar2;
        com.google.common.collect.z1 z1Var;
        if (!this.N && j3 == this.f24633x.f24281r && zVar.equals(this.f24633x.f24265b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.N = z11;
        B();
        a2 a2Var = this.f24633x;
        v8.j1 j1Var3 = a2Var.f24271h;
        k9.x xVar3 = a2Var.f24272i;
        List list2 = a2Var.f24273j;
        if (this.u.f24831k) {
            m1 m1Var = this.f24630t.f24642h;
            if (m1Var == null) {
                j1Var2 = v8.j1.f26179f;
            } else {
                j1Var2 = m1Var.f24592m;
            }
            if (m1Var == null) {
                xVar2 = this.f24617g;
            } else {
                xVar2 = m1Var.f24593n;
            }
            k9.q[] qVarArr = xVar2.f20526c;
            com.google.common.collect.m0 m0Var = new com.google.common.collect.m0();
            boolean z13 = false;
            for (k9.q qVar : qVarArr) {
                if (qVar != null) {
                    l8.b bVar = qVar.getFormat(0).f24721l;
                    if (bVar == null) {
                        m0Var.u(new l8.b(new l8.a[0]));
                    } else {
                        m0Var.u(bVar);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                z1Var = m0Var.y();
            } else {
                com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
                z1Var = com.google.common.collect.z1.f12062g;
            }
            if (m1Var != null) {
                n1 n1Var = m1Var.f24585f;
                if (n1Var.f24600c != j10) {
                    m1Var.f24585f = n1Var.a(j10);
                }
            }
            list = z1Var;
            j1Var = j1Var2;
            xVar = xVar2;
        } else if (!zVar.equals(a2Var.f24265b)) {
            j1Var = v8.j1.f26179f;
            xVar = this.f24617g;
            list = com.google.common.collect.z1.f12062g;
        } else {
            j1Var = j1Var3;
            xVar = xVar3;
            list = list2;
        }
        if (z10) {
            l0 l0Var = this.f24634y;
            if (l0Var.f24512d && l0Var.f24513e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                v8.u0.d(z12);
            } else {
                l0Var.a = true;
                l0Var.f24512d = true;
                l0Var.f24513e = i10;
            }
        }
        a2 a2Var2 = this.f24633x;
        long j12 = a2Var2.f24279p;
        m1 m1Var2 = this.f24630t.f24644j;
        if (m1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j12 - (this.L - m1Var2.f24594o));
        }
        return a2Var2.b(zVar, j3, j10, j11, max, j1Var, xVar, list);
    }

    public final boolean p() {
        long nextLoadPositionUs;
        m1 m1Var = this.f24630t.f24644j;
        if (m1Var == null) {
            return false;
        }
        if (!m1Var.f24583d) {
            nextLoadPositionUs = 0;
        } else {
            nextLoadPositionUs = m1Var.a.getNextLoadPositionUs();
        }
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        m1 m1Var = this.f24630t.f24642h;
        long j3 = m1Var.f24585f.f24602e;
        if (m1Var.f24583d && (j3 == C.TIME_UNSET || this.f24633x.f24281r < j3 || !V())) {
            return true;
        }
        return false;
    }

    public final void s() {
        long nextLoadPositionUs;
        long max;
        boolean c10;
        boolean z10 = false;
        if (!p()) {
            c10 = false;
        } else {
            m1 m1Var = this.f24630t.f24644j;
            if (!m1Var.f24583d) {
                nextLoadPositionUs = 0;
            } else {
                nextLoadPositionUs = m1Var.a.getNextLoadPositionUs();
            }
            m1 m1Var2 = this.f24630t.f24644j;
            if (m1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, nextLoadPositionUs - (this.L - m1Var2.f24594o));
            }
            if (m1Var != this.f24630t.f24642h) {
                long j3 = m1Var.f24585f.f24599b;
            }
            c10 = ((m) this.f24618h).c(max, this.f24626p.getPlaybackParameters().f24302b);
            if (!c10 && max < 500000 && this.f24625o > 0) {
                this.f24630t.f24642h.a.o(this.f24633x.f24281r);
                c10 = ((m) this.f24618h).c(max, this.f24626p.getPlaybackParameters().f24302b);
            }
        }
        this.D = c10;
        if (c10) {
            m1 m1Var3 = this.f24630t.f24644j;
            long j10 = this.L;
            if (m1Var3.f24591l == null) {
                z10 = true;
            }
            v8.u0.m(z10);
            m1Var3.a.continueLoading(j10 - m1Var3.f24594o);
        }
        a0();
    }

    public final void t() {
        boolean z10;
        l0 l0Var = this.f24634y;
        a2 a2Var = this.f24633x;
        boolean z11 = l0Var.a;
        if (l0Var.f24510b != a2Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        l0Var.a = z12;
        l0Var.f24510b = a2Var;
        if (z12) {
            i0 i0Var = this.f24629s.f24865b;
            i0Var.f24408i.c(new com.facebook.r0(13, i0Var, l0Var));
            this.f24634y = new l0(this.f24633x);
        }
    }

    public final void u() {
        l(this.u.b(), true);
    }

    public final void v() {
        this.f24634y.a(1);
        throw null;
    }

    public final void w() {
        int i10;
        this.f24634y.a(1);
        int i11 = 0;
        A(false, false, false, true);
        ((m) this.f24618h).b(false);
        if (this.f24633x.a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        U(i10);
        m9.t tVar = (m9.t) this.f24619i;
        tVar.getClass();
        w1 w1Var = this.u;
        v8.u0.m(!w1Var.f24831k);
        w1Var.f24832l = tVar;
        while (true) {
            ArrayList arrayList = w1Var.f24822b;
            if (i11 < arrayList.size()) {
                v1 v1Var = (v1) arrayList.get(i11);
                w1Var.e(v1Var);
                w1Var.f24827g.add(v1Var);
                i11++;
            } else {
                w1Var.f24831k = true;
                this.f24620j.d(2);
                return;
            }
        }
    }

    public final void x() {
        boolean z10;
        A(true, false, true, false);
        for (int i10 = 0; i10 < this.f24613b.length; i10++) {
            g gVar = this.f24615d[i10];
            synchronized (gVar.f24358b) {
                gVar.f24371p = null;
            }
            g gVar2 = this.f24613b[i10];
            if (gVar2.f24364i == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v8.u0.m(z10);
            gVar2.m();
        }
        ((m) this.f24618h).b(true);
        U(1);
        HandlerThread handlerThread = this.f24621k;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f24635z = true;
            notifyAll();
        }
    }

    public final void y(int i10, int i11, v8.c1 c1Var) {
        boolean z10 = true;
        this.f24634y.a(1);
        w1 w1Var = this.u;
        w1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > w1Var.f24822b.size()) {
            z10 = false;
        }
        v8.u0.d(z10);
        w1Var.f24830j = c1Var;
        w1Var.g(i10, i11);
        l(w1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.o0.z():void");
    }
}
