package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ WindowInsetsAnimation.Bounds g(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation h(int i2, Interpolator interpolator, long j2) {
        return new WindowInsetsAnimation(i2, interpolator, j2);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation i(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimationControlListener j(Object obj) {
        return (WindowInsetsAnimationControlListener) obj;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimationController k(Object obj) {
        return (WindowInsetsAnimationController) obj;
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ void o(View view, WindowInsetsAnimation$Callback windowInsetsAnimation$Callback) {
        view.setWindowInsetsAnimationCallback(windowInsetsAnimation$Callback);
    }
}
