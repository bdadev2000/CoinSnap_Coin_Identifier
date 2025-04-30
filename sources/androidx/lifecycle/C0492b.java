package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4881a = new HashMap();
    public final Map b;

    public C0492b(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0503m enumC0503m = (EnumC0503m) entry.getValue();
            List list = (List) this.f4881a.get(enumC0503m);
            if (list == null) {
                list = new ArrayList();
                this.f4881a.put(enumC0503m, list);
            }
            list.add((C0493c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0493c c0493c = (C0493c) list.get(size);
                c0493c.getClass();
                try {
                    int i9 = c0493c.f4883a;
                    Method method = c0493c.b;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                method.invoke(obj, interfaceC0511v, enumC0503m);
                            }
                        } else {
                            method.invoke(obj, interfaceC0511v);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
