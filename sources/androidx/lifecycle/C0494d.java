package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0494d f4886c = new C0494d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4887a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, C0493c c0493c, EnumC0503m enumC0503m, Class cls) {
        EnumC0503m enumC0503m2 = (EnumC0503m) hashMap.get(c0493c);
        if (enumC0503m2 != null && enumC0503m != enumC0503m2) {
            throw new IllegalArgumentException("Method " + c0493c.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0503m2 + ", new value " + enumC0503m);
        }
        if (enumC0503m2 == null) {
            hashMap.put(c0493c, enumC0503m);
        }
    }

    public final C0492b a(Class cls, Method[] methodArr) {
        int i9;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f4887a;
        if (superclass != null) {
            C0492b c0492b = (C0492b) hashMap2.get(superclass);
            if (c0492b == null) {
                c0492b = a(superclass, null);
            }
            hashMap.putAll(c0492b.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0492b c0492b2 = (C0492b) hashMap2.get(cls2);
            if (c0492b2 == null) {
                c0492b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0492b2.b.entrySet()) {
                b(hashMap, (C0493c) entry.getKey(), (EnumC0503m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z8 = false;
        for (Method method : methodArr) {
            E e9 = (E) method.getAnnotation(E.class);
            if (e9 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC0511v.class.isAssignableFrom(parameterTypes[0])) {
                        i9 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i9 = 0;
                }
                EnumC0503m value = e9.value();
                if (parameterTypes.length > 1) {
                    if (EnumC0503m.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC0503m.ON_ANY) {
                            i9 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0493c(method, i9), value, cls);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0492b c0492b3 = new C0492b(hashMap);
        hashMap2.put(cls, c0492b3);
        this.b.put(cls, Boolean.valueOf(z8));
        return c0492b3;
    }
}
