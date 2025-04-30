package C2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.r;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        G7.j.e(activity, "activity");
        try {
            r.c().execute(new b(1));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        G7.j.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        G7.j.e(activity, "activity");
        try {
            if (G7.j.a(d.f489c, Boolean.TRUE) && G7.j.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                r.c().execute(new b(0));
            }
        } catch (Exception unused) {
        }
    }
}
