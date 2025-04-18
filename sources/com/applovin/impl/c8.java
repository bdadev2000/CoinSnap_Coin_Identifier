package com.applovin.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.ab;
import com.applovin.impl.ae;
import com.applovin.impl.f6;
import com.applovin.impl.go;
import com.applovin.impl.li;
import com.applovin.impl.od;
import com.applovin.impl.oh;
import com.applovin.impl.rd;
import com.applovin.impl.wd;
import com.applovin.impl.we;
import com.applovin.impl.wo;
import com.applovin.impl.x6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c8 implements Handler.Callback, rd.a, wo.a, ae.d, f6.a, oh.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private h L;
    private long M;
    private int N;
    private boolean O;
    private y7 P;
    private long Q;
    private final li[] a;

    /* renamed from: b */
    private final Set f4021b;

    /* renamed from: c */
    private final mi[] f4022c;

    /* renamed from: d */
    private final wo f4023d;

    /* renamed from: f */
    private final xo f4024f;

    /* renamed from: g */
    private final gc f4025g;

    /* renamed from: h */
    private final x1 f4026h;

    /* renamed from: i */
    private final ha f4027i;

    /* renamed from: j */
    private final HandlerThread f4028j;

    /* renamed from: k */
    private final Looper f4029k;

    /* renamed from: l */
    private final go.d f4030l;

    /* renamed from: m */
    private final go.b f4031m;

    /* renamed from: n */
    private final long f4032n;

    /* renamed from: o */
    private final boolean f4033o;

    /* renamed from: p */
    private final f6 f4034p;

    /* renamed from: q */
    private final ArrayList f4035q;

    /* renamed from: r */
    private final j3 f4036r;

    /* renamed from: s */
    private final f f4037s;

    /* renamed from: t */
    private final vd f4038t;
    private final ae u;

    /* renamed from: v */
    private final fc f4039v;

    /* renamed from: w */
    private final long f4040w;

    /* renamed from: x */
    private fj f4041x;

    /* renamed from: y */
    private lh f4042y;

    /* renamed from: z */
    private e f4043z;

    /* loaded from: classes.dex */
    public class a implements li.a {
        public a() {
        }

        @Override // com.applovin.impl.li.a
        public void a(long j3) {
            if (j3 >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                c8.this.I = true;
            }
        }

        @Override // com.applovin.impl.li.a
        public void a() {
            c8.this.f4027i.c(2);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static final class e {
        private boolean a;

        /* renamed from: b */
        public lh f4050b;

        /* renamed from: c */
        public int f4051c;

        /* renamed from: d */
        public boolean f4052d;

        /* renamed from: e */
        public int f4053e;

        /* renamed from: f */
        public boolean f4054f;

        /* renamed from: g */
        public int f4055g;

        public e(lh lhVar) {
            this.f4050b = lhVar;
        }

        public void b(int i10) {
            this.a = true;
            this.f4054f = true;
            this.f4055g = i10;
        }

        public void c(int i10) {
            boolean z10 = true;
            if (this.f4052d && this.f4053e != 5) {
                if (i10 != 5) {
                    z10 = false;
                }
                a1.a(z10);
            } else {
                this.a = true;
                this.f4052d = true;
                this.f4053e = i10;
            }
        }

        public void a(int i10) {
            this.a |= i10 > 0;
            this.f4051c += i10;
        }

        public void a(lh lhVar) {
            this.a |= this.f4050b != lhVar;
            this.f4050b = lhVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* loaded from: classes.dex */
    public static final class g {
        public final wd.a a;

        /* renamed from: b */
        public final long f4056b;

        /* renamed from: c */
        public final long f4057c;

        /* renamed from: d */
        public final boolean f4058d;

        /* renamed from: e */
        public final boolean f4059e;

        /* renamed from: f */
        public final boolean f4060f;

        public g(wd.a aVar, long j3, long j10, boolean z10, boolean z11, boolean z12) {
            this.a = aVar;
            this.f4056b = j3;
            this.f4057c = j10;
            this.f4058d = z10;
            this.f4059e = z11;
            this.f4060f = z12;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {
        public final go a;

        /* renamed from: b */
        public final int f4061b;

        /* renamed from: c */
        public final long f4062c;

        public h(go goVar, int i10, long j3) {
            this.a = goVar;
            this.f4061b = i10;
            this.f4062c = j3;
        }
    }

    public c8(li[] liVarArr, wo woVar, xo xoVar, gc gcVar, x1 x1Var, int i10, boolean z10, r0 r0Var, fj fjVar, fc fcVar, long j3, boolean z11, Looper looper, j3 j3Var, f fVar) {
        this.f4037s = fVar;
        this.a = liVarArr;
        this.f4023d = woVar;
        this.f4024f = xoVar;
        this.f4025g = gcVar;
        this.f4026h = x1Var;
        this.F = i10;
        this.G = z10;
        this.f4041x = fjVar;
        this.f4039v = fcVar;
        this.f4040w = j3;
        this.Q = j3;
        this.B = z11;
        this.f4036r = j3Var;
        this.f4032n = gcVar.d();
        this.f4033o = gcVar.a();
        lh a10 = lh.a(xoVar);
        this.f4042y = a10;
        this.f4043z = new e(a10);
        this.f4022c = new mi[liVarArr.length];
        for (int i11 = 0; i11 < liVarArr.length; i11++) {
            liVarArr[i11].b(i11);
            this.f4022c[i11] = liVarArr[i11].n();
        }
        this.f4034p = new f6(this, j3Var);
        this.f4035q = new ArrayList();
        this.f4021b = nj.b();
        this.f4030l = new go.d();
        this.f4031m = new go.b();
        woVar.a(this, x1Var);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f4038t = new vd(r0Var, handler);
        this.u = new ae(this, r0Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f4028j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f4029k = looper2;
        this.f4027i = j3Var.a(looper2, this);
    }

    private void A() {
        boolean z10;
        float f10 = this.f4034p.a().a;
        sd f11 = this.f4038t.f();
        boolean z11 = true;
        for (sd e2 = this.f4038t.e(); e2 != null && e2.f7492d; e2 = e2.d()) {
            xo b3 = e2.b(f10, this.f4042y.a);
            if (!b3.a(e2.i())) {
                if (z11) {
                    sd e10 = this.f4038t.e();
                    boolean a10 = this.f4038t.a(e10);
                    boolean[] zArr = new boolean[this.a.length];
                    long a11 = e10.a(b3, this.f4042y.f5881s, a10, zArr);
                    lh lhVar = this.f4042y;
                    if (lhVar.f5867e != 4 && a11 != lhVar.f5881s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lh lhVar2 = this.f4042y;
                    this.f4042y = a(lhVar2.f5864b, a11, lhVar2.f5865c, lhVar2.f5866d, z10, 5);
                    if (z10) {
                        c(a11);
                    }
                    boolean[] zArr2 = new boolean[this.a.length];
                    int i10 = 0;
                    while (true) {
                        li[] liVarArr = this.a;
                        if (i10 >= liVarArr.length) {
                            break;
                        }
                        li liVar = liVarArr[i10];
                        boolean c10 = c(liVar);
                        zArr2[i10] = c10;
                        yi yiVar = e10.f7491c[i10];
                        if (c10) {
                            if (yiVar != liVar.o()) {
                                a(liVar);
                            } else if (zArr[i10]) {
                                liVar.a(this.M);
                            }
                        }
                        i10++;
                    }
                    a(zArr2);
                } else {
                    this.f4038t.a(e2);
                    if (e2.f7492d) {
                        e2.a(b3, Math.max(e2.f7494f.f8367b, e2.d(this.M)), false);
                    }
                }
                a(true);
                if (this.f4042y.f5867e != 4) {
                    m();
                    K();
                    this.f4027i.c(2);
                    return;
                }
                return;
            }
            if (e2 == f11) {
                z11 = false;
            }
        }
    }

    private void B() {
        boolean z10;
        sd e2 = this.f4038t.e();
        if (e2 != null && e2.f7494f.f8373h && this.B) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z10;
    }

    private boolean C() {
        sd e2;
        sd d10;
        if (!E() || this.C || (e2 = this.f4038t.e()) == null || (d10 = e2.d()) == null || this.M < d10.g() || !d10.f7495g) {
            return false;
        }
        return true;
    }

    private boolean D() {
        long d10;
        if (!j()) {
            return false;
        }
        sd d11 = this.f4038t.d();
        long b3 = b(d11.e());
        if (d11 == this.f4038t.e()) {
            d10 = d11.d(this.M);
        } else {
            d10 = d11.d(this.M) - d11.f7494f.f8367b;
        }
        return this.f4025g.a(d10, b3, this.f4034p.a().a);
    }

    private boolean E() {
        lh lhVar = this.f4042y;
        return lhVar.f5874l && lhVar.f5875m == 0;
    }

    private void F() {
        this.D = false;
        this.f4034p.b();
        for (li liVar : this.a) {
            if (c(liVar)) {
                liVar.start();
            }
        }
    }

    private void H() {
        this.f4034p.c();
        for (li liVar : this.a) {
            if (c(liVar)) {
                b(liVar);
            }
        }
    }

    private void I() {
        boolean z10;
        sd d10 = this.f4038t.d();
        if (!this.E && (d10 == null || !d10.a.a())) {
            z10 = false;
        } else {
            z10 = true;
        }
        lh lhVar = this.f4042y;
        if (z10 != lhVar.f5869g) {
            this.f4042y = lhVar.a(z10);
        }
    }

    private void J() {
        if (!this.f4042y.a.c() && this.u.d()) {
            o();
            q();
            r();
            p();
        }
    }

    private void K() {
        long j3;
        boolean z10;
        sd e2 = this.f4038t.e();
        if (e2 == null) {
            return;
        }
        if (e2.f7492d) {
            j3 = e2.a.h();
        } else {
            j3 = -9223372036854775807L;
        }
        if (j3 != C.TIME_UNSET) {
            c(j3);
            if (j3 != this.f4042y.f5881s) {
                lh lhVar = this.f4042y;
                this.f4042y = a(lhVar.f5864b, j3, lhVar.f5865c, j3, true, 5);
            }
        } else {
            f6 f6Var = this.f4034p;
            if (e2 != this.f4038t.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            long b3 = f6Var.b(z10);
            this.M = b3;
            long d10 = e2.d(b3);
            b(this.f4042y.f5881s, d10);
            this.f4042y.f5881s = d10;
        }
        this.f4042y.f5879q = this.f4038t.d().c();
        this.f4042y.f5880r = h();
        lh lhVar2 = this.f4042y;
        if (lhVar2.f5874l && lhVar2.f5867e == 3 && a(lhVar2.a, lhVar2.f5864b) && this.f4042y.f5876n.a == 1.0f) {
            float a10 = this.f4039v.a(e(), h());
            if (this.f4034p.a().a != a10) {
                this.f4034p.a(this.f4042y.f5876n.a(a10));
                a(this.f4042y.f5876n, this.f4034p.a().a, false, false);
            }
        }
    }

    private void c() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        long a10 = this.f4036r.a();
        J();
        int i11 = this.f4042y.f5867e;
        if (i11 != 1 && i11 != 4) {
            sd e2 = this.f4038t.e();
            if (e2 == null) {
                c(a10, 10L);
                return;
            }
            lo.a("doSomeWork");
            K();
            if (e2.f7492d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                e2.a.a(this.f4042y.f5881s - this.f4032n, this.f4033o);
                z10 = true;
                z11 = true;
                int i12 = 0;
                while (true) {
                    li[] liVarArr = this.a;
                    if (i12 >= liVarArr.length) {
                        break;
                    }
                    li liVar = liVarArr[i12];
                    if (c(liVar)) {
                        liVar.a(this.M, elapsedRealtime);
                        z10 = z10 && liVar.c();
                        boolean z13 = e2.f7491c[i12] != liVar.o();
                        boolean z14 = z13 || (!z13 && liVar.j()) || liVar.d() || liVar.c();
                        z11 = z11 && z14;
                        if (!z14) {
                            liVar.h();
                        }
                    }
                    i12++;
                }
            } else {
                e2.a.f();
                z10 = true;
                z11 = true;
            }
            long j3 = e2.f7494f.f8370e;
            boolean z15 = z10 && e2.f7492d && (j3 == C.TIME_UNSET || j3 <= this.f4042y.f5881s);
            if (z15 && this.C) {
                this.C = false;
                a(false, this.f4042y.f5875m, false, 5);
            }
            if (z15 && e2.f7494f.f8374i) {
                c(4);
                H();
            } else if (this.f4042y.f5867e == 2 && h(z11)) {
                c(3);
                this.P = null;
                if (E()) {
                    F();
                }
            } else if (this.f4042y.f5867e == 3 && (this.K != 0 ? !z11 : !k())) {
                this.D = E();
                c(2);
                if (this.D) {
                    u();
                    this.f4039v.a();
                }
                H();
            }
            if (this.f4042y.f5867e == 2) {
                int i13 = 0;
                while (true) {
                    li[] liVarArr2 = this.a;
                    if (i13 >= liVarArr2.length) {
                        break;
                    }
                    if (c(liVarArr2[i13]) && this.a[i13].o() == e2.f7491c[i13]) {
                        this.a[i13].h();
                    }
                    i13++;
                }
                lh lhVar = this.f4042y;
                if (!lhVar.f5869g && lhVar.f5880r < 500000 && j()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z16 = this.J;
            lh lhVar2 = this.f4042y;
            if (z16 != lhVar2.f5877o) {
                this.f4042y = lhVar2.b(z16);
            }
            if ((E() && this.f4042y.f5867e == 3) || (i10 = this.f4042y.f5867e) == 2) {
                z12 = !a(a10, 10L);
            } else {
                if (this.K != 0 && i10 != 4) {
                    c(a10, 1000L);
                } else {
                    this.f4027i.b(2);
                }
                z12 = false;
            }
            lh lhVar3 = this.f4042y;
            if (lhVar3.f5878p != z12) {
                this.f4042y = lhVar3.c(z12);
            }
            this.I = false;
            lo.a();
            return;
        }
        this.f4027i.b(2);
    }

    private void d() {
        a(new boolean[this.a.length]);
    }

    private long e() {
        lh lhVar = this.f4042y;
        return a(lhVar.a, lhVar.f5864b.a, lhVar.f5881s);
    }

    private long f() {
        sd f10 = this.f4038t.f();
        if (f10 == null) {
            return 0L;
        }
        long f11 = f10.f();
        if (!f10.f7492d) {
            return f11;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.a;
            if (i10 >= liVarArr.length) {
                return f11;
            }
            if (c(liVarArr[i10]) && this.a[i10].o() == f10.f7491c[i10]) {
                long i11 = this.a[i10].i();
                if (i11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                f11 = Math.max(i11, f11);
            }
            i10++;
        }
    }

    private long h() {
        return b(this.f4042y.f5879q);
    }

    private boolean i() {
        sd f10 = this.f4038t.f();
        if (!f10.f7492d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.a;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                yi yiVar = f10.f7491c[i10];
                if (liVar.o() != yiVar || (yiVar != null && !liVar.j() && !a(liVar, f10))) {
                    break;
                }
                i10++;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean j() {
        sd d10 = this.f4038t.d();
        if (d10 == null || d10.e() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private boolean k() {
        sd e2 = this.f4038t.e();
        long j3 = e2.f7494f.f8370e;
        if (e2.f7492d && (j3 == C.TIME_UNSET || this.f4042y.f5881s < j3 || !E())) {
            return true;
        }
        return false;
    }

    public /* synthetic */ Boolean l() {
        return Boolean.valueOf(this.A);
    }

    private void m() {
        boolean D = D();
        this.E = D;
        if (D) {
            this.f4038t.d().a(this.M);
        }
        I();
    }

    private void n() {
        this.f4043z.a(this.f4042y);
        if (this.f4043z.a) {
            this.f4037s.a(this.f4043z);
            this.f4043z = new e(this.f4042y);
        }
    }

    private void o() {
        ud a10;
        this.f4038t.a(this.M);
        if (this.f4038t.h() && (a10 = this.f4038t.a(this.M, this.f4042y)) != null) {
            sd a11 = this.f4038t.a(this.f4022c, this.f4023d, this.f4025g.b(), this.u, a10, this.f4024f);
            a11.a.a(this, a10.f8367b);
            if (this.f4038t.e() == a11) {
                c(a11.g());
            }
            a(false);
        }
        if (this.E) {
            this.E = j();
            I();
        } else {
            m();
        }
    }

    private void p() {
        boolean z10 = false;
        while (C()) {
            if (z10) {
                n();
            }
            sd e2 = this.f4038t.e();
            sd a10 = this.f4038t.a();
            ud udVar = a10.f7494f;
            wd.a aVar = udVar.a;
            long j3 = udVar.f8367b;
            lh a11 = a(aVar, j3, udVar.f8368c, j3, true, 0);
            this.f4042y = a11;
            go goVar = a11.a;
            a(goVar, a10.f7494f.a, goVar, e2.f7494f.a, C.TIME_UNSET);
            B();
            K();
            z10 = true;
        }
    }

    private void q() {
        long j3;
        boolean z10;
        sd f10 = this.f4038t.f();
        if (f10 == null) {
            return;
        }
        int i10 = 0;
        if (f10.d() != null && !this.C) {
            if (!i()) {
                return;
            }
            if (!f10.d().f7492d && this.M < f10.d().g()) {
                return;
            }
            xo i11 = f10.i();
            sd b3 = this.f4038t.b();
            xo i12 = b3.i();
            if (b3.f7492d && b3.a.h() != C.TIME_UNSET) {
                d(b3.g());
                return;
            }
            for (int i13 = 0; i13 < this.a.length; i13++) {
                boolean a10 = i11.a(i13);
                boolean a11 = i12.a(i13);
                if (a10 && !this.a[i13].k()) {
                    if (this.f4022c[i13].e() == -2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ni niVar = i11.f9069b[i13];
                    ni niVar2 = i12.f9069b[i13];
                    if (!a11 || !niVar2.equals(niVar) || z10) {
                        a(this.a[i13], b3.g());
                    }
                }
            }
            return;
        }
        if (!f10.f7494f.f8374i && !this.C) {
            return;
        }
        while (true) {
            li[] liVarArr = this.a;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                yi yiVar = f10.f7491c[i10];
                if (yiVar != null && liVar.o() == yiVar && liVar.j()) {
                    long j10 = f10.f7494f.f8370e;
                    if (j10 != C.TIME_UNSET && j10 != Long.MIN_VALUE) {
                        j3 = f10.f() + f10.f7494f.f8370e;
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    a(liVar, j3);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void r() {
        sd f10 = this.f4038t.f();
        if (f10 != null && this.f4038t.e() != f10 && !f10.f7495g && z()) {
            d();
        }
    }

    private void s() {
        a(this.u.a(), true);
    }

    private void t() {
        for (sd e2 = this.f4038t.e(); e2 != null; e2 = e2.d()) {
            for (f8 f8Var : e2.i().f9070c) {
                if (f8Var != null) {
                    f8Var.j();
                }
            }
        }
    }

    private void u() {
        for (sd e2 = this.f4038t.e(); e2 != null; e2 = e2.d()) {
            for (f8 f8Var : e2.i().f9070c) {
                if (f8Var != null) {
                    f8Var.k();
                }
            }
        }
    }

    private void w() {
        int i10;
        this.f4043z.a(1);
        a(false, false, false, true);
        this.f4025g.f();
        if (this.f4042y.a.c()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        c(i10);
        this.u.a(this.f4026h.a());
        this.f4027i.c(2);
    }

    private void y() {
        a(true, false, true, false);
        this.f4025g.e();
        c(1);
        this.f4028j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private boolean z() {
        boolean z10;
        sd f10 = this.f4038t.f();
        xo i10 = f10.i();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            li[] liVarArr = this.a;
            if (i11 < liVarArr.length) {
                li liVar = liVarArr[i11];
                if (c(liVar)) {
                    if (liVar.o() != f10.f7491c[i11]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!i10.a(i11) || z10) {
                        if (!liVar.k()) {
                            liVar.a(a(i10.f9070c[i11]), f10.f7491c[i11], f10.g(), f10.f());
                        } else if (liVar.c()) {
                            a(liVar);
                        } else {
                            z11 = true;
                        }
                    }
                }
                i11++;
            } else {
                return !z11;
            }
        }
    }

    public void G() {
        this.f4027i.d(6).a();
    }

    public Looper g() {
        return this.f4029k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        sd f10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = 1000;
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
                    a(z10, message.arg2, true, 1);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    a((h) message.obj);
                    break;
                case 4:
                    b((mh) message.obj);
                    break;
                case 5:
                    a((fj) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    c((rd) message.obj);
                    break;
                case 9:
                    b((rd) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    b(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    d((oh) message.obj);
                    break;
                case 15:
                    f((oh) message.obj);
                    break;
                case 16:
                    a((mh) message.obj, false);
                    break;
                case 17:
                    a((b) message.obj);
                    break;
                case 18:
                    a((b) message.obj, message.arg1);
                    break;
                case 19:
                    b8.a(message.obj);
                    a((c) null);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (tj) message.obj);
                    break;
                case 21:
                    a((tj) message.obj);
                    break;
                case 22:
                    s();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    e(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    d(z14);
                    break;
                case 25:
                    b();
                    break;
                default:
                    return false;
            }
        } catch (ah e2) {
            int i11 = e2.f3756b;
            if (i11 == 1) {
                if (e2.a) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else if (i11 == 4) {
                if (e2.a) {
                    i10 = 3002;
                } else {
                    i10 = 3004;
                }
            }
            a(e2, i10);
        } catch (h5 e10) {
            a(e10, e10.a);
        } catch (x6.a e11) {
            a(e11, e11.a);
        } catch (y7 e12) {
            e = e12;
            if (e.f9142d == 1 && (f10 = this.f4038t.f()) != null) {
                e = e.a(f10.f7494f.a);
            }
            if (e.f9148k && this.P == null) {
                kc.c("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                ha haVar = this.f4027i;
                haVar.a(haVar.a(25, e));
            } else {
                y7 y7Var = this.P;
                if (y7Var != null) {
                    y7Var.addSuppressed(e);
                    e = this.P;
                }
                kc.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f4042y = this.f4042y.a(e);
            }
        } catch (IOException e13) {
            a(e13, 2000);
        } catch (RuntimeException e14) {
            if ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            y7 a10 = y7.a(e14, i10);
            kc.a("ExoPlayerImplInternal", "Playback error", a10);
            a(true, false);
            this.f4042y = this.f4042y.a(a10);
        }
        n();
        return true;
    }

    public void v() {
        this.f4027i.d(0).a();
    }

    public synchronized boolean x() {
        if (!this.A && this.f4028j.isAlive()) {
            this.f4027i.c(7);
            a(new Supplier() { // from class: com.applovin.impl.gt
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    Boolean l10;
                    l10 = c8.this.l();
                    return l10;
                }
            }, this.f4040w);
            return this.A;
        }
        return true;
    }

    private void b() {
        c(true);
    }

    private void e(oh ohVar) {
        if (ohVar.b() == this.f4029k) {
            b(ohVar);
            int i10 = this.f4042y.f5867e;
            if (i10 == 3 || i10 == 2) {
                this.f4027i.c(2);
                return;
            }
            return;
        }
        this.f4027i.a(15, ohVar).a();
    }

    private void g(boolean z10) {
        this.G = z10;
        if (!this.f4038t.a(this.f4042y.a, z10)) {
            c(true);
        }
        a(false);
    }

    private boolean h(boolean z10) {
        if (this.K == 0) {
            return k();
        }
        if (!z10) {
            return false;
        }
        lh lhVar = this.f4042y;
        if (!lhVar.f5869g) {
            return true;
        }
        long b3 = a(lhVar.a, this.f4038t.e().f7494f.a) ? this.f4039v.b() : C.TIME_UNSET;
        sd d10 = this.f4038t.d();
        return (d10.j() && d10.f7494f.f8374i) || (d10.f7494f.a.a() && !d10.f7492d) || this.f4025g.a(h(), this.f4034p.a().a, this.D, b3);
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: d */
    public void a(rd rdVar) {
        this.f4027i.a(9, rdVar).a();
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparable {
        public final oh a;

        /* renamed from: b */
        public int f4047b;

        /* renamed from: c */
        public long f4048c;

        /* renamed from: d */
        public Object f4049d;

        public d(oh ohVar) {
            this.a = ohVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f4049d;
            if ((obj == null) != (dVar.f4049d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f4047b - dVar.f4047b;
            return i10 != 0 ? i10 : yp.a(this.f4048c, dVar.f4048c);
        }

        public void a(int i10, long j3, Object obj) {
            this.f4047b = i10;
            this.f4048c = j3;
            this.f4049d = obj;
        }
    }

    private void b(oh ohVar) {
        if (ohVar.i()) {
            return;
        }
        try {
            ohVar.e().a(ohVar.g(), ohVar.c());
        } finally {
            ohVar.a(true);
        }
    }

    private void d(oh ohVar) {
        if (ohVar.d() == C.TIME_UNSET) {
            e(ohVar);
            return;
        }
        if (this.f4042y.a.c()) {
            this.f4035q.add(new d(ohVar));
            return;
        }
        d dVar = new d(ohVar);
        go goVar = this.f4042y.a;
        if (a(dVar, goVar, goVar, this.F, this.G, this.f4030l, this.f4031m)) {
            this.f4035q.add(dVar);
            Collections.sort(this.f4035q);
        } else {
            ohVar.a(false);
        }
    }

    private void a(tj tjVar) {
        this.f4043z.a(1);
        a(this.u.a(tjVar), false);
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final List a;

        /* renamed from: b */
        private final tj f4044b;

        /* renamed from: c */
        private final int f4045c;

        /* renamed from: d */
        private final long f4046d;

        private b(List list, tj tjVar, int i10, long j3) {
            this.a = list;
            this.f4044b = tjVar;
            this.f4045c = i10;
            this.f4046d = j3;
        }

        public /* synthetic */ b(List list, tj tjVar, int i10, long j3, a aVar) {
            this(list, tjVar, i10, j3);
        }
    }

    private void a(b bVar, int i10) {
        this.f4043z.a(1);
        ae aeVar = this.u;
        if (i10 == -1) {
            i10 = aeVar.c();
        }
        a(aeVar.a(i10, bVar.a, bVar.f4044b), false);
    }

    private void e(boolean z10) {
        this.B = z10;
        B();
        if (!this.C || this.f4038t.f() == this.f4038t.e()) {
            return;
        }
        c(true);
        a(false);
    }

    private void b(li liVar) {
        if (liVar.b() == 2) {
            liVar.stop();
        }
    }

    private void f(oh ohVar) {
        Looper b3 = ohVar.b();
        if (!b3.getThread().isAlive()) {
            kc.d("TAG", "Trying to send message on a dead thread.");
            ohVar.a(false);
        } else {
            this.f4036r.a(b3, null).a((Runnable) new rs(1, this, ohVar));
        }
    }

    private long b(long j3) {
        sd d10 = this.f4038t.d();
        if (d10 == null) {
            return 0L;
        }
        return Math.max(0L, j3 - d10.d(this.M));
    }

    private void d(long j3) {
        for (li liVar : this.a) {
            if (liVar.o() != null) {
                a(liVar, j3);
            }
        }
    }

    private boolean a(go goVar, wd.a aVar) {
        if (aVar.a() || goVar.c()) {
            return false;
        }
        goVar.a(goVar.a(aVar.a, this.f4031m).f4958c, this.f4030l);
        if (!this.f4030l.e()) {
            return false;
        }
        go.d dVar = this.f4030l;
        return dVar.f4977j && dVar.f4974g != C.TIME_UNSET;
    }

    private void b(rd rdVar) {
        if (this.f4038t.a(rdVar)) {
            this.f4038t.a(this.M);
            m();
        }
    }

    private void d(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        lh lhVar = this.f4042y;
        int i10 = lhVar.f5867e;
        if (!z10 && i10 != 4 && i10 != 1) {
            this.f4027i.c(2);
        } else {
            this.f4042y = lhVar.b(z10);
        }
    }

    public void f(boolean z10) {
        this.f4027i.a(12, z10 ? 1 : 0, 0).a();
    }

    private void b(long j3, long j10) {
        c8 c8Var;
        d dVar;
        if (this.f4035q.isEmpty() || this.f4042y.f5864b.a()) {
            return;
        }
        if (this.O) {
            j3--;
            this.O = false;
        }
        lh lhVar = this.f4042y;
        int a10 = lhVar.a.a(lhVar.f5864b.a);
        int min = Math.min(this.N, this.f4035q.size());
        d dVar2 = min > 0 ? (d) this.f4035q.get(min - 1) : null;
        while (dVar2 != null) {
            int i10 = dVar2.f4047b;
            if (i10 <= a10 && (i10 != a10 || dVar2.f4048c <= j3)) {
                break;
            }
            int i11 = min - 1;
            dVar2 = i11 > 0 ? (d) this.f4035q.get(min - 2) : null;
            min = i11;
        }
        if (min < this.f4035q.size()) {
            dVar = (d) this.f4035q.get(min);
            c8Var = this;
        } else {
            c8Var = this;
            dVar = null;
        }
        while (dVar != null && dVar.f4049d != null) {
            int i12 = dVar.f4047b;
            if (i12 >= a10 && (i12 != a10 || dVar.f4048c > j3)) {
                break;
            }
            min++;
            if (min < c8Var.f4035q.size()) {
                dVar = (d) c8Var.f4035q.get(min);
            } else {
                c8Var = c8Var;
                dVar = null;
            }
        }
        while (dVar != null && dVar.f4049d != null && dVar.f4047b == a10) {
            long j11 = dVar.f4048c;
            if (j11 <= j3 || j11 > j10) {
                break;
            }
            try {
                c8Var.e(dVar.a);
                if (dVar.a.a() || dVar.a.i()) {
                    c8Var.f4035q.remove(min);
                } else {
                    min++;
                }
                dVar = min < c8Var.f4035q.size() ? (d) c8Var.f4035q.get(min) : null;
            } catch (Throwable th2) {
                if (dVar.a.a() || dVar.a.i()) {
                    c8Var.f4035q.remove(min);
                }
                throw th2;
            }
        }
        c8Var.N = min;
    }

    private void a(li liVar) {
        if (c(liVar)) {
            this.f4034p.a(liVar);
            b(liVar);
            liVar.f();
            this.K--;
        }
    }

    private void a(boolean z10, boolean z11) {
        a(z10 || !this.H, false, true, false);
        this.f4043z.a(z11 ? 1 : 0);
        this.f4025g.c();
        c(1);
    }

    private void a(go goVar, wd.a aVar, go goVar2, wd.a aVar2, long j3) {
        if (!goVar.c() && a(goVar, aVar)) {
            goVar.a(goVar.a(aVar.a, this.f4031m).f4958c, this.f4030l);
            this.f4039v.a((od.f) yp.a(this.f4030l.f4979l));
            if (j3 != C.TIME_UNSET) {
                this.f4039v.a(a(goVar, aVar.a, j3));
                return;
            }
            if (yp.a(!goVar2.c() ? goVar2.a(goVar2.a(aVar2.a, this.f4031m).f4958c, this.f4030l).a : null, this.f4030l.a)) {
                return;
            }
            this.f4039v.a(C.TIME_UNSET);
            return;
        }
        float f10 = this.f4034p.a().a;
        mh mhVar = this.f4042y.f5876n;
        if (f10 != mhVar.a) {
            this.f4034p.a(mhVar);
        }
    }

    private void b(boolean z10) {
        for (sd e2 = this.f4038t.e(); e2 != null; e2 = e2.d()) {
            for (f8 f8Var : e2.i().f9070c) {
                if (f8Var != null) {
                    f8Var.a(z10);
                }
            }
        }
    }

    private void a(int i10, boolean z10) {
        li liVar = this.a[i10];
        if (c(liVar)) {
            return;
        }
        sd f10 = this.f4038t.f();
        boolean z11 = f10 == this.f4038t.e();
        xo i11 = f10.i();
        ni niVar = i11.f9069b[i10];
        d9[] a10 = a(i11.f9070c[i10]);
        boolean z12 = E() && this.f4042y.f5867e == 3;
        boolean z13 = !z10 && z12;
        this.K++;
        this.f4021b.add(liVar);
        liVar.a(niVar, a10, f10.f7491c[i10], this.M, z13, z11, f10.g(), f10.f());
        liVar.a(11, new a());
        this.f4034p.b(liVar);
        if (z12) {
            liVar.start();
        }
    }

    public void b(int i10, int i11, tj tjVar) {
        this.f4027i.a(20, i10, i11, tjVar).a();
    }

    private void b(mh mhVar) {
        this.f4034p.a(mhVar);
        a(this.f4034p.a(), true);
    }

    private void b(int i10) {
        this.F = i10;
        if (!this.f4038t.a(this.f4042y.a, i10)) {
            c(true);
        }
        a(false);
    }

    private void a(qo qoVar, xo xoVar) {
        this.f4025g.a(this.a, qoVar, xoVar.f9070c);
    }

    private void a(boolean[] zArr) {
        sd f10 = this.f4038t.f();
        xo i10 = f10.i();
        for (int i11 = 0; i11 < this.a.length; i11++) {
            if (!i10.a(i11) && this.f4021b.remove(this.a[i11])) {
                this.a[i11].reset();
            }
        }
        for (int i12 = 0; i12 < this.a.length; i12++) {
            if (i10.a(i12)) {
                a(i12, zArr[i12]);
            }
        }
        f10.f7495g = true;
    }

    private void c(rd rdVar) {
        if (this.f4038t.a(rdVar)) {
            sd d10 = this.f4038t.d();
            d10.a(this.f4034p.a().a, this.f4042y.a);
            a(d10.h(), d10.i());
            if (d10 == this.f4038t.e()) {
                c(d10.f7494f.f8367b);
                d();
                lh lhVar = this.f4042y;
                wd.a aVar = lhVar.f5864b;
                long j3 = d10.f7494f.f8367b;
                this.f4042y = a(aVar, j3, lhVar.f5865c, j3, false, 5);
            }
            m();
        }
    }

    public void a(long j3) {
        this.Q = j3;
    }

    private void a(float f10) {
        for (sd e2 = this.f4038t.e(); e2 != null; e2 = e2.d()) {
            for (f8 f8Var : e2.i().f9070c) {
                if (f8Var != null) {
                    f8Var.a(f10);
                }
            }
        }
    }

    private synchronized void a(Supplier supplier, long j3) {
        long c10 = this.f4036r.c() + j3;
        boolean z10 = false;
        while (!((Boolean) supplier.get()).booleanValue() && j3 > 0) {
            try {
                this.f4036r.b();
                wait(j3);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j3 = c10 - this.f4036r.c();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean c(li liVar) {
        return liVar.b() != 0;
    }

    public /* synthetic */ void c(oh ohVar) {
        try {
            b(ohVar);
        } catch (y7 e2) {
            kc.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void c(long j3) {
        sd e2 = this.f4038t.e();
        if (e2 != null) {
            j3 = e2.e(j3);
        }
        this.M = j3;
        this.f4034p.a(j3);
        for (li liVar : this.a) {
            if (c(liVar)) {
                liVar.a(this.M);
            }
        }
        t();
    }

    private ab a(f8[] f8VarArr) {
        ab.a aVar = new ab.a();
        boolean z10 = false;
        for (f8 f8Var : f8VarArr) {
            if (f8Var != null) {
                we weVar = f8Var.a(0).f4226k;
                if (weVar == null) {
                    aVar.b(new we(new we.b[0]));
                } else {
                    aVar.b(weVar);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.a() : ab.h();
    }

    private void c(long j3, long j10) {
        this.f4027i.b(2);
        this.f4027i.a(2, j3 + j10);
    }

    private static d9[] a(f8 f8Var) {
        int b3 = f8Var != null ? f8Var.b() : 0;
        d9[] d9VarArr = new d9[b3];
        for (int i10 = 0; i10 < b3; i10++) {
            d9VarArr[i10] = f8Var.a(i10);
        }
        return d9VarArr;
    }

    private void c(boolean z10) {
        wd.a aVar = this.f4038t.e().f7494f.a;
        long a10 = a(aVar, this.f4042y.f5881s, true, false);
        if (a10 != this.f4042y.f5881s) {
            lh lhVar = this.f4042y;
            this.f4042y = a(aVar, a10, lhVar.f5865c, lhVar.f5866d, z10, 5);
        }
    }

    private long a(go goVar, Object obj, long j3) {
        goVar.a(goVar.a(obj, this.f4031m).f4958c, this.f4030l);
        go.d dVar = this.f4030l;
        if (dVar.f4974g != C.TIME_UNSET && dVar.e()) {
            go.d dVar2 = this.f4030l;
            if (dVar2.f4977j) {
                return r2.a(dVar2.a() - this.f4030l.f4974g) - (this.f4031m.e() + j3);
            }
        }
        return C.TIME_UNSET;
    }

    private void c(int i10) {
        lh lhVar = this.f4042y;
        if (lhVar.f5867e != i10) {
            this.f4042y = lhVar.a(i10);
        }
    }

    private Pair a(go goVar) {
        long j3 = 0;
        if (goVar.c()) {
            return Pair.create(lh.a(), 0L);
        }
        Pair a10 = goVar.a(this.f4030l, this.f4031m, goVar.a(this.G), C.TIME_UNSET);
        wd.a a11 = this.f4038t.a(goVar, a10.first, 0L);
        long longValue = ((Long) a10.second).longValue();
        if (a11.a()) {
            goVar.a(a11.a, this.f4031m);
            if (a11.f8261c == this.f4031m.d(a11.f8260b)) {
                j3 = this.f4031m.b();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(a11, Long.valueOf(j3));
    }

    private void a(IOException iOException, int i10) {
        y7 a10 = y7.a(iOException, i10);
        sd e2 = this.f4038t.e();
        if (e2 != null) {
            a10 = a10.a(e2.f7494f.a);
        }
        kc.a("ExoPlayerImplInternal", "Playback error", a10);
        a(false, false);
        this.f4042y = this.f4042y.a(a10);
    }

    private void a(boolean z10) {
        long c10;
        sd d10 = this.f4038t.d();
        wd.a aVar = d10 == null ? this.f4042y.f5864b : d10.f7494f.a;
        boolean z11 = !this.f4042y.f5873k.equals(aVar);
        if (z11) {
            this.f4042y = this.f4042y.a(aVar);
        }
        lh lhVar = this.f4042y;
        if (d10 == null) {
            c10 = lhVar.f5881s;
        } else {
            c10 = d10.c();
        }
        lhVar.f5879q = c10;
        this.f4042y.f5880r = h();
        if ((z11 || z10) && d10 != null && d10.f7492d) {
            a(d10.h(), d10.i());
        }
    }

    private void a(go goVar, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        g a10 = a(goVar, this.f4042y, this.L, this.f4038t, this.F, this.G, this.f4030l, this.f4031m);
        wd.a aVar = a10.a;
        long j3 = a10.f4057c;
        boolean z12 = a10.f4058d;
        long j10 = a10.f4056b;
        boolean z13 = (this.f4042y.f5864b.equals(aVar) && j10 == this.f4042y.f5881s) ? false : true;
        h hVar = null;
        long j11 = C.TIME_UNSET;
        try {
            if (a10.f4059e) {
                if (this.f4042y.f5867e != 1) {
                    c(4);
                }
                a(false, false, false, true);
            }
            try {
                if (!z13) {
                    try {
                        i11 = 4;
                        z11 = false;
                        if (!this.f4038t.a(goVar, this.M, f())) {
                            c(false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = 4;
                        lh lhVar = this.f4042y;
                        go goVar2 = lhVar.a;
                        wd.a aVar2 = lhVar.f5864b;
                        if (a10.f4060f) {
                            j11 = j10;
                        }
                        h hVar2 = hVar;
                        a(goVar, aVar, goVar2, aVar2, j11);
                        if (z13 || j3 != this.f4042y.f5865c) {
                            lh lhVar2 = this.f4042y;
                            Object obj = lhVar2.f5864b.a;
                            go goVar3 = lhVar2.a;
                            this.f4042y = a(aVar, j10, j3, this.f4042y.f5866d, z13 && z10 && !goVar3.c() && !goVar3.a(obj, this.f4031m).f4961g, goVar.a(obj) == -1 ? i10 : 3);
                        }
                        B();
                        a(goVar, this.f4042y.a);
                        this.f4042y = this.f4042y.a(goVar);
                        if (!goVar.c()) {
                            this.L = hVar2;
                        }
                        a(false);
                        throw th;
                    }
                } else {
                    i11 = 4;
                    z11 = false;
                    if (!goVar.c()) {
                        for (sd e2 = this.f4038t.e(); e2 != null; e2 = e2.d()) {
                            if (e2.f7494f.a.equals(aVar)) {
                                e2.f7494f = this.f4038t.a(goVar, e2.f7494f);
                                e2.m();
                            }
                        }
                        j10 = a(aVar, j10, z12);
                    }
                }
                lh lhVar3 = this.f4042y;
                a(goVar, aVar, lhVar3.a, lhVar3.f5864b, a10.f4060f ? j10 : -9223372036854775807L);
                if (z13 || j3 != this.f4042y.f5865c) {
                    lh lhVar4 = this.f4042y;
                    Object obj2 = lhVar4.f5864b.a;
                    go goVar4 = lhVar4.a;
                    this.f4042y = a(aVar, j10, j3, this.f4042y.f5866d, (!z13 || !z10 || goVar4.c() || goVar4.a(obj2, this.f4031m).f4961g) ? z11 : true, goVar.a(obj2) == -1 ? i11 : 3);
                }
                B();
                a(goVar, this.f4042y.a);
                this.f4042y = this.f4042y.a(goVar);
                if (!goVar.c()) {
                    this.L = null;
                }
                a(z11);
            } catch (Throwable th3) {
                th = th3;
                hVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
            i10 = 4;
        }
    }

    private void a(mh mhVar, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f4043z.a(1);
            }
            this.f4042y = this.f4042y.a(mhVar);
        }
        a(mhVar.a);
        for (li liVar : this.a) {
            if (liVar != null) {
                liVar.a(f10, mhVar.a);
            }
        }
    }

    private void a(mh mhVar, boolean z10) {
        a(mhVar, mhVar.a, true, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    private lh a(wd.a aVar, long j3, long j10, long j11, boolean z10, int i10) {
        ab abVar;
        qo qoVar;
        xo xoVar;
        qo h10;
        xo i11;
        this.O = (!this.O && j3 == this.f4042y.f5881s && aVar.equals(this.f4042y.f5864b)) ? false : true;
        B();
        lh lhVar = this.f4042y;
        qo qoVar2 = lhVar.f5870h;
        xo xoVar2 = lhVar.f5871i;
        ?? r12 = lhVar.f5872j;
        if (this.u.d()) {
            sd e2 = this.f4038t.e();
            if (e2 == null) {
                h10 = qo.f7276d;
            } else {
                h10 = e2.h();
            }
            if (e2 == null) {
                i11 = this.f4024f;
            } else {
                i11 = e2.i();
            }
            ab a10 = a(i11.f9070c);
            if (e2 != null) {
                ud udVar = e2.f7494f;
                if (udVar.f8368c != j10) {
                    e2.f7494f = udVar.a(j10);
                }
            }
            qoVar = h10;
            xoVar = i11;
            abVar = a10;
        } else if (aVar.equals(this.f4042y.f5864b)) {
            abVar = r12;
            qoVar = qoVar2;
            xoVar = xoVar2;
        } else {
            qoVar = qo.f7276d;
            xoVar = this.f4024f;
            abVar = ab.h();
        }
        if (z10) {
            this.f4043z.c(i10);
        }
        return this.f4042y.a(aVar, j3, j10, j11, h(), qoVar, xoVar, abVar);
    }

    private boolean a(li liVar, sd sdVar) {
        sd d10 = sdVar.d();
        return sdVar.f7494f.f8371f && d10.f7492d && ((liVar instanceof co) || liVar.i() >= d10.g());
    }

    private static boolean a(lh lhVar, go.b bVar) {
        wd.a aVar = lhVar.f5864b;
        go goVar = lhVar.a;
        return goVar.c() || goVar.a(aVar.a, bVar).f4961g;
    }

    private boolean a(long j3, long j10) {
        if (this.J && this.I) {
            return false;
        }
        c(j3, j10);
        return true;
    }

    private void a(c cVar) {
        this.f4043z.a(1);
        throw null;
    }

    @Override // com.applovin.impl.f6.a
    public void a(mh mhVar) {
        this.f4027i.a(16, mhVar).a();
    }

    @Override // com.applovin.impl.ae.d
    public void a() {
        this.f4027i.c(22);
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        this.f4027i.a(8, rdVar).a();
    }

    private void a(int i10, int i11, tj tjVar) {
        this.f4043z.a(1);
        a(this.u.a(i10, i11, tjVar), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(boolean, boolean, boolean, boolean):void");
    }

    private static void a(go goVar, d dVar, go.d dVar2, go.b bVar) {
        int i10 = goVar.a(goVar.a(dVar.f4049d, bVar).f4958c, dVar2).f4984q;
        Object obj = goVar.a(i10, bVar, true).f4957b;
        long j3 = bVar.f4959d;
        dVar.a(i10, j3 != C.TIME_UNSET ? j3 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean a(d dVar, go goVar, go goVar2, int i10, boolean z10, go.d dVar2, go.b bVar) {
        Object obj = dVar.f4049d;
        if (obj == null) {
            Pair a10 = a(goVar, new h(dVar.a.f(), dVar.a.h(), dVar.a.d() == Long.MIN_VALUE ? C.TIME_UNSET : r2.a(dVar.a.d())), false, i10, z10, dVar2, bVar);
            if (a10 == null) {
                return false;
            }
            dVar.a(goVar.a(a10.first), ((Long) a10.second).longValue(), a10.first);
            if (dVar.a.d() == Long.MIN_VALUE) {
                a(goVar, dVar, dVar2, bVar);
            }
            return true;
        }
        int a11 = goVar.a(obj);
        if (a11 == -1) {
            return false;
        }
        if (dVar.a.d() == Long.MIN_VALUE) {
            a(goVar, dVar, dVar2, bVar);
            return true;
        }
        dVar.f4047b = a11;
        goVar2.a(dVar.f4049d, bVar);
        if (bVar.f4961g && goVar2.a(bVar.f4958c, dVar2).f4983p == goVar2.a(dVar.f4049d)) {
            Pair a12 = goVar.a(dVar2, bVar, goVar.a(dVar.f4049d, bVar).f4958c, bVar.e() + dVar.f4048c);
            dVar.a(goVar.a(a12.first), ((Long) a12.second).longValue(), a12.first);
        }
        return true;
    }

    private void a(go goVar, go goVar2) {
        if (goVar.c() && goVar2.c()) {
            return;
        }
        for (int size = this.f4035q.size() - 1; size >= 0; size--) {
            if (!a((d) this.f4035q.get(size), goVar, goVar2, this.F, this.G, this.f4030l, this.f4031m)) {
                ((d) this.f4035q.get(size)).a.a(false);
                this.f4035q.remove(size);
            }
        }
        Collections.sort(this.f4035q);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.c8.g a(com.applovin.impl.go r30, com.applovin.impl.lh r31, com.applovin.impl.c8.h r32, com.applovin.impl.vd r33, int r34, boolean r35, com.applovin.impl.go.d r36, com.applovin.impl.go.b r37) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(com.applovin.impl.go, com.applovin.impl.lh, com.applovin.impl.c8$h, com.applovin.impl.vd, int, boolean, com.applovin.impl.go$d, com.applovin.impl.go$b):com.applovin.impl.c8$g");
    }

    private static Pair a(go goVar, h hVar, boolean z10, int i10, boolean z11, go.d dVar, go.b bVar) {
        Pair a10;
        Object a11;
        go goVar2 = hVar.a;
        if (goVar.c()) {
            return null;
        }
        go goVar3 = goVar2.c() ? goVar : goVar2;
        try {
            a10 = goVar3.a(dVar, bVar, hVar.f4061b, hVar.f4062c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (goVar.equals(goVar3)) {
            return a10;
        }
        if (goVar.a(a10.first) != -1) {
            return (goVar3.a(a10.first, bVar).f4961g && goVar3.a(bVar.f4958c, dVar).f4983p == goVar3.a(a10.first)) ? goVar.a(dVar, bVar, goVar.a(a10.first, bVar).f4958c, hVar.f4062c) : a10;
        }
        if (z10 && (a11 = a(dVar, bVar, i10, z11, a10.first, goVar3, goVar)) != null) {
            return goVar.a(dVar, bVar, goVar.a(a11, bVar).f4958c, C.TIME_UNSET);
        }
        return null;
    }

    public static Object a(go.d dVar, go.b bVar, int i10, boolean z10, Object obj, go goVar, go goVar2) {
        int a10 = goVar.a(obj);
        int a11 = goVar.a();
        int i11 = a10;
        int i12 = -1;
        for (int i13 = 0; i13 < a11 && i12 == -1; i13++) {
            i11 = goVar.a(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = goVar2.a(goVar.b(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return goVar2.b(i12);
    }

    public void a(go goVar, int i10, long j3) {
        this.f4027i.a(3, new h(goVar, i10, j3)).a();
    }

    private void a(h hVar) {
        long j3;
        long j10;
        boolean z10;
        wd.a aVar;
        long j11;
        long j12;
        long j13;
        lh lhVar;
        int i10;
        this.f4043z.a(1);
        Pair a10 = a(this.f4042y.a, hVar, true, this.F, this.G, this.f4030l, this.f4031m);
        if (a10 == null) {
            Pair a11 = a(this.f4042y.a);
            aVar = (wd.a) a11.first;
            long longValue = ((Long) a11.second).longValue();
            z10 = !this.f4042y.a.c();
            j3 = longValue;
            j10 = -9223372036854775807L;
        } else {
            Object obj = a10.first;
            long longValue2 = ((Long) a10.second).longValue();
            long j14 = hVar.f4062c == C.TIME_UNSET ? -9223372036854775807L : longValue2;
            wd.a a12 = this.f4038t.a(this.f4042y.a, obj, longValue2);
            if (a12.a()) {
                this.f4042y.a.a(a12.a, this.f4031m);
                longValue2 = this.f4031m.d(a12.f8260b) == a12.f8261c ? this.f4031m.b() : 0L;
            } else if (hVar.f4062c != C.TIME_UNSET) {
                j3 = longValue2;
                j10 = j14;
                z10 = false;
                aVar = a12;
            }
            j3 = longValue2;
            j10 = j14;
            aVar = a12;
            z10 = true;
        }
        try {
            if (this.f4042y.a.c()) {
                this.L = hVar;
            } else if (a10 == null) {
                if (this.f4042y.f5867e != 1) {
                    c(4);
                }
                a(false, true, false, true);
            } else {
                if (aVar.equals(this.f4042y.f5864b)) {
                    sd e2 = this.f4038t.e();
                    j12 = (e2 == null || !e2.f7492d || j3 == 0) ? j3 : e2.a.a(j3, this.f4041x);
                    if (r2.b(j12) == r2.b(this.f4042y.f5881s) && ((i10 = (lhVar = this.f4042y).f5867e) == 2 || i10 == 3)) {
                        long j15 = lhVar.f5881s;
                        this.f4042y = a(aVar, j15, j10, j15, z10, 2);
                        return;
                    }
                } else {
                    j12 = j3;
                }
                long a13 = a(aVar, j12, this.f4042y.f5867e == 4);
                boolean z11 = (j3 != a13) | z10;
                try {
                    lh lhVar2 = this.f4042y;
                    go goVar = lhVar2.a;
                    a(goVar, aVar, goVar, lhVar2.f5864b, j10);
                    z10 = z11;
                    j13 = a13;
                    this.f4042y = a(aVar, j13, j10, j13, z10, 2);
                } catch (Throwable th2) {
                    th = th2;
                    z10 = z11;
                    j11 = a13;
                    this.f4042y = a(aVar, j11, j10, j11, z10, 2);
                    throw th;
                }
            }
            j13 = j3;
            this.f4042y = a(aVar, j13, j10, j13, z10, 2);
        } catch (Throwable th3) {
            th = th3;
            j11 = j3;
        }
    }

    private long a(wd.a aVar, long j3, boolean z10) {
        return a(aVar, j3, this.f4038t.e() != this.f4038t.f(), z10);
    }

    private long a(wd.a aVar, long j3, boolean z10, boolean z11) {
        H();
        this.D = false;
        if (z11 || this.f4042y.f5867e == 3) {
            c(2);
        }
        sd e2 = this.f4038t.e();
        sd sdVar = e2;
        while (sdVar != null && !aVar.equals(sdVar.f7494f.a)) {
            sdVar = sdVar.d();
        }
        if (z10 || e2 != sdVar || (sdVar != null && sdVar.e(j3) < 0)) {
            for (li liVar : this.a) {
                a(liVar);
            }
            if (sdVar != null) {
                while (this.f4038t.e() != sdVar) {
                    this.f4038t.a();
                }
                this.f4038t.a(sdVar);
                sdVar.c(0L);
                d();
            }
        }
        if (sdVar != null) {
            this.f4038t.a(sdVar);
            if (!sdVar.f7492d) {
                sdVar.f7494f = sdVar.f7494f.b(j3);
            } else if (sdVar.f7493e) {
                long a10 = sdVar.a.a(j3);
                sdVar.a.a(a10 - this.f4032n, this.f4033o);
                j3 = a10;
            }
            c(j3);
            m();
        } else {
            this.f4038t.c();
            c(j3);
        }
        a(false);
        this.f4027i.c(2);
        return j3;
    }

    @Override // com.applovin.impl.oh.a
    public synchronized void a(oh ohVar) {
        if (!this.A && this.f4028j.isAlive()) {
            this.f4027i.a(14, ohVar).a();
            return;
        }
        kc.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ohVar.a(false);
    }

    private void a(li liVar, long j3) {
        liVar.g();
        if (liVar instanceof co) {
            ((co) liVar).c(j3);
        }
    }

    private void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (li liVar : this.a) {
                    if (!c(liVar) && this.f4021b.remove(liVar)) {
                        liVar.reset();
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

    private void a(b bVar) {
        this.f4043z.a(1);
        if (bVar.f4045c != -1) {
            this.L = new h(new ph(bVar.a, bVar.f4044b), bVar.f4045c, bVar.f4046d);
        }
        a(this.u.a(bVar.a, bVar.f4044b), false);
    }

    public void a(List list, int i10, long j3, tj tjVar) {
        this.f4027i.a(17, new b(list, tjVar, i10, j3, null)).a();
    }

    public void a(boolean z10, int i10) {
        this.f4027i.a(1, z10 ? 1 : 0, i10).a();
    }

    private void a(boolean z10, int i10, boolean z11, int i11) {
        this.f4043z.a(z11 ? 1 : 0);
        this.f4043z.b(i11);
        this.f4042y = this.f4042y.a(z10, i10);
        this.D = false;
        b(z10);
        if (!E()) {
            H();
            K();
            return;
        }
        int i12 = this.f4042y.f5867e;
        if (i12 == 3) {
            F();
            this.f4027i.c(2);
        } else if (i12 == 2) {
            this.f4027i.c(2);
        }
    }

    public void a(int i10) {
        this.f4027i.a(11, i10, 0).a();
    }

    private void a(fj fjVar) {
        this.f4041x = fjVar;
    }
}
