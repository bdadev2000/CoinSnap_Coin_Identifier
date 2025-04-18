package h0;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l[] f30717a;

    public c(l[] lVarArr) {
        this.f30717a = lVarArr;
    }

    private final Object readResolve() {
        l lVar = m.f30726a;
        for (l lVar2 : this.f30717a) {
            lVar = lVar.u(lVar2);
        }
        return lVar;
    }
}
