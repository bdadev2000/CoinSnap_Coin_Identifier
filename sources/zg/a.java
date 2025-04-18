package zg;

import yg.l;
import yg.p;
import yg.s;

/* loaded from: classes4.dex */
public final class a extends l {
    public final l a;

    public a(l lVar) {
        this.a = lVar;
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        if (pVar.u() == 9) {
            pVar.s();
            return null;
        }
        return this.a.fromJson(pVar);
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        if (obj == null) {
            sVar.p();
        } else {
            this.a.toJson(sVar, obj);
        }
    }

    public final String toString() {
        return this.a + ".nullSafe()";
    }
}
