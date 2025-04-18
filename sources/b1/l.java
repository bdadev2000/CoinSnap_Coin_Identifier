package b1;

import com.facebook.internal.AnalyticsEvents;
import com.google.common.primitives.Ints;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public class l extends n0 implements k, j0.d, m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22337g = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22338h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22339i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;

    @Nullable
    private volatile Object _parentHandle;

    @Nullable
    private volatile Object _state;
    public final h0.g d;

    /* renamed from: f, reason: collision with root package name */
    public final h0.l f22340f;

    public l(int i2, h0.g gVar) {
        super(i2);
        this.d = gVar;
        this.f22340f = gVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.f22287a;
    }

    public static Object C(y1 y1Var, Object obj, int i2, q0.l lVar) {
        if ((obj instanceof u) || !kotlin.jvm.internal.e.q(i2)) {
            return obj;
        }
        if (lVar != null || (y1Var instanceof j)) {
            return new t(obj, y1Var instanceof j ? (j) y1Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void u(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @Override // b1.k
    public final boolean A(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22338h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y1)) {
                return false;
            }
            m mVar = new m(this, th, (obj instanceof j) || (obj instanceof g1.z));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            y1 y1Var = (y1) obj;
            if (y1Var instanceof j) {
                h((j) obj, th);
            } else if (y1Var instanceof g1.z) {
                j((g1.z) obj, th);
            }
            if (!t()) {
                k();
            }
            l(this.f22348c);
            return true;
        }
    }

    @Override // b1.k
    public final android.support.v4.media.session.i B(Object obj, q0.l lVar) {
        return D(obj, lVar);
    }

    public final android.support.v4.media.session.i D(Object obj, q0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22338h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof y1;
            android.support.v4.media.session.i iVar = f0.f22306a;
            if (!z2) {
                boolean z3 = obj2 instanceof t;
                return null;
            }
            Object C = C((y1) obj2, obj, this.f22348c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!t()) {
                k();
            }
            return iVar;
        }
    }

    @Override // b1.k
    public final void E(z zVar) {
        d0.b0 b0Var = d0.b0.f30125a;
        h0.g gVar = this.d;
        g1.i iVar = gVar instanceof g1.i ? (g1.i) gVar : null;
        x(b0Var, (iVar != null ? iVar.d : null) == zVar ? 4 : this.f22348c, null);
    }

    @Override // b1.k
    public final void G(Object obj) {
        l(this.f22348c);
    }

    @Override // b1.m2
    public final void a(g1.z zVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f22337g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        s(zVar);
    }

    @Override // b1.n0
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22338h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof u) {
                return;
            }
            if (!(obj2 instanceof t)) {
                t tVar = new t(obj2, (j) null, (q0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            t tVar2 = (t) obj2;
            if (!(!(tVar2.e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            t a2 = t.a(tVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            j jVar = tVar2.f22374b;
            if (jVar != null) {
                h(jVar, cancellationException);
            }
            q0.l lVar = tVar2.f22375c;
            if (lVar != null) {
                i(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // b1.n0
    public final h0.g c() {
        return this.d;
    }

    @Override // b1.n0
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    @Override // b1.n0
    public final Object e(Object obj) {
        return obj instanceof t ? ((t) obj).f22373a : obj;
    }

    @Override // b1.n0
    public final Object g() {
        return f22338h.get(this);
    }

    @Override // j0.d
    public final j0.d getCallerFrame() {
        h0.g gVar = this.d;
        if (gVar instanceof j0.d) {
            return (j0.d) gVar;
        }
        return null;
    }

    @Override // h0.g
    public final h0.l getContext() {
        return this.f22340f;
    }

    public final void h(j jVar, Throwable th) {
        try {
            jVar.b(th);
        } catch (Throwable th2) {
            kotlin.jvm.internal.e.o(this.f22340f, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void i(q0.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            kotlin.jvm.internal.e.o(this.f22340f, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // b1.k
    public final boolean isActive() {
        return f22338h.get(this) instanceof y1;
    }

    public final void j(g1.z zVar, Throwable th) {
        h0.l lVar = this.f22340f;
        int i2 = f22337g.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            zVar.g(i2, lVar);
        } catch (Throwable th2) {
            kotlin.jvm.internal.e.o(lVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22339i;
        q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var == null) {
            return;
        }
        q0Var.dispose();
        atomicReferenceFieldUpdater.set(this, x1.f22395a);
    }

    public final void l(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f22337g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z2 = i2 == 4;
                h0.g gVar = this.d;
                if (z2 || !(gVar instanceof g1.i) || kotlin.jvm.internal.e.q(i2) != kotlin.jvm.internal.e.q(this.f22348c)) {
                    kotlin.jvm.internal.e.y(this, gVar, z2);
                    return;
                }
                z zVar = ((g1.i) gVar).d;
                h0.l context = gVar.getContext();
                if (zVar.j0(context)) {
                    zVar.h0(context, this);
                    return;
                }
                y0 a2 = d2.a();
                if (a2.p0()) {
                    a2.m0(this);
                    return;
                }
                a2.o0(true);
                try {
                    kotlin.jvm.internal.e.y(this, gVar, true);
                    do {
                    } while (a2.r0());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, Ints.MAX_POWER_OF_TWO + (536870911 & i3)));
    }

    @Override // b1.k
    public final void m(Object obj, q0.l lVar) {
        x(obj, this.f22348c, lVar);
    }

    public Throwable n(r1 r1Var) {
        return r1Var.n();
    }

    public final Object o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean t2 = t();
        do {
            atomicIntegerFieldUpdater = f22337g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (t2) {
                    w();
                }
                Object obj = f22338h.get(this);
                if (obj instanceof u) {
                    throw ((u) obj).f22378a;
                }
                if (kotlin.jvm.internal.e.q(this.f22348c)) {
                    h1 h1Var = (h1) this.f22340f.i(a0.f22285b);
                    if (h1Var != null && !h1Var.isActive()) {
                        CancellationException n2 = h1Var.n();
                        b(obj, n2);
                        throw n2;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((q0) f22339i.get(this)) == null) {
            r();
        }
        if (t2) {
            w();
        }
        return i0.a.f30806a;
    }

    public final void p() {
        q0 r2 = r();
        if (r2 != null && (!(f22338h.get(this) instanceof y1))) {
            r2.dispose();
            f22339i.set(this, x1.f22395a);
        }
    }

    @Override // b1.k
    public final android.support.v4.media.session.i q(Throwable th) {
        return D(new u(false, th), null);
    }

    public final q0 r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 h1Var = (h1) this.f22340f.i(a0.f22285b);
        if (h1Var == null) {
            return null;
        }
        q0 m02 = p0.a.m0(h1Var, true, new n(this), 2);
        do {
            atomicReferenceFieldUpdater = f22339i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m02)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m02;
    }

    @Override // h0.g
    public final void resumeWith(Object obj) {
        Throwable a2 = d0.n.a(obj);
        if (a2 != null) {
            obj = new u(false, a2);
        }
        x(obj, this.f22348c, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b8, code lost:
    
        u(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bb, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b1.l.f22338h
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof b1.b
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof b1.j
            r2 = 0
            if (r1 != 0) goto Lb8
            boolean r1 = r7 instanceof g1.z
            if (r1 != 0) goto Lb8
            boolean r1 = r7 instanceof b1.u
            if (r1 == 0) goto L5a
            r0 = r7
            b1.u r0 = (b1.u) r0
            r0.getClass()
            r3 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = b1.u.f22377b
            r5 = 0
            boolean r3 = r4.compareAndSet(r0, r5, r3)
            if (r3 == 0) goto L56
            boolean r3 = r7 instanceof b1.m
            if (r3 == 0) goto L55
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L41
            java.lang.Throwable r2 = r0.f22378a
        L41:
            boolean r0 = r10 instanceof b1.j
            if (r0 == 0) goto L4b
            b1.j r10 = (b1.j) r10
            r9.h(r10, r2)
            goto L55
        L4b:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            p0.a.q(r10, r0)
            g1.z r10 = (g1.z) r10
            r9.j(r10, r2)
        L55:
            return
        L56:
            u(r10, r7)
            throw r2
        L5a:
            boolean r1 = r7 instanceof b1.t
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L93
            r1 = r7
            b1.t r1 = (b1.t) r1
            b1.j r4 = r1.f22374b
            if (r4 != 0) goto L8f
            boolean r4 = r10 instanceof g1.z
            if (r4 == 0) goto L6c
            return
        L6c:
            p0.a.q(r10, r3)
            r3 = r10
            b1.j r3 = (b1.j) r3
            java.lang.Throwable r4 = r1.e
            if (r4 == 0) goto L7a
            r9.h(r3, r4)
            return
        L7a:
            r4 = 29
            b1.t r1 = b1.t.a(r1, r3, r2, r4)
        L80:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L87
            return
        L87:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L80
            goto L0
        L8f:
            u(r10, r7)
            throw r2
        L93:
            boolean r1 = r10 instanceof g1.z
            if (r1 == 0) goto L98
            return
        L98:
            p0.a.q(r10, r3)
            r3 = r10
            b1.j r3 = (b1.j) r3
            b1.t r8 = new b1.t
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        La9:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto Lb0
            return
        Lb0:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La9
            goto L0
        Lb8:
            u(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.l.s(java.lang.Object):void");
    }

    public final boolean t() {
        if (this.f22348c == 2) {
            h0.g gVar = this.d;
            p0.a.q(gVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (g1.i.f30615i.get((g1.i) gVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(v());
        sb.append('(');
        sb.append(f0.F(this.d));
        sb.append("){");
        Object obj = f22338h.get(this);
        sb.append(obj instanceof y1 ? "Active" : obj instanceof m ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED);
        sb.append("}@");
        sb.append(f0.o(this));
        return sb.toString();
    }

    public String v() {
        return "CancellableContinuation";
    }

    public final void w() {
        h0.g gVar = this.d;
        Throwable th = null;
        g1.i iVar = gVar instanceof g1.i ? (g1.i) gVar : null;
        if (iVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.i.f30615i;
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            android.support.v4.media.session.i iVar2 = g1.a.d;
            if (obj != iVar2) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                th = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                    break;
                }
            }
        }
        if (th == null) {
            return;
        }
        k();
        A(th);
    }

    public final void x(Object obj, int i2, q0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22338h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object C = C((y1) obj2, obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!t()) {
                    k();
                }
                l(i2);
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                mVar.getClass();
                if (m.f22344c.compareAndSet(mVar, 0, 1)) {
                    if (lVar != null) {
                        i(lVar, mVar.f22378a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // b1.k
    public final void z(q0.l lVar) {
        s(lVar instanceof j ? (j) lVar : new i(lVar, 2));
    }
}
