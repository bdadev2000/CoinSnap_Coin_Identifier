package androidx.transition;

import android.util.Log;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
class ViewUtilsApi19 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21629a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f21630b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21631c;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static float a(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        @DoNotInline
        public static void b(View view, float f2) {
            view.setTransitionAlpha(f2);
        }
    }

    public float a(View view) {
        if (f21629a) {
            try {
                return Api29Impl.a(view);
            } catch (NoSuchMethodError unused) {
                f21629a = false;
            }
        }
        return view.getAlpha();
    }

    public void b(View view, float f2) {
        if (f21629a) {
            try {
                Api29Impl.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f21629a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void c(View view, int i2) {
        if (!f21631c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f21630b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f21631c = true;
        }
        Field field = f21630b;
        if (field != null) {
            try {
                f21630b.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
