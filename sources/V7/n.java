package V7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3527e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3528f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final H0.a f3529g = new H0.a("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f3530a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3531c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3532d;

    public n(int i9, boolean z8) {
        this.f3530a = i9;
        this.b = z8;
        int i10 = i9 - 1;
        this.f3531c = i10;
        this.f3532d = new AtomicReferenceArray(i9);
        if (i10 <= 1073741823) {
            if ((i9 & i10) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = V7.n.f3528f
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r2 = 1
            if (r1 == 0) goto L19
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r3
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 == 0) goto L18
            r2 = 2
        L18:
            return r2
        L19:
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r1 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r9 = 30
            long r5 = r5 >> r9
            int r10 = (int) r5
            int r5 = r10 + 2
            int r11 = r13.f3531c
            r5 = r5 & r11
            r6 = r1 & r11
            if (r5 != r6) goto L32
            return r2
        L32:
            boolean r5 = r13.b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.f3532d
            if (r5 != 0) goto L51
            r5 = r10 & r11
            java.lang.Object r5 = r12.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f3530a
            if (r3 < r0) goto L50
            int r10 = r10 - r1
            r0 = r10 & r6
            int r1 = r3 >> 1
            if (r0 <= r1) goto L0
        L50:
            return r2
        L51:
            int r1 = r10 + 1
            r1 = r1 & r6
            r5 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r5 = r5 & r3
            long r1 = (long) r1
            long r1 = r1 << r9
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = V7.n.f3528f
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L0
            r1 = r10 & r11
            r12.set(r1, r14)
            r1 = r13
        L6c:
            long r2 = r0.get(r1)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L95
            V7.n r1 = r1.c()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.f3532d
            int r3 = r1.f3531c
            r3 = r3 & r10
            java.lang.Object r4 = r2.get(r3)
            boolean r5 = r4 instanceof V7.m
            if (r5 == 0) goto L92
            V7.m r4 = (V7.m) r4
            int r4 = r4.f3526a
            if (r4 != r10) goto L92
            r2.set(r3, r14)
            goto L93
        L92:
            r1 = 0
        L93:
            if (r1 != 0) goto L6c
        L95:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: V7.n.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        do {
            atomicLongFieldUpdater = f3528f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, 2305843009213693952L | j7));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        while (true) {
            atomicLongFieldUpdater = f3528f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                break;
            }
            long j9 = j7 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j7, j9)) {
                j7 = j9;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3527e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f3530a * 2, this.b);
            int i9 = (int) (1073741823 & j7);
            int i10 = (int) ((1152921503533105152L & j7) >> 30);
            while (true) {
                int i11 = this.f3531c;
                int i12 = i9 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = this.f3532d.get(i12);
                if (obj == null) {
                    obj = new m(i9);
                }
                nVar2.f3532d.set(nVar2.f3531c & i9, obj);
                i9++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j7);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3528f;
            long j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                return f3529g;
            }
            int i9 = (int) (j7 & 1073741823);
            int i10 = this.f3531c;
            int i11 = i9 & i10;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i10) == i11) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3532d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z8 = this.b;
            if (obj == null) {
                if (z8) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j9 = (i9 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j7, (j7 & (-1073741824)) | j9)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                if (z8) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3528f;
                        long j10 = atomicLongFieldUpdater2.get(nVar);
                        int i12 = (int) (j10 & 1073741823);
                        if ((j10 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j10, (j10 & (-1073741824)) | j9)) {
                                nVar.f3532d.set(nVar.f3531c & i12, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
