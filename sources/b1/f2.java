package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class f2 implements q0.l {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22316c = AtomicIntegerFieldUpdater.newUpdater(f2.class, "_state");
    private volatile int _state;

    /* renamed from: a, reason: collision with root package name */
    public final Thread f22317a = Thread.currentThread();

    /* renamed from: b, reason: collision with root package name */
    public q0 f22318b;

    public f2(h1 h1Var) {
    }

    public static void c(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    public final void b() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22316c;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        c(i2);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, 1)) {
                q0 q0Var = this.f22318b;
                if (q0Var != null) {
                    q0Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22316c;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    c(i2);
                    throw null;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, 2)) {
                this.f22317a.interrupt();
                atomicIntegerFieldUpdater.set(this, 3);
                break;
            }
        }
        return d0.b0.f30125a;
    }
}
