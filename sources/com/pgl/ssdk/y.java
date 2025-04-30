package com.pgl.ssdk;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static double f19614a = -1.0d;

    public static String a(Context context) {
        double d2 = f19614a;
        double d9 = 0.0d;
        if (d2 >= 0.0d) {
            return Integer.toString((int) d2);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            d9 = ((Double) declaredMethod.invoke(newInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        f19614a = d9;
        return Integer.toString((int) d9);
    }
}
