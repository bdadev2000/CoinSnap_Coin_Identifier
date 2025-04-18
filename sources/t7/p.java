package t7;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.applovin.impl.bv;
import com.applovin.impl.gv;
import com.applovin.impl.lv;
import com.applovin.impl.xu;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.r0;
import com.google.common.collect.u0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import n9.c0;
import n9.h0;
import s7.b2;
import s7.d2;
import s7.e2;
import s7.g2;
import s7.h2;
import s7.i0;
import s7.j1;
import s7.l1;
import s7.v2;
import s7.w2;
import s7.x2;
import s7.z2;
import v8.z;

/* loaded from: classes3.dex */
public final class p implements a {

    /* renamed from: b, reason: collision with root package name */
    public final n9.a f25315b;

    /* renamed from: c, reason: collision with root package name */
    public final v2 f25316c;

    /* renamed from: d, reason: collision with root package name */
    public final w2 f25317d;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.appcompat.widget.v f25318f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f25319g;

    /* renamed from: h, reason: collision with root package name */
    public x.e f25320h;

    /* renamed from: i, reason: collision with root package name */
    public h2 f25321i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25322j;

    public p(n9.a aVar) {
        aVar.getClass();
        this.f25315b = aVar;
        int i10 = h0.a;
        Looper myLooper = Looper.myLooper();
        this.f25320h = new x.e(myLooper == null ? Looper.getMainLooper() : myLooper, aVar, new nb.a(16));
        v2 v2Var = new v2();
        this.f25316c = v2Var;
        this.f25317d = new w2();
        this.f25318f = new androidx.appcompat.widget.v(v2Var);
        this.f25319g = new SparseArray();
    }

    @Override // s7.f2
    public final void A(e2 e2Var) {
    }

    @Override // x7.r
    public final void B(int i10, z zVar) {
        b O = O(i10, zVar);
        Q(O, 1026, new i(O, 3));
    }

    @Override // s7.f2
    public final void C(o9.z zVar) {
        b P = P();
        Q(P, 25, new androidx.fragment.app.e(20, P, zVar));
    }

    @Override // s7.f2
    public final void D(b2 b2Var) {
        b L = L();
        Q(L, 12, new androidx.fragment.app.e(18, L, b2Var));
    }

    @Override // v8.d0
    public final void E(int i10, z zVar, v8.p pVar, v8.u uVar) {
        b O = O(i10, zVar);
        Q(O, 1000, new s7.v(O, pVar, uVar, 1));
    }

    @Override // s7.f2
    public final void F(int i10, g2 g2Var, g2 g2Var2) {
        if (i10 == 1) {
            this.f25322j = false;
        }
        h2 h2Var = this.f25321i;
        h2Var.getClass();
        androidx.appcompat.widget.v vVar = this.f25318f;
        vVar.f1059d = androidx.appcompat.widget.v.e(h2Var, (r0) vVar.f1057b, (z) vVar.f1060e, (v2) vVar.a);
        b L = L();
        Q(L, 11, new lv(i10, L, g2Var, g2Var2));
    }

    @Override // s7.f2
    public final void G(z2 z2Var) {
        b L = L();
        Q(L, 2, new androidx.fragment.app.e(15, L, z2Var));
    }

    @Override // v8.d0
    public final void H(int i10, z zVar, v8.u uVar) {
        b O = O(i10, zVar);
        Q(O, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, new d(O, uVar, 1));
    }

    @Override // s7.f2
    public final void I() {
    }

    @Override // s7.f2
    public final void J(l8.b bVar) {
        b L = L();
        Q(L, 28, new androidx.fragment.app.e(11, L, bVar));
    }

    @Override // s7.f2
    public final void K(boolean z10) {
        b L = L();
        Q(L, 7, new m(1, L, z10));
    }

    public final b L() {
        return N((z) this.f25318f.f1059d);
    }

    public final b M(x2 x2Var, int i10, z zVar) {
        z zVar2;
        boolean z10;
        long Q;
        if (x2Var.p()) {
            zVar2 = null;
        } else {
            zVar2 = zVar;
        }
        ((c0) this.f25315b).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = true;
        if (x2Var.equals(((i0) this.f25321i).x()) && i10 == ((i0) this.f25321i).t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (zVar2 != null && zVar2.a()) {
            if (!z10 || ((i0) this.f25321i).r() != zVar2.f26318b || ((i0) this.f25321i).s() != zVar2.f26319c) {
                z11 = false;
            }
            if (z11) {
                Q = ((i0) this.f25321i).v();
            }
            Q = 0;
        } else if (z10) {
            i0 i0Var = (i0) this.f25321i;
            i0Var.S();
            Q = i0Var.q(i0Var.f24403f0);
        } else {
            if (!x2Var.p()) {
                Q = h0.Q(x2Var.m(i10, this.f25317d).f24851o);
            }
            Q = 0;
        }
        z zVar3 = (z) this.f25318f.f1059d;
        x2 x10 = ((i0) this.f25321i).x();
        int t5 = ((i0) this.f25321i).t();
        long v10 = ((i0) this.f25321i).v();
        i0 i0Var2 = (i0) this.f25321i;
        i0Var2.S();
        return new b(elapsedRealtime, x2Var, i10, zVar2, Q, x10, t5, zVar3, v10, h0.Q(i0Var2.f24403f0.f24280q));
    }

    public final b N(z zVar) {
        x2 x2Var;
        boolean z10;
        this.f25321i.getClass();
        if (zVar == null) {
            x2Var = null;
        } else {
            x2Var = (x2) ((u0) this.f25318f.f1058c).get(zVar);
        }
        if (zVar != null && x2Var != null) {
            return M(x2Var, x2Var.g(zVar.a, this.f25316c).f24787d, zVar);
        }
        int t5 = ((i0) this.f25321i).t();
        x2 x10 = ((i0) this.f25321i).x();
        if (t5 < x10.o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            x10 = x2.f24864b;
        }
        return M(x10, t5, null);
    }

    public final b O(int i10, z zVar) {
        this.f25321i.getClass();
        boolean z10 = true;
        if (zVar != null) {
            if (((x2) ((u0) this.f25318f.f1058c).get(zVar)) == null) {
                z10 = false;
            }
            if (z10) {
                return N(zVar);
            }
            return M(x2.f24864b, i10, zVar);
        }
        x2 x10 = ((i0) this.f25321i).x();
        if (i10 >= x10.o()) {
            z10 = false;
        }
        if (!z10) {
            x10 = x2.f24864b;
        }
        return M(x10, i10, null);
    }

    public final b P() {
        return N((z) this.f25318f.f1061f);
    }

    public final void Q(b bVar, int i10, n9.l lVar) {
        this.f25319g.put(i10, bVar);
        this.f25320h.k(i10, lVar);
    }

    public final void R(h2 h2Var, Looper looper) {
        boolean z10;
        if (this.f25321i != null && !((r0) this.f25318f.f1057b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        v8.u0.m(z10);
        h2Var.getClass();
        this.f25321i = h2Var;
        ((c0) this.f25315b).a(looper, null);
        x.e eVar = this.f25320h;
        androidx.fragment.app.e eVar2 = new androidx.fragment.app.e(14, this, h2Var);
        this.f25320h = new x.e((CopyOnWriteArraySet) eVar.f27261f, looper, (n9.a) eVar.f27258c, eVar2, eVar.f27257b);
    }

    @Override // s7.f2
    public final void a(int i10) {
        b L = L();
        Q(L, 6, new nb.a(L, i10, 1));
    }

    @Override // s7.f2
    public final void b(s7.r rVar) {
        b L;
        v8.x xVar;
        if ((rVar instanceof s7.r) && (xVar = rVar.f24692j) != null) {
            L = N(new z(xVar));
        } else {
            L = L();
        }
        Q(L, 10, new k(L, rVar, 0));
    }

    @Override // x7.r
    public final void c(int i10, z zVar) {
        b O = O(i10, zVar);
        Q(O, 1027, new i(O, 1));
    }

    @Override // s7.f2
    public final void d(int i10) {
        b L = L();
        Q(L, 4, new nb.a(L, i10, 0));
    }

    @Override // v8.d0
    public final void e(int i10, z zVar, v8.p pVar, v8.u uVar) {
        b O = O(i10, zVar);
        Q(O, 1001, new s7.v(O, pVar, uVar, 2));
    }

    @Override // x7.r
    public final void f(int i10, z zVar, Exception exc) {
        b O = O(i10, zVar);
        Q(O, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new g(O, exc, 3));
    }

    @Override // s7.f2
    public final void g(a9.c cVar) {
        b L = L();
        Q(L, 27, new androidx.fragment.app.e(17, L, cVar));
    }

    @Override // s7.f2
    public final void h(d2 d2Var) {
        b L = L();
        Q(L, 13, new androidx.fragment.app.e(16, L, d2Var));
    }

    @Override // s7.f2
    public final void i(l1 l1Var) {
        b L = L();
        Q(L, 14, new androidx.fragment.app.e(13, L, l1Var));
    }

    @Override // x7.r
    public final void j(int i10, z zVar, int i11) {
        b O = O(i10, zVar);
        Q(O, 1022, new nb.a(O, i11, 3));
    }

    @Override // s7.f2
    public final void k(int i10, boolean z10) {
        b L = L();
        Q(L, 30, new n(i10, L, z10));
    }

    @Override // s7.f2
    public final void l(int i10) {
        h2 h2Var = this.f25321i;
        h2Var.getClass();
        androidx.appcompat.widget.v vVar = this.f25318f;
        vVar.f1059d = androidx.appcompat.widget.v.e(h2Var, (r0) vVar.f1057b, (z) vVar.f1060e, (v2) vVar.a);
        vVar.l(((i0) h2Var).x());
        b L = L();
        Q(L, 0, new nb.a(L, i10, 4));
    }

    @Override // v8.d0
    public final void m(int i10, z zVar, v8.p pVar, v8.u uVar, IOException iOException, boolean z10) {
        b O = O(i10, zVar);
        Q(O, 1003, new xu(O, pVar, uVar, iOException, z10));
    }

    @Override // s7.f2
    public final void n() {
    }

    @Override // s7.f2
    public final void o(boolean z10) {
        b P = P();
        Q(P, 23, new m(3, P, z10));
    }

    @Override // s7.f2
    public final void onCues(List list) {
        b L = L();
        Q(L, 27, new androidx.fragment.app.e(19, L, list));
    }

    @Override // s7.f2
    public final void onPlayerStateChanged(boolean z10, int i10) {
        b L = L();
        Q(L, -1, new n(L, z10, i10, 1));
    }

    @Override // s7.f2
    public final void onRenderedFirstFrame() {
    }

    @Override // s7.f2
    public final void onRepeatModeChanged(int i10) {
        b L = L();
        Q(L, 8, new nb.a(L, i10, 2));
    }

    @Override // s7.f2
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b L = L();
        Q(L, 9, new m(0, L, z10));
    }

    @Override // s7.f2
    public final void p(s7.q qVar) {
        b L = L();
        Q(L, 29, new androidx.fragment.app.e(12, L, qVar));
    }

    @Override // v8.d0
    public final void q(int i10, z zVar, v8.p pVar, v8.u uVar) {
        b O = O(i10, zVar);
        Q(O, 1002, new s7.v(O, pVar, uVar, 0));
    }

    @Override // s7.f2
    public final void r(j1 j1Var, int i10) {
        b L = L();
        Q(L, 1, new n7.f(L, j1Var, i10));
    }

    @Override // x7.r
    public final void s(int i10, z zVar) {
        b O = O(i10, zVar);
        Q(O, 1023, new i(O, 2));
    }

    @Override // s7.f2
    public final void t(int i10, int i11) {
        b P = P();
        Q(P, 24, new bv(i10, i11, P));
    }

    @Override // x7.r
    public final void u(int i10, z zVar) {
        b O = O(i10, zVar);
        Q(O, 1025, new i(O, 4));
    }

    @Override // s7.f2
    public final void v(s7.r rVar) {
        b L;
        v8.x xVar;
        if ((rVar instanceof s7.r) && (xVar = rVar.f24692j) != null) {
            L = N(new z(xVar));
        } else {
            L = L();
        }
        Q(L, 10, new k(L, rVar, 1));
    }

    @Override // s7.f2
    public final void w(boolean z10) {
        b L = L();
        Q(L, 3, new m(2, L, z10));
    }

    @Override // s7.f2
    public final void x(int i10, boolean z10) {
        b L = L();
        Q(L, 5, new n(L, z10, i10, 2));
    }

    @Override // s7.f2
    public final void y(float f10) {
        b P = P();
        Q(P, 22, new gv(P, f10));
    }

    @Override // v8.d0
    public final void z(int i10, z zVar, v8.u uVar) {
        b O = O(i10, zVar);
        Q(O, 1004, new d(O, uVar, 0));
    }
}
