package com.applovin.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class l2 {
    private static Method a;

    public static IBinder a(Bundle bundle, String str) {
        if (yp.a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                a = method2;
                method2.setAccessible(true);
                method = a;
            } catch (NoSuchMethodException e2) {
                kc.b("BundleUtil", "Failed to retrieve getIBinder method", e2);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            kc.b("BundleUtil", "Failed to invoke getIBinder via reflection", e10);
            return null;
        }
    }
}
