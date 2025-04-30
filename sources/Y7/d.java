package Y7;

import Q7.AbstractC0255x;
import Q7.C0238f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.y;
import x7.EnumC2928a;

/* loaded from: classes3.dex */
public final class d extends h implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3827h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z8) {
        super(z8 ? 1 : 0);
        H0.a aVar;
        if (z8) {
            aVar = null;
        } else {
            aVar = e.f3828a;
        }
        this.owner$volatile = aVar;
    }

    public final boolean c() {
        if (Math.max(h.f3835g.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(w7.f fVar) {
        int i9;
        char c9;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f3835g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f3836a;
            if (i10 > i11) {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, i11));
            } else {
                if (i10 <= 0) {
                    c9 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f3827h.set(this, null);
                    c9 = 0;
                    break;
                }
            }
        }
        y yVar = y.f23029a;
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    throw new IllegalStateException("unexpected".toString());
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            C0238f h6 = AbstractC0255x.h(F2.h.x(fVar));
            try {
                a(new c(this, h6));
                Object s5 = h6.s();
                EnumC2928a enumC2928a = EnumC2928a.b;
                if (s5 != enumC2928a) {
                    s5 = yVar;
                }
                if (s5 == enumC2928a) {
                    return s5;
                }
                return yVar;
            } catch (Throwable th) {
                h6.A();
                throw th;
            }
        }
        return yVar;
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3827h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            H0.a aVar = e.f3828a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + AbstractC0255x.g(this) + "[isLocked=" + c() + ",owner=" + f3827h.get(this) + ']';
    }
}
