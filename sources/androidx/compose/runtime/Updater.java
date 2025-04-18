package androidx.compose.runtime;

import d0.b0;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class Updater<T> {
    public static final void a(Composer composer, l lVar) {
        if (composer.e()) {
            composer.h(b0.f30125a, new Updater$init$1(lVar));
        }
    }

    public static final void b(Composer composer, Object obj, p pVar) {
        if (composer.e() || !p0.a.g(composer.u(), obj)) {
            composer.o(obj);
            composer.h(obj, pVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Updater)) {
            return false;
        }
        ((Updater) obj).getClass();
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Updater(composer=null)";
    }
}
