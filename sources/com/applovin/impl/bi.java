package com.applovin.impl;

import com.applovin.impl.ai;
import com.applovin.impl.be;
import com.applovin.impl.fo;
import com.applovin.impl.i5;
import com.applovin.impl.td;
import com.applovin.impl.zh;

/* loaded from: classes.dex */
public final class bi extends c2 implements ai.b {

    /* renamed from: g */
    private final td f23063g;

    /* renamed from: h */
    private final td.g f23064h;

    /* renamed from: i */
    private final i5.a f23065i;

    /* renamed from: j */
    private final zh.a f23066j;

    /* renamed from: k */
    private final b7 f23067k;

    /* renamed from: l */
    private final mc f23068l;

    /* renamed from: m */
    private final int f23069m;

    /* renamed from: n */
    private boolean f23070n;

    /* renamed from: o */
    private long f23071o;

    /* renamed from: p */
    private boolean f23072p;

    /* renamed from: q */
    private boolean f23073q;

    /* renamed from: r */
    private xo f23074r;

    /* loaded from: classes.dex */
    public static final class b implements de {

        /* renamed from: a */
        private final i5.a f23075a;

        /* renamed from: b */
        private zh.a f23076b;

        /* renamed from: c */
        private c7 f23077c;
        private mc d;
        private int e;

        /* renamed from: f */
        private String f23078f;

        /* renamed from: g */
        private Object f23079g;

        public b(i5.a aVar) {
            this(aVar, new c6());
        }

        public static /* synthetic */ zh b(o8 o8Var) {
            return a(o8Var);
        }

        public bi a(td tdVar) {
            b1.a(tdVar.f27058b);
            td.g gVar = tdVar.f27058b;
            boolean z2 = false;
            boolean z3 = gVar.f27104g == null && this.f23079g != null;
            if (gVar.e == null && this.f23078f != null) {
                z2 = true;
            }
            if (z3 && z2) {
                tdVar = tdVar.a().a(this.f23079g).a(this.f23078f).a();
            } else if (z3) {
                tdVar = tdVar.a().a(this.f23079g).a();
            } else if (z2) {
                tdVar = tdVar.a().a(this.f23078f).a();
            }
            td tdVar2 = tdVar;
            return new bi(tdVar2, this.f23075a, this.f23076b, this.f23077c.a(tdVar2), this.d, this.e, null);
        }

        public b(i5.a aVar, o8 o8Var) {
            this(aVar, new is(o8Var, 6));
        }

        public b(i5.a aVar, zh.a aVar2) {
            this.f23075a = aVar;
            this.f23076b = aVar2;
            this.f23077c = new z5();
            this.d = new g6();
            this.e = 1048576;
        }

        public static /* synthetic */ zh a(o8 o8Var) {
            return new q2(o8Var);
        }
    }

    private bi(td tdVar, i5.a aVar, zh.a aVar2, b7 b7Var, mc mcVar, int i2) {
        this.f23064h = (td.g) b1.a(tdVar.f27058b);
        this.f23063g = tdVar;
        this.f23065i = aVar;
        this.f23066j = aVar2;
        this.f23067k = b7Var;
        this.f23068l = mcVar;
        this.f23069m = i2;
        this.f23070n = true;
        this.f23071o = -9223372036854775807L;
    }

    private void i() {
        fo gkVar = new gk(this.f23071o, this.f23072p, false, this.f23073q, null, this.f23063g);
        if (this.f23070n) {
            gkVar = new a(gkVar);
        }
        a(gkVar);
    }

    @Override // com.applovin.impl.be
    public td a() {
        return this.f23063g;
    }

    @Override // com.applovin.impl.be
    public void b() {
    }

    @Override // com.applovin.impl.c2
    public void h() {
        this.f23067k.a();
    }

    /* loaded from: classes.dex */
    public class a extends i9 {
        public a(fo foVar) {
            super(foVar);
        }

        @Override // com.applovin.impl.i9, com.applovin.impl.fo
        public fo.b a(int i2, fo.b bVar, boolean z2) {
            super.a(i2, bVar, z2);
            bVar.f23952g = true;
            return bVar;
        }

        @Override // com.applovin.impl.i9, com.applovin.impl.fo
        public fo.d a(int i2, fo.d dVar, long j2) {
            super.a(i2, dVar, j2);
            dVar.f23971m = true;
            return dVar;
        }
    }

    @Override // com.applovin.impl.be
    public wd a(be.a aVar, n0 n0Var, long j2) {
        i5 a2 = this.f23065i.a();
        xo xoVar = this.f23074r;
        if (xoVar != null) {
            a2.a(xoVar);
        }
        return new ai(this.f23064h.f27100a, a2, this.f23066j.a(), this.f23067k, a(aVar), this.f23068l, b(aVar), this, n0Var, this.f23064h.e, this.f23069m);
    }

    public /* synthetic */ bi(td tdVar, i5.a aVar, zh.a aVar2, b7 b7Var, mc mcVar, int i2, a aVar3) {
        this(tdVar, aVar, aVar2, b7Var, mcVar, i2);
    }

    @Override // com.applovin.impl.ai.b
    public void a(long j2, boolean z2, boolean z3) {
        if (j2 == -9223372036854775807L) {
            j2 = this.f23071o;
        }
        if (!this.f23070n && this.f23071o == j2 && this.f23072p == z2 && this.f23073q == z3) {
            return;
        }
        this.f23071o = j2;
        this.f23072p = z2;
        this.f23073q = z3;
        this.f23070n = false;
        i();
    }

    @Override // com.applovin.impl.c2
    public void a(xo xoVar) {
        this.f23074r = xoVar;
        this.f23067k.b();
        i();
    }

    @Override // com.applovin.impl.be
    public void a(wd wdVar) {
        ((ai) wdVar).t();
    }
}
