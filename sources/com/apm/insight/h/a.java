package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f5811a;

    /* renamed from: com.apm.insight.h.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0001a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f5812a;
        public final T b;
    }

    static {
        HashMap hashMap = new HashMap();
        f5811a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(Character.class, cls3);
        Class cls4 = Short.TYPE;
        hashMap.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put(Integer.class, cls5);
        Class cls6 = Float.TYPE;
        hashMap.put(Float.class, cls6);
        Class cls7 = Long.TYPE;
        hashMap.put(Long.class, cls7);
        Class cls8 = Double.TYPE;
        hashMap.put(Double.class, cls8);
        hashMap.put(cls, cls);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        hashMap.put(cls5, cls5);
        hashMap.put(cls6, cls6);
        hashMap.put(cls7, cls7);
        hashMap.put(cls8, cls8);
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) {
        return (T) a(cls, str, a(objArr)).invoke(null, b(objArr));
    }

    private static Object[] b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i9 = 0; i9 < objArr.length; i9++) {
            Object obj = objArr[i9];
            if (obj == null || !(obj instanceof C0001a)) {
                objArr2[i9] = obj;
            } else {
                objArr2[i9] = ((C0001a) obj).b;
            }
        }
        return objArr2;
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return (T) a(Class.forName(str), str2, objArr);
        } catch (Exception e4) {
            Log.w("JavaCalls", AbstractC2914a.k("Meet exception when call Method '", str2, "' in ", str), e4);
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a6 = a(cls.getDeclaredMethods(), str, clsArr);
        if (a6 != null) {
            a6.setAccessible(true);
            return a6;
        }
        if (cls.getSuperclass() != null) {
            return a((Class<?>) cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i9 = 0; i9 < clsArr.length; i9++) {
            if (!clsArr[i9].isAssignableFrom(clsArr2[i9])) {
                Map<Class<?>, Class<?>> map = f5811a;
                if (!map.containsKey(clsArr[i9]) || !map.get(clsArr[i9]).equals(map.get(clsArr2[i9]))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i9 = 0; i9 < objArr.length; i9++) {
            Object obj = objArr[i9];
            if (obj == null || !(obj instanceof C0001a)) {
                clsArr[i9] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i9] = ((C0001a) obj).f5812a;
            }
        }
        return clsArr;
    }
}
