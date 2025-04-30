package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: androidx.core.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0400a {
    public static void a(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void b(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    public static void e(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
