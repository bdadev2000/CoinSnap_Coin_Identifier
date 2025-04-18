package androidx.compose.ui.graphics;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CanvasUtils {

    /* renamed from: a, reason: collision with root package name */
    public static Method f14953a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f14954b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14955c;

    public static void a(android.graphics.Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            CanvasZHelper.f14956a.a(canvas, z2);
            return;
        }
        if (!f14955c) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f14953a = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new Class[0]);
                    f14954b = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f14953a = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f14954b = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f14953a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f14954b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f14955c = true;
        }
        if (z2) {
            try {
                Method method4 = f14953a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = f14954b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
