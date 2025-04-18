package y0;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class n extends kotlin.jvm.internal.e {
    public static j I(Iterator it) {
        p0.a.s(it, "<this>");
        e0.p pVar = new e0.p(it, 4);
        return pVar instanceof a ? pVar : new a(pVar);
    }

    public static j J(Object obj, q0.l lVar) {
        return obj == null ? d.f31426a : new r(new g.b(obj, 4), lVar);
    }

    public static j K(Object... objArr) {
        return objArr.length == 0 ? d.f31426a : e0.q.K(objArr);
    }
}
