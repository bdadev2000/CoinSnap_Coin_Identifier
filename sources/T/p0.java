package T;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2918e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final p0.a f2919f = new p0.a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2920g = new DecelerateInterpolator();

    public static void e(View view, t0 t0Var) {
        AbstractC0281l0 j7 = j(view);
        if (j7 != null) {
            ((B3.r) j7).f305c.setTranslationY(0.0f);
            if (j7.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                e(viewGroup.getChildAt(i9), t0Var);
            }
        }
    }

    public static void f(View view, t0 t0Var, WindowInsets windowInsets, boolean z8) {
        AbstractC0281l0 j7 = j(view);
        if (j7 != null) {
            j7.f2903a = windowInsets;
            if (!z8) {
                B3.r rVar = (B3.r) j7;
                View view2 = rVar.f305c;
                int[] iArr = rVar.f308f;
                view2.getLocationOnScreen(iArr);
                rVar.f306d = iArr[1];
                if (j7.b == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                f(viewGroup.getChildAt(i9), t0Var, windowInsets, z8);
            }
        }
    }

    public static void g(View view, G0 g02, List list) {
        AbstractC0281l0 j7 = j(view);
        if (j7 != null) {
            j7.a(g02, list);
            if (j7.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                g(viewGroup.getChildAt(i9), g02, list);
            }
        }
    }

    public static void h(View view, t0 t0Var, E1.d dVar) {
        AbstractC0281l0 j7 = j(view);
        if (j7 != null) {
            B3.r rVar = (B3.r) j7;
            View view2 = rVar.f305c;
            int[] iArr = rVar.f308f;
            view2.getLocationOnScreen(iArr);
            int i9 = rVar.f306d - iArr[1];
            rVar.f307e = i9;
            view2.setTranslationY(i9);
            if (j7.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), t0Var, dVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC0281l0 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof o0) {
            return ((o0) tag).f2917a;
        }
        return null;
    }
}
