package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f28959a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f28960b;

    /* renamed from: c, reason: collision with root package name */
    private a f28961c;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z2);
    }

    public void a(a aVar) {
        this.f28961c = aVar;
    }

    public void b(boolean z2) {
    }

    public boolean c() {
        return this.f28960b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.f28959a = true;
        boolean a2 = a();
        this.f28960b = a2;
        b(a2);
    }

    public void f() {
        this.f28959a = false;
        this.f28961c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    private void a(boolean z2) {
        if (this.f28960b != z2) {
            this.f28960b = z2;
            if (this.f28959a) {
                b(z2);
                a aVar = this.f28961c;
                if (aVar != null) {
                    aVar.a(z2);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
