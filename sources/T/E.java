package T;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
public abstract class E {
    public static float a(VelocityTracker velocityTracker, int i9) {
        return velocityTracker.getAxisVelocity(i9);
    }

    public static float b(VelocityTracker velocityTracker, int i9, int i10) {
        return velocityTracker.getAxisVelocity(i9, i10);
    }

    public static boolean c(VelocityTracker velocityTracker, int i9) {
        return velocityTracker.isAxisSupported(i9);
    }
}
