package com.pgl.ssdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f19539a;

    /* loaded from: classes3.dex */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f19540a;
        public final T b;
    }

    static {
        HashMap hashMap = new HashMap();
        f19539a = hashMap;
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

    public static void a(String str, String str2, Object... objArr) {
        try {
            a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Method a(Class<?> cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method method;
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (str != null) {
            int length = declaredMethods.length;
            int i9 = 0;
            loop0: while (true) {
                if (i9 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i9];
                if (method.getName().equals(str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes == 0) {
                        if (clsArr == null || clsArr.length == 0) {
                            break;
                        }
                    } else if (clsArr == null) {
                        if (parameterTypes.length == 0) {
                            break;
                        }
                    } else {
                        if (parameterTypes.length == clsArr.length) {
                            for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                                if (!parameterTypes[i10].isAssignableFrom(clsArr[i10])) {
                                    Map<Class<?>, Class<?>> map = f19539a;
                                    if (map.containsKey(parameterTypes[i10]) && map.get(parameterTypes[i10]).equals(map.get(clsArr[i10]))) {
                                    }
                                }
                            }
                            break loop0;
                        }
                        continue;
                    }
                }
                i9++;
            }
            if (method == null) {
                if (cls.getSuperclass() != null) {
                    return a((Class<?>) cls.getSuperclass(), str, clsArr);
                }
                throw new NoSuchMethodException();
            }
            method.setAccessible(true);
            return method;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    public static void a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Object[] objArr2;
        if (objArr == null || objArr.length <= 0) {
            clsArr = null;
        } else {
            clsArr = new Class[objArr.length];
            for (int i9 = 0; i9 < objArr.length; i9++) {
                Object obj = objArr[i9];
                if (obj != null && (obj instanceof a)) {
                    clsArr[i9] = ((a) obj).f19540a;
                } else {
                    clsArr[i9] = obj == null ? null : obj.getClass();
                }
            }
        }
        Method a6 = a(cls, str, clsArr);
        if (objArr == null || objArr.length <= 0) {
            objArr2 = null;
        } else {
            objArr2 = new Object[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj2 = objArr[i10];
                if (obj2 != null && (obj2 instanceof a)) {
                    objArr2[i10] = ((a) obj2).b;
                } else {
                    objArr2[i10] = obj2;
                }
            }
        }
        a6.invoke(null, objArr2);
    }
}
