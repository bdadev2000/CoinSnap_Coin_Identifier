package V;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {
    public static Interpolator a(float f9, float f10) {
        return new PathInterpolator(f9, f10);
    }

    public static Interpolator b(float f9, float f10, float f11, float f12) {
        return new PathInterpolator(f9, f10, f11, f12);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
