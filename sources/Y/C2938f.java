package y;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2938f extends R2.b {
    @Override // R2.b
    public final boolean f(h hVar, C2936d c2936d, C2936d c2936d2) {
        synchronized (hVar) {
            try {
                if (hVar.f24268c == c2936d) {
                    hVar.f24268c = c2936d2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R2.b
    public final boolean g(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.b == obj) {
                    hVar.b = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R2.b
    public final boolean h(h hVar, C2939g c2939g, C2939g c2939g2) {
        synchronized (hVar) {
            try {
                if (hVar.f24269d == c2939g) {
                    hVar.f24269d = c2939g2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R2.b
    public final void v(C2939g c2939g, C2939g c2939g2) {
        c2939g.b = c2939g2;
    }

    @Override // R2.b
    public final void w(C2939g c2939g, Thread thread) {
        c2939g.f24263a = thread;
    }
}
