package n0;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class s0 {
    @Nullable
    public static r2 a(@NonNull View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        r2 h10 = r2.h(null, rootWindowInsets);
        o2 o2Var = h10.a;
        o2Var.p(h10);
        o2Var.d(view.getRootView());
        return h10;
    }

    public static int b(@NonNull View view) {
        return view.getScrollIndicators();
    }

    public static void c(@NonNull View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void d(@NonNull View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
