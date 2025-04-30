package androidx.fragment.app;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final x.l f4682a = new x.l();

    public static Class b(ClassLoader classLoader, String str) {
        x.l lVar = f4682a;
        x.l lVar2 = (x.l) lVar.getOrDefault(classLoader, null);
        if (lVar2 == null) {
            lVar2 = new x.l();
            lVar.put(classLoader, lVar2);
        }
        Class cls = (Class) lVar2.getOrDefault(str, null);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            lVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e4) {
            throw new RuntimeException(AbstractC2914a.e("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(AbstractC2914a.e("Unable to instantiate fragment ", str, ": make sure class name exists"), e9);
        }
    }

    public abstract Fragment a(String str);
}
