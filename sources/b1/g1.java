package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class g1 extends j1 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22322g = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f, reason: collision with root package name */
    public final q0.l f22323f;

    public g1(q0.l lVar) {
        this.f22323f = lVar;
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return d0.b0.f30125a;
    }

    @Override // b1.l1
    public final void y(Throwable th) {
        if (f22322g.compareAndSet(this, 0, 1)) {
            this.f22323f.invoke(th);
        }
    }
}
