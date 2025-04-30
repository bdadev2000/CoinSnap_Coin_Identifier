package u7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import t7.C2720i;

/* renamed from: u7.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2829t extends com.bumptech.glide.c {
    public static Object W(Map map, Object obj) {
        G7.j.e(map, "<this>");
        if (map instanceof InterfaceC2828s) {
            return ((InterfaceC2828s) map).j();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static HashMap X(C2720i... c2720iArr) {
        HashMap hashMap = new HashMap(Y(c2720iArr.length));
        a0(hashMap, c2720iArr);
        return hashMap;
    }

    public static int Y(int i9) {
        if (i9 >= 0) {
            if (i9 < 3) {
                return i9 + 1;
            }
            if (i9 < 1073741824) {
                return (int) ((i9 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i9;
    }

    public static Map Z(C2720i... c2720iArr) {
        if (c2720iArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(Y(c2720iArr.length));
            a0(linkedHashMap, c2720iArr);
            return linkedHashMap;
        }
        return C2825p.b;
    }

    public static final void a0(HashMap hashMap, C2720i[] c2720iArr) {
        for (C2720i c2720i : c2720iArr) {
            hashMap.put(c2720i.b, c2720i.f23021c);
        }
    }

    public static Map b0(ArrayList arrayList) {
        C2825p c2825p = C2825p.b;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(Y(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C2720i c2720i = (C2720i) it.next();
                    linkedHashMap.put(c2720i.b, c2720i.f23021c);
                }
                return linkedHashMap;
            }
            C2720i c2720i2 = (C2720i) arrayList.get(0);
            G7.j.e(c2720i2, "pair");
            Map singletonMap = Collections.singletonMap(c2720i2.b, c2720i2.f23021c);
            G7.j.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return c2825p;
    }

    public static Map c0(Map map) {
        G7.j.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return d0(map);
            }
            G7.j.e(map, "<this>");
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            G7.j.d(singletonMap, "with(...)");
            return singletonMap;
        }
        return C2825p.b;
    }

    public static LinkedHashMap d0(Map map) {
        G7.j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
