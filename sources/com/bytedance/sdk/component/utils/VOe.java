package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class VOe {
    public static Method YFl(String str, String str2, Class<?>... clsArr) {
        Class<?> YFl;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                YFl = YFl(str);
                if (YFl == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return YFl.getMethod(str2, clsArr);
    }

    public static Class<?> YFl(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, YFl());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str, true, VOe.class.getClassLoader());
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str);
        }
    }

    private static ClassLoader YFl() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? VOe.class.getClassLoader() : contextClassLoader;
    }
}
