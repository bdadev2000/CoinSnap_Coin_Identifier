package T;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes.dex */
public abstract class N {
    public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static G0 b(@NonNull View view, @NonNull G0 g02, @NonNull Rect rect) {
        WindowInsets g9 = g02.g();
        if (g9 != null) {
            return G0.h(view, view.computeSystemWindowInsets(g9, rect));
        }
        rect.setEmpty();
        return g02;
    }

    public static boolean c(@NonNull View view, float f9, float f10, boolean z8) {
        return view.dispatchNestedFling(f9, f10, z8);
    }

    public static boolean d(@NonNull View view, float f9, float f10) {
        return view.dispatchNestedPreFling(f9, f10);
    }

    public static boolean e(View view, int i9, int i10, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i9, i10, iArr, iArr2);
    }

    public static boolean f(View view, int i9, int i10, int i11, int i12, int[] iArr) {
        return view.dispatchNestedScroll(i9, i10, i11, i12, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    @Nullable
    public static G0 j(@NonNull View view) {
        y0 v0Var;
        if (!u0.f2935d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = u0.f2933a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) u0.b.get(obj);
            Rect rect2 = (Rect) u0.f2934c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                v0Var = new x0();
            } else if (i9 >= 29) {
                v0Var = new w0();
            } else {
                v0Var = new v0();
            }
            v0Var.e(L.e.b(rect.left, rect.top, rect.right, rect.bottom));
            v0Var.g(L.e.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            G0 b = v0Var.b();
            b.f2863a.p(b);
            b.f2863a.d(view.getRootView());
            return b;
        } catch (IllegalAccessException e4) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(@NonNull View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f9) {
        view.setElevation(f9);
    }

    public static void t(View view, boolean z8) {
        view.setNestedScrollingEnabled(z8);
    }

    public static void u(@NonNull View view, @Nullable InterfaceC0292x interfaceC0292x) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0292x);
        }
        if (interfaceC0292x == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new M(view, interfaceC0292x));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f9) {
        view.setTranslationZ(f9);
    }

    public static void x(@NonNull View view, float f9) {
        view.setZ(f9);
    }

    public static boolean y(View view, int i9) {
        return view.startNestedScroll(i9);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
