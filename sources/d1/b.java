package d1;

import b1.f0;
import b1.m2;
import com.google.common.primitives.Longs;
import d0.b0;
import e1.t0;
import g.i0;
import g1.a0;
import g1.z;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f30148c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f30149f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f30150g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30151h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30152i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30153j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30154k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30155l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");

    @Nullable
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f30156a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.l f30157b;
    private volatile long bufferEnd;

    @Nullable
    private volatile Object bufferEndSegment;

    @Nullable
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    @Nullable
    private volatile Object receiveSegment;
    private volatile long receivers;

    @Nullable
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, q0.l lVar) {
        this.f30156a = i2;
        this.f30157b = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.j("Invalid channel capacity: ", i2, ", should be >=0").toString());
        }
        j jVar = d.f30159a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f30149f.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (y()) {
            jVar2 = d.f30159a;
            p0.a.q(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f30175s;
    }

    public static boolean D(Object obj) {
        if (obj instanceof b1.k) {
            p0.a.q(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((b1.k) obj, b0.f30125a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final j e(b bVar, long j2, j jVar) {
        Object a2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        j jVar2 = d.f30159a;
        c cVar = c.f30158a;
        loop0: while (true) {
            a2 = g1.a.a(jVar, j2, cVar);
            if (!t0.r(a2)) {
                z n2 = t0.n(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30151h;
                    z zVar = (z) atomicReferenceFieldUpdater.get(bVar);
                    if (zVar.f30641c >= n2.f30641c) {
                        break loop0;
                    }
                    if (!n2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, zVar, n2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != zVar) {
                            if (n2.e()) {
                                n2.d();
                            }
                        }
                    }
                    if (zVar.e()) {
                        zVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean r2 = t0.r(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
        if (r2) {
            bVar.k();
            if (jVar.f30641c * d.f30160b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) t0.n(a2);
        long j5 = jVar3.f30641c;
        if (j5 <= j2) {
            return jVar3;
        }
        long j6 = d.f30160b * j5;
        do {
            atomicLongFieldUpdater = f30148c;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * d.f30160b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void h(b bVar, Object obj, b1.l lVar) {
        d0.e i2;
        q0.l lVar2 = bVar.f30157b;
        if (lVar2 != null && (i2 = t0.i(lVar2, obj, null)) != null) {
            kotlin.jvm.internal.e.o(lVar.f22340f, i2);
        }
        lVar.resumeWith(kotlin.jvm.internal.q.d(bVar.t()));
    }

    public static final int i(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        bVar.getClass();
        jVar.m(i2, obj);
        if (z2) {
            return bVar.F(jVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = jVar.k(i2);
        if (k2 == null) {
            if (bVar.l(j2)) {
                if (jVar.j(i2, null, d.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof m2) {
            jVar.m(i2, null);
            if (bVar.C(k2, obj)) {
                jVar.n(i2, d.f30165i);
                return 0;
            }
            android.support.v4.media.session.i iVar = d.f30167k;
            if (jVar.f30182g.getAndSet((i2 * 2) + 1, iVar) != iVar) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.F(jVar, i2, obj, j2, obj2, z2);
    }

    public static void v(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30150g;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & Longs.MAX_POWER_OF_TWO) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(bVar) & Longs.MAX_POWER_OF_TWO) != 0);
    }

    public final Object A(Object obj, h0.g gVar) {
        d0.e i2;
        b1.l lVar = new b1.l(1, f0.r(gVar));
        lVar.p();
        q0.l lVar2 = this.f30157b;
        if (lVar2 == null || (i2 = t0.i(lVar2, obj, null)) == null) {
            lVar.resumeWith(kotlin.jvm.internal.q.d(t()));
        } else {
            kotlin.jvm.internal.q.a(i2, t());
            lVar.resumeWith(kotlin.jvm.internal.q.d(i2));
        }
        Object o2 = lVar.o();
        return o2 == i0.a.f30806a ? o2 : b0.f30125a;
    }

    public final void B(m2 m2Var, boolean z2) {
        if (m2Var instanceof b1.k) {
            ((h0.g) m2Var).resumeWith(kotlin.jvm.internal.q.d(z2 ? s() : t()));
            return;
        }
        if (!(m2Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + m2Var).toString());
        }
        a aVar = (a) m2Var;
        b1.l lVar = aVar.f30146b;
        p0.a.p(lVar);
        aVar.f30146b = null;
        aVar.f30145a = d.f30168l;
        Throwable r2 = aVar.f30147c.r();
        if (r2 == null) {
            lVar.resumeWith(Boolean.FALSE);
        } else {
            lVar.resumeWith(kotlin.jvm.internal.q.d(r2));
        }
    }

    public final boolean C(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b1.k)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            p0.a.q(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            b1.k kVar = (b1.k) obj;
            q0.l lVar = this.f30157b;
            return d.a(kVar, obj2, lVar != null ? t0.f(lVar, obj2, kVar.getContext()) : null);
        }
        p0.a.q(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        b1.l lVar2 = aVar.f30146b;
        p0.a.p(lVar2);
        aVar.f30146b = null;
        aVar.f30145a = obj2;
        Boolean bool = Boolean.TRUE;
        q0.l lVar3 = aVar.f30147c.f30157b;
        return d.a(lVar2, bool, lVar3 != null ? t0.f(lVar3, obj2, lVar2.f22340f) : null);
    }

    public final Object E(j jVar, int i2, long j2, Object obj) {
        Object k2 = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f30182g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30148c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f30170n;
                }
                if (jVar.j(i2, k2, obj)) {
                    p();
                    return d.f30169m;
                }
            }
        } else if (k2 == d.d && jVar.j(i2, k2, d.f30165i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null || k3 == d.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i2, k3, d.f30164h)) {
                        p();
                        return d.f30171o;
                    }
                } else {
                    if (obj == null) {
                        return d.f30170n;
                    }
                    if (jVar.j(i2, k3, obj)) {
                        p();
                        return d.f30169m;
                    }
                }
            } else {
                if (k3 != d.d) {
                    android.support.v4.media.session.i iVar = d.f30166j;
                    if (k3 != iVar && k3 != d.f30164h) {
                        if (k3 == d.f30168l) {
                            p();
                            return d.f30171o;
                        }
                        if (k3 != d.f30163g && jVar.j(i2, k3, d.f30162f)) {
                            boolean z2 = k3 instanceof t;
                            if (z2) {
                                k3 = ((t) k3).f30190a;
                            }
                            if (D(k3)) {
                                jVar.n(i2, d.f30165i);
                                p();
                                Object obj3 = atomicReferenceArray.get(i2 * 2);
                                jVar.m(i2, null);
                                return obj3;
                            }
                            jVar.n(i2, iVar);
                            jVar.l(i2, false);
                            if (z2) {
                                p();
                            }
                            return d.f30171o;
                        }
                    }
                    return d.f30171o;
                }
                if (jVar.j(i2, k3, d.f30165i)) {
                    p();
                    Object obj4 = atomicReferenceArray.get(i2 * 2);
                    jVar.m(i2, null);
                    return obj4;
                }
            }
        }
    }

    public final int F(j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = jVar.k(i2);
            if (k2 == null) {
                if (!l(j2) || z2) {
                    if (z2) {
                        if (jVar.j(i2, null, d.f30166j)) {
                            jVar.l(i2, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i2, null, d.d)) {
                    return 1;
                }
            } else {
                if (k2 != d.e) {
                    android.support.v4.media.session.i iVar = d.f30167k;
                    if (k2 == iVar) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f30164h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f30168l) {
                        jVar.m(i2, null);
                        k();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k2 instanceof t) {
                        k2 = ((t) k2).f30190a;
                    }
                    if (C(k2, obj)) {
                        jVar.n(i2, d.f30165i);
                        return 0;
                    }
                    if (jVar.f30182g.getAndSet((i2 * 2) + 1, iVar) != iVar) {
                        jVar.l(i2, true);
                    }
                    return 5;
                }
                if (jVar.j(i2, k2, d.d)) {
                    return 1;
                }
            }
        }
    }

    public final void G(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        if (y()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f30149f;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = d.f30161c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f30150g;
            if (i3 >= i2) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, Longs.MAX_POWER_OF_TWO + (j3 & 4611686018427387903L)));
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater2.get(this);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z2 = (j6 & Longs.MAX_POWER_OF_TWO) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + Longs.MAX_POWER_OF_TWO);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, j4 & 4611686018427387903L));
                return;
            }
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j8 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // d1.r
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r1;
     */
    @Override // d1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.b(java.lang.Object):java.lang.Object");
    }

    @Override // d1.s
    public final void c(i.i iVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f30155l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, iVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            android.support.v4.media.session.i iVar2 = d.f30173q;
            if (obj != iVar2) {
                if (obj == d.f30174r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            android.support.v4.media.session.i iVar3 = d.f30174r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar2, iVar3)) {
                if (atomicReferenceFieldUpdater.get(this) != iVar2) {
                    break;
                }
            }
            iVar.invoke((Object) r());
            return;
        }
    }

    @Override // d1.r
    public final Object d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f30148c;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (w(j3, true)) {
            return new g(r());
        }
        long j4 = j3 & 1152921504606846975L;
        Object obj = i.f30179b;
        if (j2 >= j4) {
            return obj;
        }
        Object obj2 = d.f30167k;
        j jVar = (j) f30152i.get(this);
        while (!w(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = d.f30160b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (jVar.f30641c != j6) {
                j q2 = q(j6, jVar);
                if (q2 == null) {
                    continue;
                } else {
                    jVar = q2;
                }
            }
            Object E = E(jVar, i2, andIncrement, obj2);
            if (E == d.f30169m) {
                m2 m2Var = obj2 instanceof m2 ? (m2) obj2 : null;
                if (m2Var != null) {
                    m2Var.a(jVar, i2);
                }
                G(andIncrement);
                jVar.h();
            } else if (E == d.f30171o) {
                if (andIncrement < u()) {
                    jVar.a();
                }
            } else {
                if (E == d.f30170n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                jVar.a();
                obj = E;
            }
            return obj;
        }
        return new g(r());
    }

    @Override // d1.s
    public final boolean f(Throwable th) {
        return m(false, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [b1.l] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, d1.b] */
    @Override // d1.r
    public final Object g(j0.i iVar) {
        j jVar;
        ?? r10;
        b1.l lVar;
        i0 f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30152i;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f30148c;
            if (w(atomicLongFieldUpdater.get(this), true)) {
                Throwable s2 = s();
                int i2 = a0.f30592a;
                throw s2;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j2 = d.f30160b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar2.f30641c != j3) {
                j q2 = q(j3, jVar2);
                if (q2 == null) {
                    continue;
                } else {
                    jVar = q2;
                }
            } else {
                jVar = jVar2;
            }
            Object E = E(jVar, i3, andIncrement, null);
            android.support.v4.media.session.i iVar2 = d.f30169m;
            if (E == iVar2) {
                throw new IllegalStateException("unexpected".toString());
            }
            android.support.v4.media.session.i iVar3 = d.f30171o;
            if (E == iVar3) {
                if (andIncrement < u()) {
                    jVar.a();
                }
                jVar2 = jVar;
            } else {
                if (E != d.f30170n) {
                    jVar.a();
                    return E;
                }
                b1.l n2 = kotlin.jvm.internal.e.n(f0.r(iVar));
                android.support.v4.media.session.i iVar4 = iVar2;
                try {
                    Object E2 = E(jVar, i3, andIncrement, n2);
                    try {
                        if (E2 == iVar4) {
                            lVar = n2;
                            lVar.a(jVar, i3);
                        } else {
                            lVar = n2;
                            q0.l lVar2 = this.f30157b;
                            h0.l lVar3 = lVar.f22340f;
                            if (E2 == iVar3) {
                                if (andIncrement < u()) {
                                    jVar.a();
                                }
                                j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (w(atomicLongFieldUpdater.get(this), true)) {
                                        lVar.resumeWith(kotlin.jvm.internal.q.d(s()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                    long j4 = d.f30160b;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                    long j5 = andIncrement2 / j4;
                                    int i4 = (int) (andIncrement2 % j4);
                                    if (jVar3.f30641c != j5) {
                                        j q3 = q(j5, jVar3);
                                        if (q3 == null) {
                                            continue;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                        } else {
                                            jVar3 = q3;
                                        }
                                    }
                                    h0.l lVar4 = lVar3;
                                    q0.l lVar5 = lVar2;
                                    E2 = E(jVar3, i4, andIncrement2, lVar);
                                    if (E2 == d.f30169m) {
                                        lVar.a(jVar3, i4);
                                        break;
                                    }
                                    if (E2 == d.f30171o) {
                                        if (andIncrement2 < u()) {
                                            jVar3.a();
                                        }
                                        lVar3 = lVar4;
                                        lVar2 = lVar5;
                                        atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                    } else {
                                        if (E2 == d.f30170n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        jVar3.a();
                                        f2 = lVar5 != null ? t0.f(lVar5, E2, lVar4) : null;
                                    }
                                }
                            } else {
                                jVar.a();
                                f2 = lVar2 != null ? t0.f(lVar2, E2, lVar3) : null;
                            }
                            lVar.m(E2, f2);
                        }
                        Object o2 = lVar.o();
                        i0.a aVar = i0.a.f30806a;
                        return o2;
                    } catch (Throwable th) {
                        th = th;
                        r10 = iVar4;
                        r10.w();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = n2;
                }
            }
        }
    }

    @Override // d1.r
    public final a iterator() {
        return new a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
    
        h(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c7, code lost:
    
        r2.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ca, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0143, code lost:
    
        if (r19 >= r5.get(r26)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0145, code lost:
    
        r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0148, code lost:
    
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014a, code lost:
    
        h(r26, r27, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [b1.l] */
    @Override // d1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(java.lang.Object r27, h0.g r28) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.j(java.lang.Object, h0.g):java.lang.Object");
    }

    @Override // d1.s
    public final boolean k() {
        return w(f30148c.get(this), false);
    }

    public final boolean l(long j2) {
        return j2 < f30149f.get(this) || j2 < d.get(this) + ((long) this.f30156a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = d1.d.f30175s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = d1.b.f30154k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r4.compareAndSet(r13, r3, r15) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r4.get(r13) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r14 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r9.compareAndSet(r13, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r14 = d1.b.f30155l;
        r15 = r14.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r15 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = d1.d.f30173q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r14.compareAndSet(r13, r15, r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r14.get(r13) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r15 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        kotlin.jvm.internal.e.g(1, r15);
        ((q0.l) r15).invoke(r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = d1.d.f30174r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r5 = r9.get(r13);
        r14 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r14 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r14 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r9.compareAndSet(r13, r5, (r3 << 60) + r14) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0061, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r7 = d1.d.f30159a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9.compareAndSet(r13, r5, (1 << 60) + (r5 & 1152921504606846975L)) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(boolean r14, java.lang.Throwable r15) {
        /*
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = d1.b.f30148c
            r10 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r9.get(r13)
            long r3 = r5 >> r0
            int r3 = (int) r3
            if (r3 != 0) goto L24
            long r3 = r5 & r1
            d1.j r7 = d1.d.f30159a
            long r7 = (long) r10
            long r7 = r7 << r0
            long r7 = r7 + r3
            r3 = r9
            r4 = r13
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto Lc
        L24:
            android.support.v4.media.session.i r3 = d1.d.f30175s
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = d1.b.f30154k
            boolean r5 = r4.compareAndSet(r13, r3, r15)
            if (r5 == 0) goto L30
            r11 = r10
            goto L38
        L30:
            java.lang.Object r4 = r4.get(r13)
            if (r4 == r3) goto L26
            r15 = 0
            r11 = r15
        L38:
            r12 = 3
            if (r14 == 0) goto L4e
        L3b:
            long r5 = r9.get(r13)
            long r14 = r5 & r1
            long r3 = (long) r12
            long r3 = r3 << r0
            long r7 = r3 + r14
            r3 = r9
            r4 = r13
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L3b
            goto L6e
        L4e:
            long r5 = r9.get(r13)
            long r14 = r5 >> r0
            int r14 = (int) r14
            if (r14 == 0) goto L61
            if (r14 == r10) goto L5a
            goto L6e
        L5a:
            long r14 = r5 & r1
            long r3 = (long) r12
        L5d:
            long r3 = r3 << r0
            long r3 = r3 + r14
            r7 = r3
            goto L66
        L61:
            long r14 = r5 & r1
            r3 = 2
            long r3 = (long) r3
            goto L5d
        L66:
            r3 = r9
            r4 = r13
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L4e
        L6e:
            r13.k()
            if (r11 == 0) goto L9d
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = d1.b.f30155l
            java.lang.Object r15 = r14.get(r13)
            if (r15 != 0) goto L7e
            android.support.v4.media.session.i r0 = d1.d.f30173q
            goto L80
        L7e:
            android.support.v4.media.session.i r0 = d1.d.f30174r
        L80:
            boolean r1 = r14.compareAndSet(r13, r15, r0)
            if (r1 == 0) goto L96
            if (r15 != 0) goto L89
            goto L9d
        L89:
            kotlin.jvm.internal.e.g(r10, r15)
            q0.l r15 = (q0.l) r15
            java.lang.Throwable r14 = r13.r()
            r15.invoke(r14)
            goto L9d
        L96:
            java.lang.Object r1 = r14.get(r13)
            if (r1 == r15) goto L80
            goto L73
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.m(boolean, java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (d1.j) ((g1.e) g1.e.f30604b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final d1.j n(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.n(long):d1.j");
    }

    public final void o(long j2) {
        d0.e i2;
        j jVar = (j) f30152i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f30156a + j3, f30149f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f30160b;
                long j5 = j3 / j4;
                int i3 = (int) (j3 % j4);
                if (jVar.f30641c != j5) {
                    j q2 = q(j5, jVar);
                    if (q2 == null) {
                        continue;
                    } else {
                        jVar = q2;
                    }
                }
                Object E = E(jVar, i3, j3, null);
                if (E != d.f30171o) {
                    jVar.a();
                    q0.l lVar = this.f30157b;
                    if (lVar != null && (i2 = t0.i(lVar, E, null)) != null) {
                        throw i2;
                    }
                } else if (j3 < u()) {
                    jVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c4, code lost:
    
        if ((r0.addAndGet(r16, r14 - r9) & com.google.common.primitives.Longs.MAX_POWER_OF_TWO) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00cd, code lost:
    
        if ((r0.get(r16) & com.google.common.primitives.Longs.MAX_POWER_OF_TWO) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.p():void");
    }

    public final j q(long j2, j jVar) {
        Object a2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f30159a;
        c cVar = c.f30158a;
        loop0: while (true) {
            a2 = g1.a.a(jVar, j2, cVar);
            if (!t0.r(a2)) {
                z n2 = t0.n(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30152i;
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f30641c >= n2.f30641c) {
                        break loop0;
                    }
                    if (!n2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, n2)) {
                        if (atomicReferenceFieldUpdater.get(this) != zVar) {
                            if (n2.e()) {
                                n2.d();
                            }
                        }
                    }
                    if (zVar.e()) {
                        zVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (t0.r(a2)) {
            k();
            if (jVar.f30641c * d.f30160b >= u()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) t0.n(a2);
        boolean y2 = y();
        long j4 = jVar3.f30641c;
        if (!y2 && j2 <= f30149f.get(this) / d.f30160b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f30153j;
                z zVar2 = (z) atomicReferenceFieldUpdater2.get(this);
                if (zVar2.f30641c >= j4) {
                    break;
                }
                if (!jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, zVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != zVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (zVar2.e()) {
                    zVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return jVar3;
        }
        long j5 = d.f30160b * j4;
        do {
            atomicLongFieldUpdater = d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * d.f30160b >= u()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable r() {
        return (Throwable) f30154k.get(this);
    }

    public final Throwable s() {
        Throwable r2 = r();
        return r2 == null ? new NoSuchElementException("Channel was closed") : r2;
    }

    public final Throwable t() {
        Throwable r2 = r();
        return r2 == null ? new IllegalStateException("Channel was closed") : r2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0196, code lost:
    
        r3 = (d1.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019d, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.toString():java.lang.String");
    }

    public final long u() {
        return f30148c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (d1.j) ((g1.e) g1.e.f30604b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.w(long, boolean):boolean");
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j2 = f30149f.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(long r5, d1.j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f30641c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            g1.e r0 = r7.b()
            d1.j r0 = (d1.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            g1.e r5 = r7.b()
            d1.j r5 = (d1.j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = d1.b.f30153j
            java.lang.Object r6 = r5.get(r4)
            g1.z r6 = (g1.z) r6
            long r0 = r6.f30641c
            long r2 = r7.f30641c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.z(long, d1.j):void");
    }
}
