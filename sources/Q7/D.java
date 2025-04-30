package Q7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class D extends V7.t {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2527g = AtomicIntegerFieldUpdater.newUpdater(D.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // V7.t, Q7.d0
    public final void q(Object obj) {
        r(obj);
    }

    @Override // V7.t, Q7.d0
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2527g;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 != 0) {
                if (i9 == 1) {
                    V7.a.h(F2.h.x(this.f3538f), AbstractC0255x.n(obj), null);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
