package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import q0.l;

/* loaded from: classes3.dex */
public final class NavArgumentKt {
    public static final ArrayList a(Map map, l lVar) {
        p0.a.s(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            NavArgument navArgument = (NavArgument) entry.getValue();
            Boolean valueOf = navArgument != null ? Boolean.valueOf(navArgument.f20321b) : null;
            p0.a.p(valueOf);
            if (!valueOf.booleanValue() && !navArgument.f20322c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
