package V7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3525a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3525a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a6 = nVar.a(obj);
            if (a6 == 0) {
                return true;
            }
            if (a6 != 1) {
                if (a6 == 2) {
                    return false;
                }
            } else {
                n c9 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c9) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3525a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c9 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c9) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f3525a.get(this);
        nVar.getClass();
        long j7 = n.f3528f.get(nVar);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3525a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d2 = nVar.d();
            if (d2 != n.f3529g) {
                return d2;
            }
            n c9 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c9) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
