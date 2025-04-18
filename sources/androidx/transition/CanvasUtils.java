package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class CanvasUtils {

    /* renamed from: a, reason: collision with root package name */
    public static Method f21515a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f21516b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21517c;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static void a(Canvas canvas) {
            canvas.disableZ();
        }

        @DoNotInline
        public static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    public static void a(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                Api29Impl.b(canvas);
                return;
            } else {
                Api29Impl.a(canvas);
                return;
            }
        }
        if (i2 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f21517c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f21515a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f21516b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f21517c = true;
        }
        if (z2) {
            try {
                Method method2 = f21515a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z2 || (method = f21516b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
