package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AmbiguousColumnResolver$resolve$4 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        p0.a.s(list, "it");
        int i2 = AmbiguousColumnResolver.Solution.d;
        List list2 = list;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            ((AmbiguousColumnResolver.Match) it.next()).getClass();
            throw null;
        }
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        ((AmbiguousColumnResolver.Match) it2.next()).getClass();
        throw null;
    }
}
