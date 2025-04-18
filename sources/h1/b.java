package h1;

import b1.e0;
import b1.f0;
import g1.q;
import g1.x;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class b implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f30737i = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f30738j = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f30739k = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30740l = new android.support.v4.media.session.i("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f30741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30742b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30743c;
    private volatile long controlState;
    public final String d;

    /* renamed from: f, reason: collision with root package name */
    public final e f30744f;

    /* renamed from: g, reason: collision with root package name */
    public final e f30745g;

    /* renamed from: h, reason: collision with root package name */
    public final x f30746h;
    private volatile long parkedWorkersStack;

    /* JADX WARN: Type inference failed for: r3v10, types: [h1.e, g1.q] */
    /* JADX WARN: Type inference failed for: r3v11, types: [h1.e, g1.q] */
    public b(int i2, int i3, String str, long j2) {
        this.f30741a = i2;
        this.f30742b = i3;
        this.f30743c = j2;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.d.j("Core pool size ", i2, " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(android.support.v4.media.d.k("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(android.support.v4.media.d.j("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f30744f = new q();
        this.f30745g = new q();
        this.f30746h = new x((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void h(b bVar, Runnable runnable, boolean z2, int i2) {
        i iVar = (i2 & 2) != 0 ? k.f30758g : null;
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        bVar.e(runnable, iVar, z2);
    }

    public final int a() {
        synchronized (this.f30746h) {
            try {
                if (f30739k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f30738j;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f30741a) {
                    return 0;
                }
                if (i2 >= this.f30742b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f30746h.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                a aVar = new a(this, i4);
                this.f30746h.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = h1.b.f30739k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof h1.a
            r3 = 0
            if (r1 == 0) goto L18
            h1.a r0 = (h1.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            h1.b r1 = r0.f30736i
            boolean r1 = p0.a.g(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            g1.x r1 = r8.f30746h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = h1.b.f30738j     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            g1.x r5 = r8.f30746h
            java.lang.Object r5 = r5.b(r1)
            p0.a.p(r5)
            h1.a r5 = (h1.a) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            h1.m r5 = r5.f30730a
            h1.e r6 = r8.f30745g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = h1.m.f30761b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            h1.h r7 = (h1.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            h1.h r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            h1.e r1 = r8.f30745g
            r1.b()
            h1.e r1 = r8.f30744f
            r1.b()
        L81:
            if (r0 == 0) goto L89
            h1.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            h1.e r1 = r8.f30744f
            java.lang.Object r1 = r1.d()
            h1.h r1 = (h1.h) r1
            if (r1 != 0) goto Lb0
            h1.e r1 = r8.f30745g
            java.lang.Object r1 = r1.d()
            h1.h r1 = (h1.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = h1.b.f30737i
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = h1.b.f30738j
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b.close():void");
    }

    public final void e(Runnable runnable, i iVar, boolean z2) {
        h jVar;
        int i2;
        k.f30757f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f30750a = nanoTime;
            jVar.f30751b = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z3 = false;
        boolean z4 = jVar.f30751b.f30752a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30738j;
        long addAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !p0.a.g(aVar.f30736i, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f30732c) != 5 && (jVar.f30751b.f30752a != 0 || i2 != 2)) {
            aVar.f30735h = true;
            m mVar = aVar.f30730a;
            if (z2) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f30761b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f30751b.f30752a == 1 ? this.f30745g.a(jVar) : this.f30744f.a(jVar))) {
                throw new RejectedExecutionException(android.support.v4.media.d.r(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z2 && aVar != null) {
            z3 = true;
        }
        if (z4) {
            if (z3 || o() || n(addAndGet)) {
                return;
            }
            o();
            return;
        }
        if (z3 || o() || n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        o();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(this, runnable, false, 6);
    }

    public final void i(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f30737i.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f30740l) {
                            i4 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i4 = 0;
                            break;
                        }
                        a aVar2 = (a) c2;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i4 = b2;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0 && f30737i.compareAndSet(this, j2, i4 | j3)) {
                return;
            }
        }
    }

    public final boolean n(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f30741a;
        if (i2 < i3) {
            int a2 = a();
            if (a2 == 1 && i3 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        android.support.v4.media.session.i iVar;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f30737i;
            long j2 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f30746h.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c2 = aVar.c();
                while (true) {
                    iVar = f30740l;
                    if (c2 == iVar) {
                        i2 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar2 = (a) c2;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c2 = aVar2.c();
                }
                if (i2 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | i2)) {
                    aVar.g(iVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f30729j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        x xVar = this.f30746h;
        int a2 = xVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a aVar = (a) xVar.b(i7);
            if (aVar != null) {
                m mVar = aVar.f30730a;
                mVar.getClass();
                int i8 = m.f30761b.get(mVar) != null ? (m.f30762c.get(mVar) - m.d.get(mVar)) + 1 : m.f30762c.get(mVar) - m.d.get(mVar);
                int a3 = e0.a(aVar.f30732c);
                if (a3 == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (a3 == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (a3 == 2) {
                    i4++;
                } else if (a3 == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (a3 == 4) {
                    i6++;
                }
            }
        }
        long j2 = f30738j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(f0.o(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f30741a;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f30742b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f30744f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f30745g.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
