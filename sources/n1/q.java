package n1;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class q extends p {
    @Override // n1.a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        p0.a.s(collection, "<this>");
        return collection.iterator();
    }

    @Override // n1.a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        p0.a.s(collection, "<this>");
        return collection.size();
    }
}
