package com.applovin.impl;

import com.applovin.impl.g5;
import com.applovin.impl.go;
import com.applovin.impl.od;
import com.applovin.impl.wd;
import com.applovin.impl.wh;
import com.applovin.impl.xh;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* loaded from: classes.dex */
public final class yh extends b2 implements xh.b {

    /* renamed from: g */
    private final od f9205g;

    /* renamed from: h */
    private final od.g f9206h;

    /* renamed from: i */
    private final g5.a f9207i;

    /* renamed from: j */
    private final wh.a f9208j;

    /* renamed from: k */
    private final z6 f9209k;

    /* renamed from: l */
    private final hc f9210l;

    /* renamed from: m */
    private final int f9211m;

    /* renamed from: n */
    private boolean f9212n;

    /* renamed from: o */
    private long f9213o;

    /* renamed from: p */
    private boolean f9214p;

    /* renamed from: q */
    private boolean f9215q;

    /* renamed from: r */
    private yo f9216r;

    /* loaded from: classes.dex */
    public static final class b implements yd {
        private final g5.a a;

        /* renamed from: b */
        private wh.a f9218b;

        /* renamed from: c */
        private a7 f9219c;

        /* renamed from: d */
        private hc f9220d;

        /* renamed from: e */
        private int f9221e;

        /* renamed from: f */
        private String f9222f;

        /* renamed from: g */
        private Object f9223g;

        public b(g5.a aVar) {
            this(aVar, new a6());
        }

        public static /* synthetic */ wh b(m8 m8Var) {
            return a(m8Var);
        }

        public yh a(od odVar) {
            a1.a(odVar.f6477b);
            od.g gVar = odVar.f6477b;
            boolean z10 = gVar.f6529g == null && this.f9223g != null;
            boolean z11 = gVar.f6527e == null && this.f9222f != null;
            if (z10 && z11) {
                odVar = odVar.a().a(this.f9223g).a(this.f9222f).a();
            } else if (z10) {
                odVar = odVar.a().a(this.f9223g).a();
            } else if (z11) {
                odVar = odVar.a().a(this.f9222f).a();
            }
            od odVar2 = odVar;
            return new yh(odVar2, this.a, this.f9218b, this.f9219c.a(odVar2), this.f9220d, this.f9221e, null);
        }

        public b(g5.a aVar, m8 m8Var) {
            this(aVar, new js(m8Var, 15));
        }

        public b(g5.a aVar, wh.a aVar2) {
            this.a = aVar;
            this.f9218b = aVar2;
            this.f9219c = new x5();
            this.f9220d = new e6();
            this.f9221e = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }

        public static /* synthetic */ wh a(m8 m8Var) {
            return new o2(m8Var);
        }
    }

    private yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i10) {
        this.f9206h = (od.g) a1.a(odVar.f6477b);
        this.f9205g = odVar;
        this.f9207i = aVar;
        this.f9208j = aVar2;
        this.f9209k = z6Var;
        this.f9210l = hcVar;
        this.f9211m = i10;
        this.f9212n = true;
        this.f9213o = C.TIME_UNSET;
    }

    private void i() {
        go dkVar = new dk(this.f9213o, this.f9214p, false, this.f9215q, null, this.f9205g);
        if (this.f9212n) {
            dkVar = new a(dkVar);
        }
        a(dkVar);
    }

    @Override // com.applovin.impl.wd
    public rd a(wd.a aVar, n0 n0Var, long j3) {
        g5 a10 = this.f9207i.a();
        yo yoVar = this.f9216r;
        if (yoVar != null) {
            a10.a(yoVar);
        }
        return new xh(this.f9206h.a, a10, this.f9208j.a(), this.f9209k, a(aVar), this.f9210l, b(aVar), this, n0Var, this.f9206h.f6527e, this.f9211m);
    }

    @Override // com.applovin.impl.wd
    public void b() {
    }

    @Override // com.applovin.impl.b2
    public void h() {
        this.f9209k.a();
    }

    /* loaded from: classes.dex */
    public class a extends g9 {
        public a(go goVar) {
            super(goVar);
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.b a(int i10, go.b bVar, boolean z10) {
            super.a(i10, bVar, z10);
            bVar.f4961g = true;
            return bVar;
        }

        @Override // com.applovin.impl.g9, com.applovin.impl.go
        public go.d a(int i10, go.d dVar, long j3) {
            super.a(i10, dVar, j3);
            dVar.f4980m = true;
            return dVar;
        }
    }

    @Override // com.applovin.impl.wd
    public od a() {
        return this.f9205g;
    }

    @Override // com.applovin.impl.xh.b
    public void a(long j3, boolean z10, boolean z11) {
        if (j3 == C.TIME_UNSET) {
            j3 = this.f9213o;
        }
        if (!this.f9212n && this.f9213o == j3 && this.f9214p == z10 && this.f9215q == z11) {
            return;
        }
        this.f9213o = j3;
        this.f9214p = z10;
        this.f9215q = z11;
        this.f9212n = false;
        i();
    }

    public /* synthetic */ yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i10, a aVar3) {
        this(odVar, aVar, aVar2, z6Var, hcVar, i10);
    }

    @Override // com.applovin.impl.b2
    public void a(yo yoVar) {
        this.f9216r = yoVar;
        this.f9209k.b();
        i();
    }

    @Override // com.applovin.impl.wd
    public void a(rd rdVar) {
        ((xh) rdVar).t();
    }
}
