package n0;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class c2 {
    public final b2 a;

    public c2(int i10, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            jb.z.o();
            this.a = new a2(jb.z.k(i10, interpolator, j3));
        } else {
            this.a = new y1(i10, interpolator, j3);
        }
    }

    public c2(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new a2(windowInsetsAnimation);
        }
    }
}
