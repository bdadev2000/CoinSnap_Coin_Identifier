package n0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.plantcare.ai.identifier.plantid.R;
import java.util.List;

/* loaded from: classes.dex */
public final class y1 extends b2 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f22370e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final i1.a f22371f = new i1.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f22372g = new DecelerateInterpolator();

    public y1(int i10, Interpolator interpolator, long j3) {
        super(i10, interpolator, j3);
    }

    public static void e(View view, c2 c2Var) {
        u1 j3 = j(view);
        if (j3 != null) {
            ((v9.i) j3).f26370c.setTranslationY(0.0f);
            if (j3.f22351b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), c2Var);
            }
        }
    }

    public static void f(View view, c2 c2Var, WindowInsets windowInsets, boolean z10) {
        u1 j3 = j(view);
        if (j3 != null) {
            j3.a = windowInsets;
            if (!z10) {
                v9.i iVar = (v9.i) j3;
                View view2 = iVar.f26370c;
                int[] iArr = iVar.f26373f;
                view2.getLocationOnScreen(iArr);
                iVar.f26371d = iArr[1];
                if (j3.f22351b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), c2Var, windowInsets, z10);
            }
        }
    }

    public static void g(View view, r2 r2Var, List list) {
        u1 j3 = j(view);
        if (j3 != null) {
            j3.a(r2Var, list);
            if (j3.f22351b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), r2Var, list);
            }
        }
    }

    public static void h(View view, c2 c2Var, d3.g gVar) {
        u1 j3 = j(view);
        if (j3 != null) {
            v9.i iVar = (v9.i) j3;
            View view2 = iVar.f26370c;
            int[] iArr = iVar.f26373f;
            view2.getLocationOnScreen(iArr);
            int i10 = iVar.f26371d - iArr[1];
            iVar.f26372e = i10;
            view2.setTranslationY(i10);
            if (j3.f22351b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), c2Var, gVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static u1 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof x1) {
            return ((x1) tag).a;
        }
        return null;
    }
}
