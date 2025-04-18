package v8;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class h1 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final m9.p f26149h;

    /* renamed from: i, reason: collision with root package name */
    public final m9.k f26150i;

    /* renamed from: j, reason: collision with root package name */
    public final s7.r0 f26151j;

    /* renamed from: k, reason: collision with root package name */
    public final long f26152k = C.TIME_UNSET;

    /* renamed from: l, reason: collision with root package name */
    public final ac.e f26153l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f26154m;

    /* renamed from: n, reason: collision with root package name */
    public final d1 f26155n;

    /* renamed from: o, reason: collision with root package name */
    public final s7.j1 f26156o;

    /* renamed from: p, reason: collision with root package name */
    public m9.w0 f26157p;

    public h1(String str, s7.i1 i1Var, m9.k kVar, ac.e eVar, boolean z10, Object obj) {
        this.f26150i = kVar;
        this.f26153l = eVar;
        this.f26154m = z10;
        s7.w0 w0Var = new s7.w0();
        w0Var.f24810b = Uri.EMPTY;
        String uri = i1Var.f24433b.toString();
        uri.getClass();
        w0Var.a = uri;
        w0Var.f24816h = com.google.common.collect.r0.i(com.google.common.collect.r0.o(i1Var));
        w0Var.f24818j = obj;
        s7.j1 a = w0Var.a();
        this.f26156o = a;
        s7.q0 q0Var = new s7.q0();
        q0Var.f24667k = (String) u0.u(i1Var.f24434c, "text/x-unknown");
        q0Var.f24659c = i1Var.f24435d;
        q0Var.f24660d = i1Var.f24436f;
        q0Var.f24661e = i1Var.f24437g;
        q0Var.f24658b = i1Var.f24438h;
        String str2 = i1Var.f24439i;
        q0Var.a = str2 != null ? str2 : str;
        this.f26151j = new s7.r0(q0Var);
        m9.o oVar = new m9.o();
        oVar.a = i1Var.f24433b;
        oVar.f21703i = 1;
        this.f26149h = oVar.a();
        this.f26155n = new d1(C.TIME_UNSET, true, false, a);
    }

    @Override // v8.a
    public final w a(z zVar, m9.q qVar, long j3) {
        return new g1(this.f26149h, this.f26150i, this.f26157p, this.f26151j, this.f26152k, this.f26153l, new f0.c((CopyOnWriteArrayList) this.f26069c.f17517d, 0, zVar), this.f26154m);
    }

    @Override // v8.a
    public final s7.j1 g() {
        return this.f26156o;
    }

    @Override // v8.a
    public final void i() {
    }

    @Override // v8.a
    public final void k(m9.w0 w0Var) {
        this.f26157p = w0Var;
        l(this.f26155n);
    }

    @Override // v8.a
    public final void m(w wVar) {
        ((g1) wVar).f26133k.b(null);
    }

    @Override // v8.a
    public final void o() {
    }
}
