package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f1784b;

    public b(HashMap hashMap) {
        this.f1784b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            n nVar = (n) entry.getValue();
            List list = (List) this.a.get(nVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(nVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, v vVar, n nVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                cVar.getClass();
                try {
                    int i10 = cVar.a;
                    Method method = cVar.f1785b;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                method.invoke(obj, vVar, nVar);
                            }
                        } else {
                            method.invoke(obj, vVar);
                        }
                    } else {
                        method.invoke(obj, new Object[0]);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
