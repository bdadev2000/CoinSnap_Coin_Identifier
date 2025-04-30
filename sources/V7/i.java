package V7;

import Q7.AbstractC0251t;
import Q7.AbstractC0257z;
import Q7.C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class i extends AbstractC0251t implements C {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3518i = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0251t f3519d;

    /* renamed from: f, reason: collision with root package name */
    public final int f3520f;

    /* renamed from: g, reason: collision with root package name */
    public final l f3521g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3522h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC0251t abstractC0251t, int i9) {
        C c9;
        this.f3519d = abstractC0251t;
        this.f3520f = i9;
        if (abstractC0251t instanceof C) {
            c9 = (C) abstractC0251t;
        } else {
            c9 = null;
        }
        if (c9 == null) {
            int i10 = AbstractC0257z.f2597a;
        }
        this.f3521g = new l();
        this.f3522h = new Object();
    }

    @Override // Q7.AbstractC0251t
    public final void j(w7.k kVar, Runnable runnable) {
        this.f3521g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3518i;
        if (atomicIntegerFieldUpdater.get(this) < this.f3520f) {
            synchronized (this.f3522h) {
                if (atomicIntegerFieldUpdater.get(this) < this.f3520f) {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    Runnable l = l();
                    if (l != null) {
                        this.f3519d.j(this, new f4.b(9, this, l, false));
                    }
                }
            }
        }
    }

    public final Runnable l() {
        while (true) {
            Runnable runnable = (Runnable) this.f3521g.d();
            if (runnable == null) {
                synchronized (this.f3522h) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3518i;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f3521g.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
