package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class m0 extends g1.y {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22345f = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_decision");
    private volatile int _decision;

    @Override // g1.y, b1.r1
    public final void p(Object obj) {
        r(obj);
    }

    @Override // g1.y, b1.r1
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f22345f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                g1.a.c(f0.r(this.d), kotlin.jvm.internal.e.x(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
