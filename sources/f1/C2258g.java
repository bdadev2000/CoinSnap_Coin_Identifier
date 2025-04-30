package f1;

import y2.AbstractC2947c;

/* renamed from: f1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2258g extends AbstractC2947c {
    @Override // y2.AbstractC2947c
    public final boolean e(AbstractC2260i abstractC2260i, C2255d c2255d, C2255d c2255d2) {
        synchronized (abstractC2260i) {
            try {
                if (abstractC2260i.f20264c == c2255d) {
                    abstractC2260i.f20264c = c2255d2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.AbstractC2947c
    public final boolean f(AbstractC2260i abstractC2260i, Object obj, Object obj2) {
        synchronized (abstractC2260i) {
            try {
                if (abstractC2260i.b == obj) {
                    abstractC2260i.b = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.AbstractC2947c
    public final boolean g(AbstractC2260i abstractC2260i, C2259h c2259h, C2259h c2259h2) {
        synchronized (abstractC2260i) {
            try {
                if (abstractC2260i.f20265d == c2259h) {
                    abstractC2260i.f20265d = c2259h2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.AbstractC2947c
    public final void s(C2259h c2259h, C2259h c2259h2) {
        c2259h.b = c2259h2;
    }

    @Override // y2.AbstractC2947c
    public final void t(C2259h c2259h, Thread thread) {
        c2259h.f20259a = thread;
    }
}
