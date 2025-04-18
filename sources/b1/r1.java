package b1;

import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class r1 implements h1, q, z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22370a = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22371b = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_parentHandle");

    @Nullable
    private volatile Object _parentHandle;

    @Nullable
    private volatile Object _state;

    public r1(boolean z2) {
        this._state = z2 ? f0.f22313j : f0.f22312i;
    }

    public static p d0(g1.p pVar) {
        while (pVar.w()) {
            g1.p m2 = pVar.m();
            if (m2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.p.f30630b;
                Object obj = atomicReferenceFieldUpdater.get(pVar);
                while (true) {
                    pVar = (g1.p) obj;
                    if (!pVar.w()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(pVar);
                }
            } else {
                pVar = m2;
            }
        }
        while (true) {
            pVar = pVar.v();
            if (!pVar.w()) {
                if (pVar instanceof p) {
                    return (p) pVar;
                }
                if (pVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    public static String k0(Object obj) {
        if (!(obj instanceof o1)) {
            return obj instanceof d1 ? ((d1) obj).isActive() ? "Active" : "New" : obj instanceof u ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
        }
        o1 o1Var = (o1) obj;
        return o1Var.d() ? "Cancelling" : o1Var.e() ? "Completing" : "Active";
    }

    public final boolean C(Throwable th) {
        if (X()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        o oVar = (o) f22371b.get(this);
        return (oVar == null || oVar == x1.f22395a) ? z2 : oVar.b(th) || z2;
    }

    @Override // h0.l
    public final Object H(Object obj, q0.p pVar) {
        return pVar.invoke(obj, this);
    }

    public String I() {
        return "Job was cancelled";
    }

    public boolean J(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return w(th) && Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, d0.e] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, d0.e] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void K(d1 d1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22371b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.dispose();
            atomicReferenceFieldUpdater.set(this, x1.f22395a);
        }
        d0.e eVar = 0;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f22378a : null;
        if (d1Var instanceof l1) {
            try {
                ((l1) d1Var).y(th);
                return;
            } catch (Throwable th2) {
                V(new RuntimeException("Exception in completion handler " + d1Var + " for " + this, th2));
                return;
            }
        }
        v1 c2 = d1Var.c();
        if (c2 != null) {
            Object q2 = c2.q();
            p0.a.q(q2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            g1.p pVar = (g1.p) q2;
            while (!p0.a.g(pVar, c2)) {
                if (pVar instanceof l1) {
                    l1 l1Var = (l1) pVar;
                    try {
                        l1Var.y(th);
                    } catch (Throwable th3) {
                        if (eVar != 0) {
                            kotlin.jvm.internal.q.a(eVar, th3);
                        } else {
                            eVar = new RuntimeException("Exception in completion handler " + l1Var + " for " + this, th3);
                        }
                    }
                }
                pVar = pVar.v();
                eVar = eVar;
            }
            if (eVar != 0) {
                V(eVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable L(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        r1 r1Var = (r1) ((z1) obj);
        Object T = r1Var.T();
        if (T instanceof o1) {
            cancellationException = ((o1) T).b();
        } else if (T instanceof u) {
            cancellationException = ((u) T).f22378a;
        } else {
            if (T instanceof d1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + T).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new i1("Parent job is ".concat(k0(T)), cancellationException, r1Var);
        }
        return cancellationException2;
    }

    public final Object M(o1 o1Var, Object obj) {
        Throwable P;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f22378a : null;
        synchronized (o1Var) {
            o1Var.d();
            ArrayList<Throwable> f2 = o1Var.f(th);
            P = P(o1Var, f2);
            if (P != null && f2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f2.size()));
                for (Throwable th2 : f2) {
                    if (th2 != P && th2 != P && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        kotlin.jvm.internal.q.a(P, th2);
                    }
                }
            }
        }
        if (P != null && P != th) {
            obj = new u(false, P);
        }
        if (P != null && (C(P) || U(P))) {
            p0.a.q(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            u.f22377b.compareAndSet((u) obj, 0, 1);
        }
        f0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22370a;
        Object e1Var = obj instanceof d1 ? new e1((d1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o1Var, e1Var) && atomicReferenceFieldUpdater.get(this) == o1Var) {
        }
        K(o1Var, obj);
        return obj;
    }

    @Override // b1.h1
    public final o N(r1 r1Var) {
        q0 m02 = p0.a.m0(this, true, new p(r1Var), 2);
        p0.a.q(m02, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (o) m02;
    }

    public final Object O() {
        Object T = T();
        if (!(!(T instanceof d1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (T instanceof u) {
            throw ((u) T).f22378a;
        }
        return f0.I(T);
    }

    public final Throwable P(o1 o1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (o1Var.d()) {
                return new i1(I(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof g2) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof g2)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean Q() {
        return true;
    }

    public boolean R() {
        return this instanceof s;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [g1.p, b1.v1] */
    public final v1 S(d1 d1Var) {
        v1 c2 = d1Var.c();
        if (c2 != null) {
            return c2;
        }
        if (d1Var instanceof s0) {
            return new g1.p();
        }
        if (d1Var instanceof l1) {
            i0((l1) d1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + d1Var).toString());
    }

    public final Object T() {
        while (true) {
            Object obj = f22370a.get(this);
            if (!(obj instanceof g1.v)) {
                return obj;
            }
            ((g1.v) obj).a(this);
        }
    }

    public boolean U(Throwable th) {
        return false;
    }

    public void V(d0.e eVar) {
        throw eVar;
    }

    public final void W(h1 h1Var) {
        x1 x1Var = x1.f22395a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22371b;
        if (h1Var == null) {
            atomicReferenceFieldUpdater.set(this, x1Var);
            return;
        }
        h1Var.start();
        o N = h1Var.N(this);
        atomicReferenceFieldUpdater.set(this, N);
        if (!(T() instanceof d1)) {
            N.dispose();
            atomicReferenceFieldUpdater.set(this, x1Var);
        }
    }

    public boolean X() {
        return this instanceof g;
    }

    public final boolean Z(Object obj) {
        Object l02;
        do {
            l02 = l0(T(), obj);
            if (l02 == f0.d) {
                return false;
            }
            if (l02 == f0.e) {
                return true;
            }
        } while (l02 == f0.f22309f);
        p(l02);
        return true;
    }

    @Override // b1.h1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new i1(I(), null, this);
        }
        x(cancellationException);
    }

    public final Object a0(Object obj) {
        Object l02;
        do {
            l02 = l0(T(), obj);
            if (l02 == f0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                u uVar = obj instanceof u ? (u) obj : null;
                throw new IllegalStateException(str, uVar != null ? uVar.f22378a : null);
            }
        } while (l02 == f0.f22309f);
        return l02;
    }

    public String c0() {
        return getClass().getSimpleName();
    }

    public Object e() {
        return O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, d0.e] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void e0(v1 v1Var, Throwable th) {
        Object q2 = v1Var.q();
        p0.a.q(q2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        g1.p pVar = (g1.p) q2;
        d0.e eVar = 0;
        while (!p0.a.g(pVar, v1Var)) {
            if (pVar instanceof j1) {
                l1 l1Var = (l1) pVar;
                try {
                    l1Var.y(th);
                } catch (Throwable th2) {
                    if (eVar != 0) {
                        kotlin.jvm.internal.q.a(eVar, th2);
                    } else {
                        eVar = new RuntimeException("Exception in completion handler " + l1Var + " for " + this, th2);
                    }
                }
            }
            pVar = pVar.v();
            eVar = eVar;
        }
        if (eVar != 0) {
            V(eVar);
        }
        C(th);
    }

    public void f0(Object obj) {
    }

    @Override // b1.h1
    public final q0 g0(q0.l lVar) {
        return y(false, true, lVar);
    }

    @Override // h0.j
    public final h0.k getKey() {
        return a0.f22285b;
    }

    @Override // b1.h1
    public final h1 getParent() {
        o oVar = (o) f22371b.get(this);
        if (oVar != null) {
            return oVar.getParent();
        }
        return null;
    }

    public void h0() {
    }

    @Override // h0.l
    public final h0.j i(h0.k kVar) {
        return kotlin.jvm.internal.q.e(this, kVar);
    }

    public final void i0(l1 l1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g1.p pVar = new g1.p();
        l1Var.getClass();
        g1.p.f30630b.lazySet(pVar, l1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g1.p.f30629a;
        atomicReferenceFieldUpdater2.lazySet(pVar, l1Var);
        loop0: while (true) {
            if (l1Var.q() != l1Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(l1Var, l1Var, pVar)) {
                if (atomicReferenceFieldUpdater2.get(l1Var) != l1Var) {
                    break;
                }
            }
            pVar.n(l1Var);
        }
        g1.p v2 = l1Var.v();
        do {
            atomicReferenceFieldUpdater = f22370a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, v2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l1Var);
    }

    @Override // b1.h1
    public boolean isActive() {
        Object T = T();
        return (T instanceof d1) && ((d1) T).isActive();
    }

    @Override // b1.h1
    public final boolean isCancelled() {
        Object T = T();
        return (T instanceof u) || ((T instanceof o1) && ((o1) T).d());
    }

    public final int j0(Object obj) {
        boolean z2 = obj instanceof s0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22370a;
        if (z2) {
            if (((s0) obj).f22372a) {
                return 0;
            }
            s0 s0Var = f0.f22313j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            h0();
            return 1;
        }
        if (!(obj instanceof c1)) {
            return 0;
        }
        v1 v1Var = ((c1) obj).f22294a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, v1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        h0();
        return 1;
    }

    public final boolean l(Object obj, v1 v1Var, l1 l1Var) {
        char c2;
        p1 p1Var = new p1(l1Var, this, obj);
        do {
            g1.p m2 = v1Var.m();
            if (m2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.p.f30630b;
                Object obj2 = atomicReferenceFieldUpdater.get(v1Var);
                while (true) {
                    m2 = (g1.p) obj2;
                    if (!m2.w()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(m2);
                }
            }
            g1.p.f30630b.lazySet(l1Var, m2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g1.p.f30629a;
            atomicReferenceFieldUpdater2.lazySet(l1Var, v1Var);
            p1Var.f22363c = v1Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(m2, v1Var, p1Var)) {
                    c2 = p1Var.a(m2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(m2) != v1Var) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        if (p0.a.m0(r2.f22360f, false, new b1.n1(r6, r1, r2, r8), 1) == b1.x1.f22395a) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        r2 = d0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e4, code lost:
    
        if (r2 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return b1.f0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:
    
        return M(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l0(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.r1.l0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // b1.h1
    public final CancellationException n() {
        CancellationException cancellationException;
        Object T = T();
        if (!(T instanceof o1)) {
            if (T instanceof d1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(T instanceof u)) {
                return new i1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((u) T).f22378a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new i1(I(), th, this) : cancellationException;
        }
        Throwable b2 = ((o1) T).b();
        if (b2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b2 instanceof CancellationException ? (CancellationException) b2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = I();
        }
        return new i1(concat, b2, this);
    }

    public void p(Object obj) {
    }

    public void r(Object obj) {
        p(obj);
    }

    @Override // h0.l
    public final h0.l s(h0.k kVar) {
        return kotlin.jvm.internal.q.i(this, kVar);
    }

    @Override // b1.h1
    public final boolean start() {
        int j02;
        do {
            j02 = j0(T());
            if (j02 == 0) {
                return false;
            }
        } while (j02 != 1);
        return true;
    }

    public final Object t(h0.g gVar) {
        Object T;
        do {
            T = T();
            if (!(T instanceof d1)) {
                if (T instanceof u) {
                    throw ((u) T).f22378a;
                }
                return f0.I(T);
            }
        } while (j0(T) < 0);
        m1 m1Var = new m1(f0.r(gVar), this);
        m1Var.p();
        m1Var.z(new i(y(false, true, new r0(m1Var, 2)), 1));
        Object o2 = m1Var.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c0() + '{' + k0(T()) + '}');
        sb.append('@');
        sb.append(f0.o(this));
        return sb.toString();
    }

    @Override // h0.l
    public final h0.l u(h0.l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }

    @Override // b1.h1
    public final Object v(h0.g gVar) {
        Object T;
        d0.b0 b0Var;
        do {
            T = T();
            boolean z2 = T instanceof d1;
            b0Var = d0.b0.f30125a;
            if (!z2) {
                kotlin.jvm.internal.e.l(gVar.getContext());
                return b0Var;
            }
        } while (j0(T) < 0);
        l lVar = new l(1, f0.r(gVar));
        lVar.p();
        lVar.z(new i(y(false, true, new r0(lVar, 3)), 1));
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        if (o2 != aVar) {
            o2 = b0Var;
        }
        return o2 == aVar ? o2 : b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = b1.f0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != b1.f0.e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = l0(r0, new b1.u(false, L(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == b1.f0.f22309f) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != b1.f0.d) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof b1.o1) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if ((r4 instanceof b1.d1) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r1 = L(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        r5 = (b1.d1) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (R() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r5.isActive() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        r5 = l0(r4, new b1.u(false, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r5 == b1.f0.d) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r5 == b1.f0.f22309f) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = T();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r6 = S(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (r6 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
    
        r7 = new b1.o1(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        r4 = b1.r1.f22370a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof b1.d1) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (r4.get(r9) == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b3, code lost:
    
        e0(r6, r1);
        r10 = b1.f0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0058, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        r10 = b1.f0.f22310g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0053, code lost:
    
        if (b1.o1.d.get((b1.o1) r4) != b1.f0.f22311h) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0055, code lost:
    
        r10 = b1.f0.f22310g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0057, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005b, code lost:
    
        r5 = ((b1.o1) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0062, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
    
        r1 = L(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof b1.o1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006b, code lost:
    
        ((b1.o1) r4).a(r1);
        r10 = ((b1.o1) r4).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007a, code lost:
    
        if ((!r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007c, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007e, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0080, code lost:
    
        e0(((b1.o1) r4).f22359a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0087, code lost:
    
        r10 = b1.f0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0069, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008b, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r0 != b1.f0.d) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0104, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        if (r0 != b1.f0.e) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fd, code lost:
    
        if (r0 != b1.f0.f22310g) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0100, code lost:
    
        p(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((b1.o1) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.r1.w(java.lang.Object):boolean");
    }

    public void x(CancellationException cancellationException) {
        w(cancellationException);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [g1.p, b1.v1] */
    @Override // b1.h1
    public final q0 y(boolean z2, boolean z3, q0.l lVar) {
        l1 l1Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z2) {
            l1Var = lVar instanceof j1 ? (j1) lVar : null;
            if (l1Var == null) {
                l1Var = new g1(lVar);
            }
        } else {
            l1Var = lVar instanceof l1 ? (l1) lVar : null;
            if (l1Var == null) {
                l1Var = new r0(lVar, 1);
            }
        }
        l1Var.d = this;
        while (true) {
            Object T = T();
            if (T instanceof s0) {
                s0 s0Var = (s0) T;
                if (s0Var.f22372a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22370a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, T, l1Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != T) {
                            break;
                        }
                    }
                    return l1Var;
                }
                ?? pVar = new g1.p();
                c1 c1Var = s0Var.f22372a ? pVar : new c1(pVar);
                do {
                    atomicReferenceFieldUpdater = f22370a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, s0Var, c1Var)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == s0Var);
            } else {
                if (!(T instanceof d1)) {
                    if (z3) {
                        u uVar = T instanceof u ? (u) T : null;
                        lVar.invoke(uVar != null ? uVar.f22378a : null);
                    }
                    return x1.f22395a;
                }
                v1 c2 = ((d1) T).c();
                if (c2 == null) {
                    p0.a.q(T, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    i0((l1) T);
                } else {
                    q0 q0Var = x1.f22395a;
                    if (z2 && (T instanceof o1)) {
                        synchronized (T) {
                            try {
                                th = ((o1) T).b();
                                if (th != null) {
                                    if ((lVar instanceof p) && !((o1) T).e()) {
                                    }
                                }
                                if (l(T, c2, l1Var)) {
                                    if (th == null) {
                                        return l1Var;
                                    }
                                    q0Var = l1Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            lVar.invoke(th);
                        }
                        return q0Var;
                    }
                    if (l(T, c2, l1Var)) {
                        return l1Var;
                    }
                }
            }
        }
    }
}
