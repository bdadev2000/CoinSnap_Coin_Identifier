package Q7;

import java.util.concurrent.CancellationException;
import t7.AbstractC2712a;
import t7.C2722k;

/* loaded from: classes3.dex */
public abstract class E extends X7.i {

    /* renamed from: d, reason: collision with root package name */
    public int f2528d;

    public E(int i9) {
        super(0L, X7.k.f3740g);
        this.f2528d = i9;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract w7.f c();

    public Throwable g(Object obj) {
        C0247o c0247o;
        if (obj instanceof C0247o) {
            c0247o = (C0247o) obj;
        } else {
            c0247o = null;
        }
        if (c0247o == null) {
            return null;
        }
        return c0247o.f2575a;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC2712a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        G7.j.b(th);
        AbstractC0255x.i(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var;
        U u8;
        Object obj = t7.y.f23029a;
        androidx.work.o oVar = this.f3733c;
        try {
            w7.f c9 = c();
            G7.j.c(c9, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            V7.h hVar = (V7.h) c9;
            w7.f fVar = hVar.f3515g;
            Object obj2 = hVar.f3517i;
            w7.k context = fVar.getContext();
            Object l = V7.a.l(context, obj2);
            if (l != V7.a.f3508f) {
                p0Var = AbstractC0255x.r(fVar, context, l);
            } else {
                p0Var = null;
            }
            try {
                w7.k context2 = fVar.getContext();
                Object j7 = j();
                Throwable g9 = g(j7);
                if (g9 == null && AbstractC0255x.k(this.f2528d)) {
                    u8 = (U) context2.h(C0252u.f2584c);
                } else {
                    u8 = null;
                }
                if (u8 != null && !u8.isActive()) {
                    CancellationException A8 = ((d0) u8).A();
                    b(j7, A8);
                    fVar.e(AbstractC2712a.b(A8));
                } else if (g9 != null) {
                    fVar.e(AbstractC2712a.b(g9));
                } else {
                    fVar.e(h(j7));
                }
                if (p0Var == null || p0Var.Y()) {
                    V7.a.g(context, l);
                }
                try {
                    oVar.getClass();
                } catch (Throwable th) {
                    obj = AbstractC2712a.b(th);
                }
                i(null, C2722k.a(obj));
            } catch (Throwable th2) {
                if (p0Var == null || p0Var.Y()) {
                    V7.a.g(context, l);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                oVar.getClass();
            } catch (Throwable th4) {
                obj = AbstractC2712a.b(th4);
            }
            i(th3, C2722k.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
