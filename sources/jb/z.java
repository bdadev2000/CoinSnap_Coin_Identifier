package jb;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds j(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation k(int i10, Interpolator interpolator, long j3) {
        return new WindowInsetsAnimation(i10, interpolator, j3);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation l(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void o() {
    }
}
