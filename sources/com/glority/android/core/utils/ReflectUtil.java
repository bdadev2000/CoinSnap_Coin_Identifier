package com.glority.android.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class ReflectUtil {
    public static <T> T getStaticField(String str, String str2) {
        try {
            Class<?> cls = Class.forName(str);
            Field declaredField = cls.getDeclaredField(str2);
            declaredField.setAccessible(true);
            return (T) declaredField.get(cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T getField(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return (T) declaredField.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Field getDeclaredField(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method getMethod(Class cls, String str) {
        try {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str)) {
                    method.setAccessible(true);
                    return method;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
