package com.applovin.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.be;
import com.applovin.impl.bf;
import com.applovin.impl.eb;
import com.applovin.impl.fe;
import com.applovin.impl.fo;
import com.applovin.impl.h6;
import com.applovin.impl.qi;
import com.applovin.impl.rh;
import com.applovin.impl.td;
import com.applovin.impl.vo;
import com.applovin.impl.wd;
import com.applovin.impl.z6;
import com.facebook.ads.AdError;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e8 implements Handler.Callback, wd.a, vo.a, fe.d, h6.a, rh.a {
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
    private a8 P;
    private long Q;

    /* renamed from: a */
    private final qi[] f23614a;

    /* renamed from: b */
    private final Set f23615b;

    /* renamed from: c */
    private final ri[] f23616c;
    private final vo d;

    /* renamed from: f */
    private final wo f23617f;

    /* renamed from: g */
    private final lc f23618g;

    /* renamed from: h */
    private final y1 f23619h;

    /* renamed from: i */
    private final ja f23620i;

    /* renamed from: j */
    private final HandlerThread f23621j;

    /* renamed from: k */
    private final Looper f23622k;

    /* renamed from: l */
    private final fo.d f23623l;

    /* renamed from: m */
    private final fo.b f23624m;

    /* renamed from: n */
    private final long f23625n;

    /* renamed from: o */
    private final boolean f23626o;

    /* renamed from: p */
    private final h6 f23627p;

    /* renamed from: q */
    private final ArrayList f23628q;

    /* renamed from: r */
    private final l3 f23629r;

    /* renamed from: s */
    private final f f23630s;

    /* renamed from: t */
    private final ae f23631t;

    /* renamed from: u */
    private final fe f23632u;

    /* renamed from: v */
    private final kc f23633v;
    private final long w;
    private jj x;

    /* renamed from: y */
    private oh f23634y;

    /* renamed from: z */
    private e f23635z;

    /* loaded from: classes.dex */
    public class a implements qi.a {
        public a() {
        }

        @Override // com.applovin.impl.qi.a
        public void a(long j2) {
            if (j2 >= 2000) {
                e8.this.I = true;
            }
        }

        @Override // com.applovin.impl.qi.a
        public void a() {
            e8.this.f23620i.c(2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List f23637a;

        /* renamed from: b */
        private final wj f23638b;

        /* renamed from: c */
        private final int f23639c;
        private final long d;

        private b(List list, wj wjVar, int i2, long j2) {
            this.f23637a = list;
            this.f23638b = wjVar;
            this.f23639c = i2;
            this.d = j2;
        }

        public /* synthetic */ b(List list, wj wjVar, int i2, long j2, a aVar) {
            this(list, wjVar, i2, j2);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final rh f23640a;

        /* renamed from: b */
        public int f23641b;

        /* renamed from: c */
        public long f23642c;
        public Object d;

        public d(rh rhVar) {
            this.f23640a = rhVar;
        }

        public void a(int i2, long j2, Object obj) {
            this.f23641b = i2;
            this.f23642c = j2;
            this.d = obj;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.d;
            if ((obj == null) != (dVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i2 = this.f23641b - dVar.f23641b;
            return i2 != 0 ? i2 : xp.a(this.f23642c, dVar.f23642c);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        private boolean f23643a;

        /* renamed from: b */
        public oh f23644b;

        /* renamed from: c */
        public int f23645c;
        public boolean d;
        public int e;

        /* renamed from: f */
        public boolean f23646f;

        /* renamed from: g */
        public int f23647g;

        public e(oh ohVar) {
            this.f23644b = ohVar;
        }

        public void a(int i2) {
            this.f23643a |= i2 > 0;
            this.f23645c += i2;
        }

        public void b(int i2) {
            this.f23643a = true;
            this.f23646f = true;
            this.f23647g = i2;
        }

        public void c(int i2) {
            if (this.d && this.e != 5) {
                b1.a(i2 == 5);
                return;
            }
            this.f23643a = true;
            this.d = true;
            this.e = i2;
        }

        public void a(oh ohVar) {
            this.f23643a |= this.f23644b != ohVar;
            this.f23644b = ohVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final be.a f23648a;

        /* renamed from: b */
        public final long f23649b;

        /* renamed from: c */
        public final long f23650c;
        public final boolean d;
        public final boolean e;

        /* renamed from: f */
        public final boolean f23651f;

        public g(be.a aVar, long j2, long j3, boolean z2, boolean z3, boolean z4) {
            this.f23648a = aVar;
            this.f23649b = j2;
            this.f23650c = j3;
            this.d = z2;
            this.e = z3;
            this.f23651f = z4;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final fo f23652a;

        /* renamed from: b */
        public final int f23653b;

        /* renamed from: c */
        public final long f23654c;

        public h(fo foVar, int i2, long j2) {
            this.f23652a = foVar;
            this.f23653b = i2;
            this.f23654c = j2;
        }
    }

    public e8(qi[] qiVarArr, vo voVar, wo woVar, lc lcVar, y1 y1Var, int i2, boolean z2, r0 r0Var, jj jjVar, kc kcVar, long j2, boolean z3, Looper looper, l3 l3Var, f fVar) {
        this.f23630s = fVar;
        this.f23614a = qiVarArr;
        this.d = voVar;
        this.f23617f = woVar;
        this.f23618g = lcVar;
        this.f23619h = y1Var;
        this.F = i2;
        this.G = z2;
        this.x = jjVar;
        this.f23633v = kcVar;
        this.w = j2;
        this.Q = j2;
        this.B = z3;
        this.f23629r = l3Var;
        this.f23625n = lcVar.d();
        this.f23626o = lcVar.a();
        oh a2 = oh.a(woVar);
        this.f23634y = a2;
        this.f23635z = new e(a2);
        this.f23616c = new ri[qiVarArr.length];
        for (int i3 = 0; i3 < qiVarArr.length; i3++) {
            qiVarArr[i3].b(i3);
            this.f23616c[i3] = qiVarArr[i3].n();
        }
        this.f23627p = new h6(this, l3Var);
        this.f23628q = new ArrayList();
        this.f23615b = rj.b();
        this.f23623l = new fo.d();
        this.f23624m = new fo.b();
        voVar.a(this, y1Var);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f23631t = new ae(r0Var, handler);
        this.f23632u = new fe(this, r0Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f23621j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f23622k = looper2;
        this.f23620i = l3Var.a(looper2, this);
    }

    private void A() {
        float f2 = this.f23627p.a().f26059a;
        xd f3 = this.f23631t.f();
        boolean z2 = true;
        for (xd e2 = this.f23631t.e(); e2 != null && e2.d; e2 = e2.d()) {
            wo b2 = e2.b(f2, this.f23634y.f25867a);
            if (!b2.a(e2.i())) {
                if (z2) {
                    xd e3 = this.f23631t.e();
                    boolean a2 = this.f23631t.a(e3);
                    boolean[] zArr = new boolean[this.f23614a.length];
                    long a3 = e3.a(b2, this.f23634y.f25883s, a2, zArr);
                    oh ohVar = this.f23634y;
                    boolean z3 = (ohVar.e == 4 || a3 == ohVar.f25883s) ? false : true;
                    oh ohVar2 = this.f23634y;
                    this.f23634y = a(ohVar2.f25868b, a3, ohVar2.f25869c, ohVar2.d, z3, 5);
                    if (z3) {
                        c(a3);
                    }
                    boolean[] zArr2 = new boolean[this.f23614a.length];
                    int i2 = 0;
                    while (true) {
                        qi[] qiVarArr = this.f23614a;
                        if (i2 >= qiVarArr.length) {
                            break;
                        }
                        qi qiVar = qiVarArr[i2];
                        boolean c2 = c(qiVar);
                        zArr2[i2] = c2;
                        cj cjVar = e3.f27894c[i2];
                        if (c2) {
                            if (cjVar != qiVar.o()) {
                                a(qiVar);
                            } else if (zArr[i2]) {
                                qiVar.a(this.M);
                            }
                        }
                        i2++;
                    }
                    a(zArr2);
                } else {
                    this.f23631t.a(e2);
                    if (e2.d) {
                        e2.a(b2, Math.max(e2.f27895f.f28323b, e2.d(this.M)), false);
                    }
                }
                a(true);
                if (this.f23634y.e != 4) {
                    m();
                    K();
                    this.f23620i.c(2);
                    return;
                }
                return;
            }
            if (e2 == f3) {
                z2 = false;
            }
        }
    }

    private void B() {
        xd e2 = this.f23631t.e();
        this.C = e2 != null && e2.f27895f.f28327h && this.B;
    }

    private boolean C() {
        xd e2;
        xd d2;
        return E() && !this.C && (e2 = this.f23631t.e()) != null && (d2 = e2.d()) != null && this.M >= d2.g() && d2.f27896g;
    }

    private boolean D() {
        if (!j()) {
            return false;
        }
        xd d2 = this.f23631t.d();
        return this.f23618g.a(d2 == this.f23631t.e() ? d2.d(this.M) : d2.d(this.M) - d2.f27895f.f28323b, b(d2.e()), this.f23627p.a().f26059a);
    }

    private boolean E() {
        oh ohVar = this.f23634y;
        return ohVar.f25876l && ohVar.f25877m == 0;
    }

    private void F() {
        this.D = false;
        this.f23627p.b();
        for (qi qiVar : this.f23614a) {
            if (c(qiVar)) {
                qiVar.start();
            }
        }
    }

    private void H() {
        this.f23627p.c();
        for (qi qiVar : this.f23614a) {
            if (c(qiVar)) {
                b(qiVar);
            }
        }
    }

    private void I() {
        xd d2 = this.f23631t.d();
        boolean z2 = this.E || (d2 != null && d2.f27892a.a());
        oh ohVar = this.f23634y;
        if (z2 != ohVar.f25871g) {
            this.f23634y = ohVar.a(z2);
        }
    }

    private void J() {
        if (this.f23634y.f25867a.c() || !this.f23632u.d()) {
            return;
        }
        o();
        q();
        r();
        p();
    }

    private void K() {
        xd e2 = this.f23631t.e();
        if (e2 == null) {
            return;
        }
        long h2 = e2.d ? e2.f27892a.h() : -9223372036854775807L;
        if (h2 != -9223372036854775807L) {
            c(h2);
            if (h2 != this.f23634y.f25883s) {
                oh ohVar = this.f23634y;
                this.f23634y = a(ohVar.f25868b, h2, ohVar.f25869c, h2, true, 5);
            }
        } else {
            long b2 = this.f23627p.b(e2 != this.f23631t.f());
            this.M = b2;
            long d2 = e2.d(b2);
            b(this.f23634y.f25883s, d2);
            this.f23634y.f25883s = d2;
        }
        this.f23634y.f25881q = this.f23631t.d().c();
        this.f23634y.f25882r = h();
        oh ohVar2 = this.f23634y;
        if (ohVar2.f25876l && ohVar2.e == 3 && a(ohVar2.f25867a, ohVar2.f25868b) && this.f23634y.f25878n.f26059a == 1.0f) {
            float a2 = this.f23633v.a(e(), h());
            if (this.f23627p.a().f26059a != a2) {
                this.f23627p.a(this.f23634y.f25878n.a(a2));
                a(this.f23634y.f25878n, this.f23627p.a().f26059a, false, false);
            }
        }
    }

    private void d() {
        a(new boolean[this.f23614a.length]);
    }

    private long e() {
        oh ohVar = this.f23634y;
        return a(ohVar.f25867a, ohVar.f25868b.f28191a, ohVar.f25883s);
    }

    private long f() {
        xd f2 = this.f23631t.f();
        if (f2 == null) {
            return 0L;
        }
        long f3 = f2.f();
        if (!f2.d) {
            return f3;
        }
        int i2 = 0;
        while (true) {
            qi[] qiVarArr = this.f23614a;
            if (i2 >= qiVarArr.length) {
                return f3;
            }
            if (c(qiVarArr[i2]) && this.f23614a[i2].o() == f2.f27894c[i2]) {
                long i3 = this.f23614a[i2].i();
                if (i3 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                f3 = Math.max(i3, f3);
            }
            i2++;
        }
    }

    private long h() {
        return b(this.f23634y.f25881q);
    }

    private boolean i() {
        xd f2 = this.f23631t.f();
        if (!f2.d) {
            return false;
        }
        int i2 = 0;
        while (true) {
            qi[] qiVarArr = this.f23614a;
            if (i2 >= qiVarArr.length) {
                return true;
            }
            qi qiVar = qiVarArr[i2];
            cj cjVar = f2.f27894c[i2];
            if (qiVar.o() != cjVar || (cjVar != null && !qiVar.j() && !a(qiVar, f2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    private boolean j() {
        xd d2 = this.f23631t.d();
        return (d2 == null || d2.e() == Long.MIN_VALUE) ? false : true;
    }

    private boolean k() {
        xd e2 = this.f23631t.e();
        long j2 = e2.f27895f.e;
        return e2.d && (j2 == -9223372036854775807L || this.f23634y.f25883s < j2 || !E());
    }

    public /* synthetic */ Boolean l() {
        return Boolean.valueOf(this.A);
    }

    private void m() {
        boolean D = D();
        this.E = D;
        if (D) {
            this.f23631t.d().a(this.M);
        }
        I();
    }

    private void n() {
        this.f23635z.a(this.f23634y);
        if (this.f23635z.f23643a) {
            this.f23630s.a(this.f23635z);
            this.f23635z = new e(this.f23634y);
        }
    }

    private void o() {
        zd a2;
        this.f23631t.a(this.M);
        if (this.f23631t.h() && (a2 = this.f23631t.a(this.M, this.f23634y)) != null) {
            xd a3 = this.f23631t.a(this.f23616c, this.d, this.f23618g.b(), this.f23632u, a2, this.f23617f);
            a3.f27892a.a(this, a2.f28323b);
            if (this.f23631t.e() == a3) {
                c(a3.g());
            }
            a(false);
        }
        if (!this.E) {
            m();
        } else {
            this.E = j();
            I();
        }
    }

    private void p() {
        boolean z2 = false;
        while (C()) {
            if (z2) {
                n();
            }
            xd e2 = this.f23631t.e();
            xd a2 = this.f23631t.a();
            zd zdVar = a2.f27895f;
            be.a aVar = zdVar.f28322a;
            long j2 = zdVar.f28323b;
            oh a3 = a(aVar, j2, zdVar.f28324c, j2, true, 0);
            this.f23634y = a3;
            fo foVar = a3.f25867a;
            a(foVar, a2.f27895f.f28322a, foVar, e2.f27895f.f28322a, -9223372036854775807L);
            B();
            K();
            z2 = true;
        }
    }

    private void q() {
        xd f2 = this.f23631t.f();
        if (f2 == null) {
            return;
        }
        int i2 = 0;
        if (f2.d() != null && !this.C) {
            if (i()) {
                if (f2.d().d || this.M >= f2.d().g()) {
                    wo i3 = f2.i();
                    xd b2 = this.f23631t.b();
                    wo i4 = b2.i();
                    if (b2.d && b2.f27892a.h() != -9223372036854775807L) {
                        d(b2.g());
                        return;
                    }
                    for (int i5 = 0; i5 < this.f23614a.length; i5++) {
                        boolean a2 = i3.a(i5);
                        boolean a3 = i4.a(i5);
                        if (a2 && !this.f23614a[i5].k()) {
                            boolean z2 = this.f23616c[i5].e() == -2;
                            si siVar = i3.f27777b[i5];
                            si siVar2 = i4.f27777b[i5];
                            if (!a3 || !siVar2.equals(siVar) || z2) {
                                a(this.f23614a[i5], b2.g());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!f2.f27895f.f28328i && !this.C) {
            return;
        }
        while (true) {
            qi[] qiVarArr = this.f23614a;
            if (i2 >= qiVarArr.length) {
                return;
            }
            qi qiVar = qiVarArr[i2];
            cj cjVar = f2.f27894c[i2];
            if (cjVar != null && qiVar.o() == cjVar && qiVar.j()) {
                long j2 = f2.f27895f.e;
                a(qiVar, (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? -9223372036854775807L : f2.f() + f2.f27895f.e);
            }
            i2++;
        }
    }

    private void r() {
        xd f2 = this.f23631t.f();
        if (f2 == null || this.f23631t.e() == f2 || f2.f27896g || !z()) {
            return;
        }
        d();
    }

    private void s() {
        a(this.f23632u.a(), true);
    }

    private void t() {
        for (xd e2 = this.f23631t.e(); e2 != null; e2 = e2.d()) {
            for (h8 h8Var : e2.i().f27778c) {
                if (h8Var != null) {
                    h8Var.j();
                }
            }
        }
    }

    private void u() {
        for (xd e2 = this.f23631t.e(); e2 != null; e2 = e2.d()) {
            for (h8 h8Var : e2.i().f27778c) {
                if (h8Var != null) {
                    h8Var.k();
                }
            }
        }
    }

    private void w() {
        this.f23635z.a(1);
        a(false, false, false, true);
        this.f23618g.f();
        c(this.f23634y.f25867a.c() ? 4 : 2);
        this.f23632u.a(this.f23619h.a());
        this.f23620i.c(2);
    }

    private void y() {
        a(true, false, true, false);
        this.f23618g.e();
        c(1);
        this.f23621j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private boolean z() {
        xd f2 = this.f23631t.f();
        wo i2 = f2.i();
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            qi[] qiVarArr = this.f23614a;
            if (i3 >= qiVarArr.length) {
                return !z2;
            }
            qi qiVar = qiVarArr[i3];
            if (c(qiVar)) {
                boolean z3 = qiVar.o() != f2.f27894c[i3];
                if (!i2.a(i3) || z3) {
                    if (!qiVar.k()) {
                        qiVar.a(a(i2.f27778c[i3]), f2.f27894c[i3], f2.g(), f2.f());
                    } else if (qiVar.c()) {
                        a(qiVar);
                    } else {
                        z2 = true;
                    }
                }
            }
            i3++;
        }
    }

    public void G() {
        this.f23620i.d(6).a();
    }

    public void a(long j2) {
        this.Q = j2;
    }

    public Looper g() {
        return this.f23622k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        xd f2;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    a((h) message.obj);
                    break;
                case 4:
                    b((ph) message.obj);
                    break;
                case 5:
                    a((jj) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    c((wd) message.obj);
                    break;
                case 9:
                    b((wd) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    b(message.arg1);
                    break;
                case 12:
                    g(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    d((rh) message.obj);
                    break;
                case 15:
                    f((rh) message.obj);
                    break;
                case 16:
                    a((ph) message.obj, false);
                    break;
                case 17:
                    a((b) message.obj);
                    break;
                case 18:
                    a((b) message.obj, message.arg1);
                    break;
                case 19:
                    d8.a(message.obj);
                    a((c) null);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (wj) message.obj);
                    break;
                case 21:
                    a((wj) message.obj);
                    break;
                case 22:
                    s();
                    break;
                case 23:
                    e(message.arg1 != 0);
                    break;
                case 24:
                    d(message.arg1 == 1);
                    break;
                case 25:
                    b();
                    break;
                default:
                    return false;
            }
        } catch (a8 e2) {
            e = e2;
            if (e.d == 1 && (f2 = this.f23631t.f()) != null) {
                e = e.a(f2.f27895f.f28322a);
            }
            if (e.f22710k && this.P == null) {
                pc.c("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                ja jaVar = this.f23620i;
                jaVar.a(jaVar.a(25, e));
            } else {
                a8 a8Var = this.P;
                if (a8Var != null) {
                    a8Var.addSuppressed(e);
                    e = this.P;
                }
                pc.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f23634y = this.f23634y.a(e);
            }
        } catch (dh e3) {
            int i2 = e3.f23486b;
            if (i2 == 1) {
                r2 = e3.f23485a ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else if (i2 == 4) {
                r2 = e3.f23485a ? 3002 : 3004;
            }
            a(e3, r2);
        } catch (j5 e4) {
            a(e4, e4.f24601a);
        } catch (z6.a e5) {
            a(e5, e5.f28307a);
        } catch (IOException e6) {
            a(e6, AdError.SERVER_ERROR_CODE);
        } catch (RuntimeException e7) {
            a8 a2 = a8.a(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            pc.a("ExoPlayerImplInternal", "Playback error", a2);
            a(true, false);
            this.f23634y = this.f23634y.a(a2);
        }
        n();
        return true;
    }

    public void v() {
        this.f23620i.d(0).a();
    }

    public synchronized boolean x() {
        if (!this.A && this.f23621j.isAlive()) {
            this.f23620i.c(7);
            a(new Supplier() { // from class: com.applovin.impl.ht
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    Boolean l2;
                    l2 = e8.this.l();
                    return l2;
                }
            }, this.w);
            return this.A;
        }
        return true;
    }

    private void a(jj jjVar) {
        this.x = jjVar;
    }

    private void b() {
        c(true);
    }

    private void c() {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        long a2 = this.f23629r.a();
        J();
        int i3 = this.f23634y.e;
        if (i3 != 1 && i3 != 4) {
            xd e2 = this.f23631t.e();
            if (e2 == null) {
                c(a2, 10L);
                return;
            }
            ko.a("doSomeWork");
            K();
            if (e2.d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                e2.f27892a.a(this.f23634y.f25883s - this.f23625n, this.f23626o);
                z2 = true;
                z3 = true;
                int i4 = 0;
                while (true) {
                    qi[] qiVarArr = this.f23614a;
                    if (i4 >= qiVarArr.length) {
                        break;
                    }
                    qi qiVar = qiVarArr[i4];
                    if (c(qiVar)) {
                        qiVar.a(this.M, elapsedRealtime);
                        z2 = z2 && qiVar.c();
                        boolean z5 = e2.f27894c[i4] != qiVar.o();
                        boolean z6 = z5 || (!z5 && qiVar.j()) || qiVar.d() || qiVar.c();
                        z3 = z3 && z6;
                        if (!z6) {
                            qiVar.h();
                        }
                    }
                    i4++;
                }
            } else {
                e2.f27892a.f();
                z2 = true;
                z3 = true;
            }
            long j2 = e2.f27895f.e;
            boolean z7 = z2 && e2.d && (j2 == -9223372036854775807L || j2 <= this.f23634y.f25883s);
            if (z7 && this.C) {
                this.C = false;
                a(false, this.f23634y.f25877m, false, 5);
            }
            if (z7 && e2.f27895f.f28328i) {
                c(4);
                H();
            } else if (this.f23634y.e == 2 && h(z3)) {
                c(3);
                this.P = null;
                if (E()) {
                    F();
                }
            } else if (this.f23634y.e == 3 && (this.K != 0 ? !z3 : !k())) {
                this.D = E();
                c(2);
                if (this.D) {
                    u();
                    this.f23633v.a();
                }
                H();
            }
            if (this.f23634y.e == 2) {
                int i5 = 0;
                while (true) {
                    qi[] qiVarArr2 = this.f23614a;
                    if (i5 >= qiVarArr2.length) {
                        break;
                    }
                    if (c(qiVarArr2[i5]) && this.f23614a[i5].o() == e2.f27894c[i5]) {
                        this.f23614a[i5].h();
                    }
                    i5++;
                }
                oh ohVar = this.f23634y;
                if (!ohVar.f25871g && ohVar.f25882r < 500000 && j()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z8 = this.J;
            oh ohVar2 = this.f23634y;
            if (z8 != ohVar2.f25879o) {
                this.f23634y = ohVar2.b(z8);
            }
            if ((E() && this.f23634y.e == 3) || (i2 = this.f23634y.e) == 2) {
                z4 = !a(a2, 10L);
            } else {
                if (this.K != 0 && i2 != 4) {
                    c(a2, 1000L);
                } else {
                    this.f23620i.b(2);
                }
                z4 = false;
            }
            oh ohVar3 = this.f23634y;
            if (ohVar3.f25880p != z4) {
                this.f23634y = ohVar3.c(z4);
            }
            this.I = false;
            ko.a();
            return;
        }
        this.f23620i.b(2);
    }

    private void e(rh rhVar) {
        if (rhVar.b() == this.f23622k) {
            b(rhVar);
            int i2 = this.f23634y.e;
            if (i2 == 3 || i2 == 2) {
                this.f23620i.c(2);
                return;
            }
            return;
        }
        this.f23620i.a(15, rhVar).a();
    }

    private void g(boolean z2) {
        this.G = z2;
        if (!this.f23631t.a(this.f23634y.f25867a, z2)) {
            c(true);
        }
        a(false);
    }

    private boolean h(boolean z2) {
        if (this.K == 0) {
            return k();
        }
        if (!z2) {
            return false;
        }
        oh ohVar = this.f23634y;
        if (!ohVar.f25871g) {
            return true;
        }
        long b2 = a(ohVar.f25867a, this.f23631t.e().f27895f.f28322a) ? this.f23633v.b() : -9223372036854775807L;
        xd d2 = this.f23631t.d();
        return (d2.j() && d2.f27895f.f28328i) || (d2.f27895f.f28322a.a() && !d2.d) || this.f23618g.a(h(), this.f23627p.a().f26059a, this.D, b2);
    }

    @Override // com.applovin.impl.pj.a
    /* renamed from: d */
    public void a(wd wdVar) {
        this.f23620i.a(9, wdVar).a();
    }

    private void b(rh rhVar) {
        if (rhVar.i()) {
            return;
        }
        try {
            rhVar.e().a(rhVar.g(), rhVar.c());
        } finally {
            rhVar.a(true);
        }
    }

    private void d(rh rhVar) {
        if (rhVar.d() == -9223372036854775807L) {
            e(rhVar);
            return;
        }
        if (this.f23634y.f25867a.c()) {
            this.f23628q.add(new d(rhVar));
            return;
        }
        d dVar = new d(rhVar);
        fo foVar = this.f23634y.f25867a;
        if (a(dVar, foVar, foVar, this.F, this.G, this.f23623l, this.f23624m)) {
            this.f23628q.add(dVar);
            Collections.sort(this.f23628q);
        } else {
            rhVar.a(false);
        }
    }

    private void a(wj wjVar) {
        this.f23635z.a(1);
        a(this.f23632u.a(wjVar), false);
    }

    private void e(boolean z2) {
        this.B = z2;
        B();
        if (!this.C || this.f23631t.f() == this.f23631t.e()) {
            return;
        }
        c(true);
        a(false);
    }

    private void a(b bVar, int i2) {
        this.f23635z.a(1);
        fe feVar = this.f23632u;
        if (i2 == -1) {
            i2 = feVar.c();
        }
        a(feVar.a(i2, bVar.f23637a, bVar.f23638b), false);
    }

    private void b(qi qiVar) {
        if (qiVar.b() == 2) {
            qiVar.stop();
        }
    }

    private void f(rh rhVar) {
        Looper b2 = rhVar.b();
        if (!b2.getThread().isAlive()) {
            pc.d("TAG", "Trying to send message on a dead thread.");
            rhVar.a(false);
        } else {
            this.f23629r.a(b2, null).a((Runnable) new ms(2, this, rhVar));
        }
    }

    private long b(long j2) {
        xd d2 = this.f23631t.d();
        if (d2 == null) {
            return 0L;
        }
        return Math.max(0L, j2 - d2.d(this.M));
    }

    private void d(long j2) {
        for (qi qiVar : this.f23614a) {
            if (qiVar.o() != null) {
                a(qiVar, j2);
            }
        }
    }

    private void b(wd wdVar) {
        if (this.f23631t.a(wdVar)) {
            this.f23631t.a(this.M);
            m();
        }
    }

    private boolean a(fo foVar, be.a aVar) {
        if (aVar.a() || foVar.c()) {
            return false;
        }
        foVar.a(foVar.a(aVar.f28191a, this.f23624m).f23950c, this.f23623l);
        if (!this.f23623l.e()) {
            return false;
        }
        fo.d dVar = this.f23623l;
        return dVar.f23968j && dVar.f23965g != -9223372036854775807L;
    }

    private void d(boolean z2) {
        if (z2 == this.J) {
            return;
        }
        this.J = z2;
        oh ohVar = this.f23634y;
        int i2 = ohVar.e;
        if (!z2 && i2 != 4 && i2 != 1) {
            this.f23620i.c(2);
        } else {
            this.f23634y = ohVar.b(z2);
        }
    }

    public void f(boolean z2) {
        this.f23620i.a(12, z2 ? 1 : 0, 0).a();
    }

    private void b(long j2, long j3) {
        e8 e8Var;
        d dVar;
        if (this.f23628q.isEmpty() || this.f23634y.f25868b.a()) {
            return;
        }
        if (this.O) {
            j2--;
            this.O = false;
        }
        oh ohVar = this.f23634y;
        int a2 = ohVar.f25867a.a(ohVar.f25868b.f28191a);
        int min = Math.min(this.N, this.f23628q.size());
        d dVar2 = min > 0 ? (d) this.f23628q.get(min - 1) : null;
        while (dVar2 != null) {
            int i2 = dVar2.f23641b;
            if (i2 <= a2 && (i2 != a2 || dVar2.f23642c <= j2)) {
                break;
            }
            int i3 = min - 1;
            dVar2 = i3 > 0 ? (d) this.f23628q.get(min - 2) : null;
            min = i3;
        }
        if (min < this.f23628q.size()) {
            dVar = (d) this.f23628q.get(min);
            e8Var = this;
        } else {
            e8Var = this;
            dVar = null;
        }
        while (dVar != null && dVar.d != null) {
            int i4 = dVar.f23641b;
            if (i4 >= a2 && (i4 != a2 || dVar.f23642c > j2)) {
                break;
            }
            min++;
            if (min < e8Var.f23628q.size()) {
                dVar = (d) e8Var.f23628q.get(min);
            } else {
                e8Var = e8Var;
                dVar = null;
            }
        }
        while (dVar != null && dVar.d != null && dVar.f23641b == a2) {
            long j4 = dVar.f23642c;
            if (j4 <= j2 || j4 > j3) {
                break;
            }
            try {
                e8Var.e(dVar.f23640a);
                if (dVar.f23640a.a() || dVar.f23640a.i()) {
                    e8Var.f23628q.remove(min);
                } else {
                    min++;
                }
                dVar = min < e8Var.f23628q.size() ? (d) e8Var.f23628q.get(min) : null;
            } catch (Throwable th) {
                if (dVar.f23640a.a() || dVar.f23640a.i()) {
                    e8Var.f23628q.remove(min);
                }
                throw th;
            }
        }
        e8Var.N = min;
    }

    private void a(qi qiVar) {
        if (c(qiVar)) {
            this.f23627p.a(qiVar);
            b(qiVar);
            qiVar.f();
            this.K--;
        }
    }

    private void a(boolean z2, boolean z3) {
        a(z2 || !this.H, false, true, false);
        this.f23635z.a(z3 ? 1 : 0);
        this.f23618g.c();
        c(1);
    }

    private void a(fo foVar, be.a aVar, fo foVar2, be.a aVar2, long j2) {
        if (!foVar.c() && a(foVar, aVar)) {
            foVar.a(foVar.a(aVar.f28191a, this.f23624m).f23950c, this.f23623l);
            this.f23633v.a((td.f) xp.a(this.f23623l.f23970l));
            if (j2 != -9223372036854775807L) {
                this.f23633v.a(a(foVar, aVar.f28191a, j2));
                return;
            }
            if (xp.a(!foVar2.c() ? foVar2.a(foVar2.a(aVar2.f28191a, this.f23624m).f23950c, this.f23623l).f23961a : null, this.f23623l.f23961a)) {
                return;
            }
            this.f23633v.a(-9223372036854775807L);
            return;
        }
        float f2 = this.f23627p.a().f26059a;
        ph phVar = this.f23634y.f25878n;
        if (f2 != phVar.f26059a) {
            this.f23627p.a(phVar);
        }
    }

    private void b(boolean z2) {
        for (xd e2 = this.f23631t.e(); e2 != null; e2 = e2.d()) {
            for (h8 h8Var : e2.i().f27778c) {
                if (h8Var != null) {
                    h8Var.a(z2);
                }
            }
        }
    }

    private void a(int i2, boolean z2) {
        qi qiVar = this.f23614a[i2];
        if (c(qiVar)) {
            return;
        }
        xd f2 = this.f23631t.f();
        boolean z3 = f2 == this.f23631t.e();
        wo i3 = f2.i();
        si siVar = i3.f27777b[i2];
        f9[] a2 = a(i3.f27778c[i2]);
        boolean z4 = E() && this.f23634y.e == 3;
        boolean z5 = !z2 && z4;
        this.K++;
        this.f23615b.add(qiVar);
        qiVar.a(siVar, a2, f2.f27894c[i2], this.M, z5, z3, f2.g(), f2.f());
        qiVar.a(11, new a());
        this.f23627p.b(qiVar);
        if (z4) {
            qiVar.start();
        }
    }

    public void b(int i2, int i3, wj wjVar) {
        this.f23620i.a(20, i2, i3, wjVar).a();
    }

    private void b(ph phVar) {
        this.f23627p.a(phVar);
        a(this.f23627p.a(), true);
    }

    private void b(int i2) {
        this.F = i2;
        if (!this.f23631t.a(this.f23634y.f25867a, i2)) {
            c(true);
        }
        a(false);
    }

    private void a(po poVar, wo woVar) {
        this.f23618g.a(this.f23614a, poVar, woVar.f27778c);
    }

    private void c(wd wdVar) {
        if (this.f23631t.a(wdVar)) {
            xd d2 = this.f23631t.d();
            d2.a(this.f23627p.a().f26059a, this.f23634y.f25867a);
            a(d2.h(), d2.i());
            if (d2 == this.f23631t.e()) {
                c(d2.f27895f.f28323b);
                d();
                oh ohVar = this.f23634y;
                be.a aVar = ohVar.f25868b;
                long j2 = d2.f27895f.f28323b;
                this.f23634y = a(aVar, j2, ohVar.f25869c, j2, false, 5);
            }
            m();
        }
    }

    private void a(boolean[] zArr) {
        xd f2 = this.f23631t.f();
        wo i2 = f2.i();
        for (int i3 = 0; i3 < this.f23614a.length; i3++) {
            if (!i2.a(i3) && this.f23615b.remove(this.f23614a[i3])) {
                this.f23614a[i3].reset();
            }
        }
        for (int i4 = 0; i4 < this.f23614a.length; i4++) {
            if (i2.a(i4)) {
                a(i4, zArr[i4]);
            }
        }
        f2.f27896g = true;
    }

    private void a(float f2) {
        for (xd e2 = this.f23631t.e(); e2 != null; e2 = e2.d()) {
            for (h8 h8Var : e2.i().f27778c) {
                if (h8Var != null) {
                    h8Var.a(f2);
                }
            }
        }
    }

    private static boolean c(qi qiVar) {
        return qiVar.b() != 0;
    }

    public /* synthetic */ void c(rh rhVar) {
        try {
            b(rhVar);
        } catch (a8 e2) {
            pc.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private synchronized void a(Supplier supplier, long j2) {
        long c2 = this.f23629r.c() + j2;
        boolean z2 = false;
        while (!((Boolean) supplier.get()).booleanValue() && j2 > 0) {
            try {
                this.f23629r.b();
                wait(j2);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            j2 = c2 - this.f23629r.c();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    private void c(long j2) {
        xd e2 = this.f23631t.e();
        if (e2 != null) {
            j2 = e2.e(j2);
        }
        this.M = j2;
        this.f23627p.a(j2);
        for (qi qiVar : this.f23614a) {
            if (c(qiVar)) {
                qiVar.a(this.M);
            }
        }
        t();
    }

    private eb a(h8[] h8VarArr) {
        eb.a aVar = new eb.a();
        boolean z2 = false;
        for (h8 h8Var : h8VarArr) {
            if (h8Var != null) {
                bf bfVar = h8Var.a(0).f23838k;
                if (bfVar == null) {
                    aVar.b(new bf(new bf.b[0]));
                } else {
                    aVar.b(bfVar);
                    z2 = true;
                }
            }
        }
        return z2 ? aVar.a() : eb.h();
    }

    private void c(long j2, long j3) {
        this.f23620i.b(2);
        this.f23620i.a(2, j2 + j3);
    }

    private void c(boolean z2) {
        be.a aVar = this.f23631t.e().f27895f.f28322a;
        long a2 = a(aVar, this.f23634y.f25883s, true, false);
        if (a2 != this.f23634y.f25883s) {
            oh ohVar = this.f23634y;
            this.f23634y = a(aVar, a2, ohVar.f25869c, ohVar.d, z2, 5);
        }
    }

    private static f9[] a(h8 h8Var) {
        int b2 = h8Var != null ? h8Var.b() : 0;
        f9[] f9VarArr = new f9[b2];
        for (int i2 = 0; i2 < b2; i2++) {
            f9VarArr[i2] = h8Var.a(i2);
        }
        return f9VarArr;
    }

    private long a(fo foVar, Object obj, long j2) {
        foVar.a(foVar.a(obj, this.f23624m).f23950c, this.f23623l);
        fo.d dVar = this.f23623l;
        if (dVar.f23965g != -9223372036854775807L && dVar.e()) {
            fo.d dVar2 = this.f23623l;
            if (dVar2.f23968j) {
                return t2.a(dVar2.a() - this.f23623l.f23965g) - (this.f23624m.e() + j2);
            }
        }
        return -9223372036854775807L;
    }

    private void c(int i2) {
        oh ohVar = this.f23634y;
        if (ohVar.e != i2) {
            this.f23634y = ohVar.a(i2);
        }
    }

    private Pair a(fo foVar) {
        long j2 = 0;
        if (foVar.c()) {
            return Pair.create(oh.a(), 0L);
        }
        Pair a2 = foVar.a(this.f23623l, this.f23624m, foVar.a(this.G), -9223372036854775807L);
        be.a a3 = this.f23631t.a(foVar, a2.first, 0L);
        long longValue = ((Long) a2.second).longValue();
        if (a3.a()) {
            foVar.a(a3.f28191a, this.f23624m);
            if (a3.f28193c == this.f23624m.d(a3.f28192b)) {
                j2 = this.f23624m.b();
            }
        } else {
            j2 = longValue;
        }
        return Pair.create(a3, Long.valueOf(j2));
    }

    private void a(IOException iOException, int i2) {
        a8 a2 = a8.a(iOException, i2);
        xd e2 = this.f23631t.e();
        if (e2 != null) {
            a2 = a2.a(e2.f27895f.f28322a);
        }
        pc.a("ExoPlayerImplInternal", "Playback error", a2);
        a(false, false);
        this.f23634y = this.f23634y.a(a2);
    }

    private void a(boolean z2) {
        long c2;
        xd d2 = this.f23631t.d();
        be.a aVar = d2 == null ? this.f23634y.f25868b : d2.f27895f.f28322a;
        boolean z3 = !this.f23634y.f25875k.equals(aVar);
        if (z3) {
            this.f23634y = this.f23634y.a(aVar);
        }
        oh ohVar = this.f23634y;
        if (d2 == null) {
            c2 = ohVar.f25883s;
        } else {
            c2 = d2.c();
        }
        ohVar.f25881q = c2;
        this.f23634y.f25882r = h();
        if ((z3 || z2) && d2 != null && d2.d) {
            a(d2.h(), d2.i());
        }
    }

    private void a(fo foVar, boolean z2) {
        int i2;
        int i3;
        boolean z3;
        g a2 = a(foVar, this.f23634y, this.L, this.f23631t, this.F, this.G, this.f23623l, this.f23624m);
        be.a aVar = a2.f23648a;
        long j2 = a2.f23650c;
        boolean z4 = a2.d;
        long j3 = a2.f23649b;
        boolean z5 = (this.f23634y.f25868b.equals(aVar) && j3 == this.f23634y.f25883s) ? false : true;
        h hVar = null;
        try {
            if (a2.e) {
                if (this.f23634y.e != 1) {
                    c(4);
                }
                a(false, false, false, true);
            }
            try {
                if (!z5) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        i2 = 4;
                    }
                    try {
                        i3 = 4;
                        z3 = false;
                        if (!this.f23631t.a(foVar, this.M, f())) {
                            c(false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = 4;
                        hVar = null;
                        oh ohVar = this.f23634y;
                        h hVar2 = hVar;
                        a(foVar, aVar, ohVar.f25867a, ohVar.f25868b, a2.f23651f ? j3 : -9223372036854775807L);
                        if (z5 || j2 != this.f23634y.f25869c) {
                            oh ohVar2 = this.f23634y;
                            Object obj = ohVar2.f25868b.f28191a;
                            fo foVar2 = ohVar2.f25867a;
                            this.f23634y = a(aVar, j3, j2, this.f23634y.d, z5 && z2 && !foVar2.c() && !foVar2.a(obj, this.f23624m).f23952g, foVar.a(obj) == -1 ? i2 : 3);
                        }
                        B();
                        a(foVar, this.f23634y.f25867a);
                        this.f23634y = this.f23634y.a(foVar);
                        if (!foVar.c()) {
                            this.L = hVar2;
                        }
                        a(false);
                        throw th;
                    }
                } else {
                    i3 = 4;
                    z3 = false;
                    if (!foVar.c()) {
                        for (xd e2 = this.f23631t.e(); e2 != null; e2 = e2.d()) {
                            if (e2.f27895f.f28322a.equals(aVar)) {
                                e2.f27895f = this.f23631t.a(foVar, e2.f27895f);
                                e2.m();
                            }
                        }
                        j3 = a(aVar, j3, z4);
                    }
                }
                oh ohVar3 = this.f23634y;
                a(foVar, aVar, ohVar3.f25867a, ohVar3.f25868b, a2.f23651f ? j3 : -9223372036854775807L);
                if (z5 || j2 != this.f23634y.f25869c) {
                    oh ohVar4 = this.f23634y;
                    Object obj2 = ohVar4.f25868b.f28191a;
                    fo foVar3 = ohVar4.f25867a;
                    this.f23634y = a(aVar, j3, j2, this.f23634y.d, (!z5 || !z2 || foVar3.c() || foVar3.a(obj2, this.f23624m).f23952g) ? z3 : true, foVar.a(obj2) == -1 ? i3 : 3);
                }
                B();
                a(foVar, this.f23634y.f25867a);
                this.f23634y = this.f23634y.a(foVar);
                if (!foVar.c()) {
                    this.L = null;
                }
                a(z3);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i2 = 4;
        }
    }

    private void a(ph phVar, float f2, boolean z2, boolean z3) {
        if (z2) {
            if (z3) {
                this.f23635z.a(1);
            }
            this.f23634y = this.f23634y.a(phVar);
        }
        a(phVar.f26059a);
        for (qi qiVar : this.f23614a) {
            if (qiVar != null) {
                qiVar.a(f2, phVar.f26059a);
            }
        }
    }

    private void a(ph phVar, boolean z2) {
        a(phVar, phVar.f26059a, true, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    private oh a(be.a aVar, long j2, long j3, long j4, boolean z2, int i2) {
        eb ebVar;
        po poVar;
        wo woVar;
        po h2;
        this.O = (!this.O && j2 == this.f23634y.f25883s && aVar.equals(this.f23634y.f25868b)) ? false : true;
        B();
        oh ohVar = this.f23634y;
        po poVar2 = ohVar.f25872h;
        wo woVar2 = ohVar.f25873i;
        ?? r1 = ohVar.f25874j;
        if (this.f23632u.d()) {
            xd e2 = this.f23631t.e();
            if (e2 == null) {
                h2 = po.d;
            } else {
                h2 = e2.h();
            }
            wo i3 = e2 == null ? this.f23617f : e2.i();
            eb a2 = a(i3.f27778c);
            if (e2 != null) {
                zd zdVar = e2.f27895f;
                if (zdVar.f28324c != j3) {
                    e2.f27895f = zdVar.a(j3);
                }
            }
            poVar = h2;
            woVar = i3;
            ebVar = a2;
        } else if (aVar.equals(this.f23634y.f25868b)) {
            ebVar = r1;
            poVar = poVar2;
            woVar = woVar2;
        } else {
            poVar = po.d;
            woVar = this.f23617f;
            ebVar = eb.h();
        }
        if (z2) {
            this.f23635z.c(i2);
        }
        return this.f23634y.a(aVar, j2, j3, j4, h(), poVar, woVar, ebVar);
    }

    private boolean a(qi qiVar, xd xdVar) {
        xd d2 = xdVar.d();
        return xdVar.f27895f.f28325f && d2.d && ((qiVar instanceof bo) || qiVar.i() >= d2.g());
    }

    private static boolean a(oh ohVar, fo.b bVar) {
        be.a aVar = ohVar.f25868b;
        fo foVar = ohVar.f25867a;
        return foVar.c() || foVar.a(aVar.f28191a, bVar).f23952g;
    }

    private boolean a(long j2, long j3) {
        if (this.J && this.I) {
            return false;
        }
        c(j2, j3);
        return true;
    }

    private void a(c cVar) {
        this.f23635z.a(1);
        throw null;
    }

    @Override // com.applovin.impl.h6.a
    public void a(ph phVar) {
        this.f23620i.a(16, phVar).a();
    }

    @Override // com.applovin.impl.fe.d
    public void a() {
        this.f23620i.c(22);
    }

    @Override // com.applovin.impl.wd.a
    public void a(wd wdVar) {
        this.f23620i.a(8, wdVar).a();
    }

    private void a(int i2, int i3, wj wjVar) {
        this.f23635z.a(1);
        a(this.f23632u.a(i2, i3, wjVar), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e8.a(boolean, boolean, boolean, boolean):void");
    }

    private static void a(fo foVar, d dVar, fo.d dVar2, fo.b bVar) {
        int i2 = foVar.a(foVar.a(dVar.d, bVar).f23950c, dVar2).f23975q;
        Object obj = foVar.a(i2, bVar, true).f23949b;
        long j2 = bVar.d;
        dVar.a(i2, j2 != -9223372036854775807L ? j2 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean a(d dVar, fo foVar, fo foVar2, int i2, boolean z2, fo.d dVar2, fo.b bVar) {
        Object obj = dVar.d;
        if (obj == null) {
            Pair a2 = a(foVar, new h(dVar.f23640a.f(), dVar.f23640a.h(), dVar.f23640a.d() == Long.MIN_VALUE ? -9223372036854775807L : t2.a(dVar.f23640a.d())), false, i2, z2, dVar2, bVar);
            if (a2 == null) {
                return false;
            }
            dVar.a(foVar.a(a2.first), ((Long) a2.second).longValue(), a2.first);
            if (dVar.f23640a.d() == Long.MIN_VALUE) {
                a(foVar, dVar, dVar2, bVar);
            }
            return true;
        }
        int a3 = foVar.a(obj);
        if (a3 == -1) {
            return false;
        }
        if (dVar.f23640a.d() == Long.MIN_VALUE) {
            a(foVar, dVar, dVar2, bVar);
            return true;
        }
        dVar.f23641b = a3;
        foVar2.a(dVar.d, bVar);
        if (bVar.f23952g && foVar2.a(bVar.f23950c, dVar2).f23974p == foVar2.a(dVar.d)) {
            Pair a4 = foVar.a(dVar2, bVar, foVar.a(dVar.d, bVar).f23950c, bVar.e() + dVar.f23642c);
            dVar.a(foVar.a(a4.first), ((Long) a4.second).longValue(), a4.first);
        }
        return true;
    }

    private void a(fo foVar, fo foVar2) {
        if (foVar.c() && foVar2.c()) {
            return;
        }
        for (int size = this.f23628q.size() - 1; size >= 0; size--) {
            if (!a((d) this.f23628q.get(size), foVar, foVar2, this.F, this.G, this.f23623l, this.f23624m)) {
                ((d) this.f23628q.get(size)).f23640a.a(false);
                this.f23628q.remove(size);
            }
        }
        Collections.sort(this.f23628q);
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
    private static com.applovin.impl.e8.g a(com.applovin.impl.fo r30, com.applovin.impl.oh r31, com.applovin.impl.e8.h r32, com.applovin.impl.ae r33, int r34, boolean r35, com.applovin.impl.fo.d r36, com.applovin.impl.fo.b r37) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e8.a(com.applovin.impl.fo, com.applovin.impl.oh, com.applovin.impl.e8$h, com.applovin.impl.ae, int, boolean, com.applovin.impl.fo$d, com.applovin.impl.fo$b):com.applovin.impl.e8$g");
    }

    private static Pair a(fo foVar, h hVar, boolean z2, int i2, boolean z3, fo.d dVar, fo.b bVar) {
        Pair a2;
        Object a3;
        fo foVar2 = hVar.f23652a;
        if (foVar.c()) {
            return null;
        }
        fo foVar3 = foVar2.c() ? foVar : foVar2;
        try {
            a2 = foVar3.a(dVar, bVar, hVar.f23653b, hVar.f23654c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (foVar.equals(foVar3)) {
            return a2;
        }
        if (foVar.a(a2.first) != -1) {
            return (foVar3.a(a2.first, bVar).f23952g && foVar3.a(bVar.f23950c, dVar).f23974p == foVar3.a(a2.first)) ? foVar.a(dVar, bVar, foVar.a(a2.first, bVar).f23950c, hVar.f23654c) : a2;
        }
        if (z2 && (a3 = a(dVar, bVar, i2, z3, a2.first, foVar3, foVar)) != null) {
            return foVar.a(dVar, bVar, foVar.a(a3, bVar).f23950c, -9223372036854775807L);
        }
        return null;
    }

    public static Object a(fo.d dVar, fo.b bVar, int i2, boolean z2, Object obj, fo foVar, fo foVar2) {
        int a2 = foVar.a(obj);
        int a3 = foVar.a();
        int i3 = a2;
        int i4 = -1;
        for (int i5 = 0; i5 < a3 && i4 == -1; i5++) {
            i3 = foVar.a(i3, bVar, dVar, i2, z2);
            if (i3 == -1) {
                break;
            }
            i4 = foVar2.a(foVar.b(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return foVar2.b(i4);
    }

    public void a(fo foVar, int i2, long j2) {
        this.f23620i.a(3, new h(foVar, i2, j2)).a();
    }

    private void a(h hVar) {
        long j2;
        long j3;
        boolean z2;
        be.a aVar;
        long j4;
        long j5;
        long j6;
        oh ohVar;
        int i2;
        this.f23635z.a(1);
        Pair a2 = a(this.f23634y.f25867a, hVar, true, this.F, this.G, this.f23623l, this.f23624m);
        if (a2 == null) {
            Pair a3 = a(this.f23634y.f25867a);
            aVar = (be.a) a3.first;
            long longValue = ((Long) a3.second).longValue();
            z2 = !this.f23634y.f25867a.c();
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            Object obj = a2.first;
            long longValue2 = ((Long) a2.second).longValue();
            long j7 = hVar.f23654c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            be.a a4 = this.f23631t.a(this.f23634y.f25867a, obj, longValue2);
            if (a4.a()) {
                this.f23634y.f25867a.a(a4.f28191a, this.f23624m);
                longValue2 = this.f23624m.d(a4.f28192b) == a4.f28193c ? this.f23624m.b() : 0L;
            } else if (hVar.f23654c != -9223372036854775807L) {
                j2 = longValue2;
                j3 = j7;
                z2 = false;
                aVar = a4;
            }
            j2 = longValue2;
            j3 = j7;
            aVar = a4;
            z2 = true;
        }
        try {
            if (this.f23634y.f25867a.c()) {
                this.L = hVar;
            } else if (a2 == null) {
                if (this.f23634y.e != 1) {
                    c(4);
                }
                a(false, true, false, true);
            } else {
                if (aVar.equals(this.f23634y.f25868b)) {
                    xd e2 = this.f23631t.e();
                    j5 = (e2 == null || !e2.d || j2 == 0) ? j2 : e2.f27892a.a(j2, this.x);
                    if (t2.b(j5) == t2.b(this.f23634y.f25883s) && ((i2 = (ohVar = this.f23634y).e) == 2 || i2 == 3)) {
                        long j8 = ohVar.f25883s;
                        this.f23634y = a(aVar, j8, j3, j8, z2, 2);
                        return;
                    }
                } else {
                    j5 = j2;
                }
                long a5 = a(aVar, j5, this.f23634y.e == 4);
                boolean z3 = (j2 != a5) | z2;
                try {
                    oh ohVar2 = this.f23634y;
                    fo foVar = ohVar2.f25867a;
                    a(foVar, aVar, foVar, ohVar2.f25868b, j3);
                    z2 = z3;
                    j6 = a5;
                    this.f23634y = a(aVar, j6, j3, j6, z2, 2);
                } catch (Throwable th) {
                    th = th;
                    z2 = z3;
                    j4 = a5;
                    this.f23634y = a(aVar, j4, j3, j4, z2, 2);
                    throw th;
                }
            }
            j6 = j2;
            this.f23634y = a(aVar, j6, j3, j6, z2, 2);
        } catch (Throwable th2) {
            th = th2;
            j4 = j2;
        }
    }

    private long a(be.a aVar, long j2, boolean z2) {
        return a(aVar, j2, this.f23631t.e() != this.f23631t.f(), z2);
    }

    private long a(be.a aVar, long j2, boolean z2, boolean z3) {
        H();
        this.D = false;
        if (z3 || this.f23634y.e == 3) {
            c(2);
        }
        xd e2 = this.f23631t.e();
        xd xdVar = e2;
        while (xdVar != null && !aVar.equals(xdVar.f27895f.f28322a)) {
            xdVar = xdVar.d();
        }
        if (z2 || e2 != xdVar || (xdVar != null && xdVar.e(j2) < 0)) {
            for (qi qiVar : this.f23614a) {
                a(qiVar);
            }
            if (xdVar != null) {
                while (this.f23631t.e() != xdVar) {
                    this.f23631t.a();
                }
                this.f23631t.a(xdVar);
                xdVar.c(0L);
                d();
            }
        }
        if (xdVar != null) {
            this.f23631t.a(xdVar);
            if (!xdVar.d) {
                xdVar.f27895f = xdVar.f27895f.b(j2);
            } else if (xdVar.e) {
                j2 = xdVar.f27892a.a(j2);
                xdVar.f27892a.a(j2 - this.f23625n, this.f23626o);
            }
            c(j2);
            m();
        } else {
            this.f23631t.c();
            c(j2);
        }
        a(false);
        this.f23620i.c(2);
        return j2;
    }

    @Override // com.applovin.impl.rh.a
    public synchronized void a(rh rhVar) {
        if (!this.A && this.f23621j.isAlive()) {
            this.f23620i.a(14, rhVar).a();
            return;
        }
        pc.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        rhVar.a(false);
    }

    private void a(qi qiVar, long j2) {
        qiVar.g();
        if (qiVar instanceof bo) {
            ((bo) qiVar).c(j2);
        }
    }

    private void a(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.H != z2) {
            this.H = z2;
            if (!z2) {
                for (qi qiVar : this.f23614a) {
                    if (!c(qiVar) && this.f23615b.remove(qiVar)) {
                        qiVar.reset();
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
        this.f23635z.a(1);
        if (bVar.f23639c != -1) {
            this.L = new h(new sh(bVar.f23637a, bVar.f23638b), bVar.f23639c, bVar.d);
        }
        a(this.f23632u.a(bVar.f23637a, bVar.f23638b), false);
    }

    public void a(List list, int i2, long j2, wj wjVar) {
        this.f23620i.a(17, new b(list, wjVar, i2, j2, null)).a();
    }

    public void a(boolean z2, int i2) {
        this.f23620i.a(1, z2 ? 1 : 0, i2).a();
    }

    private void a(boolean z2, int i2, boolean z3, int i3) {
        this.f23635z.a(z3 ? 1 : 0);
        this.f23635z.b(i3);
        this.f23634y = this.f23634y.a(z2, i2);
        this.D = false;
        b(z2);
        if (!E()) {
            H();
            K();
            return;
        }
        int i4 = this.f23634y.e;
        if (i4 == 3) {
            F();
            this.f23620i.c(2);
        } else if (i4 == 2) {
            this.f23620i.c(2);
        }
    }

    public void a(int i2) {
        this.f23620i.a(11, i2, 0).a();
    }
}
