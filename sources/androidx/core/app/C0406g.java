package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406g implements Application.ActivityLifecycleCallbacks {
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f4392c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4393d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4394f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4395g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4396h = false;

    public C0406g(Activity activity) {
        this.f4392c = activity;
        this.f4393d = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4392c == activity) {
            this.f4392c = null;
            this.f4395g = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f4395g && !this.f4396h && !this.f4394f) {
            Object obj = this.b;
            try {
                Object obj2 = AbstractC0407h.f4402c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f4393d) {
                    AbstractC0407h.f4406g.postAtFrontOfQueue(new f4.b(13, AbstractC0407h.b.get(activity), obj2));
                    this.f4396h = true;
                    this.b = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f4392c == activity) {
            this.f4394f = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
