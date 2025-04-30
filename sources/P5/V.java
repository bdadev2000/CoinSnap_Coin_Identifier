package p5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class V implements Application.ActivityLifecycleCallbacks {
    public static final V b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f22299c;

    /* renamed from: d, reason: collision with root package name */
    public static U4.y f22300d;

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
        U4.y yVar = f22300d;
        if (yVar != null) {
            yVar.j(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        t7.y yVar;
        G7.j.e(activity, "activity");
        U4.y yVar2 = f22300d;
        if (yVar2 != null) {
            yVar2.j(1);
            yVar = t7.y.f23029a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            f22299c = true;
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
    }
}
