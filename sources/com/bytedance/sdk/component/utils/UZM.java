package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class UZM {
    private static Map<String, Method> Sg = new HashMap();
    public static final Class<?>[] YFl;
    private static final HashMap<Class<?>, Class<?>> tN;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        tN = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
        YFl = new Class[0];
    }

    private static String Sg(Class<?> cls, String str, Class<?>... clsArr) {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.toString());
        sb2.append("#");
        sb2.append(str);
        sb2.append("#");
        if (cls.getClassLoader() != null) {
            obj = Integer.valueOf(cls.getClassLoader().hashCode());
        } else {
            obj = "";
        }
        sb2.append(obj);
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb2.append(cls2.toString());
                sb2.append("#");
            }
        } else {
            sb2.append(Void.class.toString());
        }
        return sb2.toString();
    }

    public static int YFl(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Method YFl(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        String Sg2 = Sg(cls, str, clsArr);
        synchronized (Sg) {
            method = Sg.get(Sg2);
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
                                boolean z10 = true;
                                for (int i10 = 0; i10 < clsArr.length; i10++) {
                                    if (!YFl(clsArr[i10], parameterTypes[i10])) {
                                        z10 = false;
                                    }
                                }
                                if (z10) {
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
                synchronized (Sg) {
                    Sg.put(Sg2, method);
                }
                return method;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static boolean YFl(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = tN.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = tN.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    public static Object YFl(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return YFl(obj, str, objArr, YFl(objArr));
    }

    public static Object YFl(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method YFl2 = YFl(obj.getClass(), str, clsArr);
        if (YFl2 != null) {
            return YFl2.invoke(obj, objArr);
        }
        throw new NoSuchMethodException(str);
    }

    public static Class<?>[] YFl(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                clsArr[i10] = obj == null ? null : obj.getClass();
            }
            return clsArr;
        }
        return YFl;
    }

    public static int YFl(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
