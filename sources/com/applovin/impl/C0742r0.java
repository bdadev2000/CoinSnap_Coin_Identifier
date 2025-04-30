package com.applovin.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.InterfaceC0775x1;
import com.applovin.impl.cb;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.wd;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* renamed from: com.applovin.impl.r0 */
/* loaded from: classes.dex */
public class C0742r0 implements nh.e, InterfaceC0736p1, xq, xd, InterfaceC0775x1.a, y6 {

    /* renamed from: a */
    private final j3 f10428a;
    private final go.b b;

    /* renamed from: c */
    private final go.d f10429c;

    /* renamed from: d */
    private final a f10430d;

    /* renamed from: f */
    private final SparseArray f10431f;

    /* renamed from: g */
    private cc f10432g;

    /* renamed from: h */
    private nh f10433h;

    /* renamed from: i */
    private ha f10434i;

    /* renamed from: j */
    private boolean f10435j;

    /* renamed from: com.applovin.impl.r0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final go.b f10436a;
        private ab b = ab.h();

        /* renamed from: c */
        private cb f10437c = cb.h();

        /* renamed from: d */
        private wd.a f10438d;

        /* renamed from: e */
        private wd.a f10439e;

        /* renamed from: f */
        private wd.a f10440f;

        public a(go.b bVar) {
            this.f10436a = bVar;
        }

        public wd.a b() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (wd.a) rb.b(this.b);
        }

        public wd.a c() {
            return this.f10439e;
        }

        public wd.a d() {
            return this.f10440f;
        }

        private void a(cb.a aVar, wd.a aVar2, go goVar) {
            if (aVar2 == null) {
                return;
            }
            if (goVar.a(aVar2.f11475a) != -1) {
                aVar.a(aVar2, goVar);
                return;
            }
            go goVar2 = (go) this.f10437c.get(aVar2);
            if (goVar2 != null) {
                aVar.a(aVar2, goVar2);
            }
        }

        public void b(nh nhVar) {
            this.f10438d = a(nhVar, this.b, this.f10439e, this.f10436a);
            a(nhVar.n());
        }

        private static wd.a a(nh nhVar, ab abVar, wd.a aVar, go.b bVar) {
            go n2 = nhVar.n();
            int v6 = nhVar.v();
            Object b = n2.c() ? null : n2.b(v6);
            int a6 = (nhVar.d() || n2.c()) ? -1 : n2.a(v6, bVar).a(AbstractC0744r2.a(nhVar.getCurrentPosition()) - bVar.e());
            for (int i9 = 0; i9 < abVar.size(); i9++) {
                wd.a aVar2 = (wd.a) abVar.get(i9);
                if (a(aVar2, b, nhVar.d(), nhVar.E(), nhVar.f(), a6)) {
                    return aVar2;
                }
            }
            if (abVar.isEmpty() && aVar != null) {
                if (a(aVar, b, nhVar.d(), nhVar.E(), nhVar.f(), a6)) {
                    return aVar;
                }
            }
            return null;
        }

        public wd.a a() {
            return this.f10438d;
        }

        public go a(wd.a aVar) {
            return (go) this.f10437c.get(aVar);
        }

        private static boolean a(wd.a aVar, Object obj, boolean z8, int i9, int i10, int i11) {
            if (aVar.f11475a.equals(obj)) {
                return (z8 && aVar.b == i9 && aVar.f11476c == i10) || (!z8 && aVar.b == -1 && aVar.f11478e == i11);
            }
            return false;
        }

        public void a(nh nhVar) {
            this.f10438d = a(nhVar, this.b, this.f10439e, this.f10436a);
        }

        public void a(List list, wd.a aVar, nh nhVar) {
            this.b = ab.a((Collection) list);
            if (!list.isEmpty()) {
                this.f10439e = (wd.a) list.get(0);
                this.f10440f = (wd.a) AbstractC0669a1.a(aVar);
            }
            if (this.f10438d == null) {
                this.f10438d = a(nhVar, this.b, this.f10439e, this.f10436a);
            }
            a(nhVar.n());
        }

        private void a(go goVar) {
            cb.a a6 = cb.a();
            if (this.b.isEmpty()) {
                a(a6, this.f10439e, goVar);
                if (!Objects.equal(this.f10440f, this.f10439e)) {
                    a(a6, this.f10440f, goVar);
                }
                if (!Objects.equal(this.f10438d, this.f10439e) && !Objects.equal(this.f10438d, this.f10440f)) {
                    a(a6, this.f10438d, goVar);
                }
            } else {
                for (int i9 = 0; i9 < this.b.size(); i9++) {
                    a(a6, (wd.a) this.b.get(i9), goVar);
                }
                if (!this.b.contains(this.f10438d)) {
                    a(a6, this.f10438d, goVar);
                }
            }
            this.f10437c = a6.a();
        }
    }

    public C0742r0(j3 j3Var) {
        this.f10428a = (j3) AbstractC0669a1.a(j3Var);
        this.f10432g = new cc(yp.d(), j3Var, new C1(7));
        go.b bVar = new go.b();
        this.b = bVar;
        this.f10429c = new go.d();
        this.f10430d = new a(bVar);
        this.f10431f = new SparseArray();
    }

    public static /* synthetic */ void L(InterfaceC0746s0.a aVar, mh mhVar, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, mhVar);
    }

    public static /* synthetic */ void R(InterfaceC0746s0.a aVar, we weVar, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, weVar);
    }

    public static /* synthetic */ void X(InterfaceC0746s0.a aVar, qd qdVar, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, qdVar);
    }

    public static /* synthetic */ void a(InterfaceC0746s0 interfaceC0746s0, z8 z8Var) {
    }

    public static /* synthetic */ void b(InterfaceC0746s0.a aVar, l5 l5Var, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.b(aVar, l5Var);
        interfaceC0746s0.a(aVar, 1, l5Var);
    }

    public static /* synthetic */ void c0(InterfaceC0746s0.a aVar, yq yqVar, InterfaceC0746s0 interfaceC0746s0) {
        a(aVar, yqVar, interfaceC0746s0);
    }

    private InterfaceC0746s0.a d() {
        return a(this.f10430d.b());
    }

    private InterfaceC0746s0.a e() {
        return a(this.f10430d.c());
    }

    private InterfaceC0746s0.a f(int i9, wd.a aVar) {
        AbstractC0669a1.a(this.f10433h);
        if (aVar != null) {
            if (this.f10430d.a(aVar) != null) {
                return a(aVar);
            }
            return a(go.f7931a, i9, aVar);
        }
        go n2 = this.f10433h.n();
        if (i9 >= n2.b()) {
            n2 = go.f7931a;
        }
        return a(n2, i9, (wd.a) null);
    }

    public static /* synthetic */ void h0(InterfaceC0746s0.a aVar, kh khVar, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, khVar);
    }

    public static /* synthetic */ void q(InterfaceC0746s0.a aVar, nh.b bVar, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, bVar);
    }

    public static /* synthetic */ void w(InterfaceC0746s0.a aVar, pd pdVar, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, pdVar);
    }

    public static /* synthetic */ void x(C0742r0 c0742r0, nh nhVar, InterfaceC0746s0 interfaceC0746s0, z8 z8Var) {
        c0742r0.a(nhVar, interfaceC0746s0, z8Var);
    }

    public final InterfaceC0746s0.a c() {
        return a(this.f10430d.a());
    }

    private InterfaceC0746s0.a a(wd.a aVar) {
        AbstractC0669a1.a(this.f10433h);
        go a6 = aVar == null ? null : this.f10430d.a(aVar);
        if (aVar != null && a6 != null) {
            return a(a6, a6.a(aVar.f11475a, this.b).f7934c, aVar);
        }
        int t9 = this.f10433h.t();
        go n2 = this.f10433h.n();
        if (t9 >= n2.b()) {
            n2 = go.f7931a;
        }
        return a(n2, t9, (wd.a) null);
    }

    public /* synthetic */ void g() {
        this.f10432g.b();
    }

    public final void h() {
        if (this.f10435j) {
            return;
        }
        InterfaceC0746s0.a c9 = c();
        this.f10435j = true;
        a(c9, -1, new O1(c9, 0));
    }

    public void i() {
        InterfaceC0746s0.a c9 = c();
        this.f10431f.put(1036, c9);
        a(c9, 1036, new O1(c9, 1));
        ((ha) AbstractC0669a1.b(this.f10434i)).a((Runnable) new F0(this, 13));
    }

    public static /* synthetic */ void d(InterfaceC0746s0.a aVar, l5 l5Var, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, l5Var);
        interfaceC0746s0.a(aVar, 2, l5Var);
    }

    public static /* synthetic */ void c(InterfaceC0746s0.a aVar, l5 l5Var, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.d(aVar, l5Var);
        interfaceC0746s0.b(aVar, 2, l5Var);
    }

    @Override // com.applovin.impl.y6
    public final void d(int i9, wd.a aVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1031, new O1(f9, 4));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void c(Exception exc) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1037, new T1(f9, exc, 0));
    }

    public static /* synthetic */ void b(InterfaceC0746s0.a aVar, String str, long j7, long j9, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.b(aVar, str, j7);
        interfaceC0746s0.a(aVar, str, j9, j7);
        interfaceC0746s0.a(aVar, 2, str, j7);
    }

    private InterfaceC0746s0.a f() {
        return a(this.f10430d.d());
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void d(boolean z8) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 7, new N1(0, c9, z8));
    }

    public final InterfaceC0746s0.a a(go goVar, int i9, wd.a aVar) {
        long b;
        wd.a aVar2 = goVar.c() ? null : aVar;
        long c9 = this.f10428a.c();
        boolean z8 = goVar.equals(this.f10433h.n()) && i9 == this.f10433h.t();
        if (aVar2 != null && aVar2.a()) {
            if (z8 && this.f10433h.E() == aVar2.b && this.f10433h.f() == aVar2.f11476c) {
                b = this.f10433h.getCurrentPosition();
            }
            b = 0;
        } else if (z8) {
            b = this.f10433h.g();
        } else {
            if (!goVar.c()) {
                b = goVar.a(i9, this.f10429c).b();
            }
            b = 0;
        }
        return new InterfaceC0746s0.a(c9, goVar, i9, aVar2, b, this.f10433h.n(), this.f10433h.t(), this.f10430d.a(), this.f10433h.getCurrentPosition(), this.f10433h.h());
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void c(l5 l5Var) {
        InterfaceC0746s0.a e4 = e();
        a(e4, 1014, new M1(e4, 2, l5Var));
    }

    @Override // com.applovin.impl.xq
    public final void d(l5 l5Var) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1020, new M1(f9, 0, l5Var));
    }

    @Override // com.applovin.impl.y6
    public final void c(int i9, wd.a aVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1033, new O1(f9, 2));
    }

    public static /* synthetic */ void b(InterfaceC0746s0.a aVar, d9 d9Var, o5 o5Var, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, d9Var);
        interfaceC0746s0.a(aVar, d9Var, o5Var);
        interfaceC0746s0.a(aVar, 2, d9Var);
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void c(boolean z8) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 3, new N1(2, c9, z8));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void b(String str) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1013, new U1(f9, str, 0));
    }

    @Override // com.applovin.impl.xd
    public final void c(int i9, wd.a aVar, ic icVar, pd pdVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1001, new A2(f9, icVar, pdVar, 2));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void b(d9 d9Var, o5 o5Var) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1010, new P1(f9, d9Var, o5Var, 0));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void c(int i9) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 8, new L1(c9, i9, 3));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void b(int i9, long j7, long j9) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1012, new Q1(f9, i9, j7, j9, 0));
    }

    @Override // com.applovin.impl.y6
    public final void b(int i9, wd.a aVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1035, new O1(f9, 6));
    }

    @Override // com.applovin.impl.xd
    public final void b(int i9, wd.a aVar, ic icVar, pd pdVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1000, new A2(f9, icVar, pdVar, 1));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void b(int i9) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 4, new L1(c9, i9, 2));
    }

    @Override // com.applovin.impl.nh.c
    public final void b(boolean z8, int i9) {
        InterfaceC0746s0.a c9 = c();
        a(c9, -1, new X1(c9, z8, i9, 0));
    }

    public static /* synthetic */ void a(InterfaceC0746s0.a aVar, String str, long j7, long j9, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, str, j7);
        interfaceC0746s0.b(aVar, str, j9, j7);
        interfaceC0746s0.a(aVar, 1, str, j7);
    }

    @Override // com.applovin.impl.nh.c
    public final void b() {
        InterfaceC0746s0.a c9 = c();
        a(c9, -1, new O1(c9, 5));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void b(boolean z8) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 9, new N1(1, c9, z8));
    }

    public static /* synthetic */ void a(InterfaceC0746s0.a aVar, l5 l5Var, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.c(aVar, l5Var);
        interfaceC0746s0.b(aVar, 1, l5Var);
    }

    @Override // com.applovin.impl.xq
    public final void b(Exception exc) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1038, new T1(f9, exc, 2));
    }

    public static /* synthetic */ void a(InterfaceC0746s0.a aVar, d9 d9Var, o5 o5Var, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.b(aVar, d9Var);
        interfaceC0746s0.b(aVar, d9Var, o5Var);
        interfaceC0746s0.a(aVar, 1, d9Var);
    }

    @Override // com.applovin.impl.xq
    public final void b(String str, long j7, long j9) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1021, new Z1(f9, str, j9, j7, 1));
    }

    @Override // com.applovin.impl.xq
    public final void b(l5 l5Var) {
        InterfaceC0746s0.a e4 = e();
        a(e4, 1025, new M1(e4, 1, l5Var));
    }

    public static /* synthetic */ void a(InterfaceC0746s0.a aVar, int i9, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.f(aVar);
        interfaceC0746s0.b(aVar, i9);
    }

    public static /* synthetic */ void a(InterfaceC0746s0.a aVar, boolean z8, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.c(aVar, z8);
        interfaceC0746s0.e(aVar, z8);
    }

    public static /* synthetic */ void a(InterfaceC0746s0.a aVar, int i9, nh.f fVar, nh.f fVar2, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, i9);
        interfaceC0746s0.a(aVar, fVar, fVar2, i9);
    }

    public static /* synthetic */ void a(InterfaceC0746s0.a aVar, yq yqVar, InterfaceC0746s0 interfaceC0746s0) {
        interfaceC0746s0.a(aVar, yqVar);
        interfaceC0746s0.a(aVar, yqVar.f12465a, yqVar.b, yqVar.f12466c, yqVar.f12467d);
    }

    public /* synthetic */ void a(nh nhVar, InterfaceC0746s0 interfaceC0746s0, z8 z8Var) {
        interfaceC0746s0.a(nhVar, new InterfaceC0746s0.b(z8Var, this.f10431f));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void a(String str, long j7, long j9) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1009, new Z1(f9, str, j9, j7, 0));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void a(l5 l5Var) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1008, new M1(f9, 3, l5Var));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void a(long j7) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1011, new C2(f9, j7));
    }

    @Override // com.applovin.impl.InterfaceC0736p1
    public final void a(Exception exc) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1018, new T1(f9, exc, 1));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void a(nh.b bVar) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 13, new B(3, c9, bVar));
    }

    @Override // com.applovin.impl.InterfaceC0775x1.a
    public final void a(int i9, long j7, long j9) {
        InterfaceC0746s0.a d2 = d();
        a(d2, 1006, new Q1(d2, i9, j7, j9, 1));
    }

    @Override // com.applovin.impl.xd
    public final void a(int i9, wd.a aVar, pd pdVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new B(5, f9, pdVar));
    }

    @Override // com.applovin.impl.y6
    public final void a(int i9, wd.a aVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1034, new O1(f9, 3));
    }

    @Override // com.applovin.impl.y6
    public final void a(int i9, wd.a aVar, int i10) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1030, new L1(f9, i10, 0));
    }

    @Override // com.applovin.impl.y6
    public final void a(int i9, wd.a aVar, Exception exc) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1032, new T1(f9, exc, 3));
    }

    @Override // com.applovin.impl.xq
    public final void a(int i9, long j7) {
        InterfaceC0746s0.a e4 = e();
        a(e4, 1023, new Y1(e4, i9, j7));
    }

    @Override // com.applovin.impl.xd
    public final void a(int i9, wd.a aVar, ic icVar, pd pdVar) {
        InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1002, new A2(f9, icVar, pdVar, 0));
    }

    @Override // com.applovin.impl.xd
    public final void a(int i9, wd.a aVar, final ic icVar, final pd pdVar, final IOException iOException, final boolean z8) {
        final InterfaceC0746s0.a f9 = f(i9, aVar);
        a(f9, 1003, new cc.a() { // from class: com.applovin.impl.R1
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((InterfaceC0746s0) obj).a(InterfaceC0746s0.a.this, icVar, pdVar, iOException, z8);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(od odVar, int i9) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 1, new J(c9, odVar, i9));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public void a(qd qdVar) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 14, new B(8, c9, qdVar));
    }

    @Override // com.applovin.impl.nh.e
    public final void a(we weVar) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 1007, new B(7, c9, weVar));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(boolean z8, int i9) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 5, new X1(c9, z8, i9, 1));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(mh mhVar) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 12, new B(6, c9, mhVar));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(int i9) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 6, new L1(c9, i9, 4));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(kh khVar) {
        td tdVar;
        InterfaceC0746s0.a a6 = (!(khVar instanceof y7) || (tdVar = ((y7) khVar).f12350j) == null) ? null : a(new wd.a(tdVar));
        if (a6 == null) {
            a6 = c();
        }
        a(a6, 10, new B(9, a6, khVar));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(final nh.f fVar, final nh.f fVar2, final int i9) {
        if (i9 == 1) {
            this.f10435j = false;
        }
        this.f10430d.a((nh) AbstractC0669a1.a(this.f10433h));
        final InterfaceC0746s0.a c9 = c();
        a(c9, 11, new cc.a() { // from class: com.applovin.impl.S1
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                C0742r0.a(InterfaceC0746s0.a.this, i9, fVar, fVar2, (InterfaceC0746s0) obj);
            }
        });
    }

    @Override // com.applovin.impl.xq
    public final void a(Object obj, long j7) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1027, new V1(f9, obj, j7));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.InterfaceC0736p1
    public final void a(boolean z8) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1017, new N1(3, f9, z8));
    }

    @Override // com.applovin.impl.nh.e
    public void a(final int i9, final int i10) {
        final InterfaceC0746s0.a f9 = f();
        a(f9, 1029, new cc.a() { // from class: com.applovin.impl.B2
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((InterfaceC0746s0) obj).a(InterfaceC0746s0.a.this, i9, i10);
            }
        });
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(go goVar, int i9) {
        this.f10430d.b((nh) AbstractC0669a1.a(this.f10433h));
        InterfaceC0746s0.a c9 = c();
        a(c9, 0, new L1(c9, i9, 1));
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public final void a(qo qoVar, uo uoVar) {
        InterfaceC0746s0.a c9 = c();
        a(c9, 2, new N(c9, qoVar, uoVar, 2));
    }

    @Override // com.applovin.impl.xq
    public final void a(String str) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1024, new U1(f9, str, 1));
    }

    @Override // com.applovin.impl.xq
    public final void a(long j7, int i9) {
        InterfaceC0746s0.a e4 = e();
        a(e4, 1026, new Y1(e4, j7, i9));
    }

    @Override // com.applovin.impl.xq
    public final void a(d9 d9Var, o5 o5Var) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1022, new P1(f9, d9Var, o5Var, 1));
    }

    @Override // com.applovin.impl.nh.e
    public final void a(yq yqVar) {
        InterfaceC0746s0.a f9 = f();
        a(f9, 1028, new B(10, f9, yqVar));
    }

    @Override // com.applovin.impl.nh.e
    public final void a(final float f9) {
        final InterfaceC0746s0.a f10 = f();
        a(f10, 1019, new cc.a() { // from class: com.applovin.impl.W1
            @Override // com.applovin.impl.cc.a
            public final void a(Object obj) {
                ((InterfaceC0746s0) obj).a(InterfaceC0746s0.a.this, f9);
            }
        });
    }

    public final void a(InterfaceC0746s0.a aVar, int i9, cc.a aVar2) {
        this.f10431f.put(i9, aVar);
        this.f10432g.b(i9, aVar2);
    }

    public void a(nh nhVar, Looper looper) {
        AbstractC0669a1.b(this.f10433h == null || this.f10430d.b.isEmpty());
        this.f10433h = (nh) AbstractC0669a1.a(nhVar);
        this.f10434i = this.f10428a.a(looper, null);
        this.f10432g = this.f10432g.a(looper, new B(4, this, nhVar));
    }

    public final void a(List list, wd.a aVar) {
        this.f10430d.a(list, aVar, (nh) AbstractC0669a1.a(this.f10433h));
    }
}
