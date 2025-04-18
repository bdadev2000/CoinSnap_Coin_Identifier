package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class PathInterpolatorCompat {

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        @DoNotInline
        public static Interpolator a(float f2, float f3) {
            return new PathInterpolator(f2, f3);
        }

        @DoNotInline
        public static Interpolator b(float f2, float f3, float f4, float f5) {
            return new PathInterpolator(f2, f3, f4, f5);
        }

        @DoNotInline
        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f2, float f3, float f4, float f5) {
        return Api21Impl.b(f2, f3, f4, f5);
    }

    public static Interpolator b(Path path) {
        return Api21Impl.c(path);
    }
}
