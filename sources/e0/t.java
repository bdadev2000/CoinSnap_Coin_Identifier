package e0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class t extends s {
    public static void t0(Collection collection, Iterable iterable) {
        p0.a.s(collection, "<this>");
        p0.a.s(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void u0(Collection collection, Object[] objArr) {
        p0.a.s(collection, "<this>");
        p0.a.s(objArr, "elements");
        collection.addAll(q.J(objArr));
    }

    public static final boolean v0(Iterable iterable, q0.l lVar, boolean z2) {
        Iterator it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z2) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    public static void w0(q0.l lVar, List list) {
        int p2;
        p0.a.s(list, "<this>");
        p0.a.s(lVar, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof r0.a) && !(list instanceof r0.b)) {
                kotlin.jvm.internal.e.B(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                v0(list, lVar, true);
                return;
            } catch (ClassCastException e) {
                p0.a.v0(kotlin.jvm.internal.e.class.getName(), e);
                throw e;
            }
        }
        int i2 = 0;
        w0.f it = new w0.e(0, b1.f0.p(list), 1).iterator();
        while (it.f31411c) {
            int b2 = it.b();
            Object obj = list.get(b2);
            if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i2 != b2) {
                    list.set(i2, obj);
                }
                i2++;
            }
        }
        if (i2 >= list.size() || i2 > (p2 = b1.f0.p(list))) {
            return;
        }
        while (true) {
            list.remove(p2);
            if (p2 == i2) {
                return;
            } else {
                p2--;
            }
        }
    }

    public static Object x0(List list) {
        p0.a.s(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object y0(List list) {
        p0.a.s(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(b1.f0.p(list));
    }
}
