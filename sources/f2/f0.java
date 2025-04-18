package f2;

import android.view.View;

/* loaded from: classes.dex */
public abstract class f0 {
    public static float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    public static void b(View view, float f10) {
        view.setTransitionAlpha(f10);
    }
}
