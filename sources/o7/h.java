package O7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2816g;
import u7.AbstractC2817h;
import u7.AbstractC2818i;

/* loaded from: classes3.dex */
public abstract class h extends com.facebook.appevents.i {
    public static String s(String str) {
        int i9;
        Comparable comparable;
        int i10;
        String str2;
        G7.j.e(str, "<this>");
        List O = g.O(str);
        List list = O;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!g.L((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i9 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i9 < length) {
                    if (!com.facebook.appevents.g.s(str3.charAt(i9))) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 == -1) {
                i9 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i9));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int length2 = str.length();
        O.size();
        int A8 = AbstractC2817h.A(O);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i11 = i9 + 1;
            if (i9 >= 0) {
                String str4 = (String) obj2;
                if ((i9 == 0 || i9 == A8) && g.L(str4)) {
                    str2 = null;
                } else {
                    str2 = g.F(i10, str4);
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i9 = i11;
            } else {
                AbstractC2817h.D();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC2816g.N(arrayList3, sb);
        String sb2 = sb.toString();
        G7.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static String t(String str) {
        G7.j.e(str, "<this>");
        if (!g.L("|")) {
            List O = g.O(str);
            int length = str.length();
            O.size();
            int A8 = AbstractC2817h.A(O);
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            for (Object obj : O) {
                int i10 = i9 + 1;
                String str2 = null;
                if (i9 >= 0) {
                    String str3 = (String) obj;
                    if ((i9 != 0 && i9 != A8) || !g.L(str3)) {
                        int length2 = str3.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length2) {
                                if (!com.facebook.appevents.g.s(str3.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1 && o.B(i11, str3, "|", false)) {
                            str2 = str3.substring(i11 + 1);
                            G7.j.d(str2, "substring(...)");
                        }
                        if (str2 == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i9 = i10;
                } else {
                    AbstractC2817h.D();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            AbstractC2816g.N(arrayList, sb);
            String sb2 = sb.toString();
            G7.j.d(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
