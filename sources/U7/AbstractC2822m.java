package u7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: u7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2822m extends AbstractC2821l {
    public static void G(Iterable iterable, AbstractCollection abstractCollection) {
        G7.j.e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Object H(List list) {
        G7.j.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(AbstractC2817h.A(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
