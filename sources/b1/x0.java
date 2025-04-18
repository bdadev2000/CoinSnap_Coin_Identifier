package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class x0 extends y0 implements k0 {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22392h = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_queue");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22393i = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_delayed");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22394j = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_isCompleted");

    @Nullable
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;

    @Nullable
    private volatile Object _queue;

    public q0 E(long j2, Runnable runnable, h0.l lVar) {
        return h0.f22326a.E(j2, runnable, lVar);
    }

    @Override // b1.k0
    public final void G(long j2, l lVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            t0 t0Var = new t0(this, j3 + nanoTime, lVar);
            w0(nanoTime, t0Var);
            lVar.z(new i(t0Var, 1));
        }
    }

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        t0(runnable);
    }

    @Override // b1.y0
    public final long q0() {
        Runnable runnable;
        v0 v0Var;
        v0 b2;
        if (r0()) {
            return 0L;
        }
        w0 w0Var = (w0) f22393i.get(this);
        if (w0Var != null && g1.f0.f30607b.get(w0Var) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (w0Var) {
                    v0[] v0VarArr = w0Var.f30608a;
                    v0 v0Var2 = v0VarArr != null ? v0VarArr[0] : null;
                    b2 = v0Var2 == null ? null : (nanoTime - v0Var2.f22382a < 0 || !u0(v0Var2)) ? null : w0Var.b(0);
                }
            } while (b2 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22392h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof g1.s)) {
                if (obj == f0.f22308c) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop1;
            }
            g1.s sVar = (g1.s) obj;
            Object d = sVar.d();
            if (d != g1.s.f30635g) {
                runnable = (Runnable) d;
                break;
            }
            g1.s c2 = sVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        e0.n nVar = this.f22398f;
        if (((nVar == null || nVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f22392h.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof g1.s)) {
                if (obj2 != f0.f22308c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = g1.s.f30634f.get((g1.s) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        w0 w0Var2 = (w0) f22393i.get(this);
        if (w0Var2 != null) {
            synchronized (w0Var2) {
                v0[] v0VarArr2 = w0Var2.f30608a;
                v0Var = v0VarArr2 != null ? v0VarArr2[0] : null;
            }
            if (v0Var != null) {
                return p0.a.w(v0Var.f22382a - System.nanoTime(), 0L);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // b1.y0
    public void shutdown() {
        v0 b2;
        ThreadLocal threadLocal = d2.f22296a;
        d2.f22296a.set(null);
        f22394j.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22392h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            android.support.v4.media.session.i iVar = f0.f22308c;
            if (obj != null) {
                if (!(obj instanceof g1.s)) {
                    if (obj != iVar) {
                        g1.s sVar = new g1.s(8, true);
                        sVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((g1.s) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (q0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            w0 w0Var = (w0) f22393i.get(this);
            if (w0Var == null) {
                return;
            }
            synchronized (w0Var) {
                b2 = g1.f0.f30607b.get(w0Var) > 0 ? w0Var.b(0) : null;
            }
            if (b2 == null) {
                return;
            } else {
                s0(nanoTime, b2);
            }
        }
    }

    public void t0(Runnable runnable) {
        if (!u0(runnable)) {
            g0.f22320k.t0(runnable);
            return;
        }
        Thread n02 = n0();
        if (Thread.currentThread() != n02) {
            LockSupport.unpark(n02);
        }
    }

    public final boolean u0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22392h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f22394j.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof g1.s)) {
                if (obj == f0.f22308c) {
                    return false;
                }
                g1.s sVar = new g1.s(8, true);
                sVar.a((Runnable) obj);
                sVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            g1.s sVar2 = (g1.s) obj;
            int a2 = sVar2.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                g1.s c2 = sVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final boolean v0() {
        e0.n nVar = this.f22398f;
        if (!(nVar != null ? nVar.isEmpty() : true)) {
            return false;
        }
        w0 w0Var = (w0) f22393i.get(this);
        if (w0Var != null && g1.f0.f30607b.get(w0Var) != 0) {
            return false;
        }
        Object obj = f22392h.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof g1.s) {
            long j2 = g1.s.f30634f.get((g1.s) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == f0.f22308c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [b1.w0, java.lang.Object] */
    public final void w0(long j2, v0 v0Var) {
        int c2;
        Thread n02;
        boolean z2 = f22394j.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22393i;
        if (z2) {
            c2 = 1;
        } else {
            w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
            if (w0Var == null) {
                ?? obj = new Object();
                obj.f22387c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                p0.a.p(obj2);
                w0Var = (w0) obj2;
            }
            c2 = v0Var.c(j2, w0Var, this);
        }
        if (c2 != 0) {
            if (c2 == 1) {
                s0(j2, v0Var);
                return;
            } else {
                if (c2 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        w0 w0Var2 = (w0) atomicReferenceFieldUpdater.get(this);
        if (w0Var2 != null) {
            synchronized (w0Var2) {
                v0[] v0VarArr = w0Var2.f30608a;
                r4 = v0VarArr != null ? v0VarArr[0] : null;
            }
        }
        if (r4 != v0Var || Thread.currentThread() == (n02 = n0())) {
            return;
        }
        LockSupport.unpark(n02);
    }
}
