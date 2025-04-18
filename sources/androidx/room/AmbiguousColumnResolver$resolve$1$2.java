package androidx.room;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AmbiguousColumnResolver$resolve$1$2 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        p0.a.s(list, "indices");
        List list2 = list;
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int intValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            if (intValue > intValue2) {
                intValue = intValue2;
            }
        }
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int intValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int intValue4 = ((Number) it2.next()).intValue();
            if (intValue3 < intValue4) {
                intValue3 = intValue4;
            }
        }
        throw null;
    }
}
