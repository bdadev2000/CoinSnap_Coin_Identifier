package g1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30603a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30604b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");

    @Nullable
    private volatile Object _next;

    @Nullable
    private volatile Object _prev;

    public e(e eVar) {
        this._prev = eVar;
    }

    public final void a() {
        f30604b.lazySet(this, null);
    }

    public final e b() {
        Object obj = f30603a.get(this);
        if (obj == a.f30589b) {
            return null;
        }
        return (e) obj;
    }

    public abstract boolean c();

    public final void d() {
        e b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30604b;
            e eVar = (e) atomicReferenceFieldUpdater.get(this);
            while (eVar != null && eVar.c()) {
                eVar = (e) atomicReferenceFieldUpdater.get(eVar);
            }
            e b3 = b();
            p0.a.p(b3);
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                e eVar2 = ((e) obj) == null ? null : eVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, eVar2)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (eVar != null) {
                f30603a.set(eVar, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (eVar == null || !eVar.c()) {
                    return;
                }
            }
        }
    }
}
