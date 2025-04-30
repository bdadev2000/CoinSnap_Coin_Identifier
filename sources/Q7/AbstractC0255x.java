package Q7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.AbstractC2712a;
import t7.C2722k;
import x7.EnumC2928a;
import y7.InterfaceC2955d;

/* renamed from: Q7.x */
/* loaded from: classes3.dex */
public abstract class AbstractC0255x {

    /* renamed from: a */
    public static final H0.a f2589a = new H0.a("RESUME_TOKEN", 2);
    public static final H0.a b = new H0.a("CLOSED_EMPTY", 2);

    /* renamed from: c */
    public static final H0.a f2590c = new H0.a("COMPLETING_ALREADY", 2);

    /* renamed from: d */
    public static final H0.a f2591d = new H0.a("COMPLETING_WAITING_CHILDREN", 2);

    /* renamed from: e */
    public static final H0.a f2592e = new H0.a("COMPLETING_RETRY", 2);

    /* renamed from: f */
    public static final H0.a f2593f = new H0.a("TOO_LATE_TO_CANCEL", 2);

    /* renamed from: g */
    public static final H0.a f2594g = new H0.a("SEALED", 2);

    /* renamed from: h */
    public static final I f2595h = new I(false);

    /* renamed from: i */
    public static final I f2596i = new I(true);

    public static final V7.e a(w7.k kVar) {
        if (kVar.h(C0252u.f2584c) == null) {
            kVar = kVar.n(new X(null));
        }
        return new V7.e(kVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q7.a, Q7.B] */
    public static B b(V7.e eVar, F7.p pVar) {
        w7.l lVar = w7.l.b;
        EnumC0254w enumC0254w = EnumC0254w.b;
        ?? abstractC0233a = new AbstractC0233a(m(eVar, lVar), true);
        abstractC0233a.X(enumC0254w, abstractC0233a, pVar);
        return abstractC0233a;
    }

    public static final void c(w7.k kVar, CancellationException cancellationException) {
        U u8 = (U) kVar.h(C0252u.f2584c);
        if (u8 != null) {
            u8.a(cancellationException);
        }
    }

    public static final Object d(F7.p pVar, w7.f fVar) {
        V7.t tVar = new V7.t(fVar, fVar.getContext());
        return com.facebook.appevents.g.x(tVar, tVar, pVar);
    }

    public static final void e(w7.k kVar) {
        U u8 = (U) kVar.h(C0252u.f2584c);
        if (u8 != null && !u8.isActive()) {
            throw ((d0) u8).A();
        }
    }

    public static final w7.k f(w7.k kVar, w7.k kVar2, boolean z8) {
        Boolean bool = Boolean.FALSE;
        C0249q c0249q = C0249q.f2580d;
        boolean booleanValue = ((Boolean) kVar.b(bool, c0249q)).booleanValue();
        boolean booleanValue2 = ((Boolean) kVar2.b(bool, c0249q)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return kVar.n(kVar2);
        }
        w7.l lVar = w7.l.b;
        w7.k kVar3 = (w7.k) kVar.b(lVar, new C0249q(2, 2));
        Object obj = kVar2;
        if (booleanValue2) {
            obj = kVar2.b(lVar, C0249q.f2579c);
        }
        return kVar3.n((w7.k) obj);
    }

    public static final String g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0238f h(w7.f fVar) {
        C0238f c0238f;
        C0238f c0238f2;
        if (!(fVar instanceof V7.h)) {
            return new C0238f(1, fVar);
        }
        V7.h hVar = (V7.h) fVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V7.h.f3513j;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            H0.a aVar = V7.a.f3506d;
            c0238f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                c0238f2 = null;
                break;
            }
            if (obj instanceof C0238f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0238f2 = (C0238f) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0238f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0238f.f2563i;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0238f2);
            if ((obj2 instanceof C0246n) && ((C0246n) obj2).f2573d != null) {
                c0238f2.p();
            } else {
                C0238f.f2562h.set(c0238f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0238f2, C0234b.b);
                c0238f = c0238f2;
            }
            if (c0238f != null) {
                return c0238f;
            }
        }
        return new C0238f(2, fVar);
    }

    public static final void i(Throwable th, w7.k kVar) {
        try {
            R7.b bVar = (R7.b) kVar.h(C0252u.b);
            if (bVar != null) {
                bVar.j(th, kVar);
            } else {
                V7.a.d(th, kVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC2712a.a(runtimeException, th);
                th = runtimeException;
            }
            V7.a.d(th, kVar);
        }
    }

    public static /* synthetic */ G j(U u8, boolean z8, Y y4, int i9) {
        boolean z9 = false;
        if ((i9 & 1) != 0) {
            z8 = false;
        }
        if ((i9 & 2) != 0) {
            z9 = true;
        }
        return ((d0) u8).J(z8, z9, y4);
    }

    public static final boolean k(int i9) {
        if (i9 == 1 || i9 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [Q7.j0, Q7.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static j0 l(InterfaceC0253v interfaceC0253v, w7.k kVar, EnumC0254w enumC0254w, F7.p pVar, int i9) {
        ?? r22;
        if ((i9 & 1) != 0) {
            kVar = w7.l.b;
        }
        if ((i9 & 2) != 0) {
            enumC0254w = EnumC0254w.b;
        }
        w7.k m = m(interfaceC0253v, kVar);
        enumC0254w.getClass();
        if (enumC0254w == EnumC0254w.f2585c) {
            r22 = new e0(m, pVar);
        } else {
            r22 = new AbstractC0233a(m, true);
        }
        r22.X(enumC0254w, r22, pVar);
        return r22;
    }

    public static final w7.k m(InterfaceC0253v interfaceC0253v, w7.k kVar) {
        w7.k f9 = f(interfaceC0253v.k(), kVar, true);
        X7.e eVar = F.f2529a;
        if (f9 != eVar && f9.h(w7.g.b) == null) {
            return f9.n(eVar);
        }
        return f9;
    }

    public static final Object n(Object obj) {
        if (obj instanceof C0247o) {
            return AbstractC2712a.b(((C0247o) obj).f2575a);
        }
        return obj;
    }

    public static final void o(E e4, w7.f fVar, boolean z8) {
        Object h6;
        p0 p0Var;
        boolean Y8;
        Object j7 = e4.j();
        Throwable g9 = e4.g(j7);
        if (g9 != null) {
            h6 = AbstractC2712a.b(g9);
        } else {
            h6 = e4.h(j7);
        }
        if (z8) {
            G7.j.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            V7.h hVar = (V7.h) fVar;
            w7.f fVar2 = hVar.f3515g;
            w7.k context = fVar2.getContext();
            Object l = V7.a.l(context, hVar.f3517i);
            if (l != V7.a.f3508f) {
                p0Var = r(fVar2, context, l);
            } else {
                p0Var = null;
            }
            try {
                fVar2.e(h6);
                if (p0Var != null) {
                    if (!Y8) {
                        return;
                    }
                }
                return;
            } finally {
                if (p0Var == null || p0Var.Y()) {
                    V7.a.g(context, l);
                }
            }
        }
        fVar.e(h6);
    }

    public static final String p(w7.f fVar) {
        Object b8;
        if (fVar instanceof V7.h) {
            return fVar.toString();
        }
        try {
            b8 = fVar + '@' + g(fVar);
        } catch (Throwable th) {
            b8 = AbstractC2712a.b(th);
        }
        if (C2722k.a(b8) != null) {
            b8 = fVar.getClass().getName() + '@' + g(fVar);
        }
        return (String) b8;
    }

    public static final Object q(Object obj) {
        Q q9;
        P p2;
        if (obj instanceof Q) {
            q9 = (Q) obj;
        } else {
            q9 = null;
        }
        if (q9 != null && (p2 = q9.f2539a) != null) {
            return p2;
        }
        return obj;
    }

    public static final p0 r(w7.f fVar, w7.k kVar, Object obj) {
        p0 p0Var = null;
        if (!(fVar instanceof InterfaceC2955d)) {
            return null;
        }
        if (kVar.h(q0.b) != null) {
            InterfaceC2955d interfaceC2955d = (InterfaceC2955d) fVar;
            while (true) {
                if ((interfaceC2955d instanceof D) || (interfaceC2955d = interfaceC2955d.d()) == null) {
                    break;
                }
                if (interfaceC2955d instanceof p0) {
                    p0Var = (p0) interfaceC2955d;
                    break;
                }
            }
            if (p0Var != null) {
                p0Var.Z(kVar, obj);
            }
        }
        return p0Var;
    }

    public static final Object s(F7.p pVar, w7.f fVar, w7.k kVar) {
        w7.k f9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        w7.k context = fVar.getContext();
        if (!((Boolean) kVar.b(Boolean.FALSE, C0249q.f2580d)).booleanValue()) {
            f9 = context.n(kVar);
        } else {
            f9 = f(context, kVar, false);
        }
        e(f9);
        if (f9 == context) {
            V7.t tVar = new V7.t(fVar, f9);
            return com.facebook.appevents.g.x(tVar, tVar, pVar);
        }
        w7.g gVar = w7.g.b;
        if (G7.j.a(f9.h(gVar), context.h(gVar))) {
            p0 p0Var = new p0(fVar, f9);
            w7.k kVar2 = p0Var.f2547d;
            Object l = V7.a.l(kVar2, null);
            try {
                return com.facebook.appevents.g.x(p0Var, p0Var, pVar);
            } finally {
                V7.a.g(kVar2, l);
            }
        }
        V7.t tVar2 = new V7.t(fVar, f9);
        com.bumptech.glide.d.Z(pVar, tVar2, tVar2);
        do {
            atomicIntegerFieldUpdater = D.f2527g;
            int i9 = atomicIntegerFieldUpdater.get(tVar2);
            if (i9 != 0) {
                if (i9 == 2) {
                    Object q9 = q(tVar2.F());
                    if (q9 instanceof C0247o) {
                        throw ((C0247o) q9).f2575a;
                    }
                    return q9;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1));
        return EnumC2928a.b;
    }
}
