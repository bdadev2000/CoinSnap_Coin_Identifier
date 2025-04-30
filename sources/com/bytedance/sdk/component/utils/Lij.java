package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Lij {
    private static final HashMap<Class<?>, Class<?>> KS;
    private static Map<String, Method> lMd = new HashMap();
    public static final Class<?>[] zp;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        KS = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
        zp = new Class[0];
    }

    private static String lMd(Class<?> cls, String str, Class<?>... clsArr) {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        sb.append("#");
        if (cls.getClassLoader() != null) {
            obj = Integer.valueOf(cls.getClassLoader().hashCode());
        } else {
            obj = "";
        }
        sb.append(obj);
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.toString());
                sb.append("#");
            }
        } else {
            sb.append(Void.class.toString());
        }
        return sb.toString();
    }

    public static int zp(Context context, float f9) {
        return (int) ((f9 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Method zp(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        String lMd2 = lMd(cls, str, clsArr);
        synchronized (lMd) {
            method = lMd.get(lMd2);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        while (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method == null) {
                try {
                    for (Method method2 : cls.getDeclaredMethods()) {
                        if (method2 != null && TextUtils.equals(method2.getName(), str)) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (clsArr != null && parameterTypes != null && clsArr.length == parameterTypes.length) {
                                boolean z8 = true;
                                for (int i9 = 0; i9 < clsArr.length; i9++) {
                                    if (!zp(clsArr[i9], parameterTypes[i9])) {
                                        z8 = false;
                                    }
                                }
                                if (z8) {
                                    method = method2;
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (method != null) {
                method.setAccessible(true);
                synchronized (lMd) {
                    lMd.put(lMd2, method);
                }
                return method;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static boolean zp(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = KS.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = KS.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    public static Object zp(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return zp(obj, str, objArr, zp(objArr));
    }

    public static Object zp(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method zp2 = zp(obj.getClass(), str, clsArr);
        if (zp2 != null) {
            return zp2.invoke(obj, objArr);
        }
        throw new NoSuchMethodException(str);
    }

    public static Class<?>[] zp(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i9 = 0; i9 < objArr.length; i9++) {
                Object obj = objArr[i9];
                clsArr[i9] = obj == null ? null : obj.getClass();
            }
            return clsArr;
        }
        return zp;
    }
}
