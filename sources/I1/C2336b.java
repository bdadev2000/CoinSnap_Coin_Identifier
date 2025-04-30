package i1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Date;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2336b implements Application.ActivityLifecycleCallbacks {
    public int b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        Application application = AbstractC2337c.f20638a;
        AbstractC2337c.f20639c = new WeakReference(activity);
        new Date().getTime();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Application application = AbstractC2337c.f20638a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Application application = AbstractC2337c.f20638a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Application application = AbstractC2337c.f20638a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.b++;
        Application application = AbstractC2337c.f20638a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.b--;
        Application application = AbstractC2337c.f20638a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
