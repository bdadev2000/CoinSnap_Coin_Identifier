package e0;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class e0 extends kotlin.jvm.internal.q {
    public static void q(File file) {
        o0.i iVar = o0.i.f31199a;
        o0.f fVar = new o0.f(new o0.h(file));
        while (true) {
            boolean z2 = true;
            while (fVar.hasNext()) {
                File file2 = (File) fVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z2) {
                        break;
                    }
                }
                z2 = false;
            }
            return;
        }
    }

    public static Object r(Object obj, Map map) {
        p0.a.s(map, "<this>");
        if (map instanceof d0) {
            return ((d0) map).u();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap s(d0.k... kVarArr) {
        HashMap hashMap = new HashMap(kotlin.jvm.internal.q.g(kVarArr.length));
        u(hashMap, kVarArr);
        return hashMap;
    }

    public static Map t(d0.k... kVarArr) {
        p0.a.s(kVarArr, "pairs");
        if (kVarArr.length <= 0) {
            return x.f30219a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.jvm.internal.q.g(kVarArr.length));
        u(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static final void u(HashMap hashMap, d0.k[] kVarArr) {
        p0.a.s(kVarArr, "pairs");
        for (d0.k kVar : kVarArr) {
            hashMap.put(kVar.f30134a, kVar.f30135b);
        }
    }

    public static File v(File file) {
        int length;
        String file2;
        File file3;
        int W0;
        File file4 = new File("image_cache");
        String path = file4.getPath();
        p0.a.r(path, "getPath(...)");
        char c2 = File.separatorChar;
        int W02 = z0.m.W0(path, c2, 0, false, 4);
        if (W02 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c2 || (W0 = z0.m.W0(path, c2, 2, false, 4)) < 0) {
                return file4;
            }
            int W03 = z0.m.W0(path, c2, W0 + 1, false, 4);
            length = W03 >= 0 ? W03 + 1 : path.length();
        } else {
            if (W02 <= 0 || path.charAt(W02 - 1) != ':') {
                if (W02 == -1 && z0.m.R0(path, ':')) {
                    length = path.length();
                }
                file2 = file.toString();
                p0.a.r(file2, "toString(...)");
                if (file2.length() == 0 || z0.m.R0(file2, c2)) {
                    file3 = new File(file2 + file4);
                } else {
                    file3 = new File(file2 + c2 + file4);
                }
                return file3;
            }
            length = W02 + 1;
        }
        if (length > 0) {
            return file4;
        }
        file2 = file.toString();
        p0.a.r(file2, "toString(...)");
        if (file2.length() == 0) {
            file3 = new File(file2 + c2 + file4);
            return file3;
        }
        file3 = new File(file2 + file4);
        return file3;
    }

    public static Map w(ArrayList arrayList) {
        x xVar = x.f30219a;
        int size = arrayList.size();
        if (size == 0) {
            return xVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.jvm.internal.q.g(arrayList.size()));
            y(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        d0.k kVar = (d0.k) arrayList.get(0);
        p0.a.s(kVar, "pair");
        Map singletonMap = Collections.singletonMap(kVar.f30134a, kVar.f30135b);
        p0.a.r(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map x(Map map) {
        p0.a.s(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? z(map) : kotlin.jvm.internal.q.n(map) : x.f30219a;
    }

    public static final void y(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d0.k kVar = (d0.k) it.next();
            linkedHashMap.put(kVar.f30134a, kVar.f30135b);
        }
    }

    public static LinkedHashMap z(Map map) {
        p0.a.s(map, "<this>");
        return new LinkedHashMap(map);
    }
}
