package M0;

import android.view.View;

/* loaded from: classes.dex */
public abstract class I {
    public static float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    public static void b(View view, float f9) {
        view.setTransitionAlpha(f9);
    }
}
