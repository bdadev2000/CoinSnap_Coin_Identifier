package S7;

import Q7.AbstractC0255x;
import Q7.C0238f;
import Q7.InterfaceC0237e;
import Q7.n0;
import Q7.r0;
import V7.u;
import V7.v;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;

/* loaded from: classes3.dex */
public class c implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2814d = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2815f = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2816g = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2817h = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2818i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2819j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2820k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final F7.l f2821c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i9, F7.l lVar) {
        long j7;
        this.b = i9;
        this.f2821c = lVar;
        if (i9 >= 0) {
            k kVar = e.f2823a;
            if (i9 != 0) {
                if (i9 != Integer.MAX_VALUE) {
                    j7 = i9;
                } else {
                    j7 = Long.MAX_VALUE;
                }
            } else {
                j7 = 0;
            }
            this.bufferEnd$volatile = j7;
            this.completedExpandBuffersAndPauseFlag$volatile = f2816g.get(this);
            k kVar2 = new k(0L, null, this, 3);
            this.sendSegment$volatile = kVar2;
            this.receiveSegment$volatile = kVar2;
            if (v()) {
                kVar2 = e.f2823a;
                G7.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = kVar2;
            this._closeCause$volatile = e.f2838s;
            return;
        }
        throw new IllegalArgumentException(n0.f(i9, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static boolean C(Object obj) {
        if (obj instanceof InterfaceC0237e) {
            G7.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0237e) obj, y.f23029a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final k b(c cVar, long j7, k kVar) {
        Object b;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        long j10;
        cVar.getClass();
        k kVar2 = e.f2823a;
        d dVar = d.f2822k;
        loop0: while (true) {
            b = V7.a.b(kVar, j7, dVar);
            if (!V7.a.e(b)) {
                u c9 = V7.a.c(b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2818i;
                    u uVar = (u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f3540d >= c9.f3540d) {
                        break loop0;
                    }
                    if (!c9.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, c9)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                            if (c9.e()) {
                                c9.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e4 = V7.a.e(b);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2815f;
        if (e4) {
            cVar.i();
            if (kVar.f3540d * e.b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) V7.a.c(b);
        long j11 = kVar3.f3540d;
        if (j11 > j7) {
            long j12 = e.b * j11;
            do {
                atomicLongFieldUpdater = f2814d;
                j9 = atomicLongFieldUpdater.get(cVar);
                j10 = 1152921504606846975L & j9;
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j9, j10 + (((int) (j9 >> 60)) << 60)));
            if (j11 * e.b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public static final void c(c cVar, Object obj, C0238f c0238f) {
        G1.a a6;
        F7.l lVar = cVar.f2821c;
        if (lVar != null && (a6 = V7.a.a(lVar, obj, null)) != null) {
            AbstractC0255x.i(a6, c0238f.f2566g);
        }
        c0238f.e(AbstractC2712a.b(cVar.q()));
    }

    public static final int d(c cVar, k kVar, int i9, Object obj, long j7, Object obj2, boolean z8) {
        cVar.getClass();
        kVar.m(i9, obj);
        if (z8) {
            return cVar.E(kVar, i9, obj, j7, obj2, z8);
        }
        Object k6 = kVar.k(i9);
        if (k6 == null) {
            if (cVar.e(j7)) {
                if (kVar.j(i9, null, e.f2825d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i9, null, obj2)) {
                    return 2;
                }
            }
        } else if (k6 instanceof r0) {
            kVar.m(i9, null);
            if (cVar.B(k6, obj)) {
                kVar.n(i9, e.f2830i);
                return 0;
            }
            H0.a aVar = e.f2832k;
            if (kVar.f2844h.getAndSet((i9 * 2) + 1, aVar) != aVar) {
                kVar.l(i9, true);
            }
            return 5;
        }
        return cVar.E(kVar, i9, obj, j7, obj2, z8);
    }

    public static void s(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2817h;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
    }

    public final Object A() {
        r0 r0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2815f;
        long j7 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2814d;
        long j9 = atomicLongFieldUpdater2.get(this);
        if (t(j9, true)) {
            return new h(o());
        }
        long j10 = j9 & 1152921504606846975L;
        Object obj = j.f2842a;
        if (j7 >= j10) {
            return obj;
        }
        Object obj2 = e.f2832k;
        k kVar = (k) f2819j.get(this);
        while (!t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = e.b;
            long j12 = andIncrement / j11;
            int i9 = (int) (andIncrement % j11);
            if (kVar.f3540d != j12) {
                k n2 = n(j12, kVar);
                if (n2 == null) {
                    continue;
                } else {
                    kVar = n2;
                }
            }
            Object D8 = D(kVar, i9, andIncrement, obj2);
            if (D8 == e.m) {
                if (obj2 instanceof r0) {
                    r0Var = (r0) obj2;
                } else {
                    r0Var = null;
                }
                if (r0Var != null) {
                    r0Var.a(kVar, i9);
                }
                F(andIncrement);
                kVar.h();
            } else if (D8 == e.f2834o) {
                if (andIncrement < r()) {
                    kVar.a();
                }
            } else if (D8 != e.f2833n) {
                kVar.a();
                obj = D8;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new h(o());
    }

    public final boolean B(Object obj, Object obj2) {
        V7.p pVar = null;
        if (obj instanceof b) {
            G7.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            b bVar = (b) obj;
            C0238f c0238f = bVar.f2812c;
            G7.j.b(c0238f);
            bVar.f2812c = null;
            bVar.b = obj2;
            Boolean bool = Boolean.TRUE;
            F7.l lVar = bVar.f2813d.f2821c;
            if (lVar != null) {
                pVar = new V7.p(lVar, obj2, c0238f.f2566g);
            }
            return e.a(c0238f, bool, pVar);
        }
        if (obj instanceof InterfaceC0237e) {
            G7.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0237e interfaceC0237e = (InterfaceC0237e) obj;
            F7.l lVar2 = this.f2821c;
            if (lVar2 != null) {
                pVar = new V7.p(lVar2, obj2, interfaceC0237e.getContext());
            }
            return e.a(interfaceC0237e, obj2, pVar);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object D(k kVar, int i9, long j7, Object obj) {
        Object k6 = kVar.k(i9);
        AtomicReferenceArray atomicReferenceArray = kVar.f2844h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2814d;
        if (k6 == null) {
            if (j7 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f2833n;
                }
                if (kVar.j(i9, k6, obj)) {
                    l();
                    return e.m;
                }
            }
        } else if (k6 == e.f2825d && kVar.j(i9, k6, e.f2830i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i9 * 2);
            kVar.m(i9, null);
            return obj2;
        }
        while (true) {
            Object k7 = kVar.k(i9);
            if (k7 != null && k7 != e.f2826e) {
                if (k7 == e.f2825d) {
                    if (kVar.j(i9, k7, e.f2830i)) {
                        l();
                        Object obj3 = atomicReferenceArray.get(i9 * 2);
                        kVar.m(i9, null);
                        return obj3;
                    }
                } else {
                    H0.a aVar = e.f2831j;
                    if (k7 == aVar) {
                        return e.f2834o;
                    }
                    if (k7 == e.f2829h) {
                        return e.f2834o;
                    }
                    if (k7 == e.l) {
                        l();
                        return e.f2834o;
                    }
                    if (k7 != e.f2828g && kVar.j(i9, k7, e.f2827f)) {
                        boolean z8 = k7 instanceof s;
                        if (z8) {
                            k7 = ((s) k7).f2847a;
                        }
                        if (C(k7)) {
                            kVar.n(i9, e.f2830i);
                            l();
                            Object obj4 = atomicReferenceArray.get(i9 * 2);
                            kVar.m(i9, null);
                            return obj4;
                        }
                        kVar.n(i9, aVar);
                        kVar.h();
                        if (z8) {
                            l();
                        }
                        return e.f2834o;
                    }
                }
            } else if (j7 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kVar.j(i9, k7, e.f2829h)) {
                    l();
                    return e.f2834o;
                }
            } else {
                if (obj == null) {
                    return e.f2833n;
                }
                if (kVar.j(i9, k7, obj)) {
                    l();
                    return e.m;
                }
            }
        }
    }

    public final int E(k kVar, int i9, Object obj, long j7, Object obj2, boolean z8) {
        while (true) {
            Object k6 = kVar.k(i9);
            if (k6 == null) {
                if (e(j7) && !z8) {
                    if (kVar.j(i9, null, e.f2825d)) {
                        return 1;
                    }
                } else if (z8) {
                    if (kVar.j(i9, null, e.f2831j)) {
                        kVar.h();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (kVar.j(i9, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k6 == e.f2826e) {
                if (kVar.j(i9, k6, e.f2825d)) {
                    return 1;
                }
            } else {
                H0.a aVar = e.f2832k;
                if (k6 == aVar) {
                    kVar.m(i9, null);
                    return 5;
                }
                if (k6 == e.f2829h) {
                    kVar.m(i9, null);
                    return 5;
                }
                if (k6 == e.l) {
                    kVar.m(i9, null);
                    i();
                    return 4;
                }
                kVar.m(i9, null);
                if (k6 instanceof s) {
                    k6 = ((s) k6).f2847a;
                }
                if (B(k6, obj)) {
                    kVar.n(i9, e.f2830i);
                    return 0;
                }
                if (kVar.f2844h.getAndSet((i9 * 2) + 1, aVar) == aVar) {
                    return 5;
                }
                kVar.l(i9, true);
                return 5;
            }
        }
    }

    public final void F(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        boolean z8;
        long j10;
        if (v()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f2816g;
        } while (atomicLongFieldUpdater.get(this) <= j7);
        int i9 = e.f2824c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2817h;
            if (i10 < i9) {
                long j11 = atomicLongFieldUpdater.get(this);
                if (j11 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j11 == atomicLongFieldUpdater.get(this)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                do {
                    j9 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, 4611686018427387904L + (j9 & 4611686018427387903L)));
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(this);
                    long j13 = atomicLongFieldUpdater2.get(this);
                    long j14 = j13 & 4611686018427387903L;
                    if ((j13 & 4611686018427387904L) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z8) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, j14 + 4611686018427387904L);
                    }
                }
                do {
                    j10 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j10, j10 & 4611686018427387903L));
                return;
            }
        }
    }

    @Override // S7.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(true, cancellationException);
    }

    public final boolean e(long j7) {
        if (j7 >= f2816g.get(this) && j7 >= f2815f.get(this) + this.b) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = S7.e.f2838s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = S7.c.l;
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
    
        i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r14 = S7.c.m;
        r15 = r14.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r15 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = S7.e.f2836q;
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
    
        G7.v.b(1, r15);
        ((F7.l) r15).invoke(o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = S7.e.f2837r;
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
    
        r7 = S7.e.f2823a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9.compareAndSet(r13, r5, (1 << 60) + (r5 & 1152921504606846975L)) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(boolean r14, java.lang.Throwable r15) {
        /*
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = S7.c.f2814d
            r10 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r9.get(r13)
            long r3 = r5 >> r0
            int r3 = (int) r3
            if (r3 != 0) goto L24
            long r3 = r5 & r1
            S7.k r7 = S7.e.f2823a
            long r7 = (long) r10
            long r7 = r7 << r0
            long r7 = r7 + r3
            r3 = r9
            r4 = r13
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto Lc
        L24:
            H0.a r3 = S7.e.f2838s
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = S7.c.l
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
            r13.i()
            if (r11 == 0) goto L9d
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = S7.c.m
            java.lang.Object r15 = r14.get(r13)
            if (r15 != 0) goto L7e
            H0.a r0 = S7.e.f2836q
            goto L80
        L7e:
            H0.a r0 = S7.e.f2837r
        L80:
            boolean r1 = r14.compareAndSet(r13, r15, r0)
            if (r1 == 0) goto L96
            if (r15 != 0) goto L89
            goto L9d
        L89:
            G7.v.b(r10, r15)
            F7.l r15 = (F7.l) r15
            java.lang.Throwable r14 = r13.o()
            r15.invoke(r14)
            goto L9d
        L96:
            java.lang.Object r1 = r14.get(r13)
            if (r1 == r15) goto L80
            goto L73
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.c.f(boolean, java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        r2.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [Q7.f] */
    @Override // S7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.Object r27, w7.f r28) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.c.g(java.lang.Object, w7.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (S7.k) ((V7.d) V7.d.f3511c.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S7.k h(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.c.h(long):S7.k");
    }

    public final void i() {
        t(f2814d.get(this), false);
    }

    @Override // S7.q
    public final b iterator() {
        return new b(this);
    }

    @Override // S7.r
    public final boolean j(Throwable th) {
        return f(false, th);
    }

    public final void k(long j7) {
        G1.a a6;
        k kVar = (k) f2819j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2815f;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(this.b + j9, f2816g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                long j10 = e.b;
                long j11 = j9 / j10;
                int i9 = (int) (j9 % j10);
                if (kVar.f3540d != j11) {
                    k n2 = n(j11, kVar);
                    if (n2 == null) {
                        continue;
                    } else {
                        kVar = n2;
                    }
                }
                Object D8 = D(kVar, i9, j9, null);
                if (D8 == e.f2834o) {
                    if (j9 < r()) {
                        kVar.a();
                    }
                } else {
                    kVar.a();
                    F7.l lVar = this.f2821c;
                    if (lVar != null && (a6 = V7.a.a(lVar, D8, null)) != null) {
                        throw a6;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c4, code lost:
    
        if ((r0.addAndGet(r16, r14 - r9) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00cd, code lost:
    
        if ((r0.get(r16) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.c.l():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // S7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.c.m(java.lang.Object):java.lang.Object");
    }

    public final k n(long j7, k kVar) {
        Object b;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        k kVar2 = e.f2823a;
        d dVar = d.f2822k;
        loop0: while (true) {
            b = V7.a.b(kVar, j7, dVar);
            if (!V7.a.e(b)) {
                u c9 = V7.a.c(b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2819j;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3540d >= c9.f3540d) {
                        break loop0;
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
            } else {
                break;
            }
        }
        if (V7.a.e(b)) {
            i();
            if (kVar.f3540d * e.b >= r()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) V7.a.c(b);
        boolean v6 = v();
        long j10 = kVar3.f3540d;
        if (!v6 && j7 <= f2816g.get(this) / e.b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2820k;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f3540d >= j10) {
                    break;
                }
                if (!kVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (kVar3.e()) {
                            kVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j10 > j7) {
            long j11 = e.b * j10;
            do {
                atomicLongFieldUpdater = f2815f;
                j9 = atomicLongFieldUpdater.get(this);
                if (j9 >= j11) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, j11));
            if (j10 * e.b >= r()) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public final Throwable o() {
        return (Throwable) l.get(this);
    }

    public final Throwable p() {
        Throwable o3 = o();
        if (o3 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return o3;
    }

    public final Throwable q() {
        Throwable o3 = o();
        if (o3 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return o3;
    }

    public final long r() {
        return f2814d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (S7.k) ((V7.d) V7.d.f3511c.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.c.t(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019c, code lost:
    
        r3 = (S7.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.c.toString():java.lang.String");
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j7 = f2816g.get(this);
        if (j7 != 0 && j7 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(long r5, S7.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f3540d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            V7.d r0 = r7.b()
            S7.k r0 = (S7.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            V7.d r5 = r7.b()
            S7.k r5 = (S7.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = S7.c.f2820k
            java.lang.Object r6 = r5.get(r4)
            V7.u r6 = (V7.u) r6
            long r0 = r6.f3540d
            long r2 = r7.f3540d
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
        throw new UnsupportedOperationException("Method not decompiled: S7.c.w(long, S7.k):void");
    }

    public final Object x(Object obj, w7.f fVar) {
        G1.a a6;
        C0238f c0238f = new C0238f(1, F2.h.x(fVar));
        c0238f.t();
        F7.l lVar = this.f2821c;
        if (lVar != null && (a6 = V7.a.a(lVar, obj, null)) != null) {
            AbstractC2712a.a(a6, q());
            c0238f.e(AbstractC2712a.b(a6));
        } else {
            c0238f.e(AbstractC2712a.b(q()));
        }
        Object s5 = c0238f.s();
        if (s5 == EnumC2928a.b) {
            return s5;
        }
        return y.f23029a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [Q7.f] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, S7.c] */
    public final Object y(w7.f fVar) {
        k kVar;
        ?? r15;
        C0238f c0238f;
        V7.p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2819j;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2814d;
            if (!t(atomicLongFieldUpdater.get(this), true)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2815f;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
                long j7 = e.b;
                long j9 = andIncrement / j7;
                int i9 = (int) (andIncrement % j7);
                if (kVar2.f3540d != j9) {
                    k n2 = n(j9, kVar2);
                    if (n2 == null) {
                        continue;
                    } else {
                        kVar = n2;
                    }
                } else {
                    kVar = kVar2;
                }
                Object D8 = D(kVar, i9, andIncrement, null);
                H0.a aVar = e.m;
                if (D8 != aVar) {
                    H0.a aVar2 = e.f2834o;
                    if (D8 == aVar2) {
                        if (andIncrement < r()) {
                            kVar.a();
                        }
                        kVar2 = kVar;
                    } else if (D8 == e.f2833n) {
                        C0238f h6 = AbstractC0255x.h(F2.h.x(fVar));
                        try {
                            Object D9 = D(kVar, i9, andIncrement, h6);
                            try {
                                if (D9 == aVar) {
                                    c0238f = h6;
                                    c0238f.a(kVar, i9);
                                } else {
                                    c0238f = h6;
                                    F7.l lVar = this.f2821c;
                                    w7.k kVar3 = c0238f.f2566g;
                                    if (D9 == aVar2) {
                                        if (andIncrement < r()) {
                                            kVar.a();
                                        }
                                        k kVar4 = (k) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            if (t(atomicLongFieldUpdater.get(this), true)) {
                                                c0238f.e(AbstractC2712a.b(p()));
                                                break;
                                            }
                                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                            long j10 = e.b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                            long j11 = andIncrement2 / j10;
                                            int i10 = (int) (andIncrement2 % j10);
                                            if (kVar4.f3540d != j11) {
                                                k n9 = n(j11, kVar4);
                                                if (n9 == null) {
                                                    continue;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                                } else {
                                                    kVar4 = n9;
                                                }
                                            }
                                            w7.k kVar5 = kVar3;
                                            F7.l lVar2 = lVar;
                                            D9 = D(kVar4, i10, andIncrement2, c0238f);
                                            if (D9 == e.m) {
                                                c0238f.a(kVar4, i10);
                                                break;
                                            }
                                            if (D9 == e.f2834o) {
                                                if (andIncrement2 < r()) {
                                                    kVar4.a();
                                                }
                                                kVar3 = kVar5;
                                                lVar = lVar2;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            } else if (D9 != e.f2833n) {
                                                kVar4.a();
                                                if (lVar2 != null) {
                                                    pVar = new V7.p(lVar2, D9, kVar5);
                                                } else {
                                                    pVar = null;
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        }
                                    } else {
                                        kVar.a();
                                        if (lVar != null) {
                                            pVar = new V7.p(lVar, D9, kVar3);
                                        } else {
                                            pVar = null;
                                        }
                                    }
                                    c0238f.B(D9, pVar);
                                }
                                return c0238f.s();
                            } catch (Throwable th) {
                                th = th;
                                r15 = aVar;
                                r15.A();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r15 = h6;
                        }
                    } else {
                        kVar.a();
                        return D8;
                    }
                } else {
                    throw new IllegalStateException("unexpected".toString());
                }
            } else {
                Throwable p2 = p();
                int i11 = v.f3541a;
                throw p2;
            }
        }
    }

    public final void z(r0 r0Var, boolean z8) {
        Throwable q9;
        if (r0Var instanceof InterfaceC0237e) {
            w7.f fVar = (w7.f) r0Var;
            if (z8) {
                q9 = p();
            } else {
                q9 = q();
            }
            fVar.e(AbstractC2712a.b(q9));
            return;
        }
        if (r0Var instanceof b) {
            b bVar = (b) r0Var;
            C0238f c0238f = bVar.f2812c;
            G7.j.b(c0238f);
            bVar.f2812c = null;
            bVar.b = e.l;
            Throwable o3 = bVar.f2813d.o();
            if (o3 == null) {
                c0238f.e(Boolean.FALSE);
                return;
            } else {
                c0238f.e(AbstractC2712a.b(o3));
                return;
            }
        }
        throw new IllegalStateException(("Unexpected waiter: " + r0Var).toString());
    }
}
