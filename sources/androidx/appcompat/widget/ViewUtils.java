package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes2.dex */
public class ViewUtils {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1295a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1296b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1297c;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static void a(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f1297c = Build.VERSION.SDK_INT >= 27;
    }

    public static void a(ViewGroup viewGroup, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(viewGroup, rect, rect2);
            return;
        }
        if (!f1295a) {
            f1295a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1296b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1296b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f1296b;
        if (method != null) {
            try {
                method.invoke(viewGroup, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
