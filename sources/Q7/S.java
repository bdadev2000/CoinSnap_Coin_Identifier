package Q7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class S extends W {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2540h = AtomicIntegerFieldUpdater.newUpdater(S.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final F7.l f2541g;

    public S(F7.l lVar) {
        this.f2541g = lVar;
    }

    @Override // F7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return t7.y.f23029a;
    }

    @Override // Q7.Y
    public final void l(Throwable th) {
        if (f2540h.compareAndSet(this, 0, 1)) {
            this.f2541g.invoke(th);
        }
    }
}
