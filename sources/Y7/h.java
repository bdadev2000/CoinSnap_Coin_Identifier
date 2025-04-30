package Y7;

import G7.w;
import Q7.C0238f;
import Q7.InterfaceC0237e;
import V7.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.y;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3831c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3832d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3833e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3834f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3835g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f3836a = 1;
    public final w b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i9) {
        if (i9 >= 0 && i9 <= 1) {
            j jVar = new j(0L, null, 2);
            this.head$volatile = jVar;
            this.tail$volatile = jVar;
            this._availablePermits$volatile = 1 - i9;
            this.b = new w(this, 3);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object b;
        y yVar;
        C0238f c0238f;
        f fVar;
        long j7;
        while (true) {
            int andDecrement = f3835g.getAndDecrement(this);
            if (andDecrement <= this.f3836a) {
                y yVar2 = y.f23029a;
                C0238f c0238f2 = cVar.b;
                d dVar = cVar.f3826d;
                Object obj = cVar.f3825c;
                if (andDecrement > 0) {
                    d.f3827h.set(dVar, obj);
                    c0238f2.B(yVar2, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3833e;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f3834f.getAndIncrement(this);
                f fVar2 = f.f3829k;
                long j9 = andIncrement / i.f3841f;
                while (true) {
                    b = V7.a.b(jVar, j9, fVar2);
                    if (!V7.a.e(b)) {
                        u c9 = V7.a.c(b);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j7 = j9;
                            yVar = yVar2;
                            c0238f = c0238f2;
                            if (uVar.f3540d >= c9.f3540d) {
                                break;
                            }
                            if (!c9.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c9)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (c9.e()) {
                                        c9.d();
                                    }
                                    yVar2 = yVar;
                                    fVar2 = fVar;
                                    j9 = j7;
                                    c0238f2 = c0238f;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        yVar = yVar2;
                        c0238f = c0238f2;
                        break;
                    }
                    yVar2 = yVar;
                    fVar2 = fVar;
                    j9 = j7;
                    c0238f2 = c0238f;
                }
                j jVar2 = (j) V7.a.c(b);
                int i9 = (int) (andIncrement % i.f3841f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f3842g;
                while (!atomicReferenceArray.compareAndSet(i9, null, cVar)) {
                    if (atomicReferenceArray.get(i9) != null) {
                        H0.a aVar = i.b;
                        H0.a aVar2 = i.f3838c;
                        while (!atomicReferenceArray.compareAndSet(i9, aVar, aVar2)) {
                            C0238f c0238f3 = c0238f;
                            if (atomicReferenceArray.get(i9) != aVar) {
                                break;
                            } else {
                                c0238f = c0238f3;
                            }
                        }
                        d.f3827h.set(dVar, obj);
                        c0238f.B(yVar, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar2, i9);
                return;
            }
        }
    }

    public final void b() {
        int i9;
        Object b;
        boolean z8;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3835g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f3836a;
            if (andIncrement < i10) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3831c;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f3832d.getAndIncrement(this);
                long j7 = andIncrement2 / i.f3841f;
                g gVar = g.f3830k;
                while (true) {
                    b = V7.a.b(jVar, j7, gVar);
                    if (V7.a.e(b)) {
                        break;
                    }
                    u c9 = V7.a.c(b);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f3540d >= c9.f3540d) {
                            break;
                        }
                        if (!c9.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c9)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (c9.e()) {
                                    c9.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                }
                j jVar2 = (j) V7.a.c(b);
                jVar2.a();
                z8 = false;
                if (jVar2.f3540d <= j7) {
                    int i11 = (int) (andIncrement2 % i.f3841f);
                    H0.a aVar = i.b;
                    AtomicReferenceArray atomicReferenceArray = jVar2.f3842g;
                    Object andSet = atomicReferenceArray.getAndSet(i11, aVar);
                    if (andSet == null) {
                        int i12 = i.f3837a;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (atomicReferenceArray.get(i11) == i.f3838c) {
                                z8 = true;
                                break;
                            }
                        }
                        H0.a aVar2 = i.b;
                        H0.a aVar3 = i.f3839d;
                        while (true) {
                            if (atomicReferenceArray.compareAndSet(i11, aVar2, aVar3)) {
                                z8 = true;
                                break;
                            } else if (atomicReferenceArray.get(i11) != aVar2) {
                                break;
                            }
                        }
                        z8 = !z8;
                    } else if (andSet != i.f3840e) {
                        if (andSet instanceof InterfaceC0237e) {
                            InterfaceC0237e interfaceC0237e = (InterfaceC0237e) andSet;
                            H0.a f9 = interfaceC0237e.f(y.f23029a, this.b);
                            if (f9 != null) {
                                interfaceC0237e.o(f9);
                                z8 = true;
                                break;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                }
            } else {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
        } while (!z8);
    }
}
