package v8;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.k2;
import s7.x2;

/* loaded from: classes3.dex */
public final class r0 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final s7.j1 f26260h;

    /* renamed from: i, reason: collision with root package name */
    public final s7.e1 f26261i;

    /* renamed from: j, reason: collision with root package name */
    public final m9.k f26262j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.core.app.h f26263k;

    /* renamed from: l, reason: collision with root package name */
    public final x7.u f26264l;

    /* renamed from: m, reason: collision with root package name */
    public final ac.e f26265m;

    /* renamed from: n, reason: collision with root package name */
    public final int f26266n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26267o;

    /* renamed from: p, reason: collision with root package name */
    public long f26268p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26269q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26270r;

    /* renamed from: s, reason: collision with root package name */
    public m9.w0 f26271s;

    public r0(s7.j1 j1Var, m9.k kVar, androidx.core.app.h hVar, x7.u uVar, ac.e eVar, int i10) {
        s7.e1 e1Var = j1Var.f24453c;
        e1Var.getClass();
        this.f26261i = e1Var;
        this.f26260h = j1Var;
        this.f26262j = kVar;
        this.f26263k = hVar;
        this.f26264l = uVar;
        this.f26265m = eVar;
        this.f26266n = i10;
        this.f26267o = true;
        this.f26268p = C.TIME_UNSET;
    }

    @Override // v8.a
    public final w a(z zVar, m9.q qVar, long j3) {
        m9.l createDataSource = this.f26262j.createDataSource();
        m9.w0 w0Var = this.f26271s;
        if (w0Var != null) {
            createDataSource.c(w0Var);
        }
        s7.e1 e1Var = this.f26261i;
        Uri uri = e1Var.f24342b;
        u0.p(this.f26073g);
        return new p0(uri, createDataSource, new h.c((y7.o) this.f26263k.f1189c), this.f26264l, new x7.q(this.f26070d.f27497c, 0, zVar), this.f26265m, new f0.c((CopyOnWriteArrayList) this.f26069c.f17517d, 0, zVar), this, qVar, e1Var.f24347h, this.f26266n);
    }

    @Override // v8.a
    public final s7.j1 g() {
        return this.f26260h;
    }

    @Override // v8.a
    public final void i() {
    }

    @Override // v8.a
    public final void k(m9.w0 w0Var) {
        this.f26271s = w0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        t7.x xVar = this.f26073g;
        u0.p(xVar);
        x7.u uVar = this.f26264l;
        uVar.e(myLooper, xVar);
        uVar.c();
        r();
    }

    @Override // v8.a
    public final void m(w wVar) {
        p0 p0Var = (p0) wVar;
        if (p0Var.f26243x) {
            for (y0 y0Var : p0Var.u) {
                y0Var.i();
                x7.n nVar = y0Var.f26328h;
                if (nVar != null) {
                    nVar.e(y0Var.f26325e);
                    y0Var.f26328h = null;
                    y0Var.f26327g = null;
                }
            }
        }
        p0Var.f26233m.b(p0Var);
        p0Var.f26238r.removeCallbacksAndMessages(null);
        p0Var.f26239s = null;
        p0Var.N = true;
    }

    @Override // v8.a
    public final void o() {
        this.f26264l.release();
    }

    public final void r() {
        x2 d1Var = new d1(this.f26268p, this.f26269q, this.f26270r, this.f26260h);
        if (this.f26267o) {
            d1Var = new k2(1, d1Var);
        }
        l(d1Var);
    }

    public final void s(long j3, boolean z10, boolean z11) {
        if (j3 == C.TIME_UNSET) {
            j3 = this.f26268p;
        }
        if (!this.f26267o && this.f26268p == j3 && this.f26269q == z10 && this.f26270r == z11) {
            return;
        }
        this.f26268p = j3;
        this.f26269q = z10;
        this.f26270r = z11;
        this.f26267o = false;
        r();
    }
}
