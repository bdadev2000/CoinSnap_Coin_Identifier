package n0;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
public abstract class i0 {
    public static float a(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    public static float b(VelocityTracker velocityTracker, int i10, int i11) {
        return velocityTracker.getAxisVelocity(i10, i11);
    }

    public static boolean c(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.isAxisSupported(i10);
    }
}
