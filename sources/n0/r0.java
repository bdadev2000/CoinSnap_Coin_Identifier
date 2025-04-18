package n0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public abstract class r0 {
    public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static r2 b(@NonNull View view, @NonNull r2 r2Var, @NonNull Rect rect) {
        WindowInsets g10 = r2Var.g();
        if (g10 != null) {
            return r2.h(view, view.computeSystemWindowInsets(g10, rect));
        }
        rect.setEmpty();
        return r2Var;
    }

    public static boolean c(@NonNull View view, float f10, float f11, boolean z10) {
        return view.dispatchNestedFling(f10, f11, z10);
    }

    public static boolean d(@NonNull View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
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
    public static r2 j(@NonNull View view) {
        if (d2.f22257d && view.isAttachedToWindow()) {
            try {
                Object obj = d2.a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) d2.f22255b.get(obj);
                    Rect rect2 = (Rect) d2.f22256c.get(obj);
                    if (rect != null && rect2 != null) {
                        kc.c cVar = new kc.c(7);
                        ((i2) cVar.f20640c).e(g0.f.b(rect.left, rect.top, rect.right, rect.bottom));
                        ((i2) cVar.f20640c).g(g0.f.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        r2 n10 = cVar.n();
                        n10.a.p(n10);
                        n10.a.d(view.getRootView());
                        return n10;
                    }
                }
            } catch (IllegalAccessException e2) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            }
        }
        return null;
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

    public static void s(View view, float f10) {
        view.setElevation(f10);
    }

    public static void t(View view, boolean z10) {
        view.setNestedScrollingEnabled(z10);
    }

    public static void u(@NonNull View view, @Nullable z zVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, zVar);
        }
        if (zVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new q0(view, zVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void x(@NonNull View view, float f10) {
        view.setZ(f10);
    }

    public static boolean y(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
