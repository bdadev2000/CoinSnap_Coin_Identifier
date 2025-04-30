package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class P implements Application.ActivityLifecycleCallbacks {
    public static final O Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        G7.j.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new P());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        int i9 = Q.f4860c;
        V.d(activity, EnumC0503m.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        G7.j.e(activity, "activity");
        int i9 = Q.f4860c;
        V.d(activity, EnumC0503m.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        G7.j.e(activity, "activity");
        int i9 = Q.f4860c;
        V.d(activity, EnumC0503m.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        G7.j.e(activity, "activity");
        int i9 = Q.f4860c;
        V.d(activity, EnumC0503m.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        G7.j.e(activity, "activity");
        int i9 = Q.f4860c;
        V.d(activity, EnumC0503m.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        G7.j.e(activity, "activity");
        int i9 = Q.f4860c;
        V.d(activity, EnumC0503m.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        G7.j.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        G7.j.e(activity, "activity");
    }
}
