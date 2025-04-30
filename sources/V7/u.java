package V7;

import Q7.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public abstract class u extends d implements h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3539f = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final long f3540d;

    public u(long j7, u uVar, int i9) {
        super(uVar);
        this.f3540d = j7;
        this.cleanedAndPointers$volatile = i9 << 16;
    }

    @Override // V7.d
    public final boolean c() {
        if (f3539f.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f3539f.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i9, w7.k kVar);

    public final void h() {
        if (f3539f.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f3539f;
            i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 65536 + i9));
        return true;
    }
}
