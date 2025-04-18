package b1;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class n0 extends h1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f22348c;

    public n0(int i2) {
        super(0L, h1.k.f30758g);
        this.f22348c = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract h0.g c();

    public Throwable d(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f22378a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            kotlin.jvm.internal.q.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        p0.a.p(th);
        kotlin.jvm.internal.e.o(c().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = d0.b0.f30125a;
        h1.i iVar = this.f30751b;
        try {
            h0.g c2 = c();
            p0.a.q(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            g1.i iVar2 = (g1.i) c2;
            h0.g gVar = iVar2.f30616f;
            Object obj2 = iVar2.f30618h;
            h0.l context = gVar.getContext();
            Object e = g1.a.e(context, obj2);
            k2 G0 = e != g1.a.f30591f ? p0.a.G0(gVar, context, e) : null;
            try {
                h0.l context2 = gVar.getContext();
                Object g2 = g();
                Throwable d = d(g2);
                h1 h1Var = (d == null && kotlin.jvm.internal.e.q(this.f22348c)) ? (h1) context2.i(a0.f22285b) : null;
                if (h1Var != null && !h1Var.isActive()) {
                    CancellationException n2 = h1Var.n();
                    b(g2, n2);
                    gVar.resumeWith(kotlin.jvm.internal.q.d(n2));
                } else if (d != null) {
                    gVar.resumeWith(kotlin.jvm.internal.q.d(d));
                } else {
                    gVar.resumeWith(e(g2));
                }
                if (G0 == null || G0.p0()) {
                    g1.a.b(context, e);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = kotlin.jvm.internal.q.d(th);
                }
                f(null, d0.n.a(obj));
            } catch (Throwable th2) {
                if (G0 == null || G0.p0()) {
                    g1.a.b(context, e);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = kotlin.jvm.internal.q.d(th4);
            }
            f(th3, d0.n.a(obj));
        }
    }
}
