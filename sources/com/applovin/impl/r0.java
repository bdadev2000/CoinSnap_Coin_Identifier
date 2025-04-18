package com.applovin.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.cb;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.s0;
import com.applovin.impl.wd;
import com.applovin.impl.x1;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class r0 implements nh.e, p1, xq, xd, x1.a, y6 {
    private final j3 a;

    /* renamed from: b */
    private final go.b f7293b;

    /* renamed from: c */
    private final go.d f7294c;

    /* renamed from: d */
    private final a f7295d;

    /* renamed from: f */
    private final SparseArray f7296f;

    /* renamed from: g */
    private cc f7297g;

    /* renamed from: h */
    private nh f7298h;

    /* renamed from: i */
    private ha f7299i;

    /* renamed from: j */
    private boolean f7300j;

    /* loaded from: classes.dex */
    public static final class a {
        private final go.b a;

        /* renamed from: b */
        private ab f7301b = ab.h();

        /* renamed from: c */
        private cb f7302c = cb.h();

        /* renamed from: d */
        private wd.a f7303d;

        /* renamed from: e */
        private wd.a f7304e;

        /* renamed from: f */
        private wd.a f7305f;

        public a(go.b bVar) {
            this.a = bVar;
        }

        public wd.a b() {
            if (this.f7301b.isEmpty()) {
                return null;
            }
            return (wd.a) rb.b(this.f7301b);
        }

        public wd.a c() {
            return this.f7304e;
        }

        public wd.a d() {
            return this.f7305f;
        }

        private void a(cb.a aVar, wd.a aVar2, go goVar) {
            if (aVar2 == null) {
                return;
            }
            if (goVar.a(aVar2.a) != -1) {
                aVar.a(aVar2, goVar);
                return;
            }
            go goVar2 = (go) this.f7302c.get(aVar2);
            if (goVar2 != null) {
                aVar.a(aVar2, goVar2);
            }
        }

        public void b(nh nhVar) {
            this.f7303d = a(nhVar, this.f7301b, this.f7304e, this.a);
            a(nhVar.n());
        }

        private static wd.a a(nh nhVar, ab abVar, wd.a aVar, go.b bVar) {
            go n10 = nhVar.n();
            int v10 = nhVar.v();
            Object b3 = n10.c() ? null : n10.b(v10);
            int a = (nhVar.d() || n10.c()) ? -1 : n10.a(v10, bVar).a(r2.a(nhVar.getCurrentPosition()) - bVar.e());
            for (int i10 = 0; i10 < abVar.size(); i10++) {
                wd.a aVar2 = (wd.a) abVar.get(i10);
                if (a(aVar2, b3, nhVar.d(), nhVar.E(), nhVar.f(), a)) {
                    return aVar2;
                }
            }
            if (abVar.isEmpty() && aVar != null) {
                if (a(aVar, b3, nhVar.d(), nhVar.E(), nhVar.f(), a)) {
                    return aVar;
                }
            }
            return null;
        }

        public wd.a a() {
            return this.f7303d;
        }

        public go a(wd.a aVar) {
            return (go) this.f7302c.get(aVar);
        }

        private static boolean a(wd.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (aVar.a.equals(obj)) {
                return (z10 && aVar.f8260b == i10 && aVar.f8261c == i11) || (!z10 && aVar.f8260b == -1 && aVar.f8263e == i12);
            }
            return false;
        }

        public void a(nh nhVar) {
            this.f7303d = a(nhVar, this.f7301b, this.f7304e, this.a);
        }

        public void a(List list, wd.a aVar, nh nhVar) {
            this.f7301b = ab.a((Collection) list);
            if (!list.isEmpty()) {
                this.f7304e = (wd.a) list.get(0);
                this.f7305f = (wd.a) a1.a(aVar);
            }
            if (this.f7303d == null) {
                this.f7303d = a(nhVar, this.f7301b, this.f7304e, this.a);
            }
            a(nhVar.n());
        }

        private void a(go goVar) {
            cb.a a = cb.a();
            if (this.f7301b.isEmpty()) {
                a(a, this.f7304e, goVar);
                if (!Objects.equal(this.f7305f, this.f7304e)) {
                    a(a, this.f7305f, goVar);
                }
                if (!Objects.equal(this.f7303d, this.f7304e) && !Objects.equal(this.f7303d, this.f7305f)) {
                    a(a, this.f7303d, goVar);
                }
            } else {
                for (int i10 = 0; i10 < this.f7301b.size(); i10++) {
                    a(a, (wd.a) this.f7301b.get(i10), goVar);
                }
                if (!this.f7301b.contains(this.f7303d)) {
                    a(a, this.f7303d, goVar);
                }
            }
            this.f7302c = a.a();
        }
    }

    public r0(j3 j3Var) {
        this.a = (j3) a1.a(j3Var);
        this.f7297g = new cc(yp.d(), j3Var, new lu(6));
        go.b bVar = new go.b();
        this.f7293b = bVar;
        this.f7294c = new go.d();
        this.f7295d = new a(bVar);
        this.f7296f = new SparseArray();
    }

    public static /* synthetic */ void a(s0 s0Var, z8 z8Var) {
    }

    public static /* synthetic */ void b(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.b(aVar, l5Var);
        s0Var.a(aVar, 1, l5Var);
    }

    public final s0.a c() {
        return a(this.f7295d.a());
    }

    private s0.a a(wd.a aVar) {
        a1.a(this.f7298h);
        go a10 = aVar == null ? null : this.f7295d.a(aVar);
        if (aVar != null && a10 != null) {
            return a(a10, a10.a(aVar.a, this.f7293b).f4958c, aVar);
        }
        int t5 = this.f7298h.t();
        go n10 = this.f7298h.n();
        if (t5 >= n10.b()) {
            n10 = go.a;
        }
        return a(n10, t5, (wd.a) null);
    }

    private s0.a d() {
        return a(this.f7295d.b());
    }

    private s0.a e() {
        return a(this.f7295d.c());
    }

    private s0.a f(int i10, wd.a aVar) {
        a1.a(this.f7298h);
        if (aVar != null) {
            if (this.f7295d.a(aVar) != null) {
                return a(aVar);
            }
            return a(go.a, i10, aVar);
        }
        go n10 = this.f7298h.n();
        if (i10 >= n10.b()) {
            n10 = go.a;
        }
        return a(n10, i10, (wd.a) null);
    }

    public final void h() {
        if (this.f7300j) {
            return;
        }
        s0.a c10 = c();
        this.f7300j = true;
        a(c10, -1, new ev(c10, 5));
    }

    public void i() {
        s0.a c10 = c();
        this.f7296f.put(1036, c10);
        a(c10, 1036, new ev(c10, 3));
        ((ha) a1.b(this.f7299i)).a((Runnable) new nt(this, 13));
    }

    public /* synthetic */ void g() {
        this.f7297g.b();
    }

    public static /* synthetic */ void c(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.d(aVar, l5Var);
        s0Var.b(aVar, 2, l5Var);
    }

    public static /* synthetic */ void d(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.a(aVar, l5Var);
        s0Var.a(aVar, 2, l5Var);
    }

    @Override // com.applovin.impl.p1
    public final void c(Exception exc) {
        s0.a f10 = f();
        a(f10, 1037, new vu(f10, exc, 0));
    }

    @Override // com.applovin.impl.y6
    public final void d(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1031, new ev(f10, 1));
    }

    public static /* synthetic */ void b(s0.a aVar, String str, long j3, long j10, s0 s0Var) {
        s0Var.b(aVar, str, j3);
        s0Var.a(aVar, str, j10, j3);
        s0Var.a(aVar, 2, str, j3);
    }

    private s0.a f() {
        return a(this.f7295d.d());
    }

    public final s0.a a(go goVar, int i10, wd.a aVar) {
        long b3;
        wd.a aVar2 = goVar.c() ? null : aVar;
        long c10 = this.a.c();
        boolean z10 = goVar.equals(this.f7298h.n()) && i10 == this.f7298h.t();
        if (aVar2 != null && aVar2.a()) {
            if (z10 && this.f7298h.E() == aVar2.f8260b && this.f7298h.f() == aVar2.f8261c) {
                b3 = this.f7298h.getCurrentPosition();
            }
            b3 = 0;
        } else if (z10) {
            b3 = this.f7298h.g();
        } else {
            if (!goVar.c()) {
                b3 = goVar.a(i10, this.f7294c).b();
            }
            b3 = 0;
        }
        return new s0.a(c10, goVar, i10, aVar2, b3, this.f7298h.n(), this.f7298h.t(), this.f7295d.a(), this.f7298h.getCurrentPosition(), this.f7298h.h());
    }

    @Override // com.applovin.impl.p1
    public final void c(l5 l5Var) {
        s0.a e2 = e();
        a(e2, 1014, new yu(e2, 3, l5Var));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void d(boolean z10) {
        s0.a c10 = c();
        a(c10, 7, new iv(c10, z10, 0));
    }

    @Override // com.applovin.impl.y6
    public final void c(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1033, new ev(f10, 2));
    }

    @Override // com.applovin.impl.xq
    public final void d(l5 l5Var) {
        s0.a f10 = f();
        a(f10, 1020, new yu(f10, 0, l5Var));
    }

    public static /* synthetic */ void b(s0.a aVar, d9 d9Var, o5 o5Var, s0 s0Var) {
        s0Var.a(aVar, d9Var);
        s0Var.a(aVar, d9Var, o5Var);
        s0Var.a(aVar, 2, d9Var);
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void c(boolean z10) {
        s0.a c10 = c();
        a(c10, 3, new iv(c10, z10, 2));
    }

    @Override // com.applovin.impl.p1
    public final void b(String str) {
        s0.a f10 = f();
        a(f10, 1013, new jv(f10, str, 1));
    }

    @Override // com.applovin.impl.xd
    public final void c(int i10, wd.a aVar, ic icVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1001, new dv(f10, icVar, pdVar, 1));
    }

    @Override // com.applovin.impl.p1
    public final void b(d9 d9Var, o5 o5Var) {
        s0.a f10 = f();
        a(f10, 1010, new fv(f10, d9Var, o5Var, 0));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void c(int i10) {
        s0.a c10 = c();
        a(c10, 8, new zu(c10, i10, 0));
    }

    @Override // com.applovin.impl.p1
    public final void b(int i10, long j3, long j10) {
        s0.a f10 = f();
        a(f10, 1012, new wu(f10, i10, j3, j10, 0));
    }

    @Override // com.applovin.impl.y6
    public final void b(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1035, new ev(f10, 6));
    }

    @Override // com.applovin.impl.xd
    public final void b(int i10, wd.a aVar, ic icVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1000, new dv(f10, icVar, pdVar, 2));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void b(int i10) {
        s0.a c10 = c();
        a(c10, 4, new zu(c10, i10, 4));
    }

    @Override // com.applovin.impl.nh.c
    public final void b(boolean z10, int i10) {
        s0.a c10 = c();
        a(c10, -1, new hv(c10, z10, i10, 1));
    }

    public static /* synthetic */ void a(s0.a aVar, String str, long j3, long j10, s0 s0Var) {
        s0Var.a(aVar, str, j3);
        s0Var.b(aVar, str, j10, j3);
        s0Var.a(aVar, 1, str, j3);
    }

    @Override // com.applovin.impl.nh.c
    public final void b() {
        s0.a c10 = c();
        a(c10, -1, new ev(c10, 4));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void b(boolean z10) {
        s0.a c10 = c();
        a(c10, 9, new iv(c10, z10, 3));
    }

    public static /* synthetic */ void a(s0.a aVar, l5 l5Var, s0 s0Var) {
        s0Var.c(aVar, l5Var);
        s0Var.b(aVar, 1, l5Var);
    }

    @Override // com.applovin.impl.xq
    public final void b(Exception exc) {
        s0.a f10 = f();
        a(f10, 1038, new vu(f10, exc, 3));
    }

    public static /* synthetic */ void a(s0.a aVar, d9 d9Var, o5 o5Var, s0 s0Var) {
        s0Var.b(aVar, d9Var);
        s0Var.b(aVar, d9Var, o5Var);
        s0Var.a(aVar, 1, d9Var);
    }

    @Override // com.applovin.impl.xq
    public final void b(String str, long j3, long j10) {
        s0.a f10 = f();
        a(f10, 1021, new mv(f10, str, j10, j3, 0));
    }

    @Override // com.applovin.impl.xq
    public final void b(l5 l5Var) {
        s0.a e2 = e();
        a(e2, 1025, new yu(e2, 2, l5Var));
    }

    public static /* synthetic */ void a(s0.a aVar, int i10, s0 s0Var) {
        s0Var.f(aVar);
        s0Var.b(aVar, i10);
    }

    public static /* synthetic */ void a(s0.a aVar, boolean z10, s0 s0Var) {
        s0Var.c(aVar, z10);
        s0Var.e(aVar, z10);
    }

    public static /* synthetic */ void a(s0.a aVar, int i10, nh.f fVar, nh.f fVar2, s0 s0Var) {
        s0Var.a(aVar, i10);
        s0Var.a(aVar, fVar, fVar2, i10);
    }

    public static /* synthetic */ void a(s0.a aVar, yq yqVar, s0 s0Var) {
        s0Var.a(aVar, yqVar);
        s0Var.a(aVar, yqVar.a, yqVar.f9269b, yqVar.f9270c, yqVar.f9271d);
    }

    public /* synthetic */ void a(nh nhVar, s0 s0Var, z8 z8Var) {
        s0Var.a(nhVar, new s0.b(z8Var, this.f7296f));
    }

    @Override // com.applovin.impl.p1
    public final void a(String str, long j3, long j10) {
        s0.a f10 = f();
        a(f10, 1009, new mv(f10, str, j10, j3, 1));
    }

    @Override // com.applovin.impl.p1
    public final void a(l5 l5Var) {
        s0.a f10 = f();
        a(f10, 1008, new yu(f10, 1, l5Var));
    }

    @Override // com.applovin.impl.p1
    public final void a(long j3) {
        s0.a f10 = f();
        a(f10, 1011, new av(f10, j3, 0));
    }

    @Override // com.applovin.impl.p1
    public final void a(Exception exc) {
        s0.a f10 = f();
        a(f10, 1018, new vu(f10, exc, 2));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void a(nh.b bVar) {
        s0.a c10 = c();
        a(c10, 13, new os(10, c10, bVar));
    }

    @Override // com.applovin.impl.x1.a
    public final void a(int i10, long j3, long j10) {
        s0.a d10 = d();
        a(d10, 1006, new wu(d10, i10, j3, j10, 1));
    }

    @Override // com.applovin.impl.xd
    public final void a(int i10, wd.a aVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1004, new os(7, f10, pdVar));
    }

    @Override // com.applovin.impl.y6
    public final void a(int i10, wd.a aVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1034, new ev(f10, 0));
    }

    @Override // com.applovin.impl.y6
    public final void a(int i10, wd.a aVar, int i11) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1030, new zu(f10, i11, 2));
    }

    @Override // com.applovin.impl.y6
    public final void a(int i10, wd.a aVar, Exception exc) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1032, new vu(f10, exc, 1));
    }

    @Override // com.applovin.impl.xq
    public final void a(int i10, long j3) {
        s0.a e2 = e();
        a(e2, 1023, new kv(e2, i10, j3));
    }

    @Override // com.applovin.impl.xd
    public final void a(int i10, wd.a aVar, ic icVar, pd pdVar) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1002, new dv(f10, icVar, pdVar, 0));
    }

    @Override // com.applovin.impl.xd
    public final void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
        s0.a f10 = f(i10, aVar);
        a(f10, 1003, new xu(f10, icVar, pdVar, iOException, z10));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(od odVar, int i10) {
        s0.a c10 = c();
        a(c10, 1, new ns(c10, odVar, i10));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void a(qd qdVar) {
        s0.a c10 = c();
        a(c10, 14, new os(8, c10, qdVar));
    }

    @Override // com.applovin.impl.nh.e
    public final void a(we weVar) {
        s0.a c10 = c();
        a(c10, 1007, new os(3, c10, weVar));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(boolean z10, int i10) {
        s0.a c10 = c();
        a(c10, 5, new hv(c10, z10, i10, 0));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(mh mhVar) {
        s0.a c10 = c();
        a(c10, 12, new os(6, c10, mhVar));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(int i10) {
        s0.a c10 = c();
        a(c10, 6, new zu(c10, i10, 1));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(kh khVar) {
        td tdVar;
        s0.a a10 = (!(khVar instanceof y7) || (tdVar = ((y7) khVar).f9147j) == null) ? null : a(new wd.a(tdVar));
        if (a10 == null) {
            a10 = c();
        }
        a(a10, 10, new os(4, a10, khVar));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(nh.f fVar, nh.f fVar2, int i10) {
        if (i10 == 1) {
            this.f7300j = false;
        }
        this.f7295d.a((nh) a1.a(this.f7298h));
        s0.a c10 = c();
        a(c10, 11, new lv(i10, c10, fVar, fVar2));
    }

    @Override // com.applovin.impl.xq
    public final void a(Object obj, long j3) {
        s0.a f10 = f();
        a(f10, 1027, new cv(f10, j3, obj));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.p1
    public final void a(boolean z10) {
        s0.a f10 = f();
        a(f10, 1017, new iv(f10, z10, 1));
    }

    @Override // com.applovin.impl.nh.e
    public void a(int i10, int i11) {
        s0.a f10 = f();
        a(f10, 1029, new bv(i10, i11, f10));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(go goVar, int i10) {
        this.f7295d.b((nh) a1.a(this.f7298h));
        s0.a c10 = c();
        a(c10, 0, new zu(c10, i10, 3));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(qo qoVar, uo uoVar) {
        s0.a c10 = c();
        a(c10, 2, new us(2, c10, qoVar, uoVar));
    }

    @Override // com.applovin.impl.xq
    public final void a(String str) {
        s0.a f10 = f();
        a(f10, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new jv(f10, str, 0));
    }

    @Override // com.applovin.impl.xq
    public final void a(long j3, int i10) {
        s0.a e2 = e();
        a(e2, 1026, new kv(e2, j3, i10));
    }

    @Override // com.applovin.impl.xq
    public final void a(d9 d9Var, o5 o5Var) {
        s0.a f10 = f();
        a(f10, 1022, new fv(f10, d9Var, o5Var, 1));
    }

    @Override // com.applovin.impl.nh.e
    public final void a(yq yqVar) {
        s0.a f10 = f();
        a(f10, 1028, new os(9, f10, yqVar));
    }

    @Override // com.applovin.impl.nh.e
    public final void a(float f10) {
        s0.a f11 = f();
        a(f11, 1019, new gv(f11, f10));
    }

    public final void a(s0.a aVar, int i10, cc.a aVar2) {
        this.f7296f.put(i10, aVar);
        this.f7297g.b(i10, aVar2);
    }

    public void a(nh nhVar, Looper looper) {
        a1.b(this.f7298h == null || this.f7295d.f7301b.isEmpty());
        this.f7298h = (nh) a1.a(nhVar);
        this.f7299i = this.a.a(looper, null);
        this.f7297g = this.f7297g.a(looper, new os(5, this, nhVar));
    }

    public final void a(List list, wd.a aVar) {
        this.f7295d.a(list, aVar, (nh) a1.a(this.f7298h));
    }
}
