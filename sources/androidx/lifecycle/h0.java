package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h0 {
    @JvmStatic
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
