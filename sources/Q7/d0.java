package Q7;

import g4.AbstractC2292b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.AbstractC2712a;

/* loaded from: classes3.dex */
public class d0 implements U, InterfaceC0243k, i0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_state$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2560c = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public d0(boolean z8) {
        I i9;
        if (z8) {
            i9 = AbstractC0255x.f2596i;
        } else {
            i9 = AbstractC0255x.f2595h;
        }
        this._state$volatile = i9;
    }

    public static C0242j N(V7.k kVar) {
        while (kVar.j()) {
            V7.k e4 = kVar.e();
            if (e4 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V7.k.f3523c;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (V7.k) obj;
                    if (!kVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e4;
            }
        }
        while (true) {
            kVar = kVar.i();
            if (!kVar.j()) {
                if (kVar instanceof C0242j) {
                    return (C0242j) kVar;
                }
                if (kVar instanceof f0) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (b0Var.d()) {
                return "Cancelling";
            }
            if (!b0Var.e()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof P) {
            if (((P) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C0247o) {
            return "Cancelled";
        }
        return "Completed";
    }

    public final CancellationException A() {
        Object F4 = F();
        CancellationException cancellationException = null;
        if (F4 instanceof b0) {
            Throwable b8 = ((b0) F4).b();
            if (b8 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b8 instanceof CancellationException) {
                    cancellationException = (CancellationException) b8;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = v();
                    }
                    return new V(concat, b8, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(F4 instanceof P)) {
            if (F4 instanceof C0247o) {
                Throwable th = ((C0247o) F4).f2575a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new V(v(), th, this);
                }
                return cancellationException;
            }
            return new V(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object B() {
        Object F4 = F();
        if (!(F4 instanceof P)) {
            if (!(F4 instanceof C0247o)) {
                return AbstractC0255x.q(F4);
            }
            throw ((C0247o) F4).f2575a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean C() {
        return true;
    }

    public boolean D() {
        return this instanceof C0245m;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [V7.k, Q7.f0] */
    public final f0 E(P p2) {
        f0 c9 = p2.c();
        if (c9 == null) {
            if (p2 instanceof I) {
                return new V7.k();
            }
            if (p2 instanceof Y) {
                R((Y) p2);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + p2).toString());
        }
        return c9;
    }

    public final Object F() {
        while (true) {
            Object obj = b.get(this);
            if (!(obj instanceof V7.q)) {
                return obj;
            }
            ((V7.q) obj).a(this);
        }
    }

    public boolean G(Throwable th) {
        return false;
    }

    public final void I(U u8) {
        int S8;
        g0 g0Var = g0.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2560c;
        if (u8 == null) {
            atomicReferenceFieldUpdater.set(this, g0Var);
            return;
        }
        d0 d0Var = (d0) u8;
        do {
            S8 = d0Var.S(d0Var.F());
            if (S8 == 0) {
                break;
            }
        } while (S8 != 1);
        InterfaceC0241i interfaceC0241i = (InterfaceC0241i) AbstractC0255x.j(d0Var, true, new C0242j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0241i);
        if (!(F() instanceof P)) {
            interfaceC0241i.d();
            atomicReferenceFieldUpdater.set(this, g0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [V7.k, Q7.f0] */
    public final G J(boolean z8, boolean z9, F7.l lVar) {
        Y y4;
        O o3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0247o c0247o;
        Throwable th;
        Throwable th2 = null;
        if (z8) {
            if (lVar instanceof W) {
                y4 = (W) lVar;
            } else {
                y4 = null;
            }
            if (y4 == null) {
                y4 = new S(lVar);
            }
        } else {
            if (lVar instanceof Y) {
                y4 = (Y) lVar;
            } else {
                y4 = null;
            }
            if (y4 == null) {
                y4 = new T(lVar, 0);
            }
        }
        y4.f2545f = this;
        while (true) {
            Object F4 = F();
            if (F4 instanceof I) {
                I i9 = (I) F4;
                if (i9.b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, F4, y4)) {
                        if (atomicReferenceFieldUpdater2.get(this) != F4) {
                            break;
                        }
                    }
                    return y4;
                }
                ?? kVar = new V7.k();
                if (i9.b) {
                    o3 = kVar;
                } else {
                    o3 = new O(kVar);
                }
                do {
                    atomicReferenceFieldUpdater = b;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, i9, o3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == i9);
            } else if (F4 instanceof P) {
                f0 c9 = ((P) F4).c();
                if (c9 == null) {
                    G7.j.c(F4, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    R((Y) F4);
                } else {
                    G g9 = g0.b;
                    if (z8 && (F4 instanceof b0)) {
                        synchronized (F4) {
                            try {
                                th = ((b0) F4).b();
                                if (th != null) {
                                    if ((lVar instanceof C0242j) && !((b0) F4).e()) {
                                    }
                                }
                                if (p((P) F4, c9, y4)) {
                                    if (th == null) {
                                        return y4;
                                    }
                                    g9 = y4;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z9) {
                            lVar.invoke(th);
                        }
                        return g9;
                    }
                    if (p((P) F4, c9, y4)) {
                        return y4;
                    }
                }
            } else {
                if (z9) {
                    if (F4 instanceof C0247o) {
                        c0247o = (C0247o) F4;
                    } else {
                        c0247o = null;
                    }
                    if (c0247o != null) {
                        th2 = c0247o.f2575a;
                    }
                    lVar.invoke(th2);
                }
                return g0.b;
            }
        }
    }

    public boolean K() {
        return this instanceof C0235c;
    }

    public final Object L(Object obj) {
        Object U8;
        C0247o c0247o;
        do {
            U8 = U(F(), obj);
            if (U8 == AbstractC0255x.f2590c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0247o) {
                    c0247o = (C0247o) obj;
                } else {
                    c0247o = null;
                }
                if (c0247o != null) {
                    th = c0247o.f2575a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (U8 == AbstractC0255x.f2592e);
        return U8;
    }

    public String M() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, G1.a] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, Q7.d0] */
    public final void O(f0 f0Var, Throwable th) {
        Object h6 = f0Var.h();
        G7.j.c(h6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        V7.k kVar = (V7.k) h6;
        ?? r12 = 0;
        while (!kVar.equals(f0Var)) {
            if (kVar instanceof W) {
                Y y4 = (Y) kVar;
                try {
                    y4.l(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        AbstractC2712a.a(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + y4 + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.i();
            r12 = r12;
        }
        if (r12 != 0) {
            H(r12);
        }
        u(th);
    }

    public final void R(Y y4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V7.k kVar = new V7.k();
        y4.getClass();
        V7.k.f3523c.set(kVar, y4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = V7.k.b;
        atomicReferenceFieldUpdater2.set(kVar, y4);
        loop0: while (true) {
            if (y4.h() != y4) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(y4, y4, kVar)) {
                if (atomicReferenceFieldUpdater2.get(y4) != y4) {
                    break;
                }
            }
            kVar.f(y4);
        }
        V7.k i9 = y4.i();
        do {
            atomicReferenceFieldUpdater = b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, y4, i9)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == y4);
    }

    public final int S(Object obj) {
        boolean z8 = obj instanceof I;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (z8) {
            if (((I) obj).b) {
                return 0;
            }
            I i9 = AbstractC0255x.f2596i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Q();
            return 1;
        }
        if (!(obj instanceof O)) {
            return 0;
        }
        f0 f0Var = ((O) obj).b;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Q();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        if (Q7.AbstractC0255x.j(r2.f2569g, false, new Q7.a0(r6, r1, r2, r8), 1) == Q7.g0.b) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        r2 = N(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00da, code lost:
    
        if (r2 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return Q7.AbstractC0255x.f2591d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
    
        return z(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.d0.U(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // Q7.U
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new V(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // w7.k
    public final Object b(Object obj, F7.p pVar) {
        return pVar.g(obj, this);
    }

    public Object c() {
        return B();
    }

    @Override // w7.i
    public final w7.j getKey() {
        return C0252u.f2584c;
    }

    @Override // w7.k
    public final w7.i h(w7.j jVar) {
        return AbstractC2292b.d(this, jVar);
    }

    @Override // w7.k
    public final w7.k i(w7.j jVar) {
        return AbstractC2292b.g(this, jVar);
    }

    @Override // Q7.U
    public boolean isActive() {
        Object F4 = F();
        if ((F4 instanceof P) && ((P) F4).isActive()) {
            return true;
        }
        return false;
    }

    @Override // w7.k
    public final w7.k n(w7.k kVar) {
        G7.j.e(kVar, "context");
        if (kVar == w7.l.b) {
            return this;
        }
        return (w7.k) kVar.b(this, w7.c.f23996d);
    }

    public final boolean p(P p2, f0 f0Var, Y y4) {
        char c9;
        c0 c0Var = new c0(y4, this, p2);
        do {
            V7.k e4 = f0Var.e();
            if (e4 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V7.k.f3523c;
                Object obj = atomicReferenceFieldUpdater.get(f0Var);
                while (true) {
                    e4 = (V7.k) obj;
                    if (!e4.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e4);
                }
            }
            V7.k.f3523c.set(y4, e4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = V7.k.b;
            atomicReferenceFieldUpdater2.set(y4, f0Var);
            c0Var.f2557c = f0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e4, f0Var, c0Var)) {
                    if (c0Var.a(e4) == null) {
                        c9 = 1;
                    } else {
                        c9 = 2;
                    }
                } else if (atomicReferenceFieldUpdater2.get(e4) != f0Var) {
                    c9 = 0;
                    break;
                }
            }
            if (c9 == 1) {
                return true;
            }
        } while (c9 != 2);
        return false;
    }

    public void r(Object obj) {
        q(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = Q7.AbstractC0255x.f2590c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != Q7.AbstractC0255x.f2591d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = U(r0, new Q7.C0247o(false, y(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == Q7.AbstractC0255x.f2592e) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != Q7.AbstractC0255x.f2590c) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof Q7.b0) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if ((r4 instanceof Q7.P) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r1 = y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r5 = (Q7.P) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (D() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r5.isActive() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        r5 = U(r4, new Q7.C0247o(false, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r5 == Q7.AbstractC0255x.f2590c) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        if (r5 == Q7.AbstractC0255x.f2592e) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r6 = E(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r6 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
    
        r7 = new Q7.b0(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        r4 = Q7.d0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof Q7.P) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
    
        if (r4.get(r9) == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        O(r6, r1);
        r10 = Q7.AbstractC0255x.f2590c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005b, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
    
        r10 = Q7.AbstractC0255x.f2593f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0048, code lost:
    
        r5 = (Q7.b0) r4;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0056, code lost:
    
        if (Q7.b0.f2554f.get(r5) != Q7.AbstractC0255x.f2594g) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0058, code lost:
    
        r10 = Q7.AbstractC0255x.f2593f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005e, code lost:
    
        r5 = ((Q7.b0) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0065, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0067, code lost:
    
        r1 = y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof Q7.b0) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006e, code lost:
    
        ((Q7.b0) r4).a(r1);
        r10 = ((Q7.b0) r4).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007d, code lost:
    
        if ((!r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0080, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0081, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0083, code lost:
    
        O(((Q7.b0) r4).b, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008a, code lost:
    
        r10 = Q7.AbstractC0255x.f2590c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x006c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008e, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f5, code lost:
    
        if (r0 != Q7.AbstractC0255x.f2590c) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0107, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fb, code lost:
    
        if (r0 != Q7.AbstractC0255x.f2591d) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0100, code lost:
    
        if (r0 != Q7.AbstractC0255x.f2593f) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0103, code lost:
    
        q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((Q7.b0) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.d0.s(java.lang.Object):boolean");
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(M() + '{' + T(F()) + '}');
        sb.append('@');
        sb.append(AbstractC0255x.g(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (K()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC0241i interfaceC0241i = (InterfaceC0241i) f2560c.get(this);
        if (interfaceC0241i != null && interfaceC0241i != g0.b) {
            if (interfaceC0241i.a(th) || z8) {
                return true;
            }
            return false;
        }
        return z8;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (s(th) && C()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, G1.a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, G1.a] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, Q7.d0] */
    public final void x(P p2, Object obj) {
        C0247o c0247o;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2560c;
        InterfaceC0241i interfaceC0241i = (InterfaceC0241i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0241i != null) {
            interfaceC0241i.d();
            atomicReferenceFieldUpdater.set(this, g0.b);
        }
        ?? r12 = 0;
        if (obj instanceof C0247o) {
            c0247o = (C0247o) obj;
        } else {
            c0247o = null;
        }
        if (c0247o != null) {
            th = c0247o.f2575a;
        } else {
            th = null;
        }
        if (p2 instanceof Y) {
            try {
                ((Y) p2).l(th);
                return;
            } catch (Throwable th2) {
                H(new RuntimeException("Exception in completion handler " + p2 + " for " + ((Object) this), th2));
                return;
            }
        }
        f0 c9 = p2.c();
        if (c9 != null) {
            Object h6 = c9.h();
            G7.j.c(h6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            V7.k kVar = (V7.k) h6;
            while (!kVar.equals(c9)) {
                if (kVar instanceof Y) {
                    Y y4 = (Y) kVar;
                    try {
                        y4.l(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            AbstractC2712a.a(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + y4 + " for " + ((Object) this), th3);
                        }
                    }
                }
                kVar = kVar.i();
                r12 = r12;
            }
            if (r12 != 0) {
                H(r12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        d0 d0Var = (d0) ((i0) obj);
        Object F4 = d0Var.F();
        CancellationException cancellationException2 = null;
        if (F4 instanceof b0) {
            cancellationException = ((b0) F4).b();
        } else if (F4 instanceof C0247o) {
            cancellationException = ((C0247o) F4).f2575a;
        } else if (!(F4 instanceof P)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + F4).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            cancellationException2 = new V("Parent job is ".concat(T(F4)), cancellationException, d0Var);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(b0 b0Var, Object obj) {
        C0247o c0247o;
        Throwable th;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof C0247o) {
            c0247o = (C0247o) obj;
        } else {
            c0247o = null;
        }
        if (c0247o != null) {
            th = c0247o.f2575a;
        } else {
            th = null;
        }
        synchronized (b0Var) {
            b0Var.d();
            ArrayList<Throwable> f9 = b0Var.f(th);
            if (f9.isEmpty()) {
                if (b0Var.d()) {
                    th2 = new V(v(), null, this);
                }
            } else {
                Iterator it = f9.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th2 = next;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) f9.get(0);
                }
            }
            if (th2 != null && f9.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f9.size()));
                for (Throwable th3 : f9) {
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC2712a.a(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new C0247o(false, th2);
        }
        if (th2 != null && (u(th2) || G(th2))) {
            G7.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0247o.b.compareAndSet((C0247o) obj, 0, 1);
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (obj instanceof P) {
            obj2 = new Q((P) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, b0Var, obj2) && atomicReferenceFieldUpdater.get(this) == b0Var) {
        }
        x(b0Var, obj);
        return obj;
    }

    public void Q() {
    }

    public void H(G1.a aVar) {
        throw aVar;
    }

    public void P(Object obj) {
    }

    public void q(Object obj) {
    }
}
