package i1;

import b1.m2;
import d0.b0;
import e1.t0;
import g1.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class i implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30825c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f30826f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f30827g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f30828a;

    /* renamed from: b, reason: collision with root package name */
    public final i.i f30829b;
    private volatile long deqIdx;
    private volatile long enqIdx;

    @Nullable
    private volatile Object head;

    @Nullable
    private volatile Object tail;

    public i(int i2, int i3) {
        this.f30828a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Semaphore should have at least 1 permit, but had ", i2).toString());
        }
        if (i3 < 0 || i3 > i2) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("The number of acquired permits should be in 0..", i2).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head = kVar;
        this.tail = kVar;
        this._availablePermits = i2 - i3;
        this.f30829b = new i.i(this, 8);
    }

    public final boolean a(m2 m2Var) {
        Object a2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f30826f.getAndIncrement(this);
        g gVar = g.f30823a;
        long j2 = andIncrement / j.f30833f;
        loop0: while (true) {
            a2 = g1.a.a(kVar, j2, gVar);
            if (!t0.r(a2)) {
                z n2 = t0.n(a2);
                while (true) {
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
        k kVar2 = (k) t0.n(a2);
        int i2 = (int) (andIncrement % j.f30833f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f30834f;
        while (!atomicReferenceArray.compareAndSet(i2, null, m2Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                android.support.v4.media.session.i iVar = j.f30831b;
                android.support.v4.media.session.i iVar2 = j.f30832c;
                while (!atomicReferenceArray.compareAndSet(i2, iVar, iVar2)) {
                    if (atomicReferenceArray.get(i2) != iVar) {
                        return false;
                    }
                }
                ((b1.k) m2Var).m(b0.f30125a, this.f30829b);
                return true;
            }
        }
        m2Var.a(kVar2, i2);
        return true;
    }

    public final void b() {
        int i2;
        Object a2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f30827g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.f30828a;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30825c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j2 = andIncrement2 / j.f30833f;
            h hVar = h.f30824a;
            while (true) {
                a2 = g1.a.a(kVar, j2, hVar);
                if (t0.r(a2)) {
                    break;
                }
                z n2 = t0.n(a2);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f30641c >= n2.f30641c) {
                        break;
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
            }
            k kVar2 = (k) t0.n(a2);
            kVar2.a();
            if (kVar2.f30641c <= j2) {
                int i4 = (int) (andIncrement2 % j.f30833f);
                android.support.v4.media.session.i iVar = j.f30831b;
                AtomicReferenceArray atomicReferenceArray = kVar2.f30834f;
                Object andSet = atomicReferenceArray.getAndSet(i4, iVar);
                if (andSet == null) {
                    int i5 = j.f30830a;
                    boolean z2 = false;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (atomicReferenceArray.get(i4) == j.f30832c) {
                            return;
                        }
                    }
                    android.support.v4.media.session.i iVar2 = j.f30831b;
                    android.support.v4.media.session.i iVar3 = j.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i4, iVar2, iVar3)) {
                            if (atomicReferenceArray.get(i4) != iVar2) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                } else if (andSet == j.e) {
                    continue;
                } else {
                    if (!(andSet instanceof b1.k)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    b1.k kVar3 = (b1.k) andSet;
                    android.support.v4.media.session.i B = kVar3.B(b0.f30125a, this.f30829b);
                    if (B != null) {
                        kVar3.G(B);
                        return;
                    }
                }
            }
        }
    }
}
