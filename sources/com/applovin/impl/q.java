package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class q implements Application.ActivityLifecycleCallbacks {
    private final List a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f7044b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f7045c;

    public q(Context context) {
        this.f7044b = new WeakReference(null);
        this.f7045c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f7044b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f7045c = this.f7044b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f7045c.get();
    }

    public Activity b() {
        return (Activity) this.f7044b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((p) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((p) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f7045c = new WeakReference(null);
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((p) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f7044b = weakReference;
        this.f7045c = weakReference;
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((p) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((p) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((p) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((p) it.next()).onActivityStopped(activity);
        }
    }

    public void a(p pVar) {
        this.a.add(pVar);
    }

    public void b(p pVar) {
        this.a.remove(pVar);
    }
}
