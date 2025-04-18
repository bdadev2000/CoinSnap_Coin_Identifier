package y2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public int f27888b = 0;

    public b() {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        Application application = c.a;
        c.f27890c = new WeakReference(activity);
        new Date().getTime();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Application application = c.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Application application = c.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Application application = c.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f27888b++;
        Application application = c.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f27888b--;
        Application application = c.a;
    }
}
