package com.applovin.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.be;
import com.applovin.impl.fo;
import com.applovin.impl.gb;
import com.applovin.impl.hc;
import com.applovin.impl.qh;
import com.applovin.impl.s0;
import com.applovin.impl.y1;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class r0 implements qh.e, q1, wq, ce, y1.a, a7 {

    /* renamed from: a */
    private final l3 f26232a;

    /* renamed from: b */
    private final fo.b f26233b;

    /* renamed from: c */
    private final fo.d f26234c;
    private final a d;

    /* renamed from: f */
    private final SparseArray f26235f;

    /* renamed from: g */
    private hc f26236g;

    /* renamed from: h */
    private qh f26237h;

    /* renamed from: i */
    private ja f26238i;

    /* renamed from: j */
    private boolean f26239j;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final fo.b f26240a;

        /* renamed from: b */
        private eb f26241b = eb.h();

        /* renamed from: c */
        private gb f26242c = gb.h();
        private be.a d;
        private be.a e;

        /* renamed from: f */
        private be.a f26243f;

        public a(fo.b bVar) {
            this.f26240a = bVar;
        }

        public be.a a() {
            return this.d;
        }

        public be.a b() {
            if (this.f26241b.isEmpty()) {
                return null;
            }
            return (be.a) wb.b(this.f26241b);
        }

        public be.a c() {
            return this.e;
        }

        public be.a d() {
            return this.f26243f;
        }

        public void b(qh qhVar) {
            this.d = a(qhVar, this.f26241b, this.e, this.f26240a);
            a(qhVar.n());
        }

        private void a(gb.a aVar, be.a aVar2, fo foVar) {
            if (aVar2 == null) {
                return;
            }
            if (foVar.a(aVar2.f28191a) != -1) {
                aVar.a(aVar2, foVar);
                return;
            }
            fo foVar2 = (fo) this.f26242c.get(aVar2);
            if (foVar2 != null) {
                aVar.a(aVar2, foVar2);
            }
        }

        private static be.a a(qh qhVar, eb ebVar, be.a aVar, fo.b bVar) {
            fo n2 = qhVar.n();
            int v2 = qhVar.v();
            Object b2 = n2.c() ? null : n2.b(v2);
            int a2 = (qhVar.d() || n2.c()) ? -1 : n2.a(v2, bVar).a(t2.a(qhVar.getCurrentPosition()) - bVar.e());
            for (int i2 = 0; i2 < ebVar.size(); i2++) {
                be.a aVar2 = (be.a) ebVar.get(i2);
                if (a(aVar2, b2, qhVar.d(), qhVar.E(), qhVar.f(), a2)) {
                    return aVar2;
                }
            }
            if (ebVar.isEmpty() && aVar != null) {
                if (a(aVar, b2, qhVar.d(), qhVar.E(), qhVar.f(), a2)) {
                    return aVar;
                }
            }
            return null;
        }

        public fo a(be.a aVar) {
            return (fo) this.f26242c.get(aVar);
        }

        private static boolean a(be.a aVar, Object obj, boolean z2, int i2, int i3, int i4) {
            if (aVar.f28191a.equals(obj)) {
                return (z2 && aVar.f28192b == i2 && aVar.f28193c == i3) || (!z2 && aVar.f28192b == -1 && aVar.e == i4);
            }
            return false;
        }

        public void a(qh qhVar) {
            this.d = a(qhVar, this.f26241b, this.e, this.f26240a);
        }

        public void a(List list, be.a aVar, qh qhVar) {
            this.f26241b = eb.a((Collection) list);
            if (!list.isEmpty()) {
                this.e = (be.a) list.get(0);
                this.f26243f = (be.a) b1.a(aVar);
            }
            if (this.d == null) {
                this.d = a(qhVar, this.f26241b, this.e, this.f26240a);
            }
            a(qhVar.n());
        }

        private void a(fo foVar) {
            gb.a a2 = gb.a();
            if (this.f26241b.isEmpty()) {
                a(a2, this.e, foVar);
                if (!Objects.equal(this.f26243f, this.e)) {
                    a(a2, this.f26243f, foVar);
                }
                if (!Objects.equal(this.d, this.e) && !Objects.equal(this.d, this.f26243f)) {
                    a(a2, this.d, foVar);
                }
            } else {
                for (int i2 = 0; i2 < this.f26241b.size(); i2++) {
                    a(a2, (be.a) this.f26241b.get(i2), foVar);
                }
                if (!this.f26241b.contains(this.d)) {
                    a(a2, this.d, foVar);
                }
            }
            this.f26242c = a2.a();
        }
    }

    public r0(l3 l3Var) {
        this.f26232a = (l3) b1.a(l3Var);
        this.f26236g = new hc(xp.d(), l3Var, new ru(4));
        fo.b bVar = new fo.b();
        this.f26233b = bVar;
        this.f26234c = new fo.d();
        this.d = new a(bVar);
        this.f26235f = new SparseArray();
    }

    public static /* synthetic */ void A(s0.a aVar, ud udVar, s0 s0Var) {
        s0Var.a(aVar, udVar);
    }

    public static /* synthetic */ void J(s0.a aVar, ph phVar, s0 s0Var) {
        s0Var.a(aVar, phVar);
    }

    public static /* synthetic */ void L(s0.a aVar, qh.b bVar, s0 s0Var) {
        s0Var.a(aVar, bVar);
    }

    public static /* synthetic */ void N(s0.a aVar, nh nhVar, s0 s0Var) {
        s0Var.a(aVar, nhVar);
    }

    public static /* synthetic */ void a(s0 s0Var, b9 b9Var) {
    }

    public static /* synthetic */ void b(s0.a aVar, n5 n5Var, s0 s0Var) {
        s0Var.b(aVar, n5Var);
        s0Var.a(aVar, 1, n5Var);
    }

    public static /* synthetic */ void e(r0 r0Var, qh qhVar, s0 s0Var, b9 b9Var) {
        r0Var.a(qhVar, s0Var, b9Var);
    }

    public static /* synthetic */ void g0(s0.a aVar, bf bfVar, s0 s0Var) {
        s0Var.a(aVar, bfVar);
    }

    public static /* synthetic */ void m(s0.a aVar, vd vdVar, s0 s0Var) {
        s0Var.a(aVar, vdVar);
    }

    public static /* synthetic */ void r(s0.a aVar, xq xqVar, s0 s0Var) {
        a(aVar, xqVar, s0Var);
    }

    private s0.a a(be.a aVar) {
        b1.a(this.f26237h);
        fo a2 = aVar == null ? null : this.d.a(aVar);
        if (aVar != null && a2 != null) {
            return a(a2, a2.a(aVar.f28191a, this.f26233b).f23950c, aVar);
        }
        int t2 = this.f26237h.t();
        fo n2 = this.f26237h.n();
        if (t2 >= n2.b()) {
            n2 = fo.f23945a;
        }
        return a(n2, t2, (be.a) null);
    }

    private s0.a d() {
        return a(this.d.b());
    }

    private s0.a e() {
        return a(this.d.c());
    }

    private s0.a f(int i2, be.a aVar) {
        b1.a(this.f26237h);
        if (aVar != null) {
            if (this.d.a(aVar) != null) {
                return a(aVar);
            }
            return a(fo.f23945a, i2, aVar);
        }
        fo n2 = this.f26237h.n();
        if (i2 >= n2.b()) {
            n2 = fo.f23945a;
        }
        return a(n2, i2, (be.a) null);
    }

    public final s0.a c() {
        return a(this.d.a());
    }

    public final void h() {
        if (this.f26239j) {
            return;
        }
        s0.a c2 = c();
        this.f26239j = true;
        a(c2, -1, new pv(c2, 4));
    }

    public void i() {
        s0.a c2 = c();
        this.f26235f.put(1036, c2);
        a(c2, 1036, new pv(c2, 0));
        ((ja) b1.b(this.f26238i)).a((Runnable) new mt(this, 13));
    }

    public /* synthetic */ void g() {
        this.f26236g.b();
    }

    public static /* synthetic */ void d(s0.a aVar, n5 n5Var, s0 s0Var) {
        s0Var.a(aVar, n5Var);
        s0Var.a(aVar, 2, n5Var);
    }

    public static /* synthetic */ void c(s0.a aVar, n5 n5Var, s0 s0Var) {
        s0Var.d(aVar, n5Var);
        s0Var.b(aVar, 2, n5Var);
    }

    @Override // com.applovin.impl.a7
    public final void d(int i2, be.a aVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1031, new pv(f2, 6));
    }

    public static /* synthetic */ void b(s0.a aVar, String str, long j2, long j3, s0 s0Var) {
        s0Var.b(aVar, str, j2);
        s0Var.a(aVar, str, j3, j2);
        s0Var.a(aVar, 2, str, j2);
    }

    private s0.a f() {
        return a(this.d.d());
    }

    @Override // com.applovin.impl.q1
    public final void c(Exception exc) {
        s0.a f2 = f();
        a(f2, 1037, new cv(f2, exc, 0));
    }

    public final s0.a a(fo foVar, int i2, be.a aVar) {
        long b2;
        be.a aVar2 = foVar.c() ? null : aVar;
        long c2 = this.f26232a.c();
        boolean z2 = foVar.equals(this.f26237h.n()) && i2 == this.f26237h.t();
        if (aVar2 != null && aVar2.a()) {
            if (z2 && this.f26237h.E() == aVar2.f28192b && this.f26237h.f() == aVar2.f28193c) {
                b2 = this.f26237h.getCurrentPosition();
            }
            b2 = 0;
        } else if (z2) {
            b2 = this.f26237h.g();
        } else {
            if (!foVar.c()) {
                b2 = foVar.a(i2, this.f26234c).b();
            }
            b2 = 0;
        }
        return new s0.a(c2, foVar, i2, aVar2, b2, this.f26237h.n(), this.f26237h.t(), this.d.a(), this.f26237h.getCurrentPosition(), this.f26237h.h());
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public void d(boolean z2) {
        s0.a c2 = c();
        a(c2, 7, new ov(c2, z2, 0));
    }

    @Override // com.applovin.impl.q1
    public final void c(n5 n5Var) {
        s0.a e = e();
        a(e, 1014, new mv(e, 0, n5Var));
    }

    @Override // com.applovin.impl.wq
    public final void d(n5 n5Var) {
        s0.a f2 = f();
        a(f2, 1020, new mv(f2, 3, n5Var));
    }

    public static /* synthetic */ void b(s0.a aVar, f9 f9Var, q5 q5Var, s0 s0Var) {
        s0Var.a(aVar, f9Var);
        s0Var.a(aVar, f9Var, q5Var);
        s0Var.a(aVar, 2, f9Var);
    }

    @Override // com.applovin.impl.a7
    public final void c(int i2, be.a aVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1033, new pv(f2, 1));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void c(boolean z2) {
        s0.a c2 = c();
        a(c2, 3, new ov(c2, z2, 2));
    }

    @Override // com.applovin.impl.q1
    public final void b(String str) {
        s0.a f2 = f();
        a(f2, 1013, new qv(f2, str, 1));
    }

    @Override // com.applovin.impl.ce
    public final void c(int i2, be.a aVar, nc ncVar, ud udVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1001, new lv(f2, ncVar, udVar, 1));
    }

    @Override // com.applovin.impl.q1
    public final void b(f9 f9Var, q5 q5Var) {
        s0.a f2 = f();
        a(f2, 1010, new sv(f2, f9Var, q5Var, 1));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void c(int i2) {
        s0.a c2 = c();
        a(c2, 8, new ev(c2, i2, 1));
    }

    @Override // com.applovin.impl.q1
    public final void b(int i2, long j2, long j3) {
        s0.a f2 = f();
        a(f2, 1012, new fv(f2, i2, j2, j3, 0));
    }

    @Override // com.applovin.impl.a7
    public final void b(int i2, be.a aVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1035, new pv(f2, 5));
    }

    @Override // com.applovin.impl.ce
    public final void b(int i2, be.a aVar, nc ncVar, ud udVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1000, new lv(f2, ncVar, udVar, 0));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void b(int i2) {
        s0.a c2 = c();
        a(c2, 4, new ev(c2, i2, 4));
    }

    public static /* synthetic */ void a(s0.a aVar, String str, long j2, long j3, s0 s0Var) {
        s0Var.a(aVar, str, j2);
        s0Var.b(aVar, str, j3, j2);
        s0Var.a(aVar, 1, str, j2);
    }

    @Override // com.applovin.impl.qh.c
    public final void b(boolean z2, int i2) {
        s0.a c2 = c();
        a(c2, -1, new nv(c2, z2, i2, 1));
    }

    @Override // com.applovin.impl.qh.c
    public final void b() {
        s0.a c2 = c();
        a(c2, -1, new pv(c2, 2));
    }

    public static /* synthetic */ void a(s0.a aVar, n5 n5Var, s0 s0Var) {
        s0Var.c(aVar, n5Var);
        s0Var.b(aVar, 1, n5Var);
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void b(boolean z2) {
        s0.a c2 = c();
        a(c2, 9, new ov(c2, z2, 3));
    }

    public static /* synthetic */ void a(s0.a aVar, f9 f9Var, q5 q5Var, s0 s0Var) {
        s0Var.b(aVar, f9Var);
        s0Var.b(aVar, f9Var, q5Var);
        s0Var.a(aVar, 1, f9Var);
    }

    @Override // com.applovin.impl.wq
    public final void b(Exception exc) {
        s0.a f2 = f();
        a(f2, 1038, new cv(f2, exc, 3));
    }

    @Override // com.applovin.impl.wq
    public final void b(String str, long j2, long j3) {
        s0.a f2 = f();
        a(f2, 1021, new dv(f2, str, j3, j2, 0));
    }

    @Override // com.applovin.impl.wq
    public final void b(n5 n5Var) {
        s0.a e = e();
        a(e, 1025, new mv(e, 1, n5Var));
    }

    public static /* synthetic */ void a(s0.a aVar, int i2, s0 s0Var) {
        s0Var.f(aVar);
        s0Var.b(aVar, i2);
    }

    public static /* synthetic */ void a(s0.a aVar, boolean z2, s0 s0Var) {
        s0Var.c(aVar, z2);
        s0Var.e(aVar, z2);
    }

    public static /* synthetic */ void a(s0.a aVar, int i2, qh.f fVar, qh.f fVar2, s0 s0Var) {
        s0Var.a(aVar, i2);
        s0Var.a(aVar, fVar, fVar2, i2);
    }

    public static /* synthetic */ void a(s0.a aVar, xq xqVar, s0 s0Var) {
        s0Var.a(aVar, xqVar);
        s0Var.a(aVar, xqVar.f27977a, xqVar.f27978b, xqVar.f27979c, xqVar.d);
    }

    public /* synthetic */ void a(qh qhVar, s0 s0Var, b9 b9Var) {
        s0Var.a(qhVar, new s0.b(b9Var, this.f26235f));
    }

    @Override // com.applovin.impl.q1
    public final void a(String str, long j2, long j3) {
        s0.a f2 = f();
        a(f2, 1009, new dv(f2, str, j3, j2, 1));
    }

    @Override // com.applovin.impl.q1
    public final void a(n5 n5Var) {
        s0.a f2 = f();
        a(f2, 1008, new mv(f2, 2, n5Var));
    }

    @Override // com.applovin.impl.q1
    public final void a(final long j2) {
        final s0.a f2 = f();
        a(f2, 1011, new hc.a() { // from class: com.applovin.impl.gv
            @Override // com.applovin.impl.hc.a
            public final void a(Object obj) {
                ((s0) obj).a(s0.a.this, j2);
            }
        });
    }

    @Override // com.applovin.impl.q1
    public final void a(Exception exc) {
        s0.a f2 = f();
        a(f2, 1018, new cv(f2, exc, 1));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public void a(qh.b bVar) {
        s0.a c2 = c();
        a(c2, 13, new zs(6, c2, bVar));
    }

    @Override // com.applovin.impl.y1.a
    public final void a(int i2, long j2, long j3) {
        s0.a d = d();
        a(d, 1006, new fv(d, i2, j2, j3, 1));
    }

    @Override // com.applovin.impl.ce
    public final void a(int i2, be.a aVar, ud udVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new zs(8, f2, udVar));
    }

    @Override // com.applovin.impl.a7
    public final void a(int i2, be.a aVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1034, new pv(f2, 3));
    }

    @Override // com.applovin.impl.a7
    public final void a(int i2, be.a aVar, int i3) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1030, new ev(f2, i3, 3));
    }

    @Override // com.applovin.impl.a7
    public final void a(int i2, be.a aVar, Exception exc) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1032, new cv(f2, exc, 2));
    }

    @Override // com.applovin.impl.wq
    public final void a(int i2, long j2) {
        s0.a e = e();
        a(e, 1023, new rv(e, i2, j2));
    }

    @Override // com.applovin.impl.ce
    public final void a(int i2, be.a aVar, nc ncVar, ud udVar) {
        s0.a f2 = f(i2, aVar);
        a(f2, 1002, new lv(f2, ncVar, udVar, 2));
    }

    @Override // com.applovin.impl.ce
    public final void a(int i2, be.a aVar, final nc ncVar, final ud udVar, final IOException iOException, final boolean z2) {
        final s0.a f2 = f(i2, aVar);
        a(f2, 1003, new hc.a() { // from class: com.applovin.impl.iv
            @Override // com.applovin.impl.hc.a
            public final void a(Object obj) {
                ((s0) obj).a(s0.a.this, ncVar, udVar, iOException, z2);
            }
        });
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(td tdVar, int i2) {
        s0.a c2 = c();
        a(c2, 1, new ys(c2, tdVar, i2));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public void a(vd vdVar) {
        s0.a c2 = c();
        a(c2, 14, new zs(5, c2, vdVar));
    }

    @Override // com.applovin.impl.qh.e
    public final void a(bf bfVar) {
        s0.a c2 = c();
        a(c2, 1007, new zs(9, c2, bfVar));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(boolean z2, int i2) {
        s0.a c2 = c();
        a(c2, 5, new nv(c2, z2, i2, 0));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(ph phVar) {
        s0.a c2 = c();
        a(c2, 12, new zs(2, c2, phVar));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(int i2) {
        s0.a c2 = c();
        a(c2, 6, new ev(c2, i2, 2));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(nh nhVar) {
        yd ydVar;
        s0.a a2 = (!(nhVar instanceof a8) || (ydVar = ((a8) nhVar).f22709j) == null) ? null : a(new be.a(ydVar));
        if (a2 == null) {
            a2 = c();
        }
        a(a2, 10, new zs(3, a2, nhVar));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(final qh.f fVar, final qh.f fVar2, final int i2) {
        if (i2 == 1) {
            this.f26239j = false;
        }
        this.d.a((qh) b1.a(this.f26237h));
        final s0.a c2 = c();
        a(c2, 11, new hc.a() { // from class: com.applovin.impl.jv
            @Override // com.applovin.impl.hc.a
            public final void a(Object obj) {
                r0.a(s0.a.this, i2, fVar, fVar2, (s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.wq
    public final void a(Object obj, long j2) {
        s0.a f2 = f();
        a(f2, 1027, new hv(f2, j2, obj));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.q1
    public final void a(boolean z2) {
        s0.a f2 = f();
        a(f2, 1017, new ov(f2, z2, 1));
    }

    @Override // com.applovin.impl.qh.e
    public void a(int i2, int i3) {
        s0.a f2 = f();
        a(f2, 1029, new androidx.compose.foundation.text.b(i2, i3, f2));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(fo foVar, int i2) {
        this.d.b((qh) b1.a(this.f26237h));
        s0.a c2 = c();
        a(c2, 0, new ev(c2, i2, 0));
    }

    @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
    public final void a(po poVar, to toVar) {
        s0.a c2 = c();
        a(c2, 2, new os(c2, 2, poVar, toVar));
    }

    @Override // com.applovin.impl.wq
    public final void a(String str) {
        s0.a f2 = f();
        a(f2, 1024, new qv(f2, str, 0));
    }

    @Override // com.applovin.impl.wq
    public final void a(long j2, int i2) {
        s0.a e = e();
        a(e, 1026, new rv(e, j2, i2));
    }

    @Override // com.applovin.impl.wq
    public final void a(f9 f9Var, q5 q5Var) {
        s0.a f2 = f();
        a(f2, 1022, new sv(f2, f9Var, q5Var, 0));
    }

    @Override // com.applovin.impl.qh.e
    public final void a(xq xqVar) {
        s0.a f2 = f();
        a(f2, 1028, new zs(7, f2, xqVar));
    }

    @Override // com.applovin.impl.qh.e
    public final void a(final float f2) {
        final s0.a f3 = f();
        a(f3, 1019, new hc.a() { // from class: com.applovin.impl.kv
            @Override // com.applovin.impl.hc.a
            public final void a(Object obj) {
                ((s0) obj).a(s0.a.this, f2);
            }
        });
    }

    public final void a(s0.a aVar, int i2, hc.a aVar2) {
        this.f26235f.put(i2, aVar);
        this.f26236g.b(i2, aVar2);
    }

    public void a(qh qhVar, Looper looper) {
        b1.b(this.f26237h == null || this.d.f26241b.isEmpty());
        this.f26237h = (qh) b1.a(qhVar);
        this.f26238i = this.f26232a.a(looper, null);
        this.f26236g = this.f26236g.a(looper, new zs(4, this, qhVar));
    }

    public final void a(List list, be.a aVar) {
        this.d.a(list, aVar, (qh) b1.a(this.f26237h));
    }
}
