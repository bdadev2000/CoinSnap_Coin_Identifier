package T;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public s0 f2928a;

    public t0(int i9, Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2928a = new r0(I3.b.i(i9, interpolator, j7));
        } else {
            this.f2928a = new s0(i9, interpolator, j7);
        }
    }
}
