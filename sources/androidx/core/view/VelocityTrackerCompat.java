package androidx.core.view;

import android.view.VelocityTracker;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class VelocityTrackerCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f18736a = Collections.synchronizedMap(new WeakHashMap());

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api34Impl {
        @DoNotInline
        public static float a(VelocityTracker velocityTracker, int i2) {
            return velocityTracker.getAxisVelocity(i2);
        }

        @DoNotInline
        public static float b(VelocityTracker velocityTracker, int i2, int i3) {
            return velocityTracker.getAxisVelocity(i2, i3);
        }

        @DoNotInline
        public static boolean c(VelocityTracker velocityTracker, int i2) {
            return velocityTracker.isAxisSupported(i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface VelocityTrackableMotionEventAxis {
    }
}
