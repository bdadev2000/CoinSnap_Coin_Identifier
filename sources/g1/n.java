package g1;

import b1.k0;
import b1.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class n extends b1.z implements k0 {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f30624i = AtomicIntegerFieldUpdater.newUpdater(n.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final b1.z f30625c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f30626f;

    /* renamed from: g, reason: collision with root package name */
    public final q f30627g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f30628h;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public n(b1.z zVar, int i2) {
        this.f30625c = zVar;
        this.d = i2;
        k0 k0Var = zVar instanceof k0 ? (k0) zVar : null;
        this.f30626f = k0Var == null ? b1.h0.f22326a : k0Var;
        this.f30627g = new q();
        this.f30628h = new Object();
    }

    @Override // b1.k0
    public final q0 E(long j2, Runnable runnable, h0.l lVar) {
        return this.f30626f.E(j2, runnable, lVar);
    }

    @Override // b1.k0
    public final void G(long j2, b1.l lVar) {
        this.f30626f.G(j2, lVar);
    }

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        Runnable l02;
        this.f30627g.a(runnable);
        if (f30624i.get(this) >= this.d || !m0() || (l02 = l0()) == null) {
            return;
        }
        this.f30625c.h0(this, new android.support.v4.media.h(3, this, l02));
    }

    @Override // b1.z
    public final void i0(h0.l lVar, Runnable runnable) {
        Runnable l02;
        this.f30627g.a(runnable);
        if (f30624i.get(this) >= this.d || !m0() || (l02 = l0()) == null) {
            return;
        }
        this.f30625c.i0(this, new android.support.v4.media.h(3, this, l02));
    }

    public final Runnable l0() {
        while (true) {
            Runnable runnable = (Runnable) this.f30627g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f30628h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f30624i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f30627g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean m0() {
        synchronized (this.f30628h) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f30624i;
            if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
