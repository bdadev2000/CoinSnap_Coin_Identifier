package y0;

import b1.f0;
import e0.w;
import e0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class m extends n {
    public static f L(j jVar, q0.l lVar) {
        p0.a.s(lVar, "predicate");
        return new f(jVar, true, lVar);
    }

    public static Object M(j jVar) {
        Iterator it = jVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static h N(j jVar, q0.l lVar) {
        p0.a.s(jVar, "<this>");
        p pVar = p.f31447a;
        return new h(jVar, lVar);
    }

    public static String O(j jVar, String str, q0.l lVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        CharSequence charSequence = (i2 & 2) != 0 ? "" : null;
        String str2 = (i2 & 4) == 0 ? null : "";
        int i3 = 0;
        int i4 = (i2 & 8) != 0 ? -1 : 0;
        String str3 = (i2 & 16) != 0 ? "..." : null;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        p0.a.s(jVar, "<this>");
        p0.a.s(charSequence, "prefix");
        p0.a.s(str2, "postfix");
        p0.a.s(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        for (Object obj : jVar) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i4 >= 0 && i3 > i4) {
                break;
            }
            p0.a.e(sb, obj, lVar);
        }
        if (i4 >= 0 && i3 > i4) {
            sb.append((CharSequence) str3);
        }
        sb.append((CharSequence) str2);
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }

    public static r P(j jVar, q0.l lVar) {
        p0.a.s(jVar, "<this>");
        p0.a.s(lVar, "transform");
        return new r(jVar, lVar, 1);
    }

    public static f Q(j jVar, q0.l lVar) {
        p0.a.s(jVar, "<this>");
        p0.a.s(lVar, "transform");
        return new f(new r(jVar, lVar, 1), false, o.f31446a);
    }

    public static j R(j jVar, int i2) {
        p0.a.s(jVar, "<this>");
        if (i2 >= 0) {
            return i2 == 0 ? d.f31426a : jVar instanceof c ? ((c) jVar).b(i2) : new b(jVar, i2, 1);
        }
        throw new IllegalArgumentException(android.support.v4.media.d.j("Requested element count ", i2, " is less than zero.").toString());
    }

    public static List S(j jVar) {
        p0.a.s(jVar, "<this>");
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return w.f30218a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return f0.u(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set T(h hVar) {
        g gVar = new g(hVar);
        if (!gVar.b()) {
            return y.f30220a;
        }
        Object next = gVar.next();
        if (!gVar.b()) {
            return f0.B(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (gVar.b()) {
            linkedHashSet.add(gVar.next());
        }
        return linkedHashSet;
    }
}
