package w7;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 0;
    public final k[] b;

    public b(k[] kVarArr) {
        this.b = kVarArr;
    }

    private final Object readResolve() {
        k kVar = l.b;
        for (k kVar2 : this.b) {
            kVar = kVar.n(kVar2);
        }
        return kVar;
    }
}
