package g1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class s {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f30634f = AtomicLongFieldUpdater.newUpdater(s.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30635g = new android.support.v4.media.session.i("REMOVE_FROZEN");

    @Nullable
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f30636a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30637b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30638c;
    public final AtomicReferenceArray d;

    public s(int i2, boolean z2) {
        this.f30636a = i2;
        this.f30637b = z2;
        int i3 = i2 - 1;
        this.f30638c = i3;
        this.d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0053, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = g1.s.f30634f
            long r2 = r8.get(r15)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L1c
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L1b
            r1 = 2
        L1b:
            return r1
        L1c:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r11 = 30
            long r4 = r4 >> r11
            int r12 = (int) r4
            int r4 = r12 + 2
            int r13 = r6.f30638c
            r4 = r4 & r13
            r5 = r0 & r13
            if (r4 != r5) goto L35
            return r1
        L35:
            boolean r4 = r6.f30637b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r6.d
            if (r4 != 0) goto L54
            r4 = r12 & r13
            java.lang.Object r4 = r14.get(r4)
            if (r4 == 0) goto L54
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r6.f30636a
            if (r3 < r2) goto L53
            int r12 = r12 - r0
            r0 = r12 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L3
        L53:
            return r1
        L54:
            int r0 = r12 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = g1.s.f30634f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r9 = (long) r0
            long r9 = r9 << r11
            long r4 = r4 | r9
            r0 = r1
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            r0 = r12 & r13
            r14.set(r0, r7)
            r0 = r6
        L70:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L9b
            g1.s r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.d
            int r2 = r0.f30638c
            r2 = r2 & r12
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof g1.r
            if (r9 == 0) goto L98
            g1.r r5 = (g1.r) r5
            int r5 = r5.f30633a
            if (r5 != r12) goto L98
            r1.set(r2, r7)
            goto L99
        L98:
            r0 = 0
        L99:
            if (r0 != 0) goto L70
        L9b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.s.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f30634f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final s c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f30634f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            s sVar2 = new s(this.f30636a * 2, this.f30637b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f30638c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = this.d.get(i5);
                if (obj == null) {
                    obj = new r(i2);
                }
                sVar2.d.set(sVar2.f30638c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(sVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, sVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f30634f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f30635g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = this.f30638c;
            int i4 = i2 & i3;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z2 = this.f30637b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof r) {
                    return null;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                if (z2) {
                    s sVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f30634f;
                        long j4 = atomicLongFieldUpdater2.get(sVar);
                        int i5 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            sVar = sVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(sVar, j4, (j4 & (-1073741824)) | j3)) {
                                sVar.d.set(sVar.f30638c & i5, null);
                                sVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (sVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
