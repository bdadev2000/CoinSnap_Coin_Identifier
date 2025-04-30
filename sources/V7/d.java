package V7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3511c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(d dVar) {
        this._prev$volatile = dVar;
    }

    public final void a() {
        f3511c.set(this, null);
    }

    public final d b() {
        Object obj = b.get(this);
        if (obj == a.b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b8;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3511c;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.c()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d b9 = b();
            G7.j.b(b9);
            while (b9.c() && (b8 = b9.b()) != null) {
                b9 = b8;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b9);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b9, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(b9) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                b.set(dVar2, b9);
            }
            if (!b9.c() || b9.b() == null) {
                if (dVar2 == null || !dVar2.c()) {
                    return;
                }
            }
        }
    }
}
