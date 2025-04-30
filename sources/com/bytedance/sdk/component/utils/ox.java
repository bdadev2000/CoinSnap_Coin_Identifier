package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ox {
    public static Method zp(String str, String str2, Class<?>... clsArr) {
        Class<?> zp;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                zp = zp(str);
                if (zp == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return zp.getMethod(str2, clsArr);
    }

    public static Class<?> zp(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, zp());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str, true, ox.class.getClassLoader());
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str);
        }
    }

    private static ClassLoader zp() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? ox.class.getClassLoader() : contextClassLoader;
    }
}
