package I3;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int i9, Interpolator interpolator, long j7) {
        return new WindowInsetsAnimation(i9, interpolator, j7);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController l(Window window) {
        return window.getInsetsController();
    }

    public static /* synthetic */ void m() {
    }
}
