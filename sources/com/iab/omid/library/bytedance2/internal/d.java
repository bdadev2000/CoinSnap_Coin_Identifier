package com.iab.omid.library.bytedance2.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14522a;
    protected boolean b;

    /* renamed from: c, reason: collision with root package name */
    private a f14523c;

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z8);
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.f14522a = true;
        boolean a6 = a();
        this.b = a6;
        b(a6);
    }

    public void f() {
        this.f14522a = false;
        this.f14523c = null;
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
        this.f14523c = aVar;
    }

    public void b(boolean z8) {
    }

    private void a(boolean z8) {
        if (this.b != z8) {
            this.b = z8;
            if (this.f14522a) {
                b(z8);
                a aVar = this.f14523c;
                if (aVar != null) {
                    aVar.a(z8);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
