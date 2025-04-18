package i1;

import b1.f0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d extends i implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30821h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");

    @Nullable
    private volatile Object owner;

    public d(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner = z2 ? null : e.f30822a;
    }

    public final boolean c() {
        return Math.max(i.f30827g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        r0.m(r1, r3.f30829b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Object r4, h0.g r5) {
        /*
            r3 = this;
            boolean r0 = r3.e(r4)
            d0.b0 r1 = d0.b0.f30125a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            h0.g r5 = b1.f0.r(r5)
            b1.l r5 = kotlin.jvm.internal.e.n(r5)
            i1.c r0 = new i1.c     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = i1.i.f30827g     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L3c
            int r2 = r3.f30828a     // Catch: java.lang.Throwable -> L3c
            if (r4 > r2) goto L16
            if (r4 <= 0) goto L28
            i.i r4 = r3.f30829b     // Catch: java.lang.Throwable -> L3c
            r0.m(r1, r4)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r4 = r3.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L16
        L2e:
            java.lang.Object r4 = r5.o()
            i0.a r5 = i0.a.f30806a
            if (r4 != r5) goto L37
            goto L38
        L37:
            r4 = r1
        L38:
            if (r4 != r5) goto L3b
            r1 = r4
        L3b:
            return r1
        L3c:
            r4 = move-exception
            r5.w()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.d.d(java.lang.Object, h0.g):java.lang.Object");
    }

    public final boolean e(Object obj) {
        int i2;
        char c2;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f30827g;
            int i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = this.f30828a;
            if (i3 > i4) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > i4) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i4));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30821h;
                if (i3 <= 0) {
                    if (obj == null) {
                        break;
                    }
                    while (true) {
                        if (!c()) {
                            c3 = 0;
                            break;
                        }
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 != e.f30822a) {
                            c3 = obj2 == obj ? (char) 1 : (char) 2;
                        }
                    }
                    if (c3 == 1) {
                        c2 = 2;
                        break;
                    }
                    if (c3 == 2) {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c2 = 0;
                    break;
                }
            }
        }
        c2 = 1;
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30821h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            android.support.v4.media.session.i iVar = e.f30822a;
            if (obj2 != iVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, iVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + f0.o(this) + "[isLocked=" + c() + ",owner=" + f30821h.get(this) + ']';
    }
}
