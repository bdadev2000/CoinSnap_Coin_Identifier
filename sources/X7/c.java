package X7;

import Q7.AbstractC0255x;
import Q7.n0;
import V7.s;
import androidx.work.o;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class c implements Executor, Closeable {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3720j = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3721k = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final H0.a m = new H0.a("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3722c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final long f3723d;

    /* renamed from: f, reason: collision with root package name */
    public final String f3724f;

    /* renamed from: g, reason: collision with root package name */
    public final f f3725g;

    /* renamed from: h, reason: collision with root package name */
    public final f f3726h;

    /* renamed from: i, reason: collision with root package name */
    public final s f3727i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r3v10, types: [V7.l, X7.f] */
    /* JADX WARN: Type inference failed for: r3v9, types: [V7.l, X7.f] */
    public c(int i9, int i10, String str, long j7) {
        this.b = i9;
        this.f3722c = i10;
        this.f3723d = j7;
        this.f3724f = str;
        if (i9 >= 1) {
            if (i10 >= i9) {
                if (i10 <= 2097150) {
                    if (j7 > 0) {
                        this.f3725g = new V7.l();
                        this.f3726h = new V7.l();
                        this.f3727i = new s((i9 + 1) * 2);
                        this.controlState$volatile = i9 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(L.j("Idle worker keep alive time ", j7, " must be positive").toString());
                }
                throw new IllegalArgumentException(n0.f(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(n0.e(i10, i9, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(n0.f(i9, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        synchronized (this.f3727i) {
            try {
                if (l.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3721k;
                long j7 = atomicLongFieldUpdater.get(this);
                int i9 = (int) (j7 & 2097151);
                int i10 = i9 - ((int) ((j7 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.b) {
                    return 0;
                }
                if (i9 >= this.f3722c) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 > 0 && this.f3727i.b(i11) == null) {
                    a aVar = new a(this, i11);
                    this.f3727i.c(i11, aVar);
                    if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i12 = i10 + 1;
                        aVar.start();
                        return i12;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, o oVar, boolean z8) {
        i jVar;
        boolean z9;
        long j7;
        a aVar;
        boolean a6;
        b bVar;
        k.f3739f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.b = nanoTime;
            jVar.f3733c = oVar;
        } else {
            jVar = new j(runnable, nanoTime, oVar);
        }
        boolean z10 = false;
        if (jVar.f3733c.b == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3721k;
        if (z9) {
            j7 = atomicLongFieldUpdater.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        } else {
            j7 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !G7.j.a(aVar.f3714j, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f3709d) != b.f3718g && (jVar.f3733c.b != 0 || bVar != b.f3715c)) {
            aVar.f3713i = true;
            m mVar = aVar.b;
            if (z8) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.b.getAndSet(mVar, jVar);
                if (iVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(iVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.f3733c.b == 1) {
                a6 = this.f3726h.a(jVar);
            } else {
                a6 = this.f3725g.a(jVar);
            }
            if (!a6) {
                throw new RejectedExecutionException(AbstractC2914a.h(new StringBuilder(), this.f3724f, " was terminated"));
            }
        }
        if (z8 && aVar != null) {
            z10 = true;
        }
        if (z9) {
            if (!z10 && !i() && !h(j7)) {
                i();
                return;
            }
            return;
        }
        if (!z10 && !i() && !h(atomicLongFieldUpdater.get(this))) {
            i();
        }
    }

    public final void c(a aVar, int i9, int i10) {
        while (true) {
            long j7 = f3720j.get(this);
            int i11 = (int) (2097151 & j7);
            long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j7) & (-2097152);
            if (i11 == i9) {
                if (i10 == 0) {
                    Object c9 = aVar.c();
                    while (true) {
                        if (c9 == m) {
                            i11 = -1;
                            break;
                        }
                        if (c9 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c9;
                        int b = aVar2.b();
                        if (b != 0) {
                            i11 = b;
                            break;
                        }
                        c9 = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f3720j.compareAndSet(this, j7, i11 | j9)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X7.c.l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof X7.a
            r3 = 0
            if (r1 == 0) goto L18
            X7.a r0 = (X7.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            X7.c r1 = r0.f3714j
            boolean r1 = G7.j.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            V7.s r1 = r8.f3727i
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = X7.c.f3721k     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            V7.s r5 = r8.f3727i
            java.lang.Object r5 = r5.b(r1)
            G7.j.b(r5)
            X7.a r5 = (X7.a) r5
            if (r5 == r0) goto L74
        L44:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L55
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L55:
            X7.m r5 = r5.b
            X7.f r6 = r8.f3726h
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = X7.m.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            X7.i r7 = (X7.i) r7
            if (r7 == 0) goto L69
            r6.a(r7)
        L69:
            X7.i r7 = r5.b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            X7.f r1 = r8.f3726h
            r1.b()
            X7.f r1 = r8.f3725g
            r1.b()
        L83:
            if (r0 == 0) goto L8b
            X7.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            X7.f r1 = r8.f3725g
            java.lang.Object r1 = r1.d()
            X7.i r1 = (X7.i) r1
            if (r1 != 0) goto Lb3
            X7.f r1 = r8.f3726h
            java.lang.Object r1 = r1.d()
            X7.i r1 = (X7.i) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            X7.b r1 = X7.b.f3718g
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X7.c.f3720j
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X7.c.f3721k
            r0.set(r8, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L83
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L83
        Lc4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X7.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f3740g, false);
    }

    public final boolean h(long j7) {
        int i9 = ((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21));
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = this.b;
        if (i9 < i10) {
            int a6 = a();
            if (a6 == 1 && i10 > 1) {
                a();
            }
            if (a6 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        H0.a aVar;
        int i9;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3720j;
            long j7 = atomicLongFieldUpdater.get(this);
            a aVar2 = (a) this.f3727i.b((int) (2097151 & j7));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j9 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j7) & (-2097152);
                Object c9 = aVar2.c();
                while (true) {
                    aVar = m;
                    if (c9 == aVar) {
                        i9 = -1;
                        break;
                    }
                    if (c9 == null) {
                        i9 = 0;
                        break;
                    }
                    a aVar3 = (a) c9;
                    i9 = aVar3.b();
                    if (i9 != 0) {
                        break;
                    }
                    c9 = aVar3.c();
                }
                if (i9 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j7, j9 | i9)) {
                    aVar2.g(aVar);
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f3707k.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    public final String toString() {
        int i9;
        ArrayList arrayList = new ArrayList();
        s sVar = this.f3727i;
        int a6 = sVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a6; i15++) {
            a aVar = (a) sVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.b;
                mVar.getClass();
                if (m.b.get(mVar) != null) {
                    i9 = (m.f3743c.get(mVar) - m.f3744d.get(mVar)) + 1;
                } else {
                    i9 = m.f3743c.get(mVar) - m.f3744d.get(mVar);
                }
                int ordinal = aVar.f3709d.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i14++;
                                }
                            } else {
                                i13++;
                                if (i9 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i9);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        i11++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i9);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i9);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j7 = f3721k.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3724f);
        sb4.append('@');
        sb4.append(AbstractC0255x.g(this));
        sb4.append("[Pool Size {core = ");
        int i16 = this.b;
        sb4.append(i16);
        sb4.append(", max = ");
        n0.t(sb4, this.f3722c, "}, Worker States {CPU = ", i10, ", blocking = ");
        n0.t(sb4, i11, ", parked = ", i12, ", dormant = ");
        n0.t(sb4, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f3725g.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3726h.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j7));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j7) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i16 - ((int) ((j7 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
