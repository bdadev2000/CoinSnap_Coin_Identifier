package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class d implements Application.ActivityLifecycleCallbacks {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f12160b;

    /* renamed from: c, reason: collision with root package name */
    private a f12161c;

    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z10);
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void b(boolean z10) {
    }

    public boolean c() {
        return this.f12160b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.a = true;
        boolean a10 = a();
        this.f12160b = a10;
        b(a10);
    }

    public void f() {
        this.a = false;
        this.f12161c = null;
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

    public void a(a aVar) {
        this.f12161c = aVar;
    }

    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    private void a(boolean z10) {
        if (this.f12160b != z10) {
            this.f12160b = z10;
            if (this.a) {
                b(z10);
                a aVar = this.f12161c;
                if (aVar != null) {
                    aVar.a(z10);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
