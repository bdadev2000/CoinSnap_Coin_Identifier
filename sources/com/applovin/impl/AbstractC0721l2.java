package com.applovin.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.applovin.impl.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0721l2 {

    /* renamed from: a, reason: collision with root package name */
    private static Method f8774a;

    public static IBinder a(Bundle bundle, String str) {
        if (yp.f12451a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f8774a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f8774a = method2;
                method2.setAccessible(true);
                method = f8774a;
            } catch (NoSuchMethodException e4) {
                kc.b("BundleUtil", "Failed to retrieve getIBinder method", e4);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e9) {
            kc.b("BundleUtil", "Failed to invoke getIBinder via reflection", e9);
            return null;
        }
    }
}
