package w7;

import F7.p;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class l implements k, Serializable {
    public static final l b = new Object();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return b;
    }

    @Override // w7.k
    public final i h(j jVar) {
        G7.j.e(jVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // w7.k
    public final k i(j jVar) {
        G7.j.e(jVar, "key");
        return this;
    }

    @Override // w7.k
    public final k n(k kVar) {
        G7.j.e(kVar, "context");
        return kVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // w7.k
    public final Object b(Object obj, p pVar) {
        return obj;
    }
}
