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

/* renamed from: com.applovin.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0738q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final List f10102a = Collections.synchronizedList(new ArrayList());
    private WeakReference b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f10103c;

    public C0738q(Context context) {
        this.b = new WeakReference(null);
        this.f10103c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f10103c = this.b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f10103c.get();
    }

    public Activity b() {
        return (Activity) this.b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f10102a).iterator();
        while (it.hasNext()) {
            ((AbstractC0734p) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f10102a).iterator();
        while (it.hasNext()) {
            ((AbstractC0734p) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f10103c = new WeakReference(null);
        Iterator it = new ArrayList(this.f10102a).iterator();
        while (it.hasNext()) {
            ((AbstractC0734p) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.b = weakReference;
        this.f10103c = weakReference;
        Iterator it = new ArrayList(this.f10102a).iterator();
        while (it.hasNext()) {
            ((AbstractC0734p) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f10102a).iterator();
        while (it.hasNext()) {
            ((AbstractC0734p) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f10102a).iterator();
        while (it.hasNext()) {
            ((AbstractC0734p) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f10102a).iterator();
        while (it.hasNext()) {
            ((AbstractC0734p) it.next()).onActivityStopped(activity);
        }
    }

    public void a(AbstractC0734p abstractC0734p) {
        this.f10102a.add(abstractC0734p);
    }

    public void b(AbstractC0734p abstractC0734p) {
        this.f10102a.remove(abstractC0734p);
    }
}
