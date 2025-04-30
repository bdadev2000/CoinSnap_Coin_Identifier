package X7;

import G7.r;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class a extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3707k = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3708c;

    /* renamed from: d, reason: collision with root package name */
    public b f3709d;

    /* renamed from: f, reason: collision with root package name */
    public long f3710f;

    /* renamed from: g, reason: collision with root package name */
    public long f3711g;

    /* renamed from: h, reason: collision with root package name */
    public int f3712h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3713i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f3714j;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r2v4, types: [G7.r, java.lang.Object] */
    public a(c cVar, int i9) {
        this.f3714j = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.b = new m();
        this.f3708c = new Object();
        this.f3709d = b.f3717f;
        this.nextParkedWorker = c.m;
        J7.e.b.getClass();
        this.f3712h = J7.e.f1605c.a().nextInt();
        f(i9);
    }

    public final i a(boolean z8) {
        i e4;
        i e9;
        c cVar;
        long j7;
        b bVar = this.f3709d;
        b bVar2 = b.b;
        i iVar = null;
        m mVar = this.b;
        boolean z9 = true;
        c cVar2 = this.f3714j;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3721k;
            do {
                cVar = this.f3714j;
                j7 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || iVar2.f3733c.b != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i9 = m.f3744d.get(mVar);
                    int i10 = m.f3743c.get(mVar);
                    while (true) {
                        if (i9 == i10 || m.f3745e.get(mVar) == 0) {
                            break;
                        }
                        i10--;
                        i c9 = mVar.c(i10, true);
                        if (c9 != null) {
                            iVar = c9;
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar2.f3726h.d();
                        if (iVar3 == null) {
                            return i(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f3721k.compareAndSet(cVar, j7, j7 - 4398046511104L));
            this.f3709d = bVar2;
        }
        if (z8) {
            if (d(cVar2.b * 2) != 0) {
                z9 = false;
            }
            if (!z9 || (e9 = e()) == null) {
                mVar.getClass();
                i iVar4 = (i) m.b.getAndSet(mVar, null);
                if (iVar4 == null) {
                    iVar4 = mVar.b();
                }
                if (iVar4 == null) {
                    if (!z9 && (e4 = e()) != null) {
                        return e4;
                    }
                } else {
                    return iVar4;
                }
            } else {
                return e9;
            }
        } else {
            i e10 = e();
            if (e10 != null) {
                return e10;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i9) {
        int i10 = this.f3712h;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f3712h = i13;
        int i14 = i9 - 1;
        if ((i14 & i9) == 0) {
            return i13 & i14;
        }
        return (i13 & Integer.MAX_VALUE) % i9;
    }

    public final i e() {
        int d2 = d(2);
        c cVar = this.f3714j;
        if (d2 == 0) {
            i iVar = (i) cVar.f3725g.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f3726h.d();
        }
        i iVar2 = (i) cVar.f3726h.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f3725g.d();
    }

    public final void f(int i9) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3714j.f3724f);
        sb.append("-worker-");
        if (i9 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i9);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i9;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z8;
        b bVar2 = this.f3709d;
        if (bVar2 == b.b) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            c.f3721k.addAndGet(this.f3714j, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f3709d = bVar;
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X7.i i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X7.a.i(int):X7.i");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        loop0: while (true) {
            boolean z12 = z11;
            while (true) {
                c cVar = this.f3714j;
                cVar.getClass();
                if (c.l.get(cVar) == 0) {
                    b bVar = this.f3709d;
                    b bVar2 = b.f3718g;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a6 = a(this.f3713i);
                    long j7 = -2097152;
                    if (a6 != null) {
                        this.f3711g = 0L;
                        int i9 = a6.f3733c.b;
                        this.f3710f = 0L;
                        if (this.f3709d == b.f3716d) {
                            this.f3709d = b.f3715c;
                        }
                        c cVar2 = this.f3714j;
                        if (i9 != 0 && h(b.f3715c) && !cVar2.i() && !cVar2.h(c.f3721k.get(cVar2))) {
                            cVar2.i();
                        }
                        cVar2.getClass();
                        try {
                            a6.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i9 != 0) {
                            c.f3721k.addAndGet(cVar2, -2097152L);
                            if (this.f3709d != bVar2) {
                                this.f3709d = b.f3717f;
                            }
                        }
                    } else {
                        this.f3713i = z11;
                        if (this.f3711g != 0) {
                            if (!z12) {
                                z12 = true;
                            } else {
                                h(b.f3716d);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f3711g);
                                this.f3711g = 0L;
                                break;
                            }
                        } else {
                            Object obj = this.nextParkedWorker;
                            H0.a aVar = c.m;
                            if (obj != aVar) {
                                z8 = true;
                            } else {
                                z8 = z11;
                            }
                            if (!z8) {
                                c cVar3 = this.f3714j;
                                cVar3.getClass();
                                if (this.nextParkedWorker == aVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3720j;
                                        long j9 = atomicLongFieldUpdater.get(cVar3);
                                        long j10 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j9) & j7;
                                        int i10 = this.indexInArray;
                                        this.nextParkedWorker = cVar3.f3727i.b((int) (j9 & 2097151));
                                        if (atomicLongFieldUpdater.compareAndSet(cVar3, j9, j10 | i10)) {
                                            break;
                                        } else {
                                            j7 = -2097152;
                                        }
                                    }
                                }
                            } else {
                                f3707k.set(this, -1);
                                while (this.nextParkedWorker != c.m) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f3707k;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar4 = this.f3714j;
                                    cVar4.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.l;
                                    if (atomicIntegerFieldUpdater3.get(cVar4) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f3709d;
                                    b bVar4 = b.f3718g;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f3716d);
                                    Thread.interrupted();
                                    if (this.f3710f == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f3710f = System.nanoTime() + this.f3714j.f3723d;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f3714j.f3723d);
                                    if (System.nanoTime() - this.f3710f >= 0) {
                                        this.f3710f = 0L;
                                        c cVar5 = this.f3714j;
                                        synchronized (cVar5.f3727i) {
                                            try {
                                                if (atomicIntegerFieldUpdater3.get(cVar5) != 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (!z10) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f3721k;
                                                    if (((int) (atomicLongFieldUpdater2.get(cVar5) & 2097151)) > cVar5.b) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i11 = this.indexInArray;
                                                            z9 = false;
                                                            f(0);
                                                            cVar5.c(this, i11, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar5) & 2097151);
                                                            if (andDecrement != i11) {
                                                                Object b = cVar5.f3727i.b(andDecrement);
                                                                G7.j.b(b);
                                                                a aVar2 = (a) b;
                                                                cVar5.f3727i.c(i11, aVar2);
                                                                aVar2.f(i11);
                                                                cVar5.c(aVar2, andDecrement, i11);
                                                            }
                                                            cVar5.f3727i.c(andDecrement, null);
                                                            this.f3709d = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        z11 = z9;
                                    }
                                    z9 = false;
                                    z11 = z9;
                                }
                            }
                            z11 = z11;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f3718g);
    }
}
