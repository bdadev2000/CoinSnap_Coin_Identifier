package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 implements Application.ActivityLifecycleCallbacks {
    public static final m0 Companion = new m0();

    @JvmStatic
    public static final void registerIn(Activity activity) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new n0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = o0.f1808c;
        ka.e.h(activity, n.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = o0.f1808c;
        ka.e.h(activity, n.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = o0.f1808c;
        ka.e.h(activity, n.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = o0.f1808c;
        ka.e.h(activity, n.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = o0.f1808c;
        ka.e.h(activity, n.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = o0.f1808c;
        ka.e.h(activity, n.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
