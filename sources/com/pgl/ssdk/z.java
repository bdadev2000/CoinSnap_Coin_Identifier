package com.pgl.ssdk;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class z {
    private static double a = -1.0d;

    public static String a(Context context) {
        double d10 = a;
        double d11 = 0.0d;
        if (d10 >= 0.0d) {
            return Integer.toString((int) d10);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            d11 = ((Double) declaredMethod.invoke(newInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        a = d11;
        return Integer.toString((int) d11);
    }
}
