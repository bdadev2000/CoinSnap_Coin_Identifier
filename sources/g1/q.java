package g1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30632a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur");

    @Nullable
    private volatile Object _cur = new s(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30632a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a2 = sVar.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                s c2 = sVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c2) && atomicReferenceFieldUpdater.get(this) == sVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30632a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.b()) {
                return;
            }
            s c2 = sVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c2) && atomicReferenceFieldUpdater.get(this) == sVar) {
            }
        }
    }

    public final int c() {
        s sVar = (s) f30632a.get(this);
        sVar.getClass();
        long j2 = s.f30634f.get(sVar);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30632a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object d = sVar.d();
            if (d != s.f30635g) {
                return d;
            }
            s c2 = sVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c2) && atomicReferenceFieldUpdater.get(this) == sVar) {
            }
        }
    }
}
