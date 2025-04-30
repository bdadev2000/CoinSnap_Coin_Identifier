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
import com.google.android.gms.location.GeofenceStatusCodes;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c8 implements Handler.Callback, rd.a, wo.a, ae.d, f6.a, oh.a {

    /* renamed from: A */
    private boolean f6990A;

    /* renamed from: B */
    private boolean f6991B;

    /* renamed from: C */
    private boolean f6992C;

    /* renamed from: D */
    private boolean f6993D;

    /* renamed from: E */
    private boolean f6994E;

    /* renamed from: F */
    private int f6995F;

    /* renamed from: G */
    private boolean f6996G;

    /* renamed from: H */
    private boolean f6997H;

    /* renamed from: I */
    private boolean f6998I;

    /* renamed from: J */
    private boolean f6999J;

    /* renamed from: K */
    private int f7000K;

    /* renamed from: L */
    private h f7001L;

    /* renamed from: M */
    private long f7002M;

    /* renamed from: N */
    private int f7003N;
    private boolean O;

    /* renamed from: P */
    private y7 f7004P;

    /* renamed from: Q */
    private long f7005Q;

    /* renamed from: a */
    private final li[] f7006a;
    private final Set b;

    /* renamed from: c */
    private final mi[] f7007c;

    /* renamed from: d */
    private final wo f7008d;

    /* renamed from: f */
    private final xo f7009f;

    /* renamed from: g */
    private final gc f7010g;

    /* renamed from: h */
    private final InterfaceC0775x1 f7011h;

    /* renamed from: i */
    private final ha f7012i;

    /* renamed from: j */
    private final HandlerThread f7013j;

    /* renamed from: k */
    private final Looper f7014k;
    private final go.d l;
    private final go.b m;

    /* renamed from: n */
    private final long f7015n;

    /* renamed from: o */
    private final boolean f7016o;

    /* renamed from: p */
    private final f6 f7017p;

    /* renamed from: q */
    private final ArrayList f7018q;

    /* renamed from: r */
    private final j3 f7019r;

    /* renamed from: s */
    private final f f7020s;

    /* renamed from: t */
    private final vd f7021t;

    /* renamed from: u */
    private final ae f7022u;

    /* renamed from: v */
    private final fc f7023v;

    /* renamed from: w */
    private final long f7024w;

    /* renamed from: x */
    private fj f7025x;

    /* renamed from: y */
    private lh f7026y;

    /* renamed from: z */
    private e f7027z;

    /* loaded from: classes.dex */
    public class a implements li.a {
        public a() {
        }

        @Override // com.applovin.impl.li.a
        public void a(long j7) {
            if (j7 >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                c8.this.f6998I = true;
            }
        }

        @Override // com.applovin.impl.li.a
        public void a() {
            c8.this.f7012i.c(2);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        private boolean f7035a;
        public lh b;

        /* renamed from: c */
        public int f7036c;

        /* renamed from: d */
        public boolean f7037d;

        /* renamed from: e */
        public int f7038e;

        /* renamed from: f */
        public boolean f7039f;

        /* renamed from: g */
        public int f7040g;

        public e(lh lhVar) {
            this.b = lhVar;
        }

        public void b(int i9) {
            this.f7035a = true;
            this.f7039f = true;
            this.f7040g = i9;
        }

        public void c(int i9) {
            boolean z8 = true;
            if (this.f7037d && this.f7038e != 5) {
                if (i9 != 5) {
                    z8 = false;
                }
                AbstractC0669a1.a(z8);
            } else {
                this.f7035a = true;
                this.f7037d = true;
                this.f7038e = i9;
            }
        }

        public void a(int i9) {
            this.f7035a |= i9 > 0;
            this.f7036c += i9;
        }

        public void a(lh lhVar) {
            this.f7035a |= this.b != lhVar;
            this.b = lhVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final wd.a f7041a;
        public final long b;

        /* renamed from: c */
        public final long f7042c;

        /* renamed from: d */
        public final boolean f7043d;

        /* renamed from: e */
        public final boolean f7044e;

        /* renamed from: f */
        public final boolean f7045f;

        public g(wd.a aVar, long j7, long j9, boolean z8, boolean z9, boolean z10) {
            this.f7041a = aVar;
            this.b = j7;
            this.f7042c = j9;
            this.f7043d = z8;
            this.f7044e = z9;
            this.f7045f = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final go f7046a;
        public final int b;

        /* renamed from: c */
        public final long f7047c;

        public h(go goVar, int i9, long j7) {
            this.f7046a = goVar;
            this.b = i9;
            this.f7047c = j7;
        }
    }

    public c8(li[] liVarArr, wo woVar, xo xoVar, gc gcVar, InterfaceC0775x1 interfaceC0775x1, int i9, boolean z8, C0742r0 c0742r0, fj fjVar, fc fcVar, long j7, boolean z9, Looper looper, j3 j3Var, f fVar) {
        this.f7020s = fVar;
        this.f7006a = liVarArr;
        this.f7008d = woVar;
        this.f7009f = xoVar;
        this.f7010g = gcVar;
        this.f7011h = interfaceC0775x1;
        this.f6995F = i9;
        this.f6996G = z8;
        this.f7025x = fjVar;
        this.f7023v = fcVar;
        this.f7024w = j7;
        this.f7005Q = j7;
        this.f6991B = z9;
        this.f7019r = j3Var;
        this.f7015n = gcVar.d();
        this.f7016o = gcVar.a();
        lh a6 = lh.a(xoVar);
        this.f7026y = a6;
        this.f7027z = new e(a6);
        this.f7007c = new mi[liVarArr.length];
        for (int i10 = 0; i10 < liVarArr.length; i10++) {
            liVarArr[i10].b(i10);
            this.f7007c[i10] = liVarArr[i10].n();
        }
        this.f7017p = new f6(this, j3Var);
        this.f7018q = new ArrayList();
        this.b = nj.b();
        this.l = new go.d();
        this.m = new go.b();
        woVar.a(this, interfaceC0775x1);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f7021t = new vd(c0742r0, handler);
        this.f7022u = new ae(this, c0742r0, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f7013j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f7014k = looper2;
        this.f7012i = j3Var.a(looper2, this);
    }

    private void A() {
        boolean z8;
        float f9 = this.f7017p.a().f9208a;
        sd f10 = this.f7021t.f();
        boolean z9 = true;
        for (sd e4 = this.f7021t.e(); e4 != null && e4.f10631d; e4 = e4.d()) {
            xo b8 = e4.b(f9, this.f7026y.f8832a);
            if (!b8.a(e4.i())) {
                if (z9) {
                    sd e9 = this.f7021t.e();
                    boolean a6 = this.f7021t.a(e9);
                    boolean[] zArr = new boolean[this.f7006a.length];
                    long a9 = e9.a(b8, this.f7026y.f8847s, a6, zArr);
                    lh lhVar = this.f7026y;
                    if (lhVar.f8835e != 4 && a9 != lhVar.f8847s) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    lh lhVar2 = this.f7026y;
                    this.f7026y = a(lhVar2.b, a9, lhVar2.f8833c, lhVar2.f8834d, z8, 5);
                    if (z8) {
                        c(a9);
                    }
                    boolean[] zArr2 = new boolean[this.f7006a.length];
                    int i9 = 0;
                    while (true) {
                        li[] liVarArr = this.f7006a;
                        if (i9 >= liVarArr.length) {
                            break;
                        }
                        li liVar = liVarArr[i9];
                        boolean c9 = c(liVar);
                        zArr2[i9] = c9;
                        yi yiVar = e9.f10630c[i9];
                        if (c9) {
                            if (yiVar != liVar.o()) {
                                a(liVar);
                            } else if (zArr[i9]) {
                                liVar.a(this.f7002M);
                            }
                        }
                        i9++;
                    }
                    a(zArr2);
                } else {
                    this.f7021t.a(e4);
                    if (e4.f10631d) {
                        e4.a(b8, Math.max(e4.f10633f.b, e4.d(this.f7002M)), false);
                    }
                }
                a(true);
                if (this.f7026y.f8835e != 4) {
                    m();
                    K();
                    this.f7012i.c(2);
                    return;
                }
                return;
            }
            if (e4 == f10) {
                z9 = false;
            }
        }
    }

    private void B() {
        boolean z8;
        sd e4 = this.f7021t.e();
        if (e4 != null && e4.f10633f.f11588h && this.f6991B) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f6992C = z8;
    }

    private boolean C() {
        sd e4;
        sd d2;
        if (!E() || this.f6992C || (e4 = this.f7021t.e()) == null || (d2 = e4.d()) == null || this.f7002M < d2.g() || !d2.f10634g) {
            return false;
        }
        return true;
    }

    private boolean D() {
        long d2;
        if (!j()) {
            return false;
        }
        sd d9 = this.f7021t.d();
        long b8 = b(d9.e());
        if (d9 == this.f7021t.e()) {
            d2 = d9.d(this.f7002M);
        } else {
            d2 = d9.d(this.f7002M) - d9.f10633f.b;
        }
        return this.f7010g.a(d2, b8, this.f7017p.a().f9208a);
    }

    private boolean E() {
        lh lhVar = this.f7026y;
        if (lhVar.l && lhVar.m == 0) {
            return true;
        }
        return false;
    }

    private void F() {
        this.f6993D = false;
        this.f7017p.b();
        for (li liVar : this.f7006a) {
            if (c(liVar)) {
                liVar.start();
            }
        }
    }

    private void H() {
        this.f7017p.c();
        for (li liVar : this.f7006a) {
            if (c(liVar)) {
                b(liVar);
            }
        }
    }

    private void I() {
        boolean z8;
        sd d2 = this.f7021t.d();
        if (!this.f6994E && (d2 == null || !d2.f10629a.a())) {
            z8 = false;
        } else {
            z8 = true;
        }
        lh lhVar = this.f7026y;
        if (z8 != lhVar.f8837g) {
            this.f7026y = lhVar.a(z8);
        }
    }

    private void J() {
        if (!this.f7026y.f8832a.c() && this.f7022u.d()) {
            o();
            q();
            r();
            p();
        }
    }

    private void K() {
        long j7;
        boolean z8;
        sd e4 = this.f7021t.e();
        if (e4 == null) {
            return;
        }
        if (e4.f10631d) {
            j7 = e4.f10629a.h();
        } else {
            j7 = -9223372036854775807L;
        }
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            c(j7);
            if (j7 != this.f7026y.f8847s) {
                lh lhVar = this.f7026y;
                this.f7026y = a(lhVar.b, j7, lhVar.f8833c, j7, true, 5);
            }
        } else {
            f6 f6Var = this.f7017p;
            if (e4 != this.f7021t.f()) {
                z8 = true;
            } else {
                z8 = false;
            }
            long b8 = f6Var.b(z8);
            this.f7002M = b8;
            long d2 = e4.d(b8);
            b(this.f7026y.f8847s, d2);
            this.f7026y.f8847s = d2;
        }
        this.f7026y.f8845q = this.f7021t.d().c();
        this.f7026y.f8846r = h();
        lh lhVar2 = this.f7026y;
        if (lhVar2.l && lhVar2.f8835e == 3 && a(lhVar2.f8832a, lhVar2.b) && this.f7026y.f8842n.f9208a == 1.0f) {
            float a6 = this.f7023v.a(e(), h());
            if (this.f7017p.a().f9208a != a6) {
                this.f7017p.a(this.f7026y.f8842n.a(a6));
                a(this.f7026y.f8842n, this.f7017p.a().f9208a, false, false);
            }
        }
    }

    private void d() {
        a(new boolean[this.f7006a.length]);
    }

    private long e() {
        lh lhVar = this.f7026y;
        return a(lhVar.f8832a, lhVar.b.f11475a, lhVar.f8847s);
    }

    private long f() {
        sd f9 = this.f7021t.f();
        if (f9 == null) {
            return 0L;
        }
        long f10 = f9.f();
        if (!f9.f10631d) {
            return f10;
        }
        int i9 = 0;
        while (true) {
            li[] liVarArr = this.f7006a;
            if (i9 >= liVarArr.length) {
                return f10;
            }
            if (c(liVarArr[i9]) && this.f7006a[i9].o() == f9.f10630c[i9]) {
                long i10 = this.f7006a[i9].i();
                if (i10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                f10 = Math.max(i10, f10);
            }
            i9++;
        }
    }

    private long h() {
        return b(this.f7026y.f8845q);
    }

    private boolean i() {
        sd f9 = this.f7021t.f();
        if (!f9.f10631d) {
            return false;
        }
        int i9 = 0;
        while (true) {
            li[] liVarArr = this.f7006a;
            if (i9 < liVarArr.length) {
                li liVar = liVarArr[i9];
                yi yiVar = f9.f10630c[i9];
                if (liVar.o() != yiVar || (yiVar != null && !liVar.j() && !a(liVar, f9))) {
                    break;
                }
                i9++;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean j() {
        sd d2 = this.f7021t.d();
        if (d2 == null || d2.e() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private boolean k() {
        sd e4 = this.f7021t.e();
        long j7 = e4.f10633f.f11585e;
        if (e4.f10631d && (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || this.f7026y.f8847s < j7 || !E())) {
            return true;
        }
        return false;
    }

    public /* synthetic */ Boolean l() {
        return Boolean.valueOf(this.f6990A);
    }

    private void m() {
        boolean D8 = D();
        this.f6994E = D8;
        if (D8) {
            this.f7021t.d().a(this.f7002M);
        }
        I();
    }

    private void n() {
        this.f7027z.a(this.f7026y);
        if (this.f7027z.f7035a) {
            this.f7020s.a(this.f7027z);
            this.f7027z = new e(this.f7026y);
        }
    }

    private void o() {
        ud a6;
        this.f7021t.a(this.f7002M);
        if (this.f7021t.h() && (a6 = this.f7021t.a(this.f7002M, this.f7026y)) != null) {
            sd a9 = this.f7021t.a(this.f7007c, this.f7008d, this.f7010g.b(), this.f7022u, a6, this.f7009f);
            a9.f10629a.a(this, a6.b);
            if (this.f7021t.e() == a9) {
                c(a9.g());
            }
            a(false);
        }
        if (this.f6994E) {
            this.f6994E = j();
            I();
        } else {
            m();
        }
    }

    private void p() {
        boolean z8 = false;
        while (C()) {
            if (z8) {
                n();
            }
            sd e4 = this.f7021t.e();
            sd a6 = this.f7021t.a();
            ud udVar = a6.f10633f;
            wd.a aVar = udVar.f11582a;
            long j7 = udVar.b;
            lh a9 = a(aVar, j7, udVar.f11583c, j7, true, 0);
            this.f7026y = a9;
            go goVar = a9.f8832a;
            a(goVar, a6.f10633f.f11582a, goVar, e4.f10633f.f11582a, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            B();
            K();
            z8 = true;
        }
    }

    private void q() {
        long j7;
        boolean z8;
        sd f9 = this.f7021t.f();
        if (f9 == null) {
            return;
        }
        int i9 = 0;
        if (f9.d() != null && !this.f6992C) {
            if (!i()) {
                return;
            }
            if (!f9.d().f10631d && this.f7002M < f9.d().g()) {
                return;
            }
            xo i10 = f9.i();
            sd b8 = this.f7021t.b();
            xo i11 = b8.i();
            if (b8.f10631d && b8.f10629a.h() != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                d(b8.g());
                return;
            }
            for (int i12 = 0; i12 < this.f7006a.length; i12++) {
                boolean a6 = i10.a(i12);
                boolean a9 = i11.a(i12);
                if (a6 && !this.f7006a[i12].k()) {
                    if (this.f7007c[i12].e() == -2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ni niVar = i10.b[i12];
                    ni niVar2 = i11.b[i12];
                    if (!a9 || !niVar2.equals(niVar) || z8) {
                        a(this.f7006a[i12], b8.g());
                    }
                }
            }
            return;
        }
        if (!f9.f10633f.f11589i && !this.f6992C) {
            return;
        }
        while (true) {
            li[] liVarArr = this.f7006a;
            if (i9 < liVarArr.length) {
                li liVar = liVarArr[i9];
                yi yiVar = f9.f10630c[i9];
                if (yiVar != null && liVar.o() == yiVar && liVar.j()) {
                    long j9 = f9.f10633f.f11585e;
                    if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j9 != Long.MIN_VALUE) {
                        j7 = f9.f() + f9.f10633f.f11585e;
                    } else {
                        j7 = -9223372036854775807L;
                    }
                    a(liVar, j7);
                }
                i9++;
            } else {
                return;
            }
        }
    }

    private void r() {
        sd f9 = this.f7021t.f();
        if (f9 != null && this.f7021t.e() != f9 && !f9.f10634g && z()) {
            d();
        }
    }

    private void s() {
        a(this.f7022u.a(), true);
    }

    private void t() {
        for (sd e4 = this.f7021t.e(); e4 != null; e4 = e4.d()) {
            for (f8 f8Var : e4.i().f12288c) {
                if (f8Var != null) {
                    f8Var.j();
                }
            }
        }
    }

    private void u() {
        for (sd e4 = this.f7021t.e(); e4 != null; e4 = e4.d()) {
            for (f8 f8Var : e4.i().f12288c) {
                if (f8Var != null) {
                    f8Var.k();
                }
            }
        }
    }

    private void w() {
        int i9;
        this.f7027z.a(1);
        a(false, false, false, true);
        this.f7010g.f();
        if (this.f7026y.f8832a.c()) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        c(i9);
        this.f7022u.a(this.f7011h.a());
        this.f7012i.c(2);
    }

    private void y() {
        a(true, false, true, false);
        this.f7010g.e();
        c(1);
        this.f7013j.quit();
        synchronized (this) {
            this.f6990A = true;
            notifyAll();
        }
    }

    private boolean z() {
        boolean z8;
        sd f9 = this.f7021t.f();
        xo i9 = f9.i();
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            li[] liVarArr = this.f7006a;
            if (i10 < liVarArr.length) {
                li liVar = liVarArr[i10];
                if (c(liVar)) {
                    if (liVar.o() != f9.f10630c[i10]) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!i9.a(i10) || z8) {
                        if (!liVar.k()) {
                            liVar.a(a(i9.f12288c[i10]), f9.f10630c[i10], f9.g(), f9.f());
                        } else if (liVar.c()) {
                            a(liVar);
                        } else {
                            z9 = true;
                        }
                    }
                }
                i10++;
            } else {
                return !z9;
            }
        }
    }

    public void G() {
        this.f7012i.d(6).a();
    }

    public Looper g() {
        return this.f7014k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        sd f9;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    a(z8, message.arg2, true, 1);
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
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    g(z9);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a(z10, (AtomicBoolean) message.obj);
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
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e(z11);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    d(z12);
                    break;
                case 25:
                    b();
                    break;
                default:
                    return false;
            }
        } catch (ah e4) {
            int i10 = e4.b;
            if (i10 == 1) {
                if (e4.f6751a) {
                    i9 = 3001;
                } else {
                    i9 = 3003;
                }
            } else if (i10 == 4) {
                if (e4.f6751a) {
                    i9 = 3002;
                } else {
                    i9 = 3004;
                }
            }
            a(e4, i9);
        } catch (h5 e9) {
            a(e9, e9.f8062a);
        } catch (x6.a e10) {
            a(e10, e10.f12156a);
        } catch (y7 e11) {
            e = e11;
            if (e.f12345d == 1 && (f9 = this.f7021t.f()) != null) {
                e = e.a(f9.f10633f.f11582a);
            }
            if (e.f12351k && this.f7004P == null) {
                kc.c("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f7004P = e;
                ha haVar = this.f7012i;
                haVar.a(haVar.a(25, e));
            } else {
                y7 y7Var = this.f7004P;
                if (y7Var != null) {
                    y7Var.addSuppressed(e);
                    e = this.f7004P;
                }
                kc.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f7026y = this.f7026y.a(e);
            }
        } catch (IOException e12) {
            a(e12, 2000);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i9 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
            }
            y7 a6 = y7.a(e13, i9);
            kc.a("ExoPlayerImplInternal", "Playback error", a6);
            a(true, false);
            this.f7026y = this.f7026y.a(a6);
        }
        n();
        return true;
    }

    public void v() {
        this.f7012i.d(0).a();
    }

    public synchronized boolean x() {
        if (!this.f6990A && this.f7013j.isAlive()) {
            this.f7012i.c(7);
            a(new Supplier() { // from class: com.applovin.impl.Z
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    Boolean l;
                    l = c8.this.l();
                    return l;
                }
            }, this.f7024w);
            return this.f6990A;
        }
        return true;
    }

    private void b() {
        c(true);
    }

    private void c() {
        boolean z8;
        boolean z9;
        int i9;
        boolean z10;
        long a6 = this.f7019r.a();
        J();
        int i10 = this.f7026y.f8835e;
        if (i10 != 1 && i10 != 4) {
            sd e4 = this.f7021t.e();
            if (e4 == null) {
                c(a6, 10L);
                return;
            }
            lo.a("doSomeWork");
            K();
            if (e4.f10631d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                e4.f10629a.a(this.f7026y.f8847s - this.f7015n, this.f7016o);
                z8 = true;
                z9 = true;
                int i11 = 0;
                while (true) {
                    li[] liVarArr = this.f7006a;
                    if (i11 >= liVarArr.length) {
                        break;
                    }
                    li liVar = liVarArr[i11];
                    if (c(liVar)) {
                        liVar.a(this.f7002M, elapsedRealtime);
                        z8 = z8 && liVar.c();
                        boolean z11 = e4.f10630c[i11] != liVar.o();
                        boolean z12 = z11 || (!z11 && liVar.j()) || liVar.d() || liVar.c();
                        z9 = z9 && z12;
                        if (!z12) {
                            liVar.h();
                        }
                    }
                    i11++;
                }
            } else {
                e4.f10629a.f();
                z8 = true;
                z9 = true;
            }
            long j7 = e4.f10633f.f11585e;
            boolean z13 = z8 && e4.f10631d && (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j7 <= this.f7026y.f8847s);
            if (z13 && this.f6992C) {
                this.f6992C = false;
                a(false, this.f7026y.m, false, 5);
            }
            if (z13 && e4.f10633f.f11589i) {
                c(4);
                H();
            } else if (this.f7026y.f8835e == 2 && h(z9)) {
                c(3);
                this.f7004P = null;
                if (E()) {
                    F();
                }
            } else if (this.f7026y.f8835e == 3 && (this.f7000K != 0 ? !z9 : !k())) {
                this.f6993D = E();
                c(2);
                if (this.f6993D) {
                    u();
                    this.f7023v.a();
                }
                H();
            }
            if (this.f7026y.f8835e == 2) {
                int i12 = 0;
                while (true) {
                    li[] liVarArr2 = this.f7006a;
                    if (i12 >= liVarArr2.length) {
                        break;
                    }
                    if (c(liVarArr2[i12]) && this.f7006a[i12].o() == e4.f10630c[i12]) {
                        this.f7006a[i12].h();
                    }
                    i12++;
                }
                lh lhVar = this.f7026y;
                if (!lhVar.f8837g && lhVar.f8846r < 500000 && j()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z14 = this.f6999J;
            lh lhVar2 = this.f7026y;
            if (z14 != lhVar2.f8843o) {
                this.f7026y = lhVar2.b(z14);
            }
            if ((E() && this.f7026y.f8835e == 3) || (i9 = this.f7026y.f8835e) == 2) {
                z10 = !a(a6, 10L);
            } else {
                if (this.f7000K != 0 && i9 != 4) {
                    c(a6, 1000L);
                } else {
                    this.f7012i.b(2);
                }
                z10 = false;
            }
            lh lhVar3 = this.f7026y;
            if (lhVar3.f8844p != z10) {
                this.f7026y = lhVar3.c(z10);
            }
            this.f6998I = false;
            lo.a();
            return;
        }
        this.f7012i.b(2);
    }

    private void e(oh ohVar) {
        if (ohVar.b() == this.f7014k) {
            b(ohVar);
            int i9 = this.f7026y.f8835e;
            if (i9 == 3 || i9 == 2) {
                this.f7012i.c(2);
                return;
            }
            return;
        }
        this.f7012i.a(15, ohVar).a();
    }

    private void g(boolean z8) {
        this.f6996G = z8;
        if (!this.f7021t.a(this.f7026y.f8832a, z8)) {
            c(true);
        }
        a(false);
    }

    private boolean h(boolean z8) {
        if (this.f7000K == 0) {
            return k();
        }
        if (!z8) {
            return false;
        }
        lh lhVar = this.f7026y;
        if (!lhVar.f8837g) {
            return true;
        }
        long b8 = a(lhVar.f8832a, this.f7021t.e().f10633f.f11582a) ? this.f7023v.b() : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        sd d2 = this.f7021t.d();
        return (d2.j() && d2.f10633f.f11589i) || (d2.f10633f.f11582a.a() && !d2.f10631d) || this.f7010g.a(h(), this.f7017p.a().f9208a, this.f6993D, b8);
    }

    @Override // com.applovin.impl.lj.a
    /* renamed from: d */
    public void a(rd rdVar) {
        this.f7012i.a(9, rdVar).a();
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final oh f7032a;
        public int b;

        /* renamed from: c */
        public long f7033c;

        /* renamed from: d */
        public Object f7034d;

        public d(oh ohVar) {
            this.f7032a = ohVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f7034d;
            if ((obj == null) != (dVar.f7034d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i9 = this.b - dVar.b;
            return i9 != 0 ? i9 : yp.a(this.f7033c, dVar.f7033c);
        }

        public void a(int i9, long j7, Object obj) {
            this.b = i9;
            this.f7033c = j7;
            this.f7034d = obj;
        }
    }

    private void a(tj tjVar) {
        this.f7027z.a(1);
        a(this.f7022u.a(tjVar), false);
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
        if (ohVar.d() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            e(ohVar);
            return;
        }
        if (this.f7026y.f8832a.c()) {
            this.f7018q.add(new d(ohVar));
            return;
        }
        d dVar = new d(ohVar);
        go goVar = this.f7026y.f8832a;
        if (a(dVar, goVar, goVar, this.f6995F, this.f6996G, this.l, this.m)) {
            this.f7018q.add(dVar);
            Collections.sort(this.f7018q);
        } else {
            ohVar.a(false);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List f7029a;
        private final tj b;

        /* renamed from: c */
        private final int f7030c;

        /* renamed from: d */
        private final long f7031d;

        private b(List list, tj tjVar, int i9, long j7) {
            this.f7029a = list;
            this.b = tjVar;
            this.f7030c = i9;
            this.f7031d = j7;
        }

        public /* synthetic */ b(List list, tj tjVar, int i9, long j7, a aVar) {
            this(list, tjVar, i9, j7);
        }
    }

    private void a(b bVar, int i9) {
        this.f7027z.a(1);
        ae aeVar = this.f7022u;
        if (i9 == -1) {
            i9 = aeVar.c();
        }
        a(aeVar.a(i9, bVar.f7029a, bVar.b), false);
    }

    private void e(boolean z8) {
        this.f6991B = z8;
        B();
        if (!this.f6992C || this.f7021t.f() == this.f7021t.e()) {
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
        Looper b8 = ohVar.b();
        if (!b8.getThread().isAlive()) {
            kc.d("TAG", "Trying to send message on a dead thread.");
            ohVar.a(false);
        } else {
            this.f7019r.a(b8, null).a((Runnable) new F(1, this, ohVar));
        }
    }

    private long b(long j7) {
        sd d2 = this.f7021t.d();
        if (d2 == null) {
            return 0L;
        }
        return Math.max(0L, j7 - d2.d(this.f7002M));
    }

    private void d(long j7) {
        for (li liVar : this.f7006a) {
            if (liVar.o() != null) {
                a(liVar, j7);
            }
        }
    }

    private boolean a(go goVar, wd.a aVar) {
        if (aVar.a() || goVar.c()) {
            return false;
        }
        goVar.a(goVar.a(aVar.f11475a, this.m).f7934c, this.l);
        if (!this.l.e()) {
            return false;
        }
        go.d dVar = this.l;
        return dVar.f7954j && dVar.f7951g != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private void b(rd rdVar) {
        if (this.f7021t.a(rdVar)) {
            this.f7021t.a(this.f7002M);
            m();
        }
    }

    private void d(boolean z8) {
        if (z8 == this.f6999J) {
            return;
        }
        this.f6999J = z8;
        lh lhVar = this.f7026y;
        int i9 = lhVar.f8835e;
        if (!z8 && i9 != 4 && i9 != 1) {
            this.f7012i.c(2);
        } else {
            this.f7026y = lhVar.b(z8);
        }
    }

    public void f(boolean z8) {
        this.f7012i.a(12, z8 ? 1 : 0, 0).a();
    }

    private void a(li liVar) {
        if (c(liVar)) {
            this.f7017p.a(liVar);
            b(liVar);
            liVar.f();
            this.f7000K--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.b(long, long):void");
    }

    private void a(boolean z8, boolean z9) {
        a(z8 || !this.f6997H, false, true, false);
        this.f7027z.a(z9 ? 1 : 0);
        this.f7010g.c();
        c(1);
    }

    private void a(go goVar, wd.a aVar, go goVar2, wd.a aVar2, long j7) {
        if (!goVar.c() && a(goVar, aVar)) {
            goVar.a(goVar.a(aVar.f11475a, this.m).f7934c, this.l);
            this.f7023v.a((od.f) yp.a(this.l.l));
            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.f7023v.a(a(goVar, aVar.f11475a, j7));
                return;
            }
            if (yp.a(!goVar2.c() ? goVar2.a(goVar2.a(aVar2.f11475a, this.m).f7934c, this.l).f7947a : null, this.l.f7947a)) {
                return;
            }
            this.f7023v.a(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            return;
        }
        float f9 = this.f7017p.a().f9208a;
        mh mhVar = this.f7026y.f8842n;
        if (f9 != mhVar.f9208a) {
            this.f7017p.a(mhVar);
        }
    }

    private void a(int i9, boolean z8) {
        li liVar = this.f7006a[i9];
        if (c(liVar)) {
            return;
        }
        sd f9 = this.f7021t.f();
        boolean z9 = f9 == this.f7021t.e();
        xo i10 = f9.i();
        ni niVar = i10.b[i9];
        d9[] a6 = a(i10.f12288c[i9]);
        boolean z10 = E() && this.f7026y.f8835e == 3;
        boolean z11 = !z8 && z10;
        this.f7000K++;
        this.b.add(liVar);
        liVar.a(niVar, a6, f9.f10630c[i9], this.f7002M, z11, z9, f9.g(), f9.f());
        liVar.a(11, new a());
        this.f7017p.b(liVar);
        if (z10) {
            liVar.start();
        }
    }

    private void b(boolean z8) {
        for (sd e4 = this.f7021t.e(); e4 != null; e4 = e4.d()) {
            for (f8 f8Var : e4.i().f12288c) {
                if (f8Var != null) {
                    f8Var.a(z8);
                }
            }
        }
    }

    public void b(int i9, int i10, tj tjVar) {
        this.f7012i.a(20, i9, i10, tjVar).a();
    }

    private void b(mh mhVar) {
        this.f7017p.a(mhVar);
        a(this.f7017p.a(), true);
    }

    private void b(int i9) {
        this.f6995F = i9;
        if (!this.f7021t.a(this.f7026y.f8832a, i9)) {
            c(true);
        }
        a(false);
    }

    private void a(qo qoVar, xo xoVar) {
        this.f7010g.a(this.f7006a, qoVar, xoVar.f12288c);
    }

    private void a(boolean[] zArr) {
        sd f9 = this.f7021t.f();
        xo i9 = f9.i();
        for (int i10 = 0; i10 < this.f7006a.length; i10++) {
            if (!i9.a(i10) && this.b.remove(this.f7006a[i10])) {
                this.f7006a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f7006a.length; i11++) {
            if (i9.a(i11)) {
                a(i11, zArr[i11]);
            }
        }
        f9.f10634g = true;
    }

    private void c(rd rdVar) {
        if (this.f7021t.a(rdVar)) {
            sd d2 = this.f7021t.d();
            d2.a(this.f7017p.a().f9208a, this.f7026y.f8832a);
            a(d2.h(), d2.i());
            if (d2 == this.f7021t.e()) {
                c(d2.f10633f.b);
                d();
                lh lhVar = this.f7026y;
                wd.a aVar = lhVar.b;
                long j7 = d2.f10633f.b;
                this.f7026y = a(aVar, j7, lhVar.f8833c, j7, false, 5);
            }
            m();
        }
    }

    public void a(long j7) {
        this.f7005Q = j7;
    }

    private void a(float f9) {
        for (sd e4 = this.f7021t.e(); e4 != null; e4 = e4.d()) {
            for (f8 f8Var : e4.i().f12288c) {
                if (f8Var != null) {
                    f8Var.a(f9);
                }
            }
        }
    }

    private synchronized void a(Supplier supplier, long j7) {
        long c9 = this.f7019r.c() + j7;
        boolean z8 = false;
        while (!((Boolean) supplier.get()).booleanValue() && j7 > 0) {
            try {
                this.f7019r.b();
                wait(j7);
            } catch (InterruptedException unused) {
                z8 = true;
            }
            j7 = c9 - this.f7019r.c();
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean c(li liVar) {
        return liVar.b() != 0;
    }

    public /* synthetic */ void c(oh ohVar) {
        try {
            b(ohVar);
        } catch (y7 e4) {
            kc.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
            throw new RuntimeException(e4);
        }
    }

    private ab a(f8[] f8VarArr) {
        ab.a aVar = new ab.a();
        boolean z8 = false;
        for (f8 f8Var : f8VarArr) {
            if (f8Var != null) {
                we weVar = f8Var.a(0).f7210k;
                if (weVar == null) {
                    aVar.b(new we(new we.b[0]));
                } else {
                    aVar.b(weVar);
                    z8 = true;
                }
            }
        }
        return z8 ? aVar.a() : ab.h();
    }

    private void c(long j7) {
        sd e4 = this.f7021t.e();
        if (e4 != null) {
            j7 = e4.e(j7);
        }
        this.f7002M = j7;
        this.f7017p.a(j7);
        for (li liVar : this.f7006a) {
            if (c(liVar)) {
                liVar.a(this.f7002M);
            }
        }
        t();
    }

    private static d9[] a(f8 f8Var) {
        int b8 = f8Var != null ? f8Var.b() : 0;
        d9[] d9VarArr = new d9[b8];
        for (int i9 = 0; i9 < b8; i9++) {
            d9VarArr[i9] = f8Var.a(i9);
        }
        return d9VarArr;
    }

    private void c(long j7, long j9) {
        this.f7012i.b(2);
        this.f7012i.a(2, j7 + j9);
    }

    private long a(go goVar, Object obj, long j7) {
        goVar.a(goVar.a(obj, this.m).f7934c, this.l);
        go.d dVar = this.l;
        if (dVar.f7951g != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && dVar.e()) {
            go.d dVar2 = this.l;
            if (dVar2.f7954j) {
                return AbstractC0744r2.a(dVar2.a() - this.l.f7951g) - (this.m.e() + j7);
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private void c(boolean z8) {
        wd.a aVar = this.f7021t.e().f10633f.f11582a;
        long a6 = a(aVar, this.f7026y.f8847s, true, false);
        if (a6 != this.f7026y.f8847s) {
            lh lhVar = this.f7026y;
            this.f7026y = a(aVar, a6, lhVar.f8833c, lhVar.f8834d, z8, 5);
        }
    }

    private Pair a(go goVar) {
        long j7 = 0;
        if (goVar.c()) {
            return Pair.create(lh.a(), 0L);
        }
        Pair a6 = goVar.a(this.l, this.m, goVar.a(this.f6996G), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        wd.a a9 = this.f7021t.a(goVar, a6.first, 0L);
        long longValue = ((Long) a6.second).longValue();
        if (a9.a()) {
            goVar.a(a9.f11475a, this.m);
            if (a9.f11476c == this.m.d(a9.b)) {
                j7 = this.m.b();
            }
        } else {
            j7 = longValue;
        }
        return Pair.create(a9, Long.valueOf(j7));
    }

    private void c(int i9) {
        lh lhVar = this.f7026y;
        if (lhVar.f8835e != i9) {
            this.f7026y = lhVar.a(i9);
        }
    }

    private void a(IOException iOException, int i9) {
        y7 a6 = y7.a(iOException, i9);
        sd e4 = this.f7021t.e();
        if (e4 != null) {
            a6 = a6.a(e4.f10633f.f11582a);
        }
        kc.a("ExoPlayerImplInternal", "Playback error", a6);
        a(false, false);
        this.f7026y = this.f7026y.a(a6);
    }

    private void a(boolean z8) {
        long c9;
        sd d2 = this.f7021t.d();
        wd.a aVar = d2 == null ? this.f7026y.b : d2.f10633f.f11582a;
        boolean z9 = !this.f7026y.f8841k.equals(aVar);
        if (z9) {
            this.f7026y = this.f7026y.a(aVar);
        }
        lh lhVar = this.f7026y;
        if (d2 == null) {
            c9 = lhVar.f8847s;
        } else {
            c9 = d2.c();
        }
        lhVar.f8845q = c9;
        this.f7026y.f8846r = h();
        if ((z9 || z8) && d2 != null && d2.f10631d) {
            a(d2.h(), d2.i());
        }
    }

    private void a(go goVar, boolean z8) {
        int i9;
        int i10;
        boolean z9;
        g a6 = a(goVar, this.f7026y, this.f7001L, this.f7021t, this.f6995F, this.f6996G, this.l, this.m);
        wd.a aVar = a6.f7041a;
        long j7 = a6.f7042c;
        boolean z10 = a6.f7043d;
        long j9 = a6.b;
        boolean z11 = (this.f7026y.b.equals(aVar) && j9 == this.f7026y.f8847s) ? false : true;
        h hVar = null;
        long j10 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        try {
            if (a6.f7044e) {
                if (this.f7026y.f8835e != 1) {
                    c(4);
                }
                a(false, false, false, true);
            }
            try {
                if (!z11) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        i9 = 4;
                    }
                    try {
                        i10 = 4;
                        z9 = false;
                        if (!this.f7021t.a(goVar, this.f7002M, f())) {
                            c(false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i9 = 4;
                        hVar = null;
                        lh lhVar = this.f7026y;
                        go goVar2 = lhVar.f8832a;
                        wd.a aVar2 = lhVar.b;
                        if (a6.f7045f) {
                            j10 = j9;
                        }
                        h hVar2 = hVar;
                        a(goVar, aVar, goVar2, aVar2, j10);
                        if (z11 || j7 != this.f7026y.f8833c) {
                            lh lhVar2 = this.f7026y;
                            Object obj = lhVar2.b.f11475a;
                            go goVar3 = lhVar2.f8832a;
                            this.f7026y = a(aVar, j9, j7, this.f7026y.f8834d, z11 && z8 && !goVar3.c() && !goVar3.a(obj, this.m).f7937g, goVar.a(obj) == -1 ? i9 : 3);
                        }
                        B();
                        a(goVar, this.f7026y.f8832a);
                        this.f7026y = this.f7026y.a(goVar);
                        if (!goVar.c()) {
                            this.f7001L = hVar2;
                        }
                        a(false);
                        throw th;
                    }
                } else {
                    i10 = 4;
                    z9 = false;
                    if (!goVar.c()) {
                        for (sd e4 = this.f7021t.e(); e4 != null; e4 = e4.d()) {
                            if (e4.f10633f.f11582a.equals(aVar)) {
                                e4.f10633f = this.f7021t.a(goVar, e4.f10633f);
                                e4.m();
                            }
                        }
                        j9 = a(aVar, j9, z10);
                    }
                }
                lh lhVar3 = this.f7026y;
                a(goVar, aVar, lhVar3.f8832a, lhVar3.b, a6.f7045f ? j9 : -9223372036854775807L);
                if (z11 || j7 != this.f7026y.f8833c) {
                    lh lhVar4 = this.f7026y;
                    Object obj2 = lhVar4.b.f11475a;
                    go goVar4 = lhVar4.f8832a;
                    this.f7026y = a(aVar, j9, j7, this.f7026y.f8834d, (!z11 || !z8 || goVar4.c() || goVar4.a(obj2, this.m).f7937g) ? z9 : true, goVar.a(obj2) == -1 ? i10 : 3);
                }
                B();
                a(goVar, this.f7026y.f8832a);
                this.f7026y = this.f7026y.a(goVar);
                if (!goVar.c()) {
                    this.f7001L = null;
                }
                a(z9);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i9 = 4;
        }
    }

    private void a(mh mhVar, float f9, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                this.f7027z.a(1);
            }
            this.f7026y = this.f7026y.a(mhVar);
        }
        a(mhVar.f9208a);
        for (li liVar : this.f7006a) {
            if (liVar != null) {
                liVar.a(f9, mhVar.f9208a);
            }
        }
    }

    private void a(mh mhVar, boolean z8) {
        a(mhVar, mhVar.f9208a, true, z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    private lh a(wd.a aVar, long j7, long j9, long j10, boolean z8, int i9) {
        ab abVar;
        qo qoVar;
        xo xoVar;
        qo h6;
        xo i10;
        this.O = (!this.O && j7 == this.f7026y.f8847s && aVar.equals(this.f7026y.b)) ? false : true;
        B();
        lh lhVar = this.f7026y;
        qo qoVar2 = lhVar.f8838h;
        xo xoVar2 = lhVar.f8839i;
        ?? r12 = lhVar.f8840j;
        if (this.f7022u.d()) {
            sd e4 = this.f7021t.e();
            if (e4 == null) {
                h6 = qo.f10419d;
            } else {
                h6 = e4.h();
            }
            if (e4 == null) {
                i10 = this.f7009f;
            } else {
                i10 = e4.i();
            }
            ab a6 = a(i10.f12288c);
            if (e4 != null) {
                ud udVar = e4.f10633f;
                if (udVar.f11583c != j9) {
                    e4.f10633f = udVar.a(j9);
                }
            }
            qoVar = h6;
            xoVar = i10;
            abVar = a6;
        } else if (aVar.equals(this.f7026y.b)) {
            abVar = r12;
            qoVar = qoVar2;
            xoVar = xoVar2;
        } else {
            qoVar = qo.f10419d;
            xoVar = this.f7009f;
            abVar = ab.h();
        }
        if (z8) {
            this.f7027z.c(i9);
        }
        return this.f7026y.a(aVar, j7, j9, j10, h(), qoVar, xoVar, abVar);
    }

    private boolean a(li liVar, sd sdVar) {
        sd d2 = sdVar.d();
        return sdVar.f10633f.f11586f && d2.f10631d && ((liVar instanceof co) || liVar.i() >= d2.g());
    }

    private static boolean a(lh lhVar, go.b bVar) {
        wd.a aVar = lhVar.b;
        go goVar = lhVar.f8832a;
        return goVar.c() || goVar.a(aVar.f11475a, bVar).f7937g;
    }

    private boolean a(long j7, long j9) {
        if (this.f6999J && this.f6998I) {
            return false;
        }
        c(j7, j9);
        return true;
    }

    private void a(c cVar) {
        this.f7027z.a(1);
        throw null;
    }

    @Override // com.applovin.impl.f6.a
    public void a(mh mhVar) {
        this.f7012i.a(16, mhVar).a();
    }

    @Override // com.applovin.impl.ae.d
    public void a() {
        this.f7012i.c(22);
    }

    @Override // com.applovin.impl.rd.a
    public void a(rd rdVar) {
        this.f7012i.a(8, rdVar).a();
    }

    private void a(int i9, int i10, tj tjVar) {
        this.f7027z.a(1);
        a(this.f7022u.a(i9, i10, tjVar), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(boolean, boolean, boolean, boolean):void");
    }

    private static void a(go goVar, d dVar, go.d dVar2, go.b bVar) {
        int i9 = goVar.a(goVar.a(dVar.f7034d, bVar).f7934c, dVar2).f7959q;
        Object obj = goVar.a(i9, bVar, true).b;
        long j7 = bVar.f7935d;
        dVar.a(i9, j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j7 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean a(d dVar, go goVar, go goVar2, int i9, boolean z8, go.d dVar2, go.b bVar) {
        Object obj = dVar.f7034d;
        if (obj == null) {
            Pair a6 = a(goVar, new h(dVar.f7032a.f(), dVar.f7032a.h(), dVar.f7032a.d() == Long.MIN_VALUE ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : AbstractC0744r2.a(dVar.f7032a.d())), false, i9, z8, dVar2, bVar);
            if (a6 == null) {
                return false;
            }
            dVar.a(goVar.a(a6.first), ((Long) a6.second).longValue(), a6.first);
            if (dVar.f7032a.d() == Long.MIN_VALUE) {
                a(goVar, dVar, dVar2, bVar);
            }
            return true;
        }
        int a9 = goVar.a(obj);
        if (a9 == -1) {
            return false;
        }
        if (dVar.f7032a.d() == Long.MIN_VALUE) {
            a(goVar, dVar, dVar2, bVar);
            return true;
        }
        dVar.b = a9;
        goVar2.a(dVar.f7034d, bVar);
        if (bVar.f7937g && goVar2.a(bVar.f7934c, dVar2).f7958p == goVar2.a(dVar.f7034d)) {
            Pair a10 = goVar.a(dVar2, bVar, goVar.a(dVar.f7034d, bVar).f7934c, bVar.e() + dVar.f7033c);
            dVar.a(goVar.a(a10.first), ((Long) a10.second).longValue(), a10.first);
        }
        return true;
    }

    private void a(go goVar, go goVar2) {
        if (goVar.c() && goVar2.c()) {
            return;
        }
        for (int size = this.f7018q.size() - 1; size >= 0; size--) {
            if (!a((d) this.f7018q.get(size), goVar, goVar2, this.f6995F, this.f6996G, this.l, this.m)) {
                ((d) this.f7018q.get(size)).f7032a.a(false);
                this.f7018q.remove(size);
            }
        }
        Collections.sort(this.f7018q);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.c8.g a(com.applovin.impl.go r30, com.applovin.impl.lh r31, com.applovin.impl.c8.h r32, com.applovin.impl.vd r33, int r34, boolean r35, com.applovin.impl.go.d r36, com.applovin.impl.go.b r37) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(com.applovin.impl.go, com.applovin.impl.lh, com.applovin.impl.c8$h, com.applovin.impl.vd, int, boolean, com.applovin.impl.go$d, com.applovin.impl.go$b):com.applovin.impl.c8$g");
    }

    private static Pair a(go goVar, h hVar, boolean z8, int i9, boolean z9, go.d dVar, go.b bVar) {
        Pair a6;
        Object a9;
        go goVar2 = hVar.f7046a;
        if (goVar.c()) {
            return null;
        }
        go goVar3 = goVar2.c() ? goVar : goVar2;
        try {
            a6 = goVar3.a(dVar, bVar, hVar.b, hVar.f7047c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (goVar.equals(goVar3)) {
            return a6;
        }
        if (goVar.a(a6.first) != -1) {
            return (goVar3.a(a6.first, bVar).f7937g && goVar3.a(bVar.f7934c, dVar).f7958p == goVar3.a(a6.first)) ? goVar.a(dVar, bVar, goVar.a(a6.first, bVar).f7934c, hVar.f7047c) : a6;
        }
        if (z8 && (a9 = a(dVar, bVar, i9, z9, a6.first, goVar3, goVar)) != null) {
            return goVar.a(dVar, bVar, goVar.a(a9, bVar).f7934c, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        }
        return null;
    }

    public static Object a(go.d dVar, go.b bVar, int i9, boolean z8, Object obj, go goVar, go goVar2) {
        int a6 = goVar.a(obj);
        int a9 = goVar.a();
        int i10 = a6;
        int i11 = -1;
        for (int i12 = 0; i12 < a9 && i11 == -1; i12++) {
            i10 = goVar.a(i10, bVar, dVar, i9, z8);
            if (i10 == -1) {
                break;
            }
            i11 = goVar2.a(goVar.b(i10));
        }
        if (i11 == -1) {
            return null;
        }
        return goVar2.b(i11);
    }

    public void a(go goVar, int i9, long j7) {
        this.f7012i.a(3, new h(goVar, i9, j7)).a();
    }

    private void a(h hVar) {
        long j7;
        long j9;
        boolean z8;
        wd.a aVar;
        long j10;
        long j11;
        long j12;
        lh lhVar;
        int i9;
        this.f7027z.a(1);
        Pair a6 = a(this.f7026y.f8832a, hVar, true, this.f6995F, this.f6996G, this.l, this.m);
        if (a6 == null) {
            Pair a9 = a(this.f7026y.f8832a);
            aVar = (wd.a) a9.first;
            long longValue = ((Long) a9.second).longValue();
            z8 = !this.f7026y.f8832a.c();
            j7 = longValue;
            j9 = -9223372036854775807L;
        } else {
            Object obj = a6.first;
            long longValue2 = ((Long) a6.second).longValue();
            long j13 = hVar.f7047c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? -9223372036854775807L : longValue2;
            wd.a a10 = this.f7021t.a(this.f7026y.f8832a, obj, longValue2);
            if (a10.a()) {
                this.f7026y.f8832a.a(a10.f11475a, this.m);
                longValue2 = this.m.d(a10.b) == a10.f11476c ? this.m.b() : 0L;
            } else if (hVar.f7047c != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                j7 = longValue2;
                j9 = j13;
                z8 = false;
                aVar = a10;
            }
            j7 = longValue2;
            j9 = j13;
            aVar = a10;
            z8 = true;
        }
        try {
            if (this.f7026y.f8832a.c()) {
                this.f7001L = hVar;
            } else if (a6 == null) {
                if (this.f7026y.f8835e != 1) {
                    c(4);
                }
                a(false, true, false, true);
            } else {
                if (aVar.equals(this.f7026y.b)) {
                    sd e4 = this.f7021t.e();
                    j11 = (e4 == null || !e4.f10631d || j7 == 0) ? j7 : e4.f10629a.a(j7, this.f7025x);
                    if (AbstractC0744r2.b(j11) == AbstractC0744r2.b(this.f7026y.f8847s) && ((i9 = (lhVar = this.f7026y).f8835e) == 2 || i9 == 3)) {
                        long j14 = lhVar.f8847s;
                        this.f7026y = a(aVar, j14, j9, j14, z8, 2);
                        return;
                    }
                } else {
                    j11 = j7;
                }
                long a11 = a(aVar, j11, this.f7026y.f8835e == 4);
                boolean z9 = (j7 != a11) | z8;
                try {
                    lh lhVar2 = this.f7026y;
                    go goVar = lhVar2.f8832a;
                    a(goVar, aVar, goVar, lhVar2.b, j9);
                    z8 = z9;
                    j12 = a11;
                    this.f7026y = a(aVar, j12, j9, j12, z8, 2);
                } catch (Throwable th) {
                    th = th;
                    z8 = z9;
                    j10 = a11;
                    this.f7026y = a(aVar, j10, j9, j10, z8, 2);
                    throw th;
                }
            }
            j12 = j7;
            this.f7026y = a(aVar, j12, j9, j12, z8, 2);
        } catch (Throwable th2) {
            th = th2;
            j10 = j7;
        }
    }

    private long a(wd.a aVar, long j7, boolean z8) {
        return a(aVar, j7, this.f7021t.e() != this.f7021t.f(), z8);
    }

    private long a(wd.a aVar, long j7, boolean z8, boolean z9) {
        H();
        this.f6993D = false;
        if (z9 || this.f7026y.f8835e == 3) {
            c(2);
        }
        sd e4 = this.f7021t.e();
        sd sdVar = e4;
        while (sdVar != null && !aVar.equals(sdVar.f10633f.f11582a)) {
            sdVar = sdVar.d();
        }
        if (z8 || e4 != sdVar || (sdVar != null && sdVar.e(j7) < 0)) {
            for (li liVar : this.f7006a) {
                a(liVar);
            }
            if (sdVar != null) {
                while (this.f7021t.e() != sdVar) {
                    this.f7021t.a();
                }
                this.f7021t.a(sdVar);
                sdVar.c(0L);
                d();
            }
        }
        if (sdVar != null) {
            this.f7021t.a(sdVar);
            if (!sdVar.f10631d) {
                sdVar.f10633f = sdVar.f10633f.b(j7);
            } else if (sdVar.f10632e) {
                j7 = sdVar.f10629a.a(j7);
                sdVar.f10629a.a(j7 - this.f7015n, this.f7016o);
            }
            c(j7);
            m();
        } else {
            this.f7021t.c();
            c(j7);
        }
        a(false);
        this.f7012i.c(2);
        return j7;
    }

    @Override // com.applovin.impl.oh.a
    public synchronized void a(oh ohVar) {
        if (!this.f6990A && this.f7013j.isAlive()) {
            this.f7012i.a(14, ohVar).a();
            return;
        }
        kc.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ohVar.a(false);
    }

    private void a(li liVar, long j7) {
        liVar.g();
        if (liVar instanceof co) {
            ((co) liVar).c(j7);
        }
    }

    private void a(boolean z8, AtomicBoolean atomicBoolean) {
        if (this.f6997H != z8) {
            this.f6997H = z8;
            if (!z8) {
                for (li liVar : this.f7006a) {
                    if (!c(liVar) && this.b.remove(liVar)) {
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
        this.f7027z.a(1);
        if (bVar.f7030c != -1) {
            this.f7001L = new h(new ph(bVar.f7029a, bVar.b), bVar.f7030c, bVar.f7031d);
        }
        a(this.f7022u.a(bVar.f7029a, bVar.b), false);
    }

    public void a(List list, int i9, long j7, tj tjVar) {
        this.f7012i.a(17, new b(list, tjVar, i9, j7, null)).a();
    }

    public void a(boolean z8, int i9) {
        this.f7012i.a(1, z8 ? 1 : 0, i9).a();
    }

    private void a(boolean z8, int i9, boolean z9, int i10) {
        this.f7027z.a(z9 ? 1 : 0);
        this.f7027z.b(i10);
        this.f7026y = this.f7026y.a(z8, i9);
        this.f6993D = false;
        b(z8);
        if (!E()) {
            H();
            K();
            return;
        }
        int i11 = this.f7026y.f8835e;
        if (i11 == 3) {
            F();
            this.f7012i.c(2);
        } else if (i11 == 2) {
            this.f7012i.c(2);
        }
    }

    public void a(int i9) {
        this.f7012i.a(11, i9, 0).a();
    }

    private void a(fj fjVar) {
        this.f7025x = fjVar;
    }
}
