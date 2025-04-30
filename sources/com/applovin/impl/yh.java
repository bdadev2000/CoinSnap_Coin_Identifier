package com.applovin.impl;

import com.applovin.impl.g5;
import com.applovin.impl.go;
import com.applovin.impl.od;
import com.applovin.impl.wd;
import com.applovin.impl.wh;
import com.applovin.impl.xh;

/* loaded from: classes.dex */
public final class yh extends AbstractC0675b2 implements xh.b {

    /* renamed from: g */
    private final od f12405g;

    /* renamed from: h */
    private final od.g f12406h;

    /* renamed from: i */
    private final g5.a f12407i;

    /* renamed from: j */
    private final wh.a f12408j;

    /* renamed from: k */
    private final z6 f12409k;
    private final hc l;
    private final int m;

    /* renamed from: n */
    private boolean f12410n;

    /* renamed from: o */
    private long f12411o;

    /* renamed from: p */
    private boolean f12412p;

    /* renamed from: q */
    private boolean f12413q;

    /* renamed from: r */
    private yo f12414r;

    /* loaded from: classes.dex */
    public static final class b implements yd {

        /* renamed from: a */
        private final g5.a f12416a;
        private wh.a b;

        /* renamed from: c */
        private a7 f12417c;

        /* renamed from: d */
        private hc f12418d;

        /* renamed from: e */
        private int f12419e;

        /* renamed from: f */
        private String f12420f;

        /* renamed from: g */
        private Object f12421g;

        public b(g5.a aVar) {
            this(aVar, new a6());
        }

        public static /* synthetic */ wh b(m8 m8Var) {
            return a(m8Var);
        }

        public yh a(od odVar) {
            AbstractC0669a1.a(odVar.b);
            od.g gVar = odVar.b;
            boolean z8 = false;
            boolean z9 = gVar.f9462g == null && this.f12421g != null;
            if (gVar.f9460e == null && this.f12420f != null) {
                z8 = true;
            }
            if (z9 && z8) {
                odVar = odVar.a().a(this.f12421g).a(this.f12420f).a();
            } else if (z9) {
                odVar = odVar.a().a(this.f12421g).a();
            } else if (z8) {
                odVar = odVar.a().a(this.f12420f).a();
            }
            od odVar2 = odVar;
            return new yh(odVar2, this.f12416a, this.b, this.f12417c.a(odVar2), this.f12418d, this.f12419e, null);
        }

        public b(g5.a aVar, m8 m8Var) {
            this(aVar, new C(m8Var, 15));
        }

        public b(g5.a aVar, wh.a aVar2) {
            this.f12416a = aVar;
            this.b = aVar2;
            this.f12417c = new x5();
            this.f12418d = new e6();
            this.f12419e = 1048576;
        }

        public static /* synthetic */ wh a(m8 m8Var) {
            return new C0733o2(m8Var);
        }
    }

    private yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i9) {
        this.f12406h = (od.g) AbstractC0669a1.a(odVar.b);
        this.f12405g = odVar;
        this.f12407i = aVar;
        this.f12408j = aVar2;
        this.f12409k = z6Var;
        this.l = hcVar;
        this.m = i9;
        this.f12410n = true;
        this.f12411o = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private void i() {
        go dkVar = new dk(this.f12411o, this.f12412p, false, this.f12413q, null, this.f12405g);
        if (this.f12410n) {
            dkVar = new a(dkVar);
        }
        a(dkVar);
    }

    @Override // com.applovin.impl.wd
    public rd a(wd.a aVar, InterfaceC0727n0 interfaceC0727n0, long j7) {
        g5 a6 = this.f12407i.a();
        yo yoVar = this.f12414r;
        if (yoVar != null) {
            a6.a(yoVar);
        }
        return new xh(this.f12406h.f9457a, a6, this.f12408j.a(), this.f12409k, a(aVar), this.l, b(aVar), this, interfaceC0727n0, this.f12406h.f9460e, this.m);
    }

    @Override // com.applovin.impl.wd
    public void b() {
    }

    @Override // com.applovin.impl.AbstractC0675b2
    public void h() {
        this.f12409k.a();
    }

    /* loaded from: classes.dex */
    public class a extends g9 {
        public a(go goVar) {
            super(goVar);
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.b a(int i9, go.b bVar, boolean z8) {
            super.a(i9, bVar, z8);
            bVar.f7937g = true;
            return bVar;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.d a(int i9, go.d dVar, long j7) {
            super.a(i9, dVar, j7);
            dVar.m = true;
            return dVar;
        }
    }

    @Override // com.applovin.impl.wd
    public od a() {
        return this.f12405g;
    }

    @Override // com.applovin.impl.xh.b
    public void a(long j7, boolean z8, boolean z9) {
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j7 = this.f12411o;
        }
        if (!this.f12410n && this.f12411o == j7 && this.f12412p == z8 && this.f12413q == z9) {
            return;
        }
        this.f12411o = j7;
        this.f12412p = z8;
        this.f12413q = z9;
        this.f12410n = false;
        i();
    }

    public /* synthetic */ yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i9, a aVar3) {
        this(odVar, aVar, aVar2, z6Var, hcVar, i9);
    }

    @Override // com.applovin.impl.AbstractC0675b2
    public void a(yo yoVar) {
        this.f12414r = yoVar;
        this.f12409k.b();
        i();
    }

    @Override // com.applovin.impl.wd
    public void a(rd rdVar) {
        ((xh) rdVar).t();
    }
}
