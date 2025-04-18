package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class h0 {
    public static final r.k a = new r.k();

    public static Class b(ClassLoader classLoader, String str) {
        r.k kVar = a;
        r.k kVar2 = (r.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new r.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            kVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new z(com.applovin.impl.mediation.ads.e.f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e10) {
            throw new z(com.applovin.impl.mediation.ads.e.f("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public abstract Fragment a(String str);
}
