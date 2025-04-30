package u7;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: u7.g */
/* loaded from: classes3.dex */
public abstract class AbstractC2816g extends AbstractC2822m {
    public static boolean I(Iterable iterable, Object obj) {
        int i9;
        G7.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i9 = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i10 >= 0) {
                        if (G7.j.a(obj, next)) {
                            i9 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        AbstractC2817h.D();
                        throw null;
                    }
                } else {
                    i9 = -1;
                    break;
                }
            }
        }
        if (i9 < 0) {
            return false;
        }
        return true;
    }

    public static ArrayList J(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object K(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object L(int i9, List list) {
        G7.j.e(list, "<this>");
        if (i9 >= 0 && i9 < list.size()) {
            return list.get(i9);
        }
        return null;
    }

    public static final void M(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, F7.l lVar) {
        G7.j.e(iterable, "<this>");
        G7.j.e(charSequence, "separator");
        G7.j.e(charSequence2, "prefix");
        G7.j.e(charSequence3, "postfix");
        G7.j.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            } else {
                com.facebook.appevents.i.a(sb, obj, lVar);
            }
        }
        if (i9 >= 0 && i10 > i9) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void N(ArrayList arrayList, StringBuilder sb) {
        M(arrayList, sb, "\n", "", "", -1, "...", null);
    }

    public static String O(Iterable iterable, String str, String str2, String str3, F7.l lVar, int i9) {
        String str4;
        String str5;
        if ((i9 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i9 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        G7.j.e(iterable, "<this>");
        G7.j.e(str4, "prefix");
        G7.j.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        M(iterable, sb, str, str4, str5, -1, "...", lVar);
        String sb2 = sb.toString();
        G7.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static Object P(List list) {
        G7.j.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(AbstractC2817h.A(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object Q(List list) {
        G7.j.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List R(Comparator comparator, Iterable iterable) {
        ArrayList arrayList;
        G7.j.e(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        if (z8) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return T(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            G7.j.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return AbstractC2815f.t(array);
        }
        if (z8) {
            arrayList = U((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            S(iterable, arrayList2);
            arrayList = arrayList2;
        }
        AbstractC2821l.F(arrayList, comparator);
        return arrayList;
    }

    public static final void S(Iterable iterable, AbstractCollection abstractCollection) {
        G7.j.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List T(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        G7.j.e(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        if (z8) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return U(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return android.support.v4.media.session.a.w(next);
            }
            return C2824o.b;
        }
        if (z8) {
            arrayList = U((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            S(iterable, arrayList2);
            arrayList = arrayList2;
        }
        return AbstractC2817h.C(arrayList);
    }

    public static ArrayList U(Collection collection) {
        G7.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set V(Iterable iterable) {
        Object next;
        G7.j.e(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        C2826q c2826q = C2826q.b;
        if (z8) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2829t.Y(collection.size()));
                    S(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                G7.j.d(singleton, "singleton(...)");
                return singleton;
            }
            return c2826q;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        S(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
            G7.j.d(singleton2, "singleton(...)");
            return singleton2;
        }
        return c2826q;
    }
}
