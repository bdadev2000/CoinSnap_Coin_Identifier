package T;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class O {
    @Nullable
    public static G0 a(@NonNull View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        G0 h6 = G0.h(null, rootWindowInsets);
        E0 e02 = h6.f2863a;
        e02.p(h6);
        e02.d(view.getRootView());
        return h6;
    }

    public static int b(@NonNull View view) {
        return view.getScrollIndicators();
    }

    public static void c(@NonNull View view, int i9) {
        view.setScrollIndicators(i9);
    }

    public static void d(@NonNull View view, int i9, int i10) {
        view.setScrollIndicators(i9, i10);
    }
}
