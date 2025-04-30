package Q7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.C2722k;
import u7.C2814e;
import x7.EnumC2928a;
import y7.InterfaceC2955d;

/* renamed from: Q7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0238f extends E implements InterfaceC0237e, InterfaceC2955d, r0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2562h = AtomicIntegerFieldUpdater.newUpdater(C0238f.class, "_decisionAndIndex$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2563i = AtomicReferenceFieldUpdater.newUpdater(C0238f.class, Object.class, "_state$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2564j = AtomicReferenceFieldUpdater.newUpdater(C0238f.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final w7.f f2565f;

    /* renamed from: g, reason: collision with root package name */
    public final w7.k f2566g;

    public C0238f(int i9, w7.f fVar) {
        super(i9);
        this.f2565f = fVar;
        this.f2566g = fVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0234b.b;
    }

    public static Object D(h0 h0Var, Object obj, int i9, F7.l lVar) {
        H h6;
        if (!(obj instanceof C0247o) && AbstractC0255x.k(i9)) {
            if (lVar != null || (h0Var instanceof H)) {
                if (h0Var instanceof H) {
                    h6 = (H) h0Var;
                } else {
                    h6 = null;
                }
                return new C0246n(obj, h6, lVar, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        V7.h hVar;
        w7.f fVar = this.f2565f;
        Throwable th = null;
        if (fVar instanceof V7.h) {
            hVar = (V7.h) fVar;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V7.h.f3513j;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            H0.a aVar = V7.a.f3506d;
            if (obj != aVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                th = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                    break;
                }
            }
        }
        if (th != null) {
            p();
            l(th);
        }
    }

    public final void B(Object obj, F7.l lVar) {
        C(obj, this.f2528d, lVar);
    }

    public final void C(Object obj, int i9, F7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2563i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof h0) {
                Object D8 = D((h0) obj2, obj, i9, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D8)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                }
                q(i9);
                return;
            }
            if (obj2 instanceof C0239g) {
                C0239g c0239g = (C0239g) obj2;
                c0239g.getClass();
                if (C0239g.f2567c.compareAndSet(c0239g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0239g.f2575a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // Q7.r0
    public final void a(V7.u uVar, int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f2562h;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i9));
        w(uVar);
    }

    @Override // Q7.E
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z8;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2563i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof h0)) {
                if (obj2 instanceof C0247o) {
                    return;
                }
                if (obj2 instanceof C0246n) {
                    C0246n c0246n = (C0246n) obj2;
                    if (c0246n.f2574e != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        C0246n a6 = C0246n.a(c0246n, null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a6)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        H h6 = c0246n.b;
                        if (h6 != null) {
                            k(h6, cancellationException);
                        }
                        F7.l lVar = c0246n.f2572c;
                        if (lVar != null) {
                            m(lVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                C0246n c0246n2 = new C0246n(obj2, (H) null, (F7.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0246n2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            throw new IllegalStateException("Not completed".toString());
        }
    }

    @Override // Q7.E
    public final w7.f c() {
        return this.f2565f;
    }

    @Override // y7.InterfaceC2955d
    public final InterfaceC2955d d() {
        w7.f fVar = this.f2565f;
        if (fVar instanceof InterfaceC2955d) {
            return (InterfaceC2955d) fVar;
        }
        return null;
    }

    @Override // w7.f
    public final void e(Object obj) {
        Throwable a6 = C2722k.a(obj);
        if (a6 != null) {
            obj = new C0247o(false, a6);
        }
        C(obj, this.f2528d, null);
    }

    @Override // Q7.InterfaceC0237e
    public final H0.a f(Object obj, F7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2563i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z8 = obj2 instanceof h0;
            H0.a aVar = AbstractC0255x.f2589a;
            if (z8) {
                Object D8 = D((h0) obj2, obj, this.f2528d, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D8)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                    return aVar;
                }
                return aVar;
            }
            boolean z9 = obj2 instanceof C0246n;
            return null;
        }
    }

    @Override // Q7.E
    public final Throwable g(Object obj) {
        Throwable g9 = super.g(obj);
        if (g9 == null) {
            return null;
        }
        return g9;
    }

    @Override // w7.f
    public final w7.k getContext() {
        return this.f2566g;
    }

    @Override // Q7.E
    public final Object h(Object obj) {
        if (obj instanceof C0246n) {
            return ((C0246n) obj).f2571a;
        }
        return obj;
    }

    @Override // Q7.E
    public final Object j() {
        return f2563i.get(this);
    }

    public final void k(H h6, Throwable th) {
        try {
            h6.a(th);
        } catch (Throwable th2) {
            AbstractC0255x.i(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), this.f2566g);
        }
    }

    @Override // Q7.InterfaceC0237e
    public final boolean l(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2563i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z8 = false;
            if (!(obj instanceof h0)) {
                return false;
            }
            if ((obj instanceof H) || (obj instanceof V7.u)) {
                z8 = true;
            }
            C0239g c0239g = new C0239g(this, th, z8);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0239g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            h0 h0Var = (h0) obj;
            if (h0Var instanceof H) {
                k((H) obj, th);
            } else if (h0Var instanceof V7.u) {
                n((V7.u) obj, th);
            }
            if (!x()) {
                p();
            }
            q(this.f2528d);
            return true;
        }
    }

    public final void m(F7.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0255x.i(new RuntimeException("Exception in resume onCancellation handler for " + this, th2), this.f2566g);
        }
    }

    public final void n(V7.u uVar, Throwable th) {
        w7.k kVar = this.f2566g;
        int i9 = f2562h.get(this) & 536870911;
        if (i9 != 536870911) {
            try {
                uVar.g(i9, kVar);
                return;
            } catch (Throwable th2) {
                AbstractC0255x.i(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), kVar);
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    @Override // Q7.InterfaceC0237e
    public final void o(Object obj) {
        q(this.f2528d);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2564j;
        G g9 = (G) atomicReferenceFieldUpdater.get(this);
        if (g9 == null) {
            return;
        }
        g9.d();
        atomicReferenceFieldUpdater.set(this, g0.b);
    }

    public final void q(int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z8;
        do {
            atomicIntegerFieldUpdater = f2562h;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    if (i9 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    w7.f fVar = this.f2565f;
                    if (!z8 && (fVar instanceof V7.h) && AbstractC0255x.k(i9) == AbstractC0255x.k(this.f2528d)) {
                        AbstractC0251t abstractC0251t = ((V7.h) fVar).f3514f;
                        w7.k context = ((V7.h) fVar).f3515g.getContext();
                        if (abstractC0251t.k()) {
                            abstractC0251t.j(context, this);
                            return;
                        }
                        L a6 = m0.a();
                        if (a6.f2535d >= 4294967296L) {
                            C2814e c2814e = a6.f2537g;
                            if (c2814e == null) {
                                c2814e = new C2814e();
                                a6.f2537g = c2814e;
                            }
                            c2814e.addLast(this);
                            return;
                        }
                        a6.o(true);
                        try {
                            AbstractC0255x.o(this, fVar, true);
                            do {
                            } while (a6.q());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    AbstractC0255x.o(this, fVar, z8);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable r(d0 d0Var) {
        return d0Var.A();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        boolean x9 = x();
        do {
            atomicIntegerFieldUpdater = f2562h;
            i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = i9 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (x9) {
                        A();
                    }
                    Object obj = f2563i.get(this);
                    if (!(obj instanceof C0247o)) {
                        if (AbstractC0255x.k(this.f2528d)) {
                            U u8 = (U) this.f2566g.h(C0252u.f2584c);
                            if (u8 != null && !u8.isActive()) {
                                CancellationException A8 = ((d0) u8).A();
                                b(obj, A8);
                                throw A8;
                            }
                        }
                        return h(obj);
                    }
                    throw ((C0247o) obj).f2575a;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 536870912 + (536870911 & i9)));
        if (((G) f2564j.get(this)) == null) {
            u();
        }
        if (x9) {
            A();
        }
        return EnumC2928a.b;
    }

    public final void t() {
        G u8 = u();
        if (u8 != null && (!(f2563i.get(this) instanceof h0))) {
            u8.d();
            f2564j.set(this, g0.b);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC0255x.p(this.f2565f));
        sb.append("){");
        Object obj = f2563i.get(this);
        if (obj instanceof h0) {
            str = "Active";
        } else if (obj instanceof C0239g) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0255x.g(this));
        return sb.toString();
    }

    public final G u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u8 = (U) this.f2566g.h(C0252u.f2584c);
        if (u8 == null) {
            return null;
        }
        G j7 = AbstractC0255x.j(u8, true, new C0240h(this), 2);
        do {
            atomicReferenceFieldUpdater = f2564j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, j7)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return j7;
    }

    public final void v(F7.l lVar) {
        H h6;
        if (lVar instanceof H) {
            h6 = (H) lVar;
        } else {
            h6 = new H(lVar, 1);
        }
        w(h6);
    }

    public final void w(Object obj) {
        boolean z8;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2563i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0234b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            if (obj2 instanceof H) {
                z8 = true;
            } else {
                z8 = obj2 instanceof V7.u;
            }
            Throwable th = null;
            if (!z8) {
                if (obj2 instanceof C0247o) {
                    C0247o c0247o = (C0247o) obj2;
                    c0247o.getClass();
                    if (C0247o.b.compareAndSet(c0247o, 0, 1)) {
                        if (obj2 instanceof C0239g) {
                            if (!(obj2 instanceof C0247o)) {
                                c0247o = null;
                            }
                            if (c0247o != null) {
                                th = c0247o.f2575a;
                            }
                            if (obj instanceof H) {
                                k((H) obj, th);
                                return;
                            } else {
                                G7.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                n((V7.u) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    y(obj, obj2);
                    throw null;
                }
                if (obj2 instanceof C0246n) {
                    C0246n c0246n = (C0246n) obj2;
                    if (c0246n.b == null) {
                        if (obj instanceof V7.u) {
                            return;
                        }
                        G7.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        H h6 = (H) obj;
                        Throwable th2 = c0246n.f2574e;
                        if (th2 != null) {
                            k(h6, th2);
                            return;
                        }
                        C0246n a6 = C0246n.a(c0246n, h6, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a6)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        return;
                    }
                    y(obj, obj2);
                    throw null;
                }
                if (obj instanceof V7.u) {
                    return;
                }
                G7.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0246n c0246n2 = new C0246n(obj2, (H) obj, (F7.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0246n2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            y(obj, obj2);
            throw null;
        }
    }

    public final boolean x() {
        if (this.f2528d == 2) {
            w7.f fVar = this.f2565f;
            G7.j.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (V7.h.f3513j.get((V7.h) fVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
