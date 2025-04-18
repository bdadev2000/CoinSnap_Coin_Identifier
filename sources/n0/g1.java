package n0;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class g1 {
    public static float a(ViewConfiguration viewConfiguration) {
        float scaledHorizontalScrollFactor;
        scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    public static float b(ViewConfiguration viewConfiguration) {
        float scaledVerticalScrollFactor;
        scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }
}
