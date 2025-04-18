package e0;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class u extends t {
    public static boolean A0(Iterable iterable, Object obj) {
        p0.a.s(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : H0(iterable, obj) >= 0;
    }

    public static List B0(Iterable iterable, int i2) {
        ArrayList arrayList;
        Object obj;
        p0.a.s(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.j("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return Z0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i2;
            if (size <= 0) {
                return w.f30218a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = L0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return b1.f0.u(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i2 < size2) {
                        arrayList.add(((List) iterable).get(i2));
                        i2++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i2);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i3 = 0;
        for (Object obj2 : iterable) {
            if (i3 >= i2) {
                arrayList.add(obj2);
            } else {
                i3++;
            }
        }
        return b1.f0.x(arrayList);
    }

    public static ArrayList C0(Iterable iterable) {
        p0.a.s(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object D0(Iterable iterable) {
        p0.a.s(iterable, "<this>");
        if (iterable instanceof List) {
            return E0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object E0(List list) {
        p0.a.s(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object F0(List list) {
        p0.a.s(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object G0(int i2, List list) {
        p0.a.s(list, "<this>");
        if (i2 < 0 || i2 > b1.f0.p(list)) {
            return null;
        }
        return list.get(i2);
    }

    public static int H0(Iterable iterable, Object obj) {
        p0.a.s(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 < 0) {
                b1.f0.D();
                throw null;
            }
            if (p0.a.g(obj, obj2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final void I0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, q0.l lVar) {
        p0.a.s(iterable, "<this>");
        p0.a.s(charSequence, "separator");
        p0.a.s(charSequence2, "prefix");
        p0.a.s(charSequence3, "postfix");
        p0.a.s(charSequence4, "truncated");
        sb.append(charSequence2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            } else {
                p0.a.e(sb, obj, lVar);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void J0(Iterable iterable, StringBuilder sb, q0.l lVar, int i2) {
        I0(iterable, sb, (i2 & 2) != 0 ? ", " : "\n", (i2 & 4) != 0 ? "" : null, (i2 & 8) != 0 ? "" : null, (i2 & 16) != 0 ? -1 : 0, (i2 & 32) != 0 ? "..." : null, (i2 & 64) != 0 ? null : lVar);
    }

    public static String K0(Iterable iterable, String str, String str2, String str3, q0.l lVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        int i3 = (i2 & 8) != 0 ? -1 : 0;
        CharSequence charSequence = (i2 & 16) != 0 ? "..." : null;
        q0.l lVar2 = (i2 & 32) != 0 ? null : lVar;
        p0.a.s(iterable, "<this>");
        p0.a.s(str4, "separator");
        p0.a.s(str5, "prefix");
        p0.a.s(str6, "postfix");
        p0.a.s(charSequence, "truncated");
        StringBuilder sb = new StringBuilder();
        I0(iterable, sb, str4, str5, str6, i3, charSequence, lVar2);
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }

    public static Object L0(List list) {
        p0.a.s(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(b1.f0.p(list));
    }

    public static Object M0(List list) {
        p0.a.s(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return androidx.compose.foundation.text.input.a.g(list, 1);
    }

    public static Comparable N0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList O0(Iterable iterable, d0.c cVar) {
        p0.a.s(iterable, "<this>");
        ArrayList arrayList = new ArrayList(q.M(iterable, 10));
        boolean z2 = false;
        for (Object obj : iterable) {
            boolean z3 = true;
            if (!z2 && p0.a.g(obj, cVar)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList P0(Iterable iterable, Collection collection) {
        p0.a.s(collection, "<this>");
        p0.a.s(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            t.t0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList Q0(Collection collection, Object obj) {
        p0.a.s(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List R0(AbstractList abstractList) {
        p0.a.s(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return Z0(abstractList);
        }
        List c12 = c1(abstractList);
        Collections.reverse(c12);
        return c12;
    }

    public static Object S0(List list) {
        p0.a.s(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List T0(Iterable iterable, Comparator comparator) {
        p0.a.s(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List c12 = c1(iterable);
            s.s0(c12, comparator);
            return c12;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Z0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        p0.a.s(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return q.J(array);
    }

    public static List U0(Iterable iterable, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.j("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return w.f30218a;
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return Z0(iterable);
            }
            if (i2 == 1) {
                return b1.f0.u(D0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return b1.f0.x(arrayList);
    }

    public static boolean[] V0(Collection collection) {
        p0.a.s(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        return zArr;
    }

    public static final void W0(Iterable iterable, AbstractCollection abstractCollection) {
        p0.a.s(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] X0(Collection collection) {
        p0.a.s(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[i2] = ((Number) it.next()).floatValue();
            i2++;
        }
        return fArr;
    }

    public static int[] Y0(Collection collection) {
        p0.a.s(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List Z0(Iterable iterable) {
        p0.a.s(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return b1.f0.x(c1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.f30218a;
        }
        if (size != 1) {
            return b1(collection);
        }
        return b1.f0.u(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] a1(Collection collection) {
        p0.a.s(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static ArrayList b1(Collection collection) {
        p0.a.s(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List c1(Iterable iterable) {
        p0.a.s(iterable, "<this>");
        if (iterable instanceof Collection) {
            return b1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        W0(iterable, arrayList);
        return arrayList;
    }

    public static Set d1(Iterable iterable) {
        p0.a.s(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        W0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set e1(Iterable iterable) {
        p0.a.s(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        y yVar = y.f30220a;
        if (!z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            W0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : b1.f0.B(linkedHashSet.iterator().next()) : yVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return yVar;
        }
        if (size2 == 1) {
            return b1.f0.B(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(kotlin.jvm.internal.q.g(collection.size()));
        W0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static p z0(Iterable iterable) {
        p0.a.s(iterable, "<this>");
        return new p(iterable, 1);
    }
}
