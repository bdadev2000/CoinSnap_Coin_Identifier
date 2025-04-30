package Q7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.C2814e;

/* loaded from: classes3.dex */
public abstract class K extends L implements C {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2531i = AtomicReferenceFieldUpdater.newUpdater(K.class, Object.class, "_queue$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2532j = AtomicReferenceFieldUpdater.newUpdater(K.class, Object.class, "_delayed$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2533k = AtomicIntegerFieldUpdater.newUpdater(K.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // Q7.AbstractC0251t
    public final void j(w7.k kVar, Runnable runnable) {
        r(runnable);
    }

    @Override // Q7.L
    public final long p() {
        Runnable runnable;
        long j7;
        if (q()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2531i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (obj instanceof V7.n) {
                V7.n nVar = (V7.n) obj;
                Object d2 = nVar.d();
                if (d2 != V7.n.f3529g) {
                    runnable = (Runnable) d2;
                    break;
                }
                V7.n c9 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == AbstractC0255x.b) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop0;
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C2814e c2814e = this.f2537g;
        if (c2814e == null || c2814e.isEmpty()) {
            j7 = Long.MAX_VALUE;
        } else {
            j7 = 0;
        }
        if (j7 == 0) {
            return 0L;
        }
        Object obj2 = f2531i.get(this);
        if (obj2 != null) {
            if (obj2 instanceof V7.n) {
                long j9 = V7.n.f3528f.get((V7.n) obj2);
                if (((int) (1073741823 & j9)) != ((int) ((j9 & 1152921503533105152L) >> 30))) {
                    return 0L;
                }
            } else {
                if (obj2 != AbstractC0255x.b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Q7.K.f2531i
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Q7.K.f2533k
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof V7.n
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            V7.n r2 = (V7.n) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            V7.n r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            H0.a r2 = Q7.AbstractC0255x.b
            if (r1 != r2) goto L50
        L4a:
            Q7.y r0 = Q7.RunnableC0256y.l
            r0.r(r6)
            goto L73
        L50:
            V7.n r2 = new V7.n
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.m()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.K.r(java.lang.Runnable):void");
    }

    public final boolean s() {
        boolean z8;
        C2814e c2814e = this.f2537g;
        if (c2814e != null) {
            z8 = c2814e.isEmpty();
        } else {
            z8 = true;
        }
        if (!z8) {
            return false;
        }
        Object obj = f2531i.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof V7.n) {
            long j7 = V7.n.f3528f.get((V7.n) obj);
            if (((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0255x.b) {
            return true;
        }
        return false;
    }

    @Override // Q7.L
    public void shutdown() {
        m0.f2570a.set(null);
        f2533k.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2531i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            H0.a aVar = AbstractC0255x.b;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof V7.n) {
                    ((V7.n) obj).b();
                    break;
                }
                if (obj != aVar) {
                    V7.n nVar = new V7.n(8, true);
                    nVar.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (p() <= 0);
        System.nanoTime();
    }
}
